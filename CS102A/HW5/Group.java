package HW5;

import java.util.ArrayList;

public class Group {
    private int id;//increase from 1 by 1 with total count of groups
    private String piId;// userId of PI, should not in userList, but can access their offices
    public ArrayList<User> userList=new ArrayList<>();// to store all group members
    public ArrayList<Office> officeList=new ArrayList<>();
    private boolean isValid = true;// false if the group is deleted
    private static int count=0;// total count of groups created

    public String addUser(User user){
        for (int i=0;i<userList.size();i++){
            if (userList.get(i).getId().equals(user.getId())){
               return "user already exists";
            }
        }
        userList.add(user);
        return "addUser succeed";
    }
    public String deleteUser(String userId){
        for (int i=0;i<userList.size();i++){
            if (userId.equals(userList.get(i).getId())){
                userList.remove(i);
                return  "deleteUser succeed";
            }
        }
        return "user not exists";
    }

    public String addOffice(Office office){
        for (int i=0;i<officeList.size();i++){
            if (officeList.get(i).getId()==office.getId()){
                return "office already exists";
            }
        }
        officeList.add(office);
        return "addOffice succeed";
    }

    public String deleteOffice(int officeId){
        for (int i=0;i<officeList.size();i++){
            if (officeId==officeList.get(i).getId()){
                officeList.remove(i);
                return  "deleteOffice succeed";
            }
        }
        return "office not exists";
    }

    public Group(String pild){
        this.piId=pild;
        id=count+1;
        count++;
        this.isValid=true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPiId() {
        return piId;
    }

    public void setPiId(String piId) {
        this.piId = piId;
    }

    public ArrayList<User> getUserList() {
        return userList;
    }

    public void setUserList(ArrayList<User> userList) {
        this.userList = userList;
    }

    public ArrayList<Office> getOfficeList() {
        return officeList;
    }

    public void setOfficeList(ArrayList<Office> officeList) {
        this.officeList = officeList;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Group.count = count;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", piId='" + piId + '\'' +
                ", userList=" + userList +
                ", officeList=" + officeList +
                ", isValid=" + isValid +
                ", count=" + count +
                '}';
    }
}