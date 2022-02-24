import java.util.Scanner;

public class HW1_2 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        int borrowercode=0;
        int bookcode=0;
        int number=0;

        borrowercode=input.nextInt();
        bookcode=input.nextInt();

        number=bookcode%borrowercode;

        if (number!=0){
            System.out.print("No");
        }
        else {
            System.out.print("Yes");
        }
        input.close();

    }
}
