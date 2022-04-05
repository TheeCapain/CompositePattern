package Entity;


import component.MovieComponent;

public class Movie implements MovieComponent {

    private String movieTitle;
    private String movieDescription;


    public Movie(String movieTitle, String movieDescription) {
        this.movieTitle = movieTitle;
        this.movieDescription = movieDescription;
    }

    @Override
    public void add(MovieComponent movieComponent) {

    }

    @Override
    public void delete(MovieComponent movieComponent) {

    }

    @Override
    public MovieComponent get(int componentInde) {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getDirector() {
        return null;
    }

    @Override
    public int getReleaseYear() {
        return 0;
    }

    public void displayMovieInfo() {
        System.out.println(movieTitle + " " + movieDescription);
    }


}
