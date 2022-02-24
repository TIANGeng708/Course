import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class UserJunitTest {

    @Test
    public void testCase(){
        User user = new User("11911234","Student1",1);
        assertEquals("11911234", user.getId(),"getId() error");
        assertEquals("Student1",user.getName(), "set/getName() error");
        assertEquals(1, user.getGender(),"set/getGender() error");
        user.setName("S1");
        assertEquals("S1", user.getName(),"set/getName() error");

        user.setRole(Role.TEACHER);
        assertEquals(Role.TEACHER,user.getRole(),"set/getRole() or ENUM Role error");
        user.setRole(Role.STAFF);
        assertEquals(Role.STAFF,user.getRole(),"set/getRole() or ENUM Role error");
        user.setRole(Role.GRADUATE);
        assertEquals(Role.GRADUATE,user.getRole(),"set/getRole() or ENUM Role error");
        user.setRole(Role.VISITOR);
        assertEquals(Role.VISITOR,user.getRole(),"set/getRole() or ENUM Role error");
        user.setRole(Role.UNDERGRADUATE);
        assertEquals(Role.UNDERGRADUATE,user.getRole(),"set/getRole() or ENUM Role error");

        user.setResidentialCollege(ResidentialCollege.SHUDE);
        assertEquals(ResidentialCollege.SHUDE,user.getResidentialCollege(),"set/getResidentialCollege() or ENUM ResidentialCollege error");
        user.setResidentialCollege(ResidentialCollege.SHULI);
        assertEquals(ResidentialCollege.SHULI,user.getResidentialCollege(),"set/getResidentialCollege() or ENUM ResidentialCollege error");
        user.setResidentialCollege(ResidentialCollege.SHUREN);
        assertEquals(ResidentialCollege.SHUREN,user.getResidentialCollege(),"set/getResidentialCollege() or ENUM ResidentialCollege error");
        user.setResidentialCollege(ResidentialCollege.ZHICHENG);
        assertEquals(ResidentialCollege.ZHICHENG,user.getResidentialCollege(),"set/getResidentialCollege() or ENUM ResidentialCollege error");
        user.setResidentialCollege(ResidentialCollege.ZHIREN);
        assertEquals(ResidentialCollege.ZHIREN,user.getResidentialCollege(),"set/getResidentialCollege() or ENUM ResidentialCollege error");
        user.setResidentialCollege(ResidentialCollege.ZHIXIN);
        assertEquals(ResidentialCollege.ZHIXIN,user.getResidentialCollege(),"set/getResidentialCollege() or ENUM ResidentialCollege error");

        assertNull(user.getDepartment(),"set/getDepartment() error");
        user.setDepartment("CSE");
        assertEquals("CSE", user.getDepartment(),"set/getDepartment() error");

        user.setDistrict("Nanshan");
        assertEquals("Nanshan", user.getDistrict(), "set/getDistrict() error");
        user.setDistrict("SUSTech");
        assertEquals("SUSTech", user.getDistrict(), "set/getDistrict() error");

        user.setDomain("Lychee Park");
        assertEquals("Lychee Park", user.getDomain(), "set/getDomain() error");

        user.setBuildingNo(2);
        assertEquals(2,user.getBuildingNo(), "set/getBuildingNo() error");

        user.setRoomNo(201);
        assertEquals(201,user.getRoomNo(), "set/getRoomNo() error");

        user.setDateBackToShenzhen(LocalDate.of(2020,4,11));
        assertEquals(LocalDate.of(2020,4,11),user.getDateBackToShenzhen(),"set/getDateBackToShenzhen() error");

        assertTrue(user.isValid(),"setValid() or isValid() error");
        user.setValid(false);
        assertFalse(user.isValid(),"setValid() or isValid() error");


        assertEquals(0.0,user.getBodyTemperature(), "set/getBodyTemperature() error");
        user.takeTemperature(36.5, LocalDateTime.of(2020,4,11,10,0,1));
        assertEquals(36.5,user.getBodyTemperature(), "set/getBodyTemperature() error");

        assertEquals("User{id='11911234', name='S1', gender=1, role=UNDERGRADUATE, residentialCollege=ZHIXIN, department='CSE', district='SUSTech', domain='Lychee Park', buildingNo=2, roomNo=201, dateBackToShenzhen=2020-04-11, isValid=false, bodyTemperature=36.5, temperatureTestTime=2020-04-11T10:00:01}",user.toString(),"toString() error");
        //System.out.println(user.toString());
    }

}
