package Entity;


import component.MovieComponent;

public class Movie extends MovieComponent {

    private String movieTitle;
    private String movieDescription;


    public Movie(String movieTitle, String movieDescription) {
        this.movieTitle = movieTitle;
        this.movieDescription = movieDescription;
    }

    public void displayMovieInfo() {
        System.out.println(movieTitle + " " + movieDescription);
    }


}
