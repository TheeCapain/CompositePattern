adventureComposite = new MovieGroup("Adventure", "A fun trip");
horrorComposite = new MovieGroup("Horror", "A scary trip");
fantasyComposite = new MovieGroup("Fantasy", "a subgenre of Adventure");
allMovies = new MovieGroup("Movies", "Every single movie");

allMovies.add(adventureComposite);
adventureComposite.add(new Movie("Pirates of Danmark", "Wild danes being pirates"));
adventureComposite.add(new Movie("Avatar", "Blue people vs humans, who will win?"));

adventureComposite.add(fantasyComposite);
fantasyComposite.add(new Movie("Harry Potter", "Yer a wizard Harry"));
fantasyComposite.add(new Movie("Harry Potter 2", "Yer a hairy wizard"));

allMovies.add(horrorComposite);
horrorComposite.add(new Movie("Scream", "Its loud"));
horrorComposite.add(new Movie("Ice age", "Its melting"));

netflix = new Netflix(allMovies);
netflix.getMovieList();