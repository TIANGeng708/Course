

import java.util.*;

public class ConcreteCinema implements Cinema {
    List<Movie> movies=new ArrayList<>();
    //private List<String> movies=new ArrayList<>();
    private List<String> halls=new ArrayList<>();
    private static int countMovie=0;
    //private static int countHall=0;


    @Override
    public void addMovieHall(int capacity) {
        Hall hall = new Hall(capacity);
        String abc = "" + hall.getId() + "-" + capacity;
        halls.add(abc);
    }

    @Override
    public List<String> getAllMovieHallsCapacity() {
        return halls;
    }

    @Override
    public void addMovie(String name, int runtime, int hallNumber, double price, int type, Time startTime) {
        int controller=1;
        for (int i=0;i<movies.size();i++){
            //controller=1;
            if (movies.get(i).getHallNumber()==hallNumber) {
                int runtimes = movies.get(i).getRuntime() + 20;
                int lastHour = runtimes / 60;int hour=runtime/60;
                int lastMinute = runtimes % 60;int minute=runtime%60;
                int hour_1 = Integer.parseInt(movies.get(i).getStartTime().toString().substring(0, 2)) + lastHour;
                int minute_1 = Integer.parseInt(movies.get(i).getStartTime().toString().substring(3)) + lastMinute;
                int hour_2=Integer.parseInt(startTime.toString().substring(0,2))+hour;
                int minute_2=Integer.parseInt(startTime.toString().substring(3))+minute+20;
                if (minute_1 >= 60) {
                    minute_1 = minute_1 - 60;
                    hour_1 = hour_1 + 1;
                }if (minute_2>=60){
                    minute_2=minute_2-60;
                    hour_2=hour_2+1;
                }
                Time last = new Time(hour_1, minute_1);
                Time future=new Time(hour_2,minute_2);
                //System.out.print(movies.get(i).getStartTime().toString()+"  ");System.out.print(last+"  ");System.out.print(startTime+"  ");System.out.println(future);
                //if (last.getHour() > startTime.getHour() || (last.getHour() == startTime.getHour() && last.getMinute() > startTime.getMinute())) {
                if ((startTime.getHour()>=movies.get(i).getStartTime().getHour()||(startTime.getHour()==movies.get(i).getStartTime().getHour()&&startTime.getMinute()>=movies.get(i).getStartTime().getMinute()))
                        &&(startTime.getHour()<last.getHour()||(startTime.getHour()==last.getHour()&&startTime.getMinute()<last.getMinute()))){
                    controller=0;//countMovie=countMovie+1;
                }
                if ((future.getHour()>movies.get(i).getStartTime().getHour()||(future.getHour()==movies.get(i).getStartTime().getHour()&&future.getMinute()>movies.get(i).getStartTime().getMinute()))
                        &&(future.getHour()<last.getHour()||(future.getHour()==last.getHour()&&future.getMinute()<last.getMinute()))){
                    controller=0;///countMovie=countMovie+1;
                }

            }
        }
        if (controller==1){
            countMovie=countMovie+1;
        }

        if (type==0&&controller==1){
            OrdinaryMovie ordinaryMovie=new OrdinaryMovie(countMovie,name,startTime,runtime,price, Integer.parseInt(halls.get(hallNumber-1).substring(2)),hallNumber,
                    Integer.parseInt(halls.get(hallNumber-1).substring(2)));
            //OrdinaryMovie ordinaryMovie=new OrdinaryMovie();
            //ordinaryMovie.Movie
            movies.add(ordinaryMovie);
        }if (type==1&&controller==1){
            ThreeDMovie threeDMovie=new ThreeDMovie(countMovie,name,startTime,runtime,price,Integer.parseInt(halls.get(hallNumber-1).substring(2)),hallNumber,Integer.parseInt(halls.get(hallNumber-1).substring(2)));
            movies.add(threeDMovie);
        }
    }




    @Override
    public List<Movie> getAllMovies() {
        return movies;
    }

