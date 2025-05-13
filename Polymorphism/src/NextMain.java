public class NextMain {

    public static void main(String[] args) {

        Movie movie = Movie.getMovie("A", "Jaws");
        movie.watchMovie();

//        Adventure jaws = Movie.getMovie("C", "Jaws");    // compiler made assumptions and execute rules that we create
//        without execute ide dont know passed value is a adventure film but know it is a movie


//        Adventure jaws2 = (Adventure) Movie.getMovie("C", "Jaws");   // runtime errors
//        jaws2.watchMovie();


        Object comedy = Movie.getMovie("C", "Airplane");
        Comedy comedyMovie = (Comedy)  comedy;
        comedyMovie.watchComedy();



        var airPlane = Movie.getMovie("C", "Airplane");
        airPlane.watchMovie();


        var plane = new Comedy("Airplane");
        plane.watchComedy();


        Object unknownObject = Movie.getMovie("S", "Star Wars");
        if (unknownObject.getClass().getSimpleName() == "Comedy"){
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();
        } else if (unknownObject instanceof Adventure) {
            ((Adventure) unknownObject).watchAdventure();
        } else if (unknownObject instanceof ScienceFiction syfy) {
            syfy.watchScienceFiction();
        }

    }
}
