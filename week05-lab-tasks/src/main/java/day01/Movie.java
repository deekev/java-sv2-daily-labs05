package day01;

import java.time.LocalDateTime;
import java.util.List;

public class Movie {

    private String title;
    private List<LocalDateTime> timeOfScreening;

    public Movie(String title, List<LocalDateTime> timeOfScreening) {
        this.title = title;
        this.timeOfScreening = timeOfScreening;
    }

    public String getTitle() {
        return title;
    }

    public List<LocalDateTime> getTimeOfScreening() {
        return timeOfScreening;
    }
}