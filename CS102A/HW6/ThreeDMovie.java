public class ThreeDMovie extends Movie {
    private final int GLASS_PRICE = 20;
    //private int count;

    public ThreeDMovie(int count, String name, Time startTime, int runtime, double price, int ticketsLeft,int hallNmuber,int capacity) {
        super( name, startTime, runtime, price, ticketsLeft,hallNmuber,capacity);
        super.setId(count);
    }

    public double purchase(int arg) {
        if (arg==0&&ticketsLeft>0){
            ticketsLeft=ticketsLeft-1;
            return getPrice();
        }if (arg==1&&ticketsLeft>0){
            ticketsLeft=ticketsLeft-1;
            setThreeD(getThreeD()+1);
            return getPrice()+getGLASS_PRICE();
        }
        return 0;
    }

    public String toString(){
        return super.toString()+" ThreeDMovie";
    }

    public int getGLASS_PRICE() {
        return GLASS_PRICE;
    }
}
