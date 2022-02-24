package HW4;

import java.util.ArrayList;

public class Bus {
    private String licensePlate;
    private int seats;
    private ArrayList<VehicleRun> vrs;
    private int currentVrIndex;

    public Bus(String licensePlate, int seats){
        this.vrs=null;
        this.licensePlate=licensePlate;
        this.seats=seats;
        this.currentVrIndex=0;
    }
    public Bus(String licensePlate, int seats, ArrayList<VehicleRun> vrs){
        this.vrs=vrs;
        this.licensePlate=licensePlate;
        this.seats=seats;
        this.currentVrIndex=0;
    }

    public boolean arriveStation(int currentVrIndex,String xstation, ArrayList<Passenger> passengersGetOn, ArrayList<Passenger> passengersGetOff){


        if (vrs.get(currentVrIndex).getBusLine().indexOf(xstation)==0&&passengersGetOff.size()!=0){
            return false;
        }

        int a=0;int b=0;
        for (int i=0;i<vrs.get(currentVrIndex).getBusLine().size();i++){
            a=a+vrs.get(currentVrIndex).getpCntOn()[i];
            b=b+vrs.get(currentVrIndex).getpCntOff()[i];
        }
        if (a-b!=passengersGetOff.size()&&vrs.get(currentVrIndex).getBusLine().indexOf(xstation)==vrs.get(currentVrIndex).getBusLine().size()-1){
            return false;
        }
        if (a-b<passengersGetOff.size()){
            return false;
        }

        if (vrs.get(currentVrIndex).getBusLine().indexOf(xstation)==vrs.get(currentVrIndex).getBusLine().size()-1&&passengersGetOn.size()!=0){
            return false;
        }



        if (currentVrIndex==vrs.get(currentVrIndex).getBusLine().size()-1&&passengersGetOn.size()!=0){
            return false;
        }


          vrs.get(currentVrIndex);
        //vrs.get(currentVrIndex).getpCntOn()[vrs.get(currentVrIndex).getBusLine().indexOf(xstation)]=passengersGetOn.size();
        //vrs.get(currentVrIndex).getpCntOff()[vrs.get(currentVrIndex).getBusLine().indexOf(xstation)]=passengersGetOff.size();
        vrs.get(currentVrIndex).updateCntOnStation(xstation,passengersGetOn.size(),passengersGetOff.size());
        //if (vrs.get(currentVrIndex).getThroughTicket()){
            //vrs.get(currentVrIndex).getFare(vrs.get(currentVrIndex).getFee()*passengersGetOn.size());
            for (int i=0;i<passengersGetOn.size();i++){
                passengersGetOn.get(i).getOn(vrs.get(currentVrIndex),xstation);
            }
        //}
        //else {
            //vrs.get(currentVrIndex).getFare(vrs.hashCode())
            for (int j=0;j<passengersGetOff.size();j++){
                passengersGetOff.get(j).getOff(vrs.get(currentVrIndex),xstation);
            }
        //}
        return true;
    }

    public void endCurrentOperation(){
        if (currentVrIndex==vrs.size()-1){
            System.out.print("WellDone,all the operations of Today has been finished,have a rest!!");
        }
        else {
            currentVrIndex=currentVrIndex+1;
        }


    }

    public String getLicensePlate(){
        return licensePlate;
    }
    public int getSeats(){
        return seats;
    }
    public ArrayList<VehicleRun> getVrs(){
        return vrs;
    }
    public int getCurrentVrIndex(){
        return currentVrIndex;
    }
    public void setLicensePlate(String licensePlate){
        this.licensePlate=licensePlate;
    }
    public void setSeats(int seats){
        this.seats=seats;
    }
    public void setVrs(ArrayList<VehicleRun> vrs){
        this.vrs=vrs;
    }
    public void setCurrentVrIndex(int currentVrIndex){this.currentVrIndex=currentVrIndex;}
}
