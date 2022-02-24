import java.util.Scanner;
public class HW1_4 {
    public static void main(String[] args){
        int month;
        int day;
        Scanner input= new Scanner(System.in);
        month= input.nextInt();
        day= input.nextInt();
        if (month<=12) {
            if (day <= 0) {
                if (month != 0) {
                    System.out.print("1");
                } else {
                    System.out.print("2");
                }
            } else {
                if (month == 0) {
                    if (day <= 31) {
                        System.out.print("1");
                    }
                    if (day > 31) {
                        System.out.print("2");
                    }
                }//月份为0x，00日期是xx
                if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                    if (day <= 31) {
                        System.out.print("0");
                    }
                    if (day > 31) {
                        System.out.print("1");
                    }
                }//月份为0x，00日期是xx
                if (month == 2) {
                    if (day <= 28) {
                        System.out.print("0");
                    }
                    if (day > 28) {
                        System.out.print("1");
                    }
                }//月份为0x，00日期是xx
                if (month == 4 || month == 6 || month == 9 || month == 11) {
                    if (day <= 30) {
                        System.out.print("0");
                    }
                    if (day > 30) {
                        System.out.print("1");
                    }
                }
            }
        }
        else {
            if(day==0){
                    System.out.print("2");
            }
            else {
                    if (month==24||month==26||month==29||month==34||month==36||month==39||month==44||month==46||month==49||month==54||month==56||month==59||month==64||month==66||month==69||month==74||month==76||month==79||month==84||month==86||month==89||month==94||month==96||month==99){
                        if (day<=30){
                            System.out.print("1");
                        }
                        else {
                            System.out.print("2");
                        }
                    }
                    else {
                        if (day<=31){
                            System.out.print("1");
                        }
                        else {
                            System.out.print("2");
                        }
                    }
            }
        }
        input.close();
    }
}
