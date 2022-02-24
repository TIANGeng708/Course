package HW4;

import java.util.Scanner;

public class Schedule {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int busNum = sc.nextInt();
        String list = sc.next();
        StringBuilder schedule[] = Schedule(list, busNum);
        if (schedule != null)
            for (StringBuilder s : schedule) {
                System.out.println(s.toString());
            }
    }
    public static StringBuilder[] Schedule(String timelist, int busNum) {
        int cc=0;
        cc=Math.min(busNum,(timelist.length()+1)/6);
        if (busNum<=0){
            System.out.print("Bus Number is negative or zero, error!");
            return null;
        }
        int changdu=timelist.length();
        int a22=-1;int b22=-1;int c1=0;int x=1;StringBuilder[] huanchong=new StringBuilder[cc];
        for (int j=0;j<cc;j++){
            String kongzhi="";
            huanchong[j]=new StringBuilder(kongzhi);
            //System.out.println(huanchong[j]);
        }
        for (int i=0;i<=changdu-4;){
            String a1=timelist.substring(i,i+2);
            String b1=timelist.substring(i+3,i+5);
            String che=timelist.substring(i,i+5);
            int a11 = Integer.parseInt(a1);
            int b11=Integer.parseInt(b1);
            if (a11*60+b11>=a22*60+b22){
                ;
            }
            else {
                //System.out.println(a11*60+b11);
                //System.out.println(a22*60+b22);
                System.out.print("Time Table error!");
                return null;
            }
            if (a11>=24||a11<0||b11<0||b11>=60){
                System.out.print("Time Table error!");
                return null;
            }
            else {
                ;
            }
            if (a11==a22&&b11==b22){
                c1=c1+1;
                //System.out.print(c1);
            }
            else {
                c1=1;
            }
            if (c1>busNum){
                System.out.print("Dispatching failed!");
                return null;
            }
            else {
                //System.out.println(c1);
                //System.out.println(busNum);
            }
            if (x<=busNum) {
                String op=""+huanchong[x-1];
                op=op+"_"+che;
                StringBuilder po  = new StringBuilder(op);
                huanchong[x - 1] = po;
                x=x+1;
            }
            else {
                String op=""+huanchong[0];
                op=op+"_"+che;
                StringBuilder po=new StringBuilder(op);
                huanchong[0]=po;
                x=2;
            }

            a22=a11;
            b22=b11;
            i=i+6;
        }
        for (int o=0;o<cc;o++){
            String g=""+huanchong[o];
            String h=g.substring(1,g.length());
            huanchong[o]=new StringBuilder(h);
        }

        return huanchong;
        }
}