public class Hall {
    private int id;
    private int capacity;
    private static int count=0;

    public Hall(int capacity) {
        //this.id = id;
        this.capacity = capacity;
        count=count+1;
        id=count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Hall.count = count;
    }
}
