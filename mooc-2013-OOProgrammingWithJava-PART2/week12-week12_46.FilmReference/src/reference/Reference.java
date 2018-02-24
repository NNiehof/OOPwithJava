package reference;

import reference.comparator.FilmComparator;
import reference.comparator.PersonComparator;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

import java.util.*;

/**
 * Reference.java
 * Recommend films for a user based on their similarity in ratings
 * to other users
 * Author: nniehof
 */

public class Reference {

    private RatingRegister ratingRegister;

    public Reference(RatingRegister ratingRegister) {
        this.ratingRegister = ratingRegister;
    }

    public Film recommendFilm(Person person) {
        // register with film ratings
        Map<Film, List<Rating>> ratings = this.ratingRegister.filmRatings();
        // list with films
        List<Film> films = this.ratingRegister.getFilmNames();
        // sort films by overall ratings from all users
        Collections.sort(films, new FilmComparator(ratings));

        Map<Film, Rating> userRatings =
                this.ratingRegister.getPersonalRatings(person);
        // if user has not given any ratings yet,
        // recommend film with overall highest rating
        if (userRatings.size() == 0) {
            return films.get(0);
        }
        // if user has already rated all films,
        // give no recommendation
        else if(userRatings.size() == films.size()) {
            return null;
        }

        // compute similarity in ratings with other users
        List<Person> reviewers = this.ratingRegister.reviewers();
        Map<Person, Integer> similarityScores =
                similarity(userRatings, reviewers, films);

        // sort reviewers by their similarity to the user
        Collections.sort(reviewers, new PersonComparator(similarityScores));

        // sort films by the ratings of the reviewer most similar to user
        Person reviewer = reviewers.get(1); // user is at 0
        Map<Film, Rating> reviewerRatings =
                this.ratingRegister.getPersonalRatings(reviewer);
        FilmComparator reviewerFilmCompare = singleUserSorter(reviewerRatings);
        List<Film> filmsWatched =
                this.ratingRegister.getPersonalFilmNames(reviewer);
        Collections.sort(filmsWatched, reviewerFilmCompare);

        // recommend highest rated film of recommending reviewer
        Iterator<Film> filmIterator = filmsWatched.iterator();
        while (filmIterator.hasNext()) {
            Film topFilm = filmIterator.next();
            int score = reviewerRatings.get(topFilm).getValue();

            // do not recommend film if reviewer has given it a score
            // that is neutral (1) or below
            if (score <= 1) {
                return null;
            }

            // only recommend film if user hasn't seen it yet
            if (!userRatings.containsKey(topFilm)) {
                return topFilm;
            }
        }
        return null;
    }

    /**
     * Map of similarity between the userRatings and ratings of each
     * individual reviewer, for the list of films given in the argument.
     * The similarity is the dot product of the ratings for films
     * that both the user and the reviewer have watched.
     */
    public Map<Person, Integer> similarity(
            Map<Film, Rating> userRatings, List<Person> reviewers, List<Film> films) {

        HashMap<Person, Integer> similarityScores =
                new HashMap<Person, Integer>();
        for (Person reviewer : reviewers) {
            int agreement = 0;
            Map<Film, Rating> reviewerRatings =
                    this.ratingRegister.getPersonalRatings(reviewer);

            for (Film film : films) {
                // if both have seen the film, add to agreement score
                if (userRatings.containsKey(film) & reviewerRatings.containsKey(film)) {
                    agreement += (userRatings.get(film).getValue()
                            * reviewerRatings.get(film).getValue());
                }
            }
            similarityScores.put(reviewer, agreement);
        }
        return similarityScores;
    }

    /**
     * Reformat film ratings of a single user into Map<Film, List<Rating>>
     * such that the films can be sorted with the FilmComparator
     * compare method. Each Rating item in the List will have only
     * a single item. Returns a FilmComparator object.
     * @param singleUserRating
     */
    public FilmComparator singleUserSorter(Map<Film, Rating> singleUserRating) {
        Map<Film, List<Rating>> ratings =
                new HashMap<Film, List<Rating>>();
        for (Film film : singleUserRating.keySet()) {
            List<Rating> userRating = new ArrayList<Rating>();
            userRating.add(singleUserRating.get(film));
            ratings.put(film, userRating);
        }
        return new FilmComparator(ratings);
    }
}
