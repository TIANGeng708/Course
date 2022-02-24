import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class VRTestDemo {
    @Test
    /**
     * 测试构造方法是否正确赋值，变量是否初始化
     *测试Income、Fee、ThroughTicket、DepartureTime是否正确赋值，CntOff和CntOn的长度是否和busLine的size相等
     */
   void Vehicleperation_task01_constructor()  {
        ArrayList<String> busLine = new ArrayList<>();
        busLine.add("staionS");
        busLine.add("staionA");
        busLine.add("staionB");
        busLine.add("staionC");
        VehicleRun V1 = new VehicleRun("06:05", busLine, true, 15.5f);
       //初始化一个vehicle

        Class<VehicleRun> clazz = VehicleRun.class;
        Constructor[] Constructors = clazz.getDeclaredConstructors();
        try {
            Field fieldDepartureTime= V1.getClass().getDeclaredField("departureTime");
            Field fieldBusLine= V1.getClass().getDeclaredField("busLine");
            Field fieldThroughTicket= V1.getClass().getDeclaredField("throughTicket");
            Field fieldFee= V1.getClass().getDeclaredField("fee");
            Field fieldIncome= V1.getClass().getDeclaredField("income");
            //测试有无
            fieldDepartureTime.setAccessible(true);
            fieldBusLine.setAccessible(true);
            fieldThroughTicket.setAccessible(true);
            fieldFee.setAccessible(true);
            fieldIncome.setAccessible(true);
            assertEquals(0.0f, (float) fieldIncome.get(V1),0.01f," VehicleRun's income is not right!");
            assertEquals(15.5f, (float) fieldFee.get(V1),0.01f,"VehicleRun's Fee is not right!");
            assertEquals(true, fieldThroughTicket.get(V1),"VehicleRun's ThroughTicket is not right!");
            assertEquals("06:05", fieldDepartureTime.get(V1),"VehicleRun's DepartureTime is not right!");
            assertEquals(busLine.size(),V1.getpCntOff().length,"VehicleRun's pCntOff.length is not right!");
            assertEquals(busLine.size(),V1.getpCntOn().length,"VehicleRun's pCntOfn.length is not right!");
            //测试Income、Fee、ThroughTicket、DepartureTime是否正确赋值，CntOff和CntOn的长度是否和busLine的size相等
        } catch (NoSuchFieldException  e) {
            fail("Missing attribute");
        }catch ( IllegalAccessException e){
            fail("IllegalAccessException");
        }

    }

    /**
     *测试updateCntOnStation方法
     * 测试有无pCntOff、pCntOn变量
     * 比较下车的第一个站的人数，和上车的第二站的人数（有一个失败的样例）
     * 车站为S、A、B、C、D,上车人数为15，2，3，0，下车人数为0，5，4，11
     * 失败样例：车站H
     */
    @Test
    public void Vehicleperation_task02_example(){
        try {

        ArrayList<String> busLine = new ArrayList<>();
        busLine.add("staionS");
        busLine.add("staionA");
        busLine.add("staionB");
        busLine.add("staionC");
        //V1中有S\A\B\C四站
        VehicleRun V1 = new VehicleRun("E11", busLine, true, 15.5f);
        V1.updateCntOnStation("staionS", 15, 0);
        V1.updateCntOnStation("staionA", 2, 5);
        V1.updateCntOnStation("staionB", 3, 4);
        V1.updateCntOnStation("staionC", 0, 11);
        //加入四站的上下车人数数据
        Class clazz = VehicleRun.class;
        Field nameA = clazz.getDeclaredField("pCntOff");
        Field nameB = clazz.getDeclaredField("pCntOn");
        //测试有无pCntOff、pCntOn变量
        nameA.setAccessible(true);
        nameB.setAccessible(true);
        Object pCntOffDemo=nameA.get(V1);
        Object pCntOnDemo=nameB.get(V1);
        int[] pCntOffArray = (int[])pCntOffDemo;
        int[] pCntOnArray = (int[])pCntOnDemo;
        assertEquals(0,pCntOffArray[0],"pCntOff is not right");
        assertEquals(2,pCntOnArray[1],"pCntOn is not right");
        //比较下车的第一个站的人数，和上车的第二站的人数
        assertFalse(  V1.updateCntOnStation("staionH", 5, 4));
        //一个失败的站点H，应该返回false
    }catch (Exception e){
        fail("updateCntOnStationRunError");
    }
}

    /**
     * 测试setpCntOn、setpCntOff方法
     * 测试有无busLine变量
     * 测试有无setpCntOn方法
     * 为V1更新上车下车的人数，并随机比较上下车人数是否正确
     * 车站为S、A、B、C、D、H上车人数为5, 2, 7,1,13,0下车人数为0,3,4,9,8,4。
     */
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
            //V1的车站
            VehicleRun V1 = new VehicleRun("06:00", busLine, true, 15.5f);
            Field FiledpCntOn= V1.getClass().getDeclaredField("pCntOn");
            Field FiledpCntOff= V1.getClass().getDeclaredField("pCntOff");
            FiledpCntOff.setAccessible(true);
            FiledpCntOn.setAccessible(true);
            Method methodF= clazz.getDeclaredMethod("setpCntOn", int[].class);
           // 测试有无setpCntOn方法
            Field fieldBusLine= V1.getClass().getDeclaredField("busLine");
            //测试有无busLine变量
            int r3 = rd.nextInt(busLine.size());
            int r4 = rd.nextInt(busLine.size());
            //产生随机数r3，r4
            V1.setpCntOn(new int[]{5, 2, 7,1,13,0});
            V1.setpCntOff(new int[]{0,3,4,9,8,4});
            //为V1更新上车下车的人数
            assertEquals(Array.get(FiledpCntOn.get(V1),r4), V1.getpCntOn()[r4],"pCntOn's itemValue is not right");//TODO
            assertEquals(Array.get(FiledpCntOn.get(V1),r3), V1.getpCntOn()[r3],"pCntOn's itemValue is not right");
            assertEquals(Array.get(FiledpCntOff.get(V1),r3), V1.getpCntOff()[r3],"pCntOff's itemValue is not right");
            assertEquals(Array.get(FiledpCntOff.get(V1),r4), V1.getpCntOff()[r4],"pCntOff's itemValue is not right");
            //随机比较r3，r4的上下车人数是否正确
        } catch (NoSuchMethodException e) {
            fail("missing method!");
        }catch (NoSuchFieldException e){
            fail("missing field!");
        } catch (IllegalAccessException e) {
            fail("IllegalAccessException");
        }
    }
    /**
     * 测试setpCntOn、setpCntOff方法的第二个例子
     * 测试点同task03_example2，只是数据不同
     * 车站为S、A、B、C、D、H上车人数为12,18,1,4,2,0下车人数为12,18,1,4,2,0
     */
    @Test
    public void Vehicleperation_task04_example3(){

        Class<VehicleRun> clazz = VehicleRun.class;
        try {
            ArrayList<String> busLine = new ArrayList<>();
            busLine.add("staionS");
            busLine.add("staionA");
            busLine.add("staionB");
            busLine.add("staionC");
            busLine.add("staionD");
            busLine.add("staionH");
            //初始化一个 VehicleRun
            VehicleRun V1 = new VehicleRun("06:00", busLine, true, 15.5f);
            Field FiledpCntOn= V1.getClass().getDeclaredField("pCntOn");
            Field FiledpCntOff= V1.getClass().getDeclaredField("pCntOff");
           // 检测有无pCntOn和pCntOn变量
            FiledpCntOff.setAccessible(true);
            FiledpCntOn.setAccessible(true);
            Method methodF= clazz.getDeclaredMethod("setpCntOn", int[].class);
           // 检测有无setpCntOn方法
            Field fieldBusLine= V1.getClass().getDeclaredField("busLine");
            //检测有无BusLine变量
            Random rd = new Random();
            int r3 = rd.nextInt(busLine.size());
            int r4 = rd.nextInt(busLine.size());
            //生成随机数r3，r4
            V1.setpCntOn(new int[]{12,18,1,4,2,0});
            V1.setpCntOff(new int[]{0,9,5,13,7,3});
            //给出V1的上下车数据
            assertEquals(Array.get(FiledpCntOn.get(V1),r4), V1.getpCntOn()[r4],"pCntOn's itemValue is not right");//TODO
            assertEquals(Array.get(FiledpCntOn.get(V1),r3), V1.getpCntOn()[r3],"pCntOn's itemValue is not right");
            assertEquals(Array.get(FiledpCntOff.get(V1),r3), V1.getpCntOff()[r3],"pCntOff's itemValue is not right");
            assertEquals(Array.get(FiledpCntOff.get(V1),r4), V1.getpCntOff()[r4],"pCntOff's itemValue is not right");
//           比较r3，r4站点上下车人数是否正确
        } catch (NoSuchMethodException e) {
            fail("missing method!");
        }catch (NoSuchFieldException e){
            fail("missing field!");
        } catch (IllegalAccessException e) {
            fail("IllegalAccessException");
        }
    }
    /**
     * 测试setpCntOn、setpCntOff方法的第三个例子，测试点与同上，测试数据全为0
     * 车站为S、A、B、C、D、H上车人数为0，0，0，0，0，0下车人数为0，0，0，0，0，0
     */
    @Test
    public void Vehicleperation_task05_example4(){
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
            V1.setpCntOn(new int[]{0,0,0,0,0,0});
            V1.setpCntOff(new int[]{0,0,0,0,0,0});
//            上下车测试数据全为0
            assertEquals(Array.get(FiledpCntOn.get(V1),r4), V1.getpCntOn()[r4],"pCntOn's itemValue is not right");
            assertEquals(Array.get(FiledpCntOn.get(V1),r3), V1.getpCntOn()[r3],"pCntOn's itemValue is not right");
            assertEquals(Array.get(FiledpCntOff.get(V1),r3), V1.getpCntOff()[r3],"pCntOff's itemValue is not right");
            assertEquals(Array.get(FiledpCntOff.get(V1),r4), V1.getpCntOff()[r4],"pCntOff's itemValue is not right");
      //比较站点r3，r4的上下车数据是否正确（为0）
        } catch (NoSuchMethodException e) {
            fail("missing method!");
        }catch (NoSuchFieldException e){
            fail("missing field!");
        } catch (IllegalAccessException e) {
            fail("IllegalAccessException");
        }
    }

    /**
     * 检测更新传入2.5f给getFare()方法是否正确
     * 比较更新后income数据是否正确，并给出一个失败的样例
     * 测试数据为2.5，-5。
     */
    @DisplayName("getFareMethodText")
    @Test
    public void Vehicleperation_task06_example5() {
        try {

            ArrayList<String> busLine = new ArrayList<>();
            busLine.add("staionS");
            busLine.add("staionA");
            busLine.add("staionB");
            VehicleRun V1 = new VehicleRun("E11", busLine, false, 0.5f);
            //创造一个简单的VehicleRun
            ArrayList<VehicleRun>VOS=new ArrayList<>();
            VOS.add(V1);
            assertTrue(V1.getFare(2.5f),"your getFareMethod is wrong!");
            //检测更新传入2.5f给getFare()方法是否正确
            assertEquals(2.5f,(V1.getIncome()),0.01f,"\"your getFareMethod is wrong!\"");
           //比较更新后income数据是否正确
            assertFalse(V1.getFare(-5),"your getFareMethod is wrong!");
           //失败的样例，getFare()不可以传入负值
            assertEquals(2.5f,V1.getIncome(),0.01f,"your getFareMethod is wrong!");
          //查看传入负值后income是否未改变
        }catch (Exception e){
            e.printStackTrace();
            fail("getFareMethodRunError");
        }

    }
    /**
     * 1、	测试有无updateCntOnStation方法，并测试能否正常运行
     * 2、busline中加入四站
     * 3、添加updateCntOnStation的测试数据（包括一个失败样例）
     * 4、比较随机站点的上下车数据是否正确。
     * 测试数据车站为S、A、B、C、D、H上车人数为12,18,1,4,2,0下车人数为0,9,5,13,7,3
     */
    @DisplayName("updateCntOnStationMethodTest")
    @Test
    public void Vehicleperation_task07_example06() {
        try {

            ArrayList<String> busLine = new ArrayList<>();
            busLine.add("staionS");
            busLine.add("staionA");
            busLine.add("staionB");
            busLine.add("staionC");
            busLine.add("staionD");
            busLine.add("staionH");

            String[]str=new String[]{"staionS","staionA","staionB","staionC","staionD","staionH"};
            int[] On=new int[]{12,18,1,4,2,0};
            int[] Off=new int[]{0,9,5,13,7,3};
            //上下车数据
            VehicleRun V1 = new VehicleRun("E11", busLine, true, 15.5f);
            //初始化一个 VehicleRun
            for (int i = 0; i <str.length; i++) {
                V1.updateCntOnStation(str[i], On[i],Off[i]);
                //添加上下车数据
            }
            assertFalse( V1.updateCntOnStation("staionF", 14, 8),"updateCntOnStation method is wrong!");//TODO
            //错误的数据不会被添加
            Class clazz = VehicleRun.class;
            Field nameA = clazz.getDeclaredField("pCntOff");
            Field nameB = clazz.getDeclaredField("pCntOn");

            nameA.setAccessible(true);
            nameB.setAccessible(true);
            Object pCntOffDemo=nameA.get(V1);
            Object pCntOnDemo=nameB.get(V1);
            int[] pCntOffArray = (int[])pCntOffDemo;
            int[] pCntOnArray = (int[])pCntOnDemo;
            Random rd = new Random();
            int r3 = rd.nextInt(busLine.size());
            int r4 = rd.nextInt(busLine.size());
            //产生随机数r3，r4，获得r3，r4站点的上下车数据并比较。
            assertEquals(On[r3],pCntOnArray[r3],"updateCntOnStation method is wrong!");
            assertEquals(On[r4],pCntOnArray[r4],"updateCntOnStation method is wrong!");
            assertEquals(Off[r3],pCntOffArray[r3],"updateCntOnStation method is wrong!");
            assertEquals(Off[r4],pCntOffArray[r4],"updateCntOnStation method is wrong!");
        }catch (Exception e){
            fail("updateCntOnStationRunError");
        }
    }

    }


