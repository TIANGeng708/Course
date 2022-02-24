package HW2;
import java.util.*;

public class HW2_4 {
    public static void main(String[] args){
        int a=0;
        long x=0;
        Scanner input=new Scanner(System.in);
        a=input.nextInt();
        long[]b=new long[a];
        for (int c=0;c<a;++c){
            b[c]=input.nextInt();
        }
        for (int n=0;n<a;++n){
            for (int m=0;m<a;++m){
                if (n<m&&b[n]>=b[m]){
                    x=x+b[n]*b[m];
                }
            }
        }
        System.out.print(x);
    }
}
