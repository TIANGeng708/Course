import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OfficeJunitTest {
    @Test
    public void testCase(){

        assertEquals(0,Office.getCount());
        Office office = new Office("Innovation Park",10,501,10.1);
        assertEquals(1,Office.getCount());
        assertEquals(1,office.getId(),"getOfficeId() error");
        office = new Office("Innovation Park",10,501,10.2);
        assertEquals(2,office.getId(),"getOfficeId() error");
        assertEquals("Innovation Park",office.getDomain(),"getDomain() error");
        office.setDomain("Lychee Park");
        assertEquals("Lychee Park",office.getDomain(),"getDomain() error");
        office.setBuildingNo(9);
        office.setRoomNo(510);
        office.setArea(20.2);
        assertEquals(9,office.getBuildingNo(),"set/getBuildingNo() error");
        assertEquals(510,office.getRoomNo(),"set/getRoomNo() error");
        assertEquals(20.2,office.getArea(),"set/getArea() error");

        assertTrue(office.isValid(),"isValid() error");
        office.setValid(false);
        assertFalse(office.isValid(),"setValid() error");

        office.getVistorCountToday();
        assertEquals(0,office.getVisitorCountToday(),"getVisitorCountToday() error");
        office.setVisitorCountToday(2);
        assertEquals(2,office.getVisitorCountToday(),"set/getVisitorCountToday() error");

        System.out.println(office.toString());
        assertEquals("Office{id=2, domain='Lychee Park', buildingNo=9, roomNo=510, area=20.2, count=2}",office.toString());
        //office.setCount(0);
        office = new Office();
        assertEquals(3,Office.getCount());



    }
}
