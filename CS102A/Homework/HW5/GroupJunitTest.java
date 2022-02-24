package HW5;

import HW5.Group;
import HW5.Office;
import HW5.User;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GroupJunitTest {
    @Test
    public void testCase(){
        Group group = new Group("30001001");
        assertEquals(true, group.isValid());
        User user = new User("11911001","Student1",1);
        group.addUser(user);
        user = new User("11911002","Student2",1);
        assertEquals("addUser succeed",group.addUser(user));
        user = new User("11911002","Student2",1);
        assertEquals("user already exists",group.addUser(user));
        assertEquals(2,group.getUserList().size());

        Office office = new Office();
        assertEquals("addOffice succeed", group.addOffice(office));
        System.out.println(group.toString());
        assertEquals("Group{id=1, piId='30001001', userList=[User{id='11911001', name='Student1', gender=1, role=null, residentialCollege=null, department='null', district='null', domain='null', buildingNo=0, roomNo=0, dateBackToShenzhen=null, isValid=true, bodyTemperature=0.0, temperatureTestTime=null}, User{id='11911002', name='Student2', gender=1, role=null, residentialCollege=null, department='null', district='null', domain='null', buildingNo=0, roomNo=0, dateBackToShenzhen=null, isValid=true, bodyTemperature=0.0, temperatureTestTime=null}], officeList=[Office{id=1, domain='null', buildingNo=0, roomNo=0, area=0.0, count=1}], isValid=true, count=1}",group.toString(),"toString() error");
        assertEquals("user not exists",group.deleteUser("11911003"));
        assertEquals(2,group.getUserList().size());
        assertEquals("deleteUser succeed",group.deleteUser("11911001"));
        assertEquals(1,group.getUserList().size());

        System.out.println(group.toString());
        assertEquals("Group{id=1, piId='30001001', userList=[User{id='11911002', name='Student2', gender=1, role=null, residentialCollege=null, department='null', district='null', domain='null', buildingNo=0, roomNo=0, dateBackToShenzhen=null, isValid=true, bodyTemperature=0.0, temperatureTestTime=null}], officeList=[Office{id=1, domain='null', buildingNo=0, roomNo=0, area=0.0, count=1}], isValid=true, count=1}",group.toString(),"toString() error");

        office = new Office("Innovation Park",10,501,10.1);
        assertEquals("addOffice succeed", group.addOffice(office));
        office = new Office("Innovation Park",10,502,10.1);
        office.setId(2);
        assertEquals("office already exists", group.addOffice(office));
        assertEquals("deleteOffice succeed", group.deleteOffice(office.getId()));
        assertEquals("office not exists", group.deleteOffice(4));
        assertTrue(group.isValid());
        group.setValid(false);
        assertFalse(group.isValid());

        group = new Group("PI1");
        System.out.println(group.toString());
        assertEquals(2,group.getCount());
        assertEquals("Group{id=2, piId='PI1', userList=[], officeList=[], isValid=true, count=2}",group.toString(),"maybe id&count / toString() error");

    }
}
