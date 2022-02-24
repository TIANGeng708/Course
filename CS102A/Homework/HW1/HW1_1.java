import java.util.Scanner;

public class HW1_1 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        int booknumber=0;
        double price=0;
        int number=0;
        double totalprice=0;

        booknumber=input.nextInt();
        price=input.nextDouble();
        number=input.nextInt();

        while (booknumber<20200000){
            booknumber= booknumber+10000;
        }
        while (booknumber>20209999){
            booknumber= booknumber-10000;
        }

        totalprice=number*price;

        System.out.printf("%d ",booknumber);
        System.out.print(Math.round(totalprice));

        input.close();
    }

}
