package reference;

import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

import java.util.*;

/**
 * RatingRegister.java
 * Keep track of film ratings
 * Author: nniehof
 */

public class RatingRegister {

    private Map<Film, List<Rating>> ratings;
    private Map<Person, Map<Film, Rating>> personalRatings;

    public RatingRegister() {
        this.ratings = new HashMap<Film, List<Rating>>();
        this.personalRatings = new HashMap<Person, Map<Film, Rating>>();
    }

    public void addRating(Film film, Rating rating) {
        if (!this.ratings.containsKey(film)) {
            this.ratings.put(film, new ArrayList<Rating>());
        }
        getRatings(film).add(rating);
    }

    public void addRating(Person person, Film film, Rating rating) {
        // if this person is not in the map yet, put them in
        if (!this.personalRatings.containsKey(person)) {
            this.personalRatings.put(person, new HashMap<Film, Rating>());
        }

        // if this person has not rated the film yet, add the rating
        if (!this.personalRatings.get(person).containsKey(film)) {
            this.personalRatings.get(person).put(film, rating);

            // also add to general map with film ratings
            addRating(film, rating);
        }
    }

    public List<Rating> getRatings(Film film) {
        return this.ratings.get(film);
    }

    public Rating getRating(Person person, Film film) {
        if (this.personalRatings.containsKey(person)) {
            if (this.personalRatings.get(person).containsKey(film)) {
                return this.personalRatings.get(person).get(film);
            }
        }
        return Rating.NOT_WATCHED;
    }

    public Map<Film, Rating> getPersonalRatings(Person person) {
        // if this person is not in the map yet, put them in
        if (!this.personalRatings.containsKey(person)) {
            this.personalRatings.put(person, new HashMap<Film, Rating>());
        }

        return this.personalRatings.get(person);
    }

    public Map<Film, List<Rating>> filmRatings() {
        return this.ratings;
    }

    public List<Film> getFilmNames() {
        List<Film> films = new ArrayList<Film>();
        Iterator<Film> iterator = this.ratings.keySet().iterator();
        while (iterator.hasNext()) {
            films.add(iterator.next());
        }
        return films;
    }

    public List<Film> getPersonalFilmNames(Person person) {
        List<Film> films = new ArrayList<Film>();
        Map<Film, Rating> personalFilmRatings = this.personalRatings.get(person);
        Iterator<Film> iterator = personalFilmRatings.keySet().iterator();
        while (iterator.hasNext()) {
            films.add(iterator.next());
        }
        return films;
    }

    public List<Person> reviewers() {
        ArrayList<Person> persons = new ArrayList<Person>();

        for (Person person : this.personalRatings.keySet()) {
            persons.add(person);
        }
        return persons;
    }
}
