
import java.time.*;
import java.util.ArrayList;

public class Data {
    private static ArrayList<User> userList;
    private static ArrayList<Office> officeList;
    private static ArrayList<Group> groupList;
    private static ArrayList<Log> logList;


    public static void initialize(){

        Office office = new Office("Innovation Park",10, 501,5.2);
        Data.getOfficeList().add(office);


        User user = new User("30001001","Teacher1",1);
        user.setRole(Role.TEACHER);
        user.setDepartment("CSE");
        user.setDistrict("Nanshan");
        user.setDomain("Domain1");
        user.setBuildingNo(2);
        user.setRoomNo(201);
        user.setDateBackToShenzhen(LocalDate.of(2020,3,18));
        Data.getUserList().add(user);

        Group group = new Group(user.getId());//
        Data.getGroupList().add(group);
        group.addOffice(office);


        user = new User("11910001","Student1",0);
        user.setRole(Role.UNDERGRADUATE);
        user.setResidentialCollege(ResidentialCollege.ZHIREN);
        user.setDepartment("CSE");
        user.setDistrict("SUSTech");
        user.setDomain("Lychee Park");
        user.setBuildingNo(1);
        user.setRoomNo(101);
        Data.getUserList().add(user);
        group.addUser(user);

        user = new User("11910002","Student2",1);
        user.setRole(Role.UNDERGRADUATE);
        user.setResidentialCollege(ResidentialCollege.ZHIXIN);
        user.setDepartment("CSE");
        user.setDistrict("SUSTech");
        user.setDomain("Lychee Park");
        user.setBuildingNo(1);
        user.setRoomNo(102);
        Data.getUserList().add(user);
        group.addUser(user);

        user = new User("11922002","Student4",0);
        user.setRole(Role.GRADUATE);
        user.setResidentialCollege(ResidentialCollege.SHUDE);
        user.setDepartment("CSE");
        user.setDistrict("SUSTech");
        user.setDomain("Lychee Park");
        user.setBuildingNo(1);
        user.setRoomNo(103);
        Data.getUserList().add(user);
        //addUser(user);
        group.addUser(user);


        office = new Office("Innovation Park",10, 502,8.8);
        Data.getOfficeList().add(office);
        group.addOffice(office);

        user = new User("30001002","Teacher2",1);
        user.setRole(Role.TEACHER);
        user.setDepartment("CSE");
        user.setDistrict("SUSTech");
        user.setDomain("Teahcer's Apartment");
        user.setBuildingNo(2);
        user.setRoomNo(202);
        user.setDateBackToShenzhen(LocalDate.of(2020,3,17));
        Data.getUserList().add(user);

        group = new Group(user.getId());//
        Data.getGroupList().add(group);
        group.addOffice(office);

        user = new User("11910003","Student3",1);
        user.setRole(Role.UNDERGRADUATE);
        user.setResidentialCollege(ResidentialCollege.ZHICHENG);
        user.setDepartment("CSE");
        user.setDistrict("SUSTech");
        user.setDomain("Lychee Park");
        user.setBuildingNo(1);
        user.setRoomNo(102);
        Data.getUserList().add(user);

        user = new User("11922003","Student5",0);
        user.setRole(Role.GRADUATE);
        user.setResidentialCollege(ResidentialCollege.SHULI);
        user.setDepartment("CSE");
        user.setDistrict("SUSTech");
        user.setDomain("Lychee Park");
        user.setBuildingNo(1);
        user.setRoomNo(103);
        //user.setValid(false);
        Data.getUserList().add(user);

        user = new User("11922004","Student6",1);
        user.setRole(Role.GRADUATE);
        user.setResidentialCollege(ResidentialCollege.SHUREN);
        user.setDepartment("CSE");
        user.setDistrict("SUSTech");
        user.setDomain("Lychee Park");
        user.setBuildingNo(1);
        user.setRoomNo(104);
        Data.getUserList().add(user);


        user = new User("30001003","Staff1",1);
        user.setRole(Role.STAFF);
        user.setDepartment("CSE");
        user.setDistrict("Futian");
        user.setDomain("Domain2");
        user.setBuildingNo(2);
        user.setRoomNo(203);
        user.setDateBackToShenzhen(LocalDate.of(2020,3,20));
        Data.getUserList().add(user);

        user = new User("440301199001011111","Visitor1",1);
        user.setRole(Role.VISITOR);
        user.setDepartment("CSE");
        user.setDistrict("Luohu");
        user.setDomain("Domain3");
        user.setBuildingNo(2);
        user.setRoomNo(204);
        user.setDateBackToShenzhen(LocalDate.of(2020,3,19));
        Data.getUserList().add(user);

        Log log = new Log("11911001",1,36.5,LocalDateTime.of(2020,4,1,8,0,0));
        Data.getLogList().add(log);
        log = new Log("11911001",1,36.6,LocalDateTime.of(2020,4,1,14,0,0));
        Data.getLogList().add(log);
        log = new Log("11911002",1,36.7,LocalDateTime.of(2020,4,2,8,0,0));
        Data.getLogList().add(log);
        log = new Log("11911003",2,36.8,LocalDateTime.of(2020,4,2,8,0,1));
        Data.getLogList().add(log);
        log = new Log("11911001",1,36.9,LocalDateTime.of(2020,4,2,8,0,2));
        Data.getLogList().add(log);
        log = new Log("11922002",2,37.1,LocalDateTime.of(2020,4,2,8,0,3));
        Data.getLogList().add(log);
        log = new Log("11922004",2,37.2,LocalDateTime.of(2020,4,2,8,0,4));
        Data.getLogList().add(log);
        log = new Log("11911001",1,37.1,LocalDateTime.of(2020,4,2,13,0,5));
        Data.getLogList().add(log);
        log = new Log("11911004",2,36.9,LocalDateTime.of(2020,4,2,13,0,6));
        Data.getLogList().add(log);
        log = new Log("11911001",1,36.8,LocalDateTime.of(2020,4,3,8,0,0));
        Data.getLogList().add(log);
        log = new Log("11911002",0,36.7,LocalDateTime.of(2020,4,3,8,0,1));
        Data.getLogList().add(log);
        log = new Log("11911003",2,36.6,LocalDateTime.of(2020,4,3,8,0,2));
        Data.getLogList().add(log);
        log = new Log("30001002",2,36.5,LocalDateTime.of(2020,4,3,8,0,3));
        Data.getLogList().add(log);
        log = new Log("440301199001011111",0,36.4,LocalDateTime.of(2020,4,4,8,0,4));
        Data.getLogList().add(log);


    }
}
