package Entity;


import component.MovieComponent;

public class Netflix {
    MovieComponent movieList;

    public Netflix(MovieComponent movieList){
        this.movieList = movieList;
    }

    public void getMovieList(){
        movieList.displayMovieInfo();
    }
}
