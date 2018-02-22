package reference;

import reference.comparator.FilmComparator;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Reference.java
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
        // sort films by ratings
        Collections.sort(films, new FilmComparator(ratings));

        // return the first (highest recommended) film in the list
        return films.get(0);
    }
}
