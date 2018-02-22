package reference.comparator;

import reference.domain.Film;
import reference.domain.Rating;

import java.util.*;

/**
 * FilmComparator.java
 * Author: nniehof
 */

public class FilmComparator implements Comparator<Film> {

    private Map<Film, List<Rating>> ratings;

    public FilmComparator(Map<Film, List<Rating>> ratings) {
        this.ratings = ratings;
    }

    @Override
    public int compare(Film firstFilm, Film secondFilm) {
        List<Rating> firstFilmRatings = getRatings(firstFilm);
        List<Rating> secondFilmRatings = getRatings(secondFilm);

        // if both films have ratings, calculate the means and compare
        if (!firstFilmRatings.isEmpty() & !secondFilmRatings.isEmpty()) {
            int firstFilmMean = meanRating(firstFilmRatings);
            int secondFilmMean = meanRating(secondFilmRatings);

            if (firstFilmMean < secondFilmMean) {
                return 1;
            }
            else if (firstFilmMean > secondFilmMean) {
                return -1;
            }
        }
        return 0;
    }

    public List<Rating> getRatings(Film film) {
        if (this.ratings.containsKey(film)) {
            return this.ratings.get(film);
        }
        return Collections.emptyList();
    }

    public int meanRating(List<Rating> scores) {
        Iterator<Rating> iterator =  scores.iterator();
        int sumRating = 0;

        while(iterator.hasNext()) {
            sumRating += iterator.next().getValue();
        }
        return sumRating / scores.size();
    }
}

