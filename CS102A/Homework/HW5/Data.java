package HW5;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Data {
    private static ArrayList<User> userList;
    private static ArrayList<Office> officeList;
    private static ArrayList<Group> groupList;
    private static ArrayList<Log> logList;

    public Data() {
        userList = new ArrayList<User>();
        groupList = new ArrayList<Group>();
        officeList = new ArrayList<Office>();
        logList = new ArrayList<Log>();
    }


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

    public static ArrayList<User> getUserList() {
        return userList;
    }

    public static void setUserList(ArrayList<User> userList) {
        Data.userList = userList;
    }

    public static ArrayList<Office> getOfficeList() {
        return officeList;
    }

    public static void setOfficeList(ArrayList<Office> officeList) {
        Data.officeList = officeList;
    }

    public static ArrayList<Group> getGroupList() {
        return groupList;
    }

    public static void setGroupList(ArrayList<Group> groupList) {
        Data.groupList = groupList;
    }

    public static ArrayList<Log> getLogList() {
        return logList;
    }

    public static void setLogList(ArrayList<Log> logList) {
        Data.logList = logList;
    }

    public String addUser(User user){
        for (int i=0;i<Data.userList.size();i++){
            if (Data.userList.get(i).getId().equals(user.getId())){
                //if (!userList.get(i).isValid()){
                    Data.userList.get(i).setValid(true);
                //}
                return "user already exists";
            }
        }
        Data.userList.add(user);
        for (int j=0;j<Data.userList.size();j++){
            if (Data.userList.get(j).getId().equals(user.getId())){
                //if (!userList.get(j).isValid()){
                    Data.userList.get(j).setValid(true);
                //}
            }
        }
        return "addUser succeed";
    }

    public String deleteUser(String userId){
            for (int i=0;i<userList.size();i++){
                if (userId.equals(userList.get(i).getId())){
                    userList.get(i).setValid(false);
                    return  "deleteUser succeed";
                }
            }
            return "user not exists";
    }

    public User getUser(String userId){
        for (int i=0;i<userList.size();i++) {
            if (userId.equals(userList.get(i).getId())) {
                return userList.get(i);
            }
        }
        return null;
    }

    public String addGroup(Group group){
        for (int i=0;i<groupList.size();i++){
            if (groupList.get(i).getId()==group.getId()){
                if (!groupList.get(i).isValid()){
                    groupList.get(i).setValid(true);
                }
                return "group already exists";
            }
        }
        groupList.add(group);
        return "addGroup succeed";
    }

    public String deleteGroup(int groupId){
        for (int i=0;i<groupList.size();i++){
            if (groupId==groupList.get(i).getId()){
                groupList.get(i).setValid(false);
                return  "deleteGroup succeed";
            }
        }
        return "group not exist";
    }

    public Group getGroup(int groupId){
        for (int i=0;i<groupList.size();i++) {
            if (groupId==groupList.get(i).getId()){
                return groupList.get(i);
            }
        }
        return null;
    }

    public String addOffice(Office office){
        for (int i=0;i<officeList.size();i++){
            if (officeList.get(i).getId()==office.getId()){
                if (!officeList.get(i).isValid()){
                    officeList.get(i).setValid(true);//始是更改
                }
                return "office already exists";
            }
        }
        officeList.add(office);
        return "addOffice succeed";
    }

    public String deleteOffice(int officeId){
        for (int i=0;i<officeList.size();i++){
            if (officeId==officeList.get(i).getId()){
                officeList.get(i).setValid(false);
                return  "deleteOffice succeed";
            }
        }
        return "office not exist";
    }


    public Office  getOffice(int officeId){
        for (int i=0;i<officeList.size();i++) {
            if (officeId==officeList.get(i).getId()){
                return officeList.get(i);
            }
        }
        return null;
    }

    public  boolean canAccessCampus (String userId, LocalDateTime dateTime){
        int a=0;
        for (int i=0;i<userList.size();i++){
            if (userList.get(i).getId().equals(userId)){
                a=i;
                break;
            }
            if (!userList.get(i).getId().equals(userId)&&i==userList.size()-1){
                return false;
            }
        }
        if (userList.get(a).getDistrict().equals("SUSTech")){
            return true;
        }else if (userList.get(a).getBodyTemperature()>=37.3){
            return false;
        }else {
            ;
        }
        if ((int) Duration.between(LocalDateTime.of(userList.get(a).getDateBackToShenzhen(), LocalTime.of(0, 0, 0)), dateTime).toDays() >= 14){
            return true;
        }
        return false;
    }

    public boolean canAccessOffice(String userId,int officeId,LocalDateTime dateTime){
        int a=0;int b=0;
        for (int i=0;i<userList.size();i++){
            if (userList.get(i).getId().equals(userId)){
                if (!userList.get(i).isValid()){
                    return false;
                }else {
                    a=i;
                    break;
                }
            }
            if (!userList.get(i).getId().equals(userId)&&i==userList.size()-1){
                return false;
            }
        }
        for (int i=0;i<officeList.size();i++){
            if (officeList.get(i).getId()==officeId){
                if (!officeList.get(i).isValid()){
                    return false;
                }else {
                    b=i;
                    break;
                }
            }
            if (officeList.get(i).getId()!=officeId&&i==officeList.size()-1){
                return false;
            }
        }
        for (int i=0;i<groupList.size();i++){
            if (groupList.get(i).getPiId().equals(userId)){
                for (int k=0;k<groupList.get(i).getOfficeList().size();k++){
                    if(groupList.get(i).getOfficeList().get(k).getId()==officeId){
                        if (groupList.get(i).getOfficeList().get(k).getArea()/2>groupList.get(i).getOfficeList().get(k).getVisitorCountToday()){
                            return true;
                        }
                    }
                }
            }
            for (int j=0;j<groupList.get(i).getUserList().size();j++){
                if (groupList.get(i).getUserList().get(j).getId().equals(userId)){
                    for (int k=0;k<groupList.get(i).getOfficeList().size();k++){
                        if(groupList.get(i).getOfficeList().get(k).getId()==officeId){
                            if (groupList.get(i).getOfficeList().get(k).getArea()/2>groupList.get(i).getOfficeList().get(k).getVisitorCountToday()){
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public void addAccessRecord(Log log){
        logList.add(log);
    }

    public boolean accessCampus (String userId, LocalDateTime dateTime){
        int x=0;
        if (canAccessCampus(userId,dateTime)){
            for (int i=0;i<userList.size();i++){
                if (userList.get(i).getId().equals(userId)){
                    x=i;
                }
            }
            Log log=new Log(userId,0,userList.get(x).getBodyTemperature(),dateTime);
            addAccessRecord(log);
            return true;
        }
        return false;
    }

    public boolean accessOffice(String userId,int officeId,LocalDateTime dateTime){
        int x=0;
        if (canAccessCampus(userId,dateTime)){
            for (int i=0;i<userList.size();i++){
                if (userList.get(i).getId().equals(userId)){
                    x=i;
                }
            }
            Log log=new Log(userId,officeId,userList.get(x).getBodyTemperature(),dateTime);
            addAccessRecord(log);
            return true;
        }
        return false;
    }

    public static int accessCampusUserCount(LocalDateTime date){
        int x=0;
        ArrayList<String> abc =new ArrayList<>();
        for (int i=0;i<logList.size();i++){
            if (logList.get(i).getDateTime().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")).equals(date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")))){
                //localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))

                if (!abc.contains(logList.get(i).getUserId())){
                    abc.add(logList.get(i).getUserId());
                    x++;
                }
            }
        }
        return x;
    }
    public  static ArrayList<User> accessOfficeUsers(int officeId, LocalDateTime date){
        ArrayList<String> ddd=new ArrayList<>();
        ArrayList<User> aaa=new ArrayList<>();
        for (int i=0;i<logList.size();i++){
            if (logList.get(i).getDateTime().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")).equals(date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")))){
                //int a=i;
                if (logList.get(i).getOfficeId()==officeId){
                if (!ddd.contains(logList.get(i).getUserId())){
                    ddd.add(logList.get(i).getUserId());
                }
                    }
            }
        }
        for (int j=0;j<userList.size();j++){
            for (int k=0;k<ddd.size();k++){
                if (userList.get(j).getId().equals(ddd.get(k))){
                    aaa.add(userList.get(j));
                }
            }
        }
        return aaa;
    }
    public static ArrayList<Integer> accessOfficeTimes(String userId, int officeId, LocalDateTime startDate, LocalDateTime endDate){
        LocalDateTime aaa=startDate;
        //int ccc=0;
        ArrayList<Integer> abc=new ArrayList<>();
        for (int k=0;k>-1;k++){
            int ccc=0;
        for (int i=0;i<logList.size();i++){
            if (logList.get(i).getDateTime().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")).equals(aaa.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")))){
                if (logList.get(i).getUserId().equals(userId)){
                    if (logList.get(i).getOfficeId()==officeId){
                        ccc=ccc+1;
                    }
                }
            }
        }
        abc.add(ccc);//break;
        //aaa=aaa.plusDays(1);
        if (aaa.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")).equals(endDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")))){
        break;}
            aaa=aaa.plusDays(1);
        }
        return abc;
    }
}