    @Override
    public List<Movie> getMoviesFromMovieHallOrderByStartTime(int hallNumber) {
        List<Movie> test=new ArrayList<>();
        for (int i=0;i<movies.size();i++){
            int abcd=0;
            if (movies.get(i).getHallNumber()==hallNumber){
                //System.out.print(hallNumber);System.out.println(movies.get(i).getHallNumber());
                if (test.size()==0){
                    test.add(movies.get(i));abcd=1;
                    //System.out.print(movies.get(i).getId());
                }

                for (int j=0;j<test.size();j++){
                    int hour_1=0;int hour_2=0;int hour_3=0;
                    int minute_1=0;int minute_2=0;int minute_3=0;
                    int time_1=0;int time_2=0;int time_3=0;
                    if (j==0&&abcd==0){
                        hour_1=movies.get(i).getStartTime().getHour();
                        minute_1=movies.get(i).getStartTime().getMinute();
                        hour_2=test.get(j).getStartTime().getHour();
                        minute_2=test.get(j).getStartTime().getMinute();
                        time_1=hour_1*60+minute_1;
                        time_2=hour_2*60+minute_2;
                        if (time_1<time_2){
                            test.add(0,movies.get(i));
                            //System.out.print(movies.get(i).getId());
                        }
                    }
                    if (j==test.size()-1&&abcd==0){
                        hour_1=movies.get(i).getStartTime().getHour();
                        minute_1=movies.get(i).getStartTime().getMinute();
                        hour_2=test.get(j).getStartTime().getHour();
                        minute_2=test.get(j).getStartTime().getMinute();
                        time_1=hour_1*60+minute_1;
                        time_2=hour_2*60+minute_2;
                        if (time_1>time_2){
                            test.add(movies.get(i));abcd=1;
                            //System.out.print(movies.get(i).getId());
                        }
                    }if (j!=test.size()-1&&abcd==0){
                        hour_1=movies.get(i).getStartTime().getHour();
                        minute_1=movies.get(i).getStartTime().getMinute();
                        hour_2=test.get(j).getStartTime().getHour();
                        minute_2=test.get(j).getStartTime().getMinute();
                        hour_3=test.get(j+1).getStartTime().getHour();
                        minute_3=test.get(j+1).getStartTime().getMinute();
                        time_1=hour_1*60+minute_1;
                        time_2=hour_2*60+minute_2;
                        time_3=hour_3*60+minute_3;
                        if (time_1>time_2&&time_1<time_3){
                            test.add(j+1,movies.get(i));abcd=1;
                            System.out.print(movies.get(i).getId());
                        }
                    }
                }/*if (test==null){
                    test.add(movies.get(i));
                    }
                    if (j==test.size()-1&&j==0){
                    if (movies.get(i).getStartTime().getHour()>test.get(j).getStartTime().getHour()||
                            (movies.get(i).getStartTime().getHour()==test.get(j).getStartTime().getHour()&&
                                    movies.get(i).getStartTime().getMinute()>test.get(j).getStartTime().getMinute())){
                        test.add(movies.get(i));
                    }else {
                        test.add(0,movies.get(i));
                    }
                    }
                    if (j==test.size()-1&&
                            (movies.get(i).getStartTime().getHour()>test.get(j).getStartTime().getHour()||
                            (movies.get(i).getStartTime().getHour()==test.get(j).getStartTime().getHour()&&
                                    movies.get(i).getStartTime().getMinute()>test.get(j).getStartTime().getMinute()))){
                        test.add(movies.get(i));
                    }if (j!=test.size()-1){
                        if ((movies.get(i).getStartTime().getHour()>test.get(j).getStartTime().getHour()||
                                (movies.get(i).getStartTime().getHour()==test.get(j).getStartTime().getHour()&&
                                        movies.get(i).getStartTime().getMinute()>test.get(j).getStartTime().getMinute()))&&
                                (movies.get(i).getStartTime().getHour()<test.get(j+1).getStartTime().getHour()||
                                        (movies.get(i).getStartTime().getHour()==test.get(j+1).getStartTime().getHour()&&
                                                movies.get(i).getStartTime().getMinute()<test.get(j+1).getStartTime().getMinute()))){
                            test.add(j+1,movies.get(i));
                        }
                    }
                }*///test.add(movies.get(i));
            }
        }
        return test;
    }

    @Override
    public double reserveMovie(int movieId, int arg) {
        double abc=0;
        for (int i=0;i<movies.size();i++){
            if (movies.get(i).getId()==movieId){
                abc=movies.get(i).purchase(arg);
            }
        }
        return abc;
    }

    @Override
    public Movie getMovieById(int movieId) {
        Movie def=null;
        for (int i=0;i<movies.size();i++){
            if (movieId==movies.get(i).getId()){
                def=movies.get(i);
            }
        }
        return def;
    }

    @Override
    public double getOneMovieIncome(int movieId) {
        Movie def=null;double sell=0;
        for (int i=0;i<movies.size();i++){
            if (movieId==movies.get(i).getId()){
                def=movies.get(i);
            }
        }
        sell=(def.getCapacity()-def.getTicketsLeft())*def.getPrice()+20*def.getThreeD();
        return sell;
    }

    @Override
    public double getTotalIncome() {
        Movie def=null;double sell=0;
        for (int i=0;i<movies.size();i++){
            def=movies.get(i);
            sell=sell+(def.getCapacity()-def.getTicketsLeft())*def.getPrice()+20*def.getThreeD();
        }

        return sell;
        //return 0;
    }

    @Override
    public List<Movie> getAvailableMoviesByName(Time currentTime, String name) {
        List<Movie> ui=new ArrayList<>();
        for (int i=0;i<movies.size();i++){
            if (movies.get(i).getName().equals(name)){
                int hour_1=0;int hour_2=0;
                int minute_1=0;int minute_2=0;
                hour_1=currentTime.getHour();minute_1=currentTime.getMinute();
                hour_2=movies.get(i).getStartTime().getHour();minute_2=movies.get(i).getStartTime().getMinute();
                if (hour_1<hour_2||(hour_1==hour_2&&minute_1<minute_2)){
                    ui.add(movies.get(i));//System.out.println(movies.get(i).getName());
                }
            }
        }
        return ui;
    }
}
