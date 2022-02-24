package HW4;

import java.util.ArrayList;

public class VehicleRun {
    private String departureTime;
    private ArrayList<String> busLine;
    private boolean throughTicket;
    private float fee;
    private float income;
    private int[] pCntOn;
    private int[] pCntOff;


    public VehicleRun(String departureTime, ArrayList<String> busLine, boolean
            throughTicket, float fee){
        this.departureTime=departureTime;
        this.busLine=busLine;
        this.throughTicket=throughTicket;
        this.fee=fee;
        income=0;
        pCntOn=new int[busLine.size()];
        pCntOff=new int[busLine.size()];
    }

    public boolean updateCntOnStation(String xstation,int onNum,int offNum){
        int j=0;
        for (int i=0;i<busLine.size();i++){
            if (xstation.equals(busLine.get(i))) {
                j=i;
            }
            else {
                ;
            }
        }
        if (busLine.get(j).equals(xstation)){
            pCntOn[j]=onNum;
            pCntOff[j]=offNum;
            return true;
        }else {
            return false;
        }
        //return true;
    }



    public boolean getFare( float fare){
        if (fare<0){
            return false;
        }else {
            income=income+fare;
            return true;
        }
    }
    public String getDepartureTime(){
        return departureTime;
    }
    public ArrayList<String> getBusLine(){
        return busLine;
    }
    public boolean getThroughTicket(){
        return throughTicket;
    }
    public float getFee(){
        return fee;
    }
    public float getIncome(){
        return income;
    }
    public int[] getpCntOn(){
        return pCntOn;
    }
    public int[] getpCntOff(){
        return pCntOff;
    }
    public void setDepartureTime(String departureTime){
        this.departureTime=departureTime;
    }
    public void setBusLine(ArrayList<String> busLine){
        this.busLine=busLine;
    }
    public void setThroughTicket(boolean throughTicket){
        this.throughTicket=throughTicket;
    }
    public void setFee(float fee){
        this.fee=fee;
    }
    public void setIncome(float income){
        this.income=income;
    }
    public void setpCntOn(int[] pCntOn){
        this.pCntOn=pCntOn;
    }
    public void setpCntOff(int[] pCntOff){
        this.pCntOff=pCntOff;
    }

}
