package HW3;

import java.util.Scanner;

public class HW3_1 {
    public static void main(String[] args){
        String gengzhengxiaoxie;
        //Scanner input=new Scanner(System.in);
        Scanner sc= new Scanner(System.in);
        gengzhengxiaoxie=sc.nextLine();
        String gengzhengdaxie=gengzhengxiaoxie.toUpperCase();
        String paixu;
        String xiaoxiezimu="abcdefghijklmnopqrstuvwxyz";
        //String gengzhengxiaoxie="fghijklmnopqrstuvwxyzabcde";
        String daxiezimu="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        //String gengzhengdaxie="FGHIJKLMNOPQRSTUVWXYZABCDE";
        String mubiao="";
        String chuandi="";
        int a=0;
        //Scanner sc= new Scanner(System.in);
        //danci=sc.nextLine();
        paixu=sc.nextLine();
        //System.out.println(paixu);
        a=paixu.length();
        //System.out.println(a);
        for (int i=0;i<a;i++){
            String head= paixu.substring(i,i+1);
            //System.out.println(head);
            for (int j=0;j<=25;j++){
                String da=daxiezimu.substring(j,j+1);
                String dada=gengzhengdaxie.substring(j,j+1);
                String xiao=xiaoxiezimu.substring(j,j+1);
                String xiaoxiao=gengzhengxiaoxie.substring(j,j+1);
                if (head.equals(da)){
                    mubiao=mubiao+dada;

                }
                else if (head.equals(xiao)){
                    mubiao=mubiao+xiaoxiao;
                }
                //System.out.println(dada);
                //System.out.println(xiaoxiao);
                //System.out.println(mubiao);
            }
            if (mubiao==chuandi){
                mubiao=mubiao+head;
            }
            chuandi=mubiao;
        }
        System.out.println(mubiao);

        }


    }

