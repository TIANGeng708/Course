public class Main1 {
    public static void main(String[] args) {
        Cinema cinema = new ConcreteCinema();

        // reflect Movie
        // reflect ConcreteCinema

        //1. test time
        System.out.println(new Time(12, 5));
        System.out.println(new Time(4, 11));

        //2. test add movie hall
        cinema.addMovieHall(10);
        cinema.addMovieHall(15);
        cinema.addMovieHall(4);
        cinema.getAllMovieHallsCapacity().forEach(System.out::println);
        System.out.println();

        //3. test add movie without conflict
        cinema.addMovie("name1", 120, 1, 50.4, 0, new Time(1, 15));
        cinema.addMovie("name2", 125, 1, 60, 0, new Time(6, 25));
        cinema.addMovie("name3", 125, 3, 58.5, 1, new Time(16, 15));
        cinema.getAllMovies().forEach(System.out::println);
        System.out.println();

        //4. test add movie with conflict
        cinema.addMovie("name4", 120, 3, 35.5, 1, new Time(3, 40));
        cinema.addMovie("name5", 180, 3, 60.5, 1, new Time(3, 35));
        cinema.addMovie("name6", 100, 3, 45, 1, new Time(5, 39));
        cinema.addMovie("name7", 100, 3, 45, 1, new Time(5, 49));
        cinema.getAllMovies().forEach(System.out::println);
        System.out.println();


        //5. get movies from movie hall order by start time
        cinema.getMoviesFromMovieHallOrderByStartTime(1).forEach(System.out::println);

        //6. test reserve movie
        System.out.println((int) cinema.reserveMovie(1, 8));
        System.out.println((int) cinema.reserveMovie(1, 5));
        System.out.println((int) cinema.reserveMovie(3, 1));
        System.out.println((int) cinema.reserveMovie(3, 0));
        System.out.println();

        //7. after reserve, test ticketsLeft. Here need to implement getMovieById()
        System.out.println("Movie 1 ticket Left: " + cinema.getMovieById(1).ticketsLeft);
        System.out.println("Movie 3 ticket Left: " + cinema.getMovieById(3).ticketsLeft);
        System.out.println();

        //8. test one movie income
        System.out.println("Income of Movie 1: " + (int) cinema.getOneMovieIncome(1));
        System.out.println("Income of Movie 3: " + (int) cinema.getOneMovieIncome(3));
        System.out.println();


        //9. test total income
        System.out.println("total income:" + (int) cinema.getTotalIncome());
        System.out.println();

        //10. reserve available movies: you need input movie name and current time
        cinema.addMovie("name5", 110, 2, 60.5, 1, new Time(16, 35));
        cinema.addMovie("name5", 110, 2, 60.5, 1, new Time(11, 35));
        cinema.addMovie("name5", 110, 2, 60.5, 1, new Time(19, 35));
        cinema.getAvailableMoviesByName(new Time(11, 20), "name5").forEach(System.out::println);
        cinema.getAvailableMoviesByName(new Time(16, 35), "name5").forEach(System.out::println);

    }

}
