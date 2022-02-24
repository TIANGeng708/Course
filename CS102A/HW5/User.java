package HW5;

//import javax.management.relation.Role;
import java.time.LocalDate;
import java.time.LocalDateTime;

enum Role{TEACHER, STAFF, UNDERGRADUATE, GRADUATE,VISITOR}
enum ResidentialCollege{ ZHIREN, SHUREN, ZHICHENG, SHUDE, ZHIXIN, SHULI}

public class User {
    private String id;// primary key, not null, not duplicate, eg:11911234; for visitors outside campus, it should be national ID card number
    private String name;//
    private int gender;// 0-female, 1-male, 2-other
    private Role role;//
    //enum Role{TEACHER, STAFF, UNDERGRADUATE, GRADUATE,VISITOR}
    private ResidentialCollege residentialCollege;//
    //enum ResidentialCollege{ ZHIREN, SHUREN, ZHICHENG, SHUDE, ZHIXIN, SHULI}
    private String department;//eg: “ComputerScienceEngineering”
    private String district;// “SUSTech” for in campus, other for outside campus
    private String domain;//eg: “Lychee Park”
    private int buildingNo;//building number, eg: 2
    private int roomNo;//room number, eg: 101
    private LocalDate dateBackToShenzhen;// the date back to Shenzhen
    private boolean isValid=true;// false if the user is deleted
    private double bodyTemperature;// temperature today, 0- not checked. A user should only take temperature once per day
    private LocalDateTime temperatureTestTime;
    public User(String id, String name, int gender){
        this.id=id;
        this.name=name;
        this.gender=gender;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGender() {
        return gender;
    }

    public Role getRole() {
        return role;
    }

    public ResidentialCollege getResidentialCollege() {
        return residentialCollege;
    }

    public String getDepartment() {
        return department;
    }

    public String getDistrict() {
        return district;
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

    public LocalDate getDateBackToShenzhen() {
        return dateBackToShenzhen;
    }

    public boolean isValid() {
        return isValid;
    }

    public double getBodyTemperature() {
        return bodyTemperature;
    }

    public LocalDateTime getTemperatureTestTime() {
        return temperatureTestTime;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public void setResidentialCollege(ResidentialCollege residentialCollege) {
        this.residentialCollege = residentialCollege;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setDistrict(String district) {
        this.district = district;
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

    public void setDateBackToShenzhen(LocalDate dateBackToShenzhen) {
        this.dateBackToShenzhen = dateBackToShenzhen;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }

    public void setBodyTemperature(double bodyTemperature) {
        this.bodyTemperature = bodyTemperature;
    }

    public void setTemperatureTestTime(LocalDateTime temperatureTestTime) {
        this.temperatureTestTime = temperatureTestTime;
    }

    public void takeTemperature(double temperature, LocalDateTime dateTime){
        this.temperatureTestTime=dateTime;
        this.bodyTemperature=temperature;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", role=" + role +
                ", residentialCollege=" + residentialCollege +
                ", department='" + department + '\'' +
                ", district='" + district + '\'' +
                ", domain='" + domain + '\'' +
                ", buildingNo=" + buildingNo +
                ", roomNo=" + roomNo +
                ", dateBackToShenzhen=" + dateBackToShenzhen +
                ", isValid=" + isValid +
                ", bodyTemperature=" + bodyTemperature +
                ", temperatureTestTime=" + temperatureTestTime +
                '}';
    }
}
