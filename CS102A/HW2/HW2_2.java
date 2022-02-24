import java.util.*;
public class HW2_2 {
    public static void main(String[] args){
        long a0=0;
        long m=0;
        long a=0;
        long s=0;
        long k=0;
        long c=0;
        long jisuan=0;
        Scanner input=new Scanner(System.in);
        a0=input.nextInt();
        m=input.nextInt();
        for (int d=1;d>0;d++){
            s=input.nextInt();
            if (s==-1){
                break;
            }
            k=input.nextInt();
            c++;

            if (c==1){
                jisuan=(s*a0+k)%m;
                a=a0^jisuan;
            }
            else{
                jisuan=(s*jisuan+k)%m;
                a=a^jisuan;
            }

        }
       System.out.printf("%d",a);
    }
}
