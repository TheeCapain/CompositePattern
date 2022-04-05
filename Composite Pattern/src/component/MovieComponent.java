package component;

public interface MovieComponent {

    public void add(MovieComponent movieComponent);

    public void delete(MovieComponent movieComponent);

    public MovieComponent get(int componentIndex);

    public String getName();

    public String getDirector();

    public int getReleaseYear();

    public void displayMovieInfo();

}
