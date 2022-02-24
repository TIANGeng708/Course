package HW4;

import java.util.ArrayList;

public class Passenger {
    private static int cnt=0;
    private int id;
    private float balance;
    private String boardingStation;


    public Passenger() {
        boardingStation = null;
        balance = (float) 0.0;
        cnt = cnt + 1;
        id = cnt;
    }

    public Passenger(float money) {
        balance = money;
        boardingStation = null;
        cnt = cnt + 1;
        id = cnt;
    }

    public boolean getOn(VehicleRun vr, String station) {
        ArrayList<String> busLine=vr.getBusLine();
        int a =busLine.indexOf(station);
        if (a==-1) {
            return false;
        }
        if (balance < 0) {
            return false;
        }
        if (boardingStation != null) {
            return false;
        } else {
            if (vr.getThroughTicket()) {
                vr.getFare(vr.getFee());
                balance=balance-vr.getFee();
                boardingStation = station;
            } else {
                boardingStation = station;
            }
            return true;
        }
    }

    public boolean getOff(VehicleRun vr, String station) {
        ArrayList<String> busLine=vr.getBusLine();
        int a =busLine.indexOf(station);
        int b=busLine.indexOf(boardingStation);
        if (a==-1) {
            return false;
        }
        if (b==-1) {
            return false;
        }
        if (boardingStation == null) {
            return false;
        }
        if (vr.getBusLine().indexOf(station) < vr.getBusLine().indexOf(boardingStation)) {
            return false;
        } else {
            if (vr.getThroughTicket()) {
                boardingStation = null;
            } else {
                vr.getFare(vr.getFee() * (vr.getBusLine().indexOf(station) - vr.getBusLine().indexOf(boardingStation)));
                balance=balance-vr.getFee() * (vr.getBusLine().indexOf(station) - vr.getBusLine().indexOf(boardingStation));
                boardingStation = null;
            }
            return true;
        }
    }

    public boolean refill(float money) {
        if (money > 0) {
            balance = balance + money;
            return true;
        } else {
            return false;
        }
    }


    public static int getCnt() {
        return cnt;
    }

    public int getId() {
        return id;
    }

    public float getBalance() {
        return balance;
    }

    public String getBoardingStation() {
        return boardingStation;
    }

    public static void setCnt( int  cnt) {
        Passenger.cnt=cnt;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setBalance(float balance){
        this.balance=balance;
    }
    public void setBoardingStation(String boardingStation){
        this.boardingStation=boardingStation;
    }
}