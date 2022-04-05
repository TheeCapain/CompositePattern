package Entity;

import component.MovieComponent;

import java.util.ArrayList;
import java.util.Iterator;

public class MovieGroup implements MovieComponent {

    private ArrayList<MovieComponent> movieGroupList = new ArrayList<>();

    private String groupName;
    private String groupDescription;

    public MovieGroup(String groupName, String groupDescription) {
        this.groupName = groupName;
        this.groupDescription = groupDescription;
    }

    public void add(MovieComponent movieComponent) {
        movieGroupList.add(movieComponent);
    }

    @Override
    public void delete(MovieComponent movieComponent) {

    }

    public void remove(MovieComponent movieComponent) {
        movieGroupList.remove(movieComponent);
    }

    public MovieComponent get(int componentIndex){
        return (MovieComponent)movieGroupList.get(componentIndex);
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

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupDescription() {
        return groupDescription;
    }

    public void setGroupDescription(String groupDescription) {
        this.groupDescription = groupDescription;
    }

    public void displayMovieInfo(){
        System.out.println(getGroupName() + " " + getGroupDescription());
        Iterator movieIterator = movieGroupList.iterator();
        while (movieIterator.hasNext()){
            MovieComponent movieInfo = (MovieComponent) movieIterator.next();
            movieInfo.displayMovieInfo();
        }
    }

}
