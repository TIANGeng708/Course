import java.util.*;
public class HW2_3 {
    public static void main(String[] args){
        String a;
        int ppp=0;
        int qqq=1;
        int []shuzu=new int[100000000];
        int a0=0;
        int a1=0;
        int a2=0;
        int a3=0;
        int a4=0;
        int a5=0;
        int a6=0;
        int a7=0;
        int a8=0;
        int a9=0;
        Scanner input=new Scanner(System.in);
        a=input.next();
        int bb=0;
        bb=a.length();
        while (qqq<=bb){
            String c= a.substring(ppp,qqq);
            ppp=ppp+1;
            qqq=qqq+1;
            if (c.equals("0")){
                a0=a0+1;
                continue;
            }
            if (c.equals("1")){
                a1=a1+1;
                continue;
            }
            if (c.equals("2")){
                a2=a2+1;
                continue;
            }
            if (c.equals("3")){
                a3=a3+1;
                continue;
            }
            if (c.equals("4")){
                a4=a4+1;
                continue;
            }
            if (c.equals("5")){
                a5=a5+1;
                continue;
            }
            if (c.equals("6")){
                a6=a6+1;
                continue;
            }
            if (c.equals("7")){
                a7=a7+1;
                continue;
            }
            if (c.equals("8")){
                a8=a8+1;
                continue;
            }
            if (c.equals("9")){
                a9=a9+1;
                continue;
            }
            else {
                ;
            }
            break;
            //else{
             //   System.out.printf("%d",ppp);

            //    break;
           // }
        }
        System.out.printf("%d %d %d %d %d %d %d %d %d %d",a0,a1,a2,a3,a4,a5,a6,a7,a8,a9);

    }
}
