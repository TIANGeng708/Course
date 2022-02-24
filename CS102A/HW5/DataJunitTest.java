package HW5;

import HW5.Data;
import HW5.User;
import org.junit.jupiter.api.*;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

public class DataJunitTest {

    @Test
    public void testCase() {
        Data data = new Data();
        Data.initialize();
        // 1 Test Data.initialize()
        // 1.1 Test UserList
        assertTrue(data.getUser("11910003").isValid());
        assertEquals("deleteUser succeed", data.deleteUser("11910003"));
        assertFalse(data.getUser("11910003").isValid());
        data.getUser("11910003").setValid(true);

        // 1.2 Test OfficeList
        assertTrue(data.getOffice(1).isValid());
        assertEquals("deleteOffice succeed", data.deleteOffice(1));
        assertFalse(data.getOffice(1).isValid());
        data.getOffice(1).setValid(true);

        // 1.3 Test GroupList
        assertTrue(data.getGroup(1).isValid());
        assertEquals("deleteGroup succeed", data.deleteGroup(1));
        assertFalse(data.getGroup(1).isValid());
        data.getGroup(1).setValid(true);

        // 1.4 Test LogList
        assertEquals(14, data.getLogList().size());

        // 2 Test canAccessCampus && accessCampus
        // 2.1 for users who lives outside campus
        User user = data.getUser("30001001");
        user.setDateBackToShenzhen(LocalDate.of(2020, 4, 1));

        // 2.1.1 user back to Shenzhen less than 14 days
        LocalDateTime dateTime = LocalDateTime.of(2020, 4, 14, 10, 20, 10);
        assertFalse((int) Duration.between(LocalDateTime.of(user.getDateBackToShenzhen(), LocalTime.of(0, 0, 0)), dateTime).toDays() >= 14);
        user.takeTemperature(37.0, dateTime);
        assertFalse(data.canAccessCampus(user.getId(), dateTime));
        assertFalse(data.accessCampus(user.getId(), dateTime));

        // 2.1.2 user back to Shenzhen up to 14 days
        dateTime = LocalDateTime.of(2020, 4, 15, 10, 20, 10);
        assertTrue((int) Duration.between(LocalDateTime.of(user.getDateBackToShenzhen(), LocalTime.of(0, 0, 0)), dateTime).toDays() >= 14);
        user.takeTemperature(37.0, dateTime);
        assertTrue(data.canAccessCampus(user.getId(), dateTime));
        assertTrue(data.accessCampus(user.getId(), dateTime));

        // 2.1.3 user back to Shenzhen over 14 days
        dateTime = LocalDateTime.of(2020, 4, 20, 10, 20, 10);
        user.takeTemperature(37.0, dateTime);
        assertTrue(data.canAccessCampus(user.getId(), dateTime));
        assertTrue(data.accessCampus(user.getId(), dateTime));

        // 2.1.4 user's body temperature over 37.3
        user.takeTemperature(37.3, dateTime);
        assertFalse(data.canAccessCampus(user.getId(), dateTime));
        assertFalse(data.accessCampus(user.getId(), dateTime));
        user.takeTemperature(37.5, dateTime);
        assertFalse(data.canAccessCampus(user.getId(), dateTime));
        assertFalse(data.accessCampus(user.getId(), dateTime));

        // 2.2 for users who lives outside campus
        user = data.getUser("11910001");
        user.setDateBackToShenzhen(LocalDate.of(2020, 4, 1));

        // 2.2.1 user back to Shenzhen less than 14 days
        dateTime = LocalDateTime.of(2020, 4, 14, 10, 20, 10);
        assertFalse((int) Duration.between(LocalDateTime.of(user.getDateBackToShenzhen(), LocalTime.of(0, 0, 0)), dateTime).toDays() >= 14);
        user.takeTemperature(37.0, dateTime);
        assertTrue(data.canAccessCampus(user.getId(), dateTime));
        assertTrue(data.accessCampus(user.getId(), dateTime));

        // 2.2.2 user back to Shenzhen up to 14 days
        dateTime = LocalDateTime.of(2020, 4, 15, 10, 20, 10);
        assertTrue((int) Duration.between(LocalDateTime.of(user.getDateBackToShenzhen(), LocalTime.of(0, 0, 0)), dateTime).toDays() >= 14);
        user.takeTemperature(37.0, dateTime);
        assertTrue(data.canAccessCampus(user.getId(), dateTime));
        assertTrue(data.accessCampus(user.getId(), dateTime));

        // 2.2.3 user back to Shenzhen over 14 days
        dateTime = LocalDateTime.of(2020, 4, 20, 10, 20, 10);
        user.takeTemperature(37.0, dateTime);
        assertTrue(data.canAccessCampus(user.getId(), dateTime));
        assertTrue(data.accessCampus(user.getId(), dateTime));

        // 2.2.4 user's body temperature over 37.3
        // will live in separated area, but allowed into campus
        user.takeTemperature(37.3, dateTime);
        assertTrue(data.canAccessCampus(user.getId(), dateTime));
        assertTrue(data.accessCampus(user.getId(), dateTime));
        user.takeTemperature(37.5, dateTime);
        assertTrue(data.canAccessCampus(user.getId(), dateTime));
        assertTrue(data.accessCampus(user.getId(), dateTime));


        // 3 Test accessCampusUserCount
        assertEquals(2, data.accessCampusUserCount(dateTime));

        user = data.getUser("30001002");
        dateTime = LocalDateTime.of(2020, 4, 20, 10, 00, 00);
        user.takeTemperature(37.0, dateTime);
        data.accessCampus(user.getId(), dateTime);// user access campus first time today
        dateTime = LocalDateTime.of(2020, 4, 20, 18, 00, 1);
        data.accessCampus(user.getId(), dateTime);// user access campus second time today
        user = data.getUser("30001003");
        user.takeTemperature(37.0, dateTime);
        data.accessCampus(user.getId(), dateTime);
        assertEquals(4, data.accessCampusUserCount(dateTime));

        // 4 Test canAccessOffice && accessOffice
        user = data.getUser("11910001");
        user.setDateBackToShenzhen(LocalDate.of(2020, 4, 1));
        dateTime = LocalDateTime.of(2020,4,20, 10,00,00);
        user.takeTemperature(37.0,dateTime);
        assertTrue(data.canAccessOffice("11910001", 1, LocalDateTime.of(2020,4,20, 10,00,00)));
        assertTrue( data.accessOffice("11910001", 1, LocalDateTime.of(2020,4,20, 11,00,00)));
        assertTrue( data.accessOffice("11910001", 1, LocalDateTime.of(2020,4,20, 18,00,00)));
        user = data.getUser("11910002");
        user.takeTemperature(37.0, dateTime);
        assertTrue( data.accessOffice(user.getId(), 1, dateTime));
        user = data.getUser("30001002");
        user.takeTemperature(37.0, dateTime);
        assertFalse( data.canAccessOffice(user.getId(), 1, dateTime));

        // 5 Test accessOfficeUsers
        //System.out.println(data.accessOfficeUsers(1,dateTime));
        assertEquals("[User{id='11910001', name='Student1', gender=0, role=UNDERGRADUATE, residentialCollege=ZHIREN, department='CSE', district='SUSTech', domain='Lychee Park', buildingNo=1, roomNo=101, dateBackToShenzhen=2020-04-01, isValid=true, bodyTemperature=37.0, temperatureTestTime=2020-04-20T10:00}, User{id='11910002', name='Student2', gender=1, role=UNDERGRADUATE, residentialCollege=ZHIXIN, department='CSE', district='SUSTech', domain='Lychee Park', buildingNo=1, roomNo=102, dateBackToShenzhen=null, isValid=true, bodyTemperature=37.0, temperatureTestTime=2020-04-20T10:00}]",data.accessOfficeUsers(1,dateTime).toString());


        //Test accessOffice
        data.getUser("11910001").takeTemperature(37.0,LocalDateTime.of(2020,4,21, 8,00,00));
        assertTrue( data.accessOffice("11910001", 1, LocalDateTime.of(2020,4,21, 8,00,00)));
        data.getUser("11910001").takeTemperature(37.0,LocalDateTime.of(2020,4,21, 13,00,00));
        assertTrue( data.accessOffice("11910001", 1, LocalDateTime.of(2020,4,21, 13,00,00)));
        data.getUser("11910001").takeTemperature(37.0,LocalDateTime.of(2020,4,22, 12,00,00));
        assertTrue( data.accessOffice("11910001", 1, LocalDateTime.of(2020,4,22, 12,00,00)));
        assertEquals("[2, 2, 1]", data.accessOfficeTimes("11910001",1,LocalDateTime.of(2020,4,20, 8,00,00), LocalDateTime.of(2020,4,22, 14,00,00)).toString());
    }
}
