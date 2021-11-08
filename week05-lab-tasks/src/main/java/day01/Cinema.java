package day01;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Cinema {

    private List<Movie> movies = new ArrayList<>();

    public void addMovie (Movie movie) {
        movies.add(movie);
    }

    public List<String> findMovieByTime(LocalDateTime time) {
        List<String> titles = new ArrayList<>();
        for (Movie movie: movies) {
            for (LocalDateTime date: movie.getTimeOfScreening()) {
                if (date.isEqual(time)) {
                    titles.add(movie.getTitle());
                }
            }
        }
        return titles;
    }
}