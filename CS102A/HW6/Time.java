public class Time  {
    private int hour;
    private int minute;
    public Time(int hour, int minute){
        this.hour=hour;
        this.minute=minute;
    }

    @Override
    public String toString() {
        if (hour<10&&minute>=10){
            return "0"+hour+":"+minute;
        }if (hour>=10&&minute>=10){
            return ""+hour+":"+minute;
        }if (hour<10&&minute<10){
            return "0"+hour+":0"+minute;
        }else {
            return hour + ":0" + minute;
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

}

