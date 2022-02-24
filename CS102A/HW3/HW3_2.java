package HW3;

import java.util.Scanner;

public class HW3_2 {
    public static void main(String []args){
        String luomashuzi;
        int a=0;
        int alaboshuzi=0;
        Scanner input=new Scanner(System.in);
        luomashuzi=input.next();
        a=luomashuzi.length();
        //System.out.println(luomashuzi+a);
        for (int i=0;i<a;){
            String chaifen=luomashuzi.substring(i,i+1);
            if (chaifen.equals("I")){
                if (i<a-1){
                if (luomashuzi.substring(i+1,i+2).equals("X")){
                    alaboshuzi=alaboshuzi+9;i=i+2;
                }

                else if (luomashuzi.substring(i+1,i+2).equals("V")){
                    alaboshuzi=alaboshuzi+4;i=i+2;
                }
                else {
                alaboshuzi=alaboshuzi+1;i=i+1;}
                }
                else {
                    alaboshuzi=alaboshuzi+1;i=i+1;
                }
            }
            if (chaifen.equals("V")){
                alaboshuzi=alaboshuzi+5;i=i+1;
            }
            if (chaifen.equals("X")){
                if (i<a-1){
                if (luomashuzi.substring(i+1,i+2).equals("L")){
                    alaboshuzi=alaboshuzi+40;i=i+2;
                }
                else if (luomashuzi.substring(i+1,i+2).equals("C")){
                    alaboshuzi=alaboshuzi+90;i=i+2;
                }
                else {
                    alaboshuzi=alaboshuzi+10;i=i+1;
                }}
                else {
                    alaboshuzi=alaboshuzi+10;i=i+1;
                }
            }
            if (chaifen.equals("L")){
                alaboshuzi=alaboshuzi+50;i=i+1;
            }
            if (chaifen.equals("C")){
                if (i<a-1){
                if (luomashuzi.substring(i+1,i+2).equals("D")){
                    alaboshuzi=alaboshuzi+400;i=i+2;
                }
                else if (luomashuzi.substring(i+1,i+2).equals("M")){
                    alaboshuzi=alaboshuzi+900;i=i+2;
                }
                else {
                    alaboshuzi=alaboshuzi+100;i=i+1;
                }}
                else {
                    alaboshuzi=alaboshuzi+100;i=i+1;
                }
            }
            if (chaifen.equals("D")){
                alaboshuzi=alaboshuzi+500;i=i+1;
            }
            if (chaifen.equals("M")){
                alaboshuzi=alaboshuzi+1000;i=i+1;
            }
        }
        System.out.print(alaboshuzi);
    }
}
