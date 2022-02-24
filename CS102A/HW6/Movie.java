public abstract class Movie {
    //Must declare first six fields
    private int id;
    private String name;
    private Time startTime;
    private int runtime;
    private double price;
    protected int ticketsLeft;
    private int count=0;
    private int hallNumber;
    private int capacity;
    private int threeD=0;

    //You can add other fields that you think are necessary.

    public Movie( String name, Time startTime, int runtime, double price, int ticketsLeft,int hallNumber,int capacity) {
        //this.id = id;
        this.name = name;
        this.startTime = startTime;
        this.runtime = runtime;
        this.price = price;
        this.ticketsLeft = ticketsLeft;
        this.hallNumber=hallNumber;
        this.capacity=capacity;
        //count=count+1;
        //id=count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract double purchase(int arg);

    @Override
    public String toString() {
        return
                "id=" + id + ", name='" + name +
                        "', startTime:" + startTime +
                        ", runtime=" + runtime +
                        ", price=" + price +
                        ", ticketsLeft=" + ticketsLeft;
    }

    public int getTicketsLeft() {
        return ticketsLeft;
    }

    public void setTicketsLeft(int ticketsLeft) {
        this.ticketsLeft = ticketsLeft;
    }

    public int getHallNumber() {
        return hallNumber;
    }

    public void setHallNumber(int hallNumber) {
        this.hallNumber = hallNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getThreeD() {
        return threeD;
    }

    public void setThreeD(int threeD) {
        this.threeD = threeD;
    }
}
