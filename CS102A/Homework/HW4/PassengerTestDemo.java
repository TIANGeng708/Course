import HW4.Passenger;
import HW4.VehicleRun;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PassengerTestDemo {

    @Test
    /***
     *  一个小小的上车example 通票
     */
    void example1() {
        ArrayList<String> busline = new ArrayList<>();
        busline.add("station1");
        busline.add("station2");
        busline.add("station3");
        VehicleRun vr = new VehicleRun("06:06",busline,true,2.0f);

        // new 一个 passenger p1 有2块钱
        Passenger p1 = new Passenger(2.0f);

        // p1上车，现在在路线vr经过的station2站点 如果上车成功就会返回true 这里不报错
        assertTrue(p1.getOn(vr,"station2"));
        // 因为是through ticket，所以p1上车买票，票价为2块钱，所以p1现在没钱了。
        assertEquals(p1.getBalance(),0.0f,0.01f);
        // boardingStation记录了p1上车的站点 是station2
        assertEquals(p1.getBoardingStation(),"station2");
        // 因为上车成功，那么汽车在这条路线上赚了2块钱。
        assertEquals(vr.getIncome(),2.0f,0.01f);
    }

    @Test
    /***
     *  一个小小的上车example 通票的失败版本  乘客没钱上车
     */
    void example2() {
        ArrayList<String> busline = new ArrayList<>();
        busline.add("station1");
        busline.add("station2");
        busline.add("station3");
        VehicleRun vr = new VehicleRun("06:06",busline,true,2.0f);

        // new 一个 passenger p1 但是初始化的时候钱是负数。
        Passenger p1 = new Passenger(-2.0f);

        // p1上车，现在在路线vr经过的station1站点 因为没钱买票，所以上不了车，返回false
        assertFalse(p1.getOn(vr,"station1"));
        // 上车失败了，p1的钱不变
        assertEquals(p1.getBalance(),-2.0f,0.01f);
        // boardingStation是null
        assertNull(p1.getBoardingStation());
    }

    @Test
    /***
     *  一个小小的上车example 通票的失败版本  乘客在错误的站点上车
     */
    void example3() {
        ArrayList<String> busline = new ArrayList<>();
        busline.add("station1");
        busline.add("station2");
        busline.add("station3");
        VehicleRun vr = new VehicleRun("06:06",busline,true,1.0f);

        // new 一个 passenger p1 但是初始化的时候钱是负数。
        Passenger p1 = new Passenger(1.0f);

        // p1在station4上车，而这个站点不在路线vr上 因此上车失败
        assertFalse(p1.getOn(vr,"station4"));
        // 上车失败了，p1的钱不变
        assertEquals(p1.getBalance(),1.0f,0.01f);
        // boardingStation是null
        assertNull(p1.getBoardingStation());
    }


    @Test
    /***
     *  非通票的下车成功
     */
    void example4() {
        ArrayList<String> busline = new ArrayList<>();
        busline.add("station1");
        busline.add("station2");
        busline.add("station3");
        VehicleRun vr = new VehicleRun("06:06", busline, false, 1.0f);

        Passenger p1 = new Passenger(1.0f);
        assertTrue(p1.getOn(vr,"station1"));
        // 因为是non-through ticket，所以p1上车不花钱
        assertEquals(p1.getBalance(),1.0f,0.01f);
        // boardingStation记录了p1上车的站点 是station1
        assertEquals(p1.getBoardingStation(),"station1");
        // 因为是non-through ticket，汽车赚的钱不在上车的时候结算
        assertEquals(vr.getIncome(),0.0f,0.01f);

        //接下来p1在station3下车
        assertTrue(p1.getOff(vr, "station3"));
        //p1的boardingStation是station1，从station1到station3，经过了2站，共花去2块钱，p1欠了一块钱
        assertEquals(p1.getBalance(), -1.0f, 0.01f);
        //下车后p1的boardingStation变成了null
        assertNull(p1.getBoardingStation());
        //汽车赚了2块钱
        assertEquals(vr.getIncome(), 2.0f, 0.01f);
    }

    @Test
    /***
     *  非通票的下车失败， 下车站点不在汽车的路线上。
     */
    void example5() {
        ArrayList<String> busline = new ArrayList<>();
        busline.add("station1");
        busline.add("station2");
        busline.add("station3");
        VehicleRun vr = new VehicleRun("06:06", busline, false, 1.0f);

        Passenger p1 = new Passenger(1.0f);
        assertTrue(p1.getOn(vr,"station1"));

        //接下来p1在station4下车 这个站点不在vr上  p1下车失败
        assertFalse(p1.getOff(vr, "station4"));
        //p1没花钱
        assertEquals(p1.getBalance(), 1.0f, 0.01f);
        //未下车
        assertEquals(p1.getBoardingStation(), "station1");
        //汽车也还没获得收入
        assertEquals(vr.getIncome(), 0.0f, 0.01f);
    }

    @Test
    /***
     *  一个小小的充值example
     */
    void example6() {

        // new 一个 passenger p1 有3块钱
        Passenger p1 = new Passenger(3.0f);

        // 现在给p1充值2块钱。
        assertTrue(p1.refill(2.0f));

        // 充值成功 p1的balance变成了5块钱。
        assertEquals(p1.getBalance(),5.0f, 0.01f);

    }
}
