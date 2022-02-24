import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class assignment4Demolatest {
    @Test
   void Vehicleperation_task01_constructor()  {
        ArrayList<String> busLine = new ArrayList<>();
        busLine.add("staionS");
        busLine.add("staionA");
        busLine.add("staionB");
        busLine.add("staionC");
        VehicleRun V1 = new VehicleRun("60:05", busLine, true, 15.5f);
        //VehicleRun V2 = new VehicleRun("60:05", busLine, true, -3f);

        Class<VehicleRun> clazz = VehicleRun.class;
        Constructor[] Constructors = clazz.getDeclaredConstructors();
        try {
            Field fieldDepartureTime= V1.getClass().getDeclaredField("departureTime");
            Field fieldBusLine= V1.getClass().getDeclaredField("busLine");
            Field fieldThroughTicket= V1.getClass().getDeclaredField("throughTicket");
            Field fieldFee= V1.getClass().getDeclaredField("fee");
            Field fieldIncome= V1.getClass().getDeclaredField("income");
            fieldDepartureTime.setAccessible(true);
            fieldBusLine.setAccessible(true);
            fieldThroughTicket.setAccessible(true);
            fieldFee.setAccessible(true);
            fieldIncome.setAccessible(true);
            Random rd = new Random();
            int r = rd.nextInt(busLine.size());

            assertEquals(0.0f, fieldIncome.get(V1)," VehicleRun's income is not right!");
            assertEquals(15.5f, fieldFee.get(V1),"VehicleRun's Fee is not right!");
            assertEquals(true, fieldThroughTicket.get(V1),"VehicleRun's ThroughTicket is not right!");
            assertEquals("60:05", fieldDepartureTime.get(V1),"VehicleRun's DepartureTime is not right!");
            assertEquals(busLine.size(),V1.getpCntOff().length,"VehicleRun's pCntOff.length is not right!");
            assertEquals(busLine.size(),V1.getpCntOn().length,"VehicleRun's pCntOfn.length is not right!");
        } catch (NoSuchFieldException  e) {
            fail("Missing attribute");
        }catch ( IllegalAccessException e){
            fail("IllegalAccessException");
        }

    }

    @Test
    public void Vehicleperation_task02_example(){
        try {

        ArrayList<String> busLine = new ArrayList<>();
        busLine.add("staionS");
        busLine.add("staionA");
        busLine.add("staionB");
        busLine.add("staionC");
        VehicleRun V1 = new VehicleRun("E11", busLine, true, 15.5f);
        V1.updateCntOnStation("staionS", 15, 0);
        V1.updateCntOnStation("staionA", 2, 5);
        V1.updateCntOnStation("staionB", 3, 4);
        V1.updateCntOnStation("staionC", 0, 11);
        Class clazz = VehicleRun.class;
        Field nameA = clazz.getDeclaredField("pCntOff");
        Field nameB = clazz.getDeclaredField("pCntOn");
        nameA.setAccessible(true);
        nameB.setAccessible(true);
        Object pCntOffDemo=nameA.get(V1);
        Object pCntOnDemo=nameB.get(V1);
        int[] pCntOffArray = (int[])pCntOffDemo;
        int[] pCntOnArray = (int[])pCntOnDemo;
        assertEquals(0,pCntOffArray[0],"pCntOff is not right");
        assertEquals(2,pCntOnArray[1],"pCntOn is not right");
        assertFalse(  V1.updateCntOnStation("staionH", 5, 4));
    }catch (Exception e){
        fail("updateCntOnStationRunError");
    }
}
    @Test
    public void Vehicleperation_task03_example2(){
        Random rd = new Random();
        Class<VehicleRun> clazz = VehicleRun.class;
        try {
            ArrayList<String> busLine = new ArrayList<>();
            busLine.add("staionS");
            busLine.add("staionA");
            busLine.add("staionB");
            busLine.add("staionC");
            busLine.add("staionD");
            busLine.add("staionH");
            VehicleRun V1 = new VehicleRun("06:00", busLine, true, 15.5f);
            Field FiledpCntOn= V1.getClass().getDeclaredField("pCntOn");
            Field FiledpCntOff= V1.getClass().getDeclaredField("pCntOff");
            FiledpCntOff.setAccessible(true);
            FiledpCntOn.setAccessible(true);
            Method methodF= clazz.getDeclaredMethod("setpCntOn", int[].class);//
            Field fieldBusLine= V1.getClass().getDeclaredField("busLine");
            int r3 = rd.nextInt(busLine.size());
            int r4 = rd.nextInt(busLine.size());
            V1.setpCntOn(new int[]{5, 2, 7,1,13,0});
            V1.setpCntOff(new int[]{0,3,4,9,8,4});
            assertEquals(Array.get(FiledpCntOn.get(V1),r4), V1.getpCntOn()[r4],"pCntOn's itemValue is not right");//TODO
            assertEquals(Array.get(FiledpCntOn.get(V1),r4), V1.getpCntOn()[r4],"pCntOn's itemValue is not right");
            assertEquals(Array.get(FiledpCntOff.get(V1),r3), V1.getpCntOff()[r3],"pCntOff's itemValue is not right");
            assertEquals(Array.get(FiledpCntOff.get(V1),r4), V1.getpCntOff()[r4],"pCntOff's itemValue is not right");
        } catch (NoSuchMethodException e) {
            fail("missing method!");
        }catch (NoSuchFieldException e){
            fail("missing field!");
        } catch (IllegalAccessException e) {
            fail("IllegalAccessException");
        }
    }
    }


