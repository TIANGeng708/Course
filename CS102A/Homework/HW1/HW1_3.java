import java.util.Scanner;

public class HW1_3 {
    public static void main(String[] args){

        String booknumber;
        Scanner input= new Scanner(System.in);
        booknumber= input.next();//这是为了输出最初的书号，因为是有数字有字母，所以使用String类型

        String head= booknumber.substring(0,9);
        String tail= booknumber.substring(9,10);
        if (tail.equals("X")){
            int a= 10;
            int b= Integer.parseInt(head);
            int b1=0;
            int b2=0;
            int b3=0;
            int b4=0;
            int b5=0;
            int b6=0;
            int b7=0;
            int b8=0;
            int b9=0;
            int aa=0;

            b1= b%10;
            b2=(b-b1)/10%10;
            b3=(b-b1-b2*10)/100%10;
            b4=(b-b1-b2*10-b3*100)/1000%10;
            b5=(b-b1-b2*10-b3*100-b4*1000)/10000%10;
            b6=(b-b1-b2*10-b3*100-b4*1000-b5*10000)/100000%10;
            b7=(b-b1-b2*10-b3*100-b4*1000-b5*10000-b6*100000)/1000000%10;
            b8=(b-b1-b2*10-b3*100-b4*1000-b5*10000-b6*100000-b7*1000000)/10000000%10;
            b9=(b-b1-b2*10-b3*100-b4*1000-b5*10000-b6*100000-b7*1000000-b9*10000000)/100000000%10;
            aa= (b1*9+b2*8+b3*7+b4*6+b5*5+b6*4+b7*3+b8*2+b9*1)%11;
            if (aa==a){
                System.out.printf("Yes");
            }
            else {
                System.out.printf("No");
            }
        }

        else {
            int truetail= Integer.parseInt(tail);
            int a=truetail;
            int b= Integer.parseInt(head);
            int b1=0;
            int b2=0;
            int b3=0;
            int b4=0;
            int b5=0;
            int b6=0;
            int b7=0;
            int b8=0;
            int b9=0;
            int aa=0;

            b1= b%10;
            b2=(b-b1)/10%10;
            b3=(b-b1-b2*10)/100%10;
            b4=(b-b1-b2*10-b3*100)/1000%10;
            b5=(b-b1-b2*10-b3*100-b4*1000)/10000%10;
            b6=(b-b1-b2*10-b3*100-b4*1000-b5*10000)/100000%10;
            b7=(b-b1-b2*10-b3*100-b4*1000-b5*10000-b6*100000)/1000000%10;
            b8=(b-b1-b2*10-b3*100-b4*1000-b5*10000-b6*100000-b7*1000000)/10000000%10;
            b9=(b-b1-b2*10-b3*100-b4*1000-b5*10000-b6*100000-b7*1000000-b9*10000000)/100000000%10;
            aa= (b1*9+b2*8+b3*7+b4*6+b5*5+b6*4+b7*3+b8*2+b9*1)%11;
            if (aa==a){
                System.out.printf("Yes",aa);
            }
            else {
                System.out.printf("No",aa);
            }

        }
        input.close();
   }
}
