import java.util.*;
public class HW2_1 {
    public static void main(String[] args){
        int a=0;
        int qianshu=0;
        int c=0;
        int d=0;
        Scanner input=new Scanner(System.in);
        a=input.nextInt();
        qianshu=input.nextInt();
        int [] jiage=new int[a];

        for (int counter_1=0;counter_1<jiage.length;counter_1++){
            jiage[counter_1]=input.nextInt();
        }
        for (int n=0;n<jiage.length;n++){
            for (int m=0; m<jiage.length;m++){
                if (jiage[n]+jiage[m]==qianshu&&n<m){
                    c=n+1;
                    d=m+1;
                    System.out.printf("%d %d",c,d);
                }
            }
        }

    }
}
