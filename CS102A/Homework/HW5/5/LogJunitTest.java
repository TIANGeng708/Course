import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

public class LogJunitTest {
    @Test
    public void testCase(){
        Log log = new Log("Bryan", 1, 37.0, LocalDateTime.of(2020,4,23,8,30,30));
        assertEquals(1,log.getCount());
        assertEquals(1,log.getId(), "getOfficeId() error");

        log = new Log("Ford", 1, 37.1, LocalDateTime.of(2020,4,23,9,30,30));
        assertEquals(2,log.getCount());
        assertEquals(2,log.getId(), "getId() error");
        assertEquals("Ford",log.getUserId(),"getUserId() error");

        log = new Log();
        log.setCount(3);
        assertEquals(3,log.getCount());
        log.setUserId("FTY");
        assertEquals("FTY",log.getUserId(),"getUserId() error");
        log.setOfficeId(2);
        assertEquals(2,log.getOfficeId(),"getOfficeId() error");
        log.setTemperature(37.2);
        assertEquals(37.2,log.getTemperature(),"getTemperature() error");
        log.setDateTime(LocalDateTime.of(2020,4,23,10,30,30));
        assertEquals(LocalDateTime.of(2020,4,23,10,30,30),log.getDateTime(),"getDateTime() error");
        assertEquals("Log{id=3, userId='FTY', officeId=2, temperature=37.2, dateTime=2020-04-23T10:30:30, count=3}", log.toString());
        System.out.println(log.toString());








    }
}
