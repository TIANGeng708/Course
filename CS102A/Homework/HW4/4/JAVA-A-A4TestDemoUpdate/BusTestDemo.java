import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class BusTestDemo {
    /**
     * @return one Bus object, which will be used in following test cases
     */
    private Bus busObj(){
        ArrayList<String> line1 = new ArrayList<>();
        line1.add("A");
        line1.add("B");
        line1.add("C");

        VehicleRun vr1 = new VehicleRun("06:00", line1, true, 10.0f);

        ArrayList<VehicleRun> vr = new ArrayList<>();
        vr.add(vr1);

        return new Bus("123456", 20, vr);
    }

    /**
     * one legal test case of through-ticket
     *
     * stations:           A          B          C
     * get on number:      3          2          0
     * get off number:     0          3          2
     * passenger get on:   p1,p2,p3   p4,p5      null
     * passenger get off:  null       p1,p2,p3   p4,p5
     *
     * check: value of pCntOn[] and pCntOff[] in VehicleRun object
     *                 boardingStation and balance in Passenger objects
     *
     * result: pCntOn = {3, 2, 0}
     *         pCntOff = {0, 3, 2}
     *         balance: 90.0f for all passengers
     *         boarding station: note in following comments
     */
    @Test
    void arriveStationTest1(){
        Bus b = busObj(); //one Bus object

        ArrayList<Passenger> pgo = new ArrayList<>();
        ArrayList<Passenger> pgf = new ArrayList<>();
        int[] pCntOn = b.getVrs().get(0).getpCntOn();
        int[] pCntOff = b.getVrs().get(0).getpCntOff();

        Passenger p1 = new Passenger(100);
        Passenger p2 = new Passenger(100);
        Passenger p3 = new Passenger(100);
        Passenger p4 = new Passenger(100);
        Passenger p5 = new Passenger(100); //five passengers

        //first station A
        int cvi = 0;
        String xs = "A";

        pgo.add(p1);
        pgo.add(p2);
        pgo.add(p3); //three passengers get on and no passenger get off


        for (int i = 0; i < pCntOn.length; i++) {
            assertEquals(0, pCntOn[i], "initialization of pCntOn[] is wrong");
            assertEquals(0, pCntOff[i], "initialization of pCntOff[] is wrong");
        } //check initialization

        b.arriveStation(cvi, xs, pgo, pgf); //A arrived

        //check
        assertEquals(3, pCntOn[0], "value of pCntOn[] is wrong");
        assertEquals(0, pCntOff[0], "value of pCntOff[] is wrong"); //check if numbers of passengers get on and get off are right

        assertEquals("A", p1.getBoardingStation(), "value of boardingStation is wrong");
        assertEquals("A", p2.getBoardingStation(), "value of boardingStation is wrong");
        assertEquals("A", p3.getBoardingStation(), "value of boardingStation is wrong"); //check if boarding station be changed correctly

        assertEquals(90.0f, p1.getBalance(), 0.01f, "value of balance is wrong");
        assertEquals(90.0f, p2.getBalance(), 0.01f, "value of balance is wrong");
        assertEquals(90.0f, p3.getBalance(), 0.01f, "value of balance is wrong"); //check if balance be changed correctly

        int onbus = 0;
        for(int i = 0; i < pCntOn.length; i++){
            onbus += pCntOn[i];
            onbus -= pCntOff[i];
        }
        assertEquals(3, onbus, "number of passengers on the bus is wrong"); //check if amount of people in bus is right

        //second station B
        xs = "B";

        pgo.clear();
        pgo.add(p4);
        pgo.add(p5); //two passenger get on

        pgf.add(p1);
        pgf.add(p2);
        pgf.add(p3); //three passenger get off

        b.arriveStation(cvi, xs, pgo, pgf); //B arrived

        //check, same as above
        assertEquals(2, pCntOn[1], "value of pCntOn[] is wrong");
        assertEquals(3, pCntOff[1], "value of pCntOff[] is wrong");

        assertNull(p1.getBoardingStation(), "value of boardingStation is wrong");
        assertNull(p2.getBoardingStation(), "value of boardingStation is wrong");
        assertNull(p3.getBoardingStation(), "value of boardingStation is wrong");
        assertEquals("B", p4.getBoardingStation(), "value of boardingStation is wrong");
        assertEquals("B", p5.getBoardingStation(), "value of boardingStation is wrong");

        assertEquals(90.0f, p1.getBalance(), 0.01f, "value of balance is wrong");
        assertEquals(90.0f, p2.getBalance(), 0.01f, "value of balance is wrong");
        assertEquals(90.0f, p3.getBalance(), 0.01f, "value of balance is wrong");
        assertEquals(90.0f, p4.getBalance(), 0.01f, "value of balance is wrong");
        assertEquals(90.0f, p5.getBalance(), 0.01f, "value of balance is wrong");

        onbus = 0;
        for(int i = 0; i < pCntOn.length; i++){
            onbus += pCntOn[i];
            onbus -= pCntOff[i];
        }
        assertEquals(2, onbus, "number of passengers on the bus is wrong");

        //third station C (last station)
        xs = "C";

        pgo.clear(); //no passenger get on

        pgf.clear();
        pgf.add(p4);
        pgf.add(p5); //two passenger get off

        b.arriveStation(cvi, xs, pgo, pgf); //C arrived(the last station)

        //check, same as above
        assertEquals(0, pCntOn[2], "value of pCntOn[] is wrong");
        assertEquals(2, pCntOff[2], "value of pCntOff[] is wrong");

        assertNull(p4.getBoardingStation(), "value of boardingStation is wrong");
        assertNull(p5.getBoardingStation(), "value of boardingStation is wrong");

        assertEquals(90.0f, p4.getBalance(), 0.01f, "value of balance is wrong");
        assertEquals(90.0f, p5.getBalance(), 0.01f, "value of balance is wrong");

        onbus = 0;
        for(int i = 0; i < pCntOn.length; i++){
            onbus += pCntOn[i];
            onbus -= pCntOff[i];
        }
        assertEquals(0, onbus, "number of passengers on the bus is wrong");
    }

    /**
     * one illegal test case of through-ticket
     * type: passengers get off at the first station
     *
     * stations:           A       B       C
     * get on number:      0       \       \
     * get off number:     1       \       \
     * passenger get on:   null    \       \
     * passenger get off:  p1      \       \
     *
     * result: return when station "A" arrived
     *
     * check: arriveStation method return false or not
     */
    @Test
    void arriveStationTest2(){
        Bus b = busObj(); //one Bus object

        ArrayList<Passenger> pgo = new ArrayList<>();
        ArrayList<Passenger> pgf = new ArrayList<>();

        Passenger p1 = new Passenger(100);

        //station A
        int cvi = 0;
        String xs = "A";

        pgf.add(p1); //no passengers get on and one passenger get off at the first station

        assertFalse(b.arriveStation(cvi, xs, pgo, pgf), "return value of arriveStation method is wrong"); //check if return false
    }

    /**
     * one illegal test case of through-ticket
     * type: get off < in bus at last station
     *
     * stations:           A          B          C
     * get on number:      3          2          0
     * get off number:     0          3          1
     * passenger get on:   p1,p2,p3   p4,p5      null
     * passenger get off:  null       p1,p2,p3   p4
     *
     * result: return false when station "C" arrived(the last station)
     *
     * check: arriveStation method return false or not
     */
    @Test
    void arriveStationTest3(){
        Bus b = busObj(); //one Bus object

        ArrayList<Passenger> pgo = new ArrayList<>();
        ArrayList<Passenger> pgf = new ArrayList<>();

        Passenger p1 = new Passenger(100);
        Passenger p2 = new Passenger(100);
        Passenger p3 = new Passenger(100);
        Passenger p4 = new Passenger(100);
        Passenger p5 = new Passenger(100); //five passengers

        //first station A
        int cvi = 0;
        String xs = "A";

        pgo.add(p1);
        pgo.add(p2);
        pgo.add(p3); //three passengers get on and no passenger get off

        b.arriveStation(cvi, xs, pgo, pgf); //A arrived

        //second station B
        xs = "B";

        pgo.clear();
        pgo.add(p4);
        pgo.add(p5); //two passenger get on

        pgf.add(p1);
        pgf.add(p2);
        pgf.add(p3); //three passenger get off

        b.arriveStation(cvi, xs, pgo, pgf); //B arrived

        //third station C (last station)
        xs = "C";

        pgo.clear(); //no passenger get on

        pgf.clear();
        pgf.add(p4); //one passenger get off

        assertFalse(b.arriveStation(cvi, xs, pgo, pgf), "return value of arriveStation method is wrong"); //C arrived(the last station), check if it return false
    }

}
