package HW5;

public class Office {
    private int id;//primary key, not null, not duplicate; increase by 1 from 1  with total count of offices as default when creating an office object
    private String domain;//eg:”Lychee Park”
    private int buildingNo;//building number, eg: 6
    private int roomNo;//room number, eg: 402
    private double area;// area of the room
    private boolean isValid=true;// false if the office is deleted
    private static int count=0;// total count of offices created, including deleted ones
    private int visitorCountToday;// set as 0 for everyday, ++1 when a user entered; not consider user get out. A user gets in office several times in a day should only count once.

    public Office(String domain, int buildingNo, int roomNo, double area) {
        this.domain = domain;
        this.buildingNo = buildingNo;
        this.roomNo = roomNo;
        this.area = area;
        count=count+1;
        id=count;
    }
    public Office(){
        this.domain = domain;
        this.buildingNo = buildingNo;
        this.roomNo = roomNo;
        this.area = area;
        count=count+1;
        id=count;
    }

    public int getId() {
        return id;
    }

    public String getDomain() {
        return domain;
    }

    public int getBuildingNo() {
        return buildingNo;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public double getArea() {
        return area;
    }

    public boolean isValid() {
        return isValid;
    }

    public static int getCount() {
        return count;
    }

    public int getVisitorCountToday() {
        return visitorCountToday;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public void setBuildingNo(int buildingNo) {
        this.buildingNo = buildingNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }

    public static void setCount(int count) {
        Office.count = count;
    }

    public void setVisitorCountToday(int visitorCountToday) {
        this.visitorCountToday = visitorCountToday;
    }

    @Override
    public String toString() {
        return "Office{" +
                "id=" + id +
                ", domain='" + domain + '\'' +
                ", buildingNo=" + buildingNo +
                ", roomNo=" + roomNo +
                ", area=" + area +
                ", count=" + count +
                '}';
    }


}
