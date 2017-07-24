package sg.edu.rp.c346.mymovies;

/**
 * Created by 15039608 on 24/7/2017.
 */

public class movie {
    private String title;
    private String Year;
    private String Genre;

    public String getRated() {
        return rated;
    }

    public void setRated(String rated) {
        this.rated = rated;
    }

    public String getWatched_on() {
        return watched_on;
    }

    public void setWatched_on(String watched_on) {
        this.watched_on = watched_on;
    }

    public String getIn_theartre() {
        return in_theartre;
    }

    public void setIn_theartre(String in_theartre) {
        this.in_theartre = in_theartre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public movie(String rated, String watched_on, String in_theartre, String description) {

        this.rated = rated;
        this.watched_on = watched_on;
        this.in_theartre = in_theartre;
        this.description = description;
    }

    private String rated;
    private String watched_on;
    private String in_theartre;
    private String description;

    public movie(String title, String year, String genre) {
        this.title = title;
        Year = year;
        Genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }
}
