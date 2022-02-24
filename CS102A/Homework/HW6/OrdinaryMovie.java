

public class OrdinaryMovie extends Movie {

    public OrdinaryMovie(int count,String name, Time startTime, int runtime, double price, int ticketsLeft,int hallNumber,int capacity) {
        super(name, startTime, runtime, price, ticketsLeft,hallNumber,capacity);
        super.setId(count);
    }

    public String toString() {
        return super.toString()+" OrdinaryMovie";
    }
    public double purchase(int arg){
        if (arg<getTicketsLeft()){
            double money;
            money=getPrice()*arg;
            ticketsLeft=ticketsLeft-arg;
            return money;
        }else {
            double money;
            money=getTicketsLeft()*getPrice();
            ticketsLeft=0;
            return money;
        }
    }
}
