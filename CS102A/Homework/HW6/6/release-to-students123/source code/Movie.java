public abstract class Movie {
    //Must declare first six fields
    private int id;
    private String name;
    private Time startTime;
    private int runtime;
    private double price;
    protected int ticketsLeft;

    //You can add other fields that you think are necessary.

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
}
