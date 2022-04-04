class MovieComposite {

    //gør klassen abstract, kan ikke lave en instans af sig selv
    constructor() {
        if (new.target === MovieComposite) {
          throw new TypeError("Cannot construct Abstract instances directly");
        }
      }

    add(movieComposite) { }
    delete(movieComposite) { }
    get(movieComposite) { }
    getName() { }
    getDirector() { }
    getReleaseYear() { }
    displayMovieInfo() { }
}

class MovieGroup extends MovieComposite {


    constructor(groupName, groupDescription) {
        super();
        this.groupName = groupName;
        this.groupDescription = groupDescription;
    }
    movieGroupList = [];

    add(movieComposite) {
        this.movieGroupList.push(movieComposite)
    }
    remove(movieComposite) {
        this.movieGroupList.remove(movieComposite);
    }
    get(compositeIndex) {
        this.movieGroupList.get(compositeIndex)
    }

    displayMovieInfo() {

        console.log(this.groupName + " " + this.groupDescription);

        for(let movieGroup of this.movieGroupList){
         movieGroup.displayMovieInfo();

        }
    }

}


class Movie extends MovieComposite {

    constructor(movieTitle, movieDescription) {
        super();
        this.movieTitle = movieTitle;
        this.movieDescription = movieDescription;
    }

    displayMovieInfo() {
        console.log(this.movieTitle + " " + this.movieDescription);
    }
}

class Netflix {

    constructor(movieList) {
        this.movieList = movieList;
    }

    getMovieList() {
        this.movieList.displayMovieInfo();
    }
}