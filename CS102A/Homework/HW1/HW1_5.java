import java.util.Scanner;
public class HW1_5 {
    public static void main(String[] args){

        String jieshuriqi;
        String huanshuriqi;
        int jieshutianshu=0;
        int yuefenjisuan=0;
        double jine=0;

        Scanner input= new Scanner(System.in);
        jieshuriqi= input.next();
        huanshuriqi= input.next();

        String a1= jieshuriqi.substring(0,4);
        String a2= jieshuriqi.substring(4,6);
        String a3= jieshuriqi.substring(6,8);

        String b1= huanshuriqi.substring(0,4);
        String b2= huanshuriqi.substring(4,6);
        String b3= huanshuriqi.substring(6,8);

        int a11= Integer.parseInt(a1);
        int a22= Integer.parseInt(a2);
        int a33= Integer.parseInt(a3);
        int b11= Integer.parseInt(b1);
        int b22= Integer.parseInt(b2);
        int b33= Integer.parseInt(b3);

        if (a11==b11){
            if (a22==b22){
                jieshutianshu=b33-a33;
            }
            else {
                if (a22==1){
                    yuefenjisuan=b22-a22;
                    if (yuefenjisuan==1){
                        jieshutianshu=31+b33-a33;//这是一个最终计算借书天数
                    }
                    if (a11%100!=0){
                        if (a11%4==0){
                            if (yuefenjisuan==2){
                                jieshutianshu=60+b33-a33;//这是一个最终计算借书天数
                            }
                            if (yuefenjisuan==3){
                                jieshutianshu=91+b33-a33;//这是一个最终计算借书天数
                            }
                            if (yuefenjisuan==4){
                                jieshutianshu=121+b33-a33;//这是一个最终计算借书天数
                            }
                            if (yuefenjisuan==5){
                                jieshutianshu=152+b33-a33;//这是一个最终计算借书天数
                            }
                            if (yuefenjisuan==6){
                                jieshutianshu=182+b33-a33;//已更正
                            }
                            if (yuefenjisuan==7||yuefenjisuan==8||yuefenjisuan==9||yuefenjisuan==10||yuefenjisuan==11){
                                jieshutianshu=200;
                            }
                        }
                        else{
                            if (yuefenjisuan==2){
                                jieshutianshu=59+b33-a33;//这是一个最终计算借书天数
                            }
                            if (yuefenjisuan==3){
                                jieshutianshu=90+b33-a33;//这是一个最终计算借书天数
                            }
                            if (yuefenjisuan==4){
                                jieshutianshu=120+b33-a33;//这是一个最终计算借书天数
                            }
                            if (yuefenjisuan==5){
                                jieshutianshu=151+b33-a33;//这是一个最终计算借书天数
                            }
                            if (yuefenjisuan==6){
                                jieshutianshu=181+b33-a33;//已更正
                            }
                            if (yuefenjisuan==7||yuefenjisuan==8||yuefenjisuan==9||yuefenjisuan==10||yuefenjisuan==11){
                                jieshutianshu=200;
                            }
                        }
                    }
                    else {
                        if (a11%400==0){
                            if (yuefenjisuan==2){
                                jieshutianshu=60+b33-a33;//这是一个最终计算借书天数
                            }
                            if (yuefenjisuan==3){
                                jieshutianshu=91+b33-a33;//这是一个最终计算借书天数
                            }
                            if (yuefenjisuan==4){
                                jieshutianshu=121+b33-a33;//这是一个最终计算借书天数
                            }
                            if (yuefenjisuan==5) {
                                jieshutianshu = 152 + b33 - a33;//这是一个最终计算借书天数
                            }
                            if (yuefenjisuan==6){
                                jieshutianshu= 182+ b33 - a33;//已更正
                            }
                            if (yuefenjisuan==7||yuefenjisuan==8||yuefenjisuan==9||yuefenjisuan==10||yuefenjisuan==11){
                                jieshutianshu=200;
                            }
                        }
                        else{
                            if (yuefenjisuan==2){
                                jieshutianshu=59+b33-a33;//这是一个最终计算借书天数
                            }
                            if (yuefenjisuan==3){
                                jieshutianshu=90+b33-a33;//这是一个最终计算借书天数
                            }
                            if (yuefenjisuan==4){
                                jieshutianshu=120+b33-a33;//这是一个最终计算借书天数
                            }
                            if (yuefenjisuan==5){
                                jieshutianshu=151+b33-a33;//这是一个最终计算借书天数
                            }
                            if (yuefenjisuan==6){
                                jieshutianshu=181+b33-a33;//已更正
                            }
                            if (yuefenjisuan==7||yuefenjisuan==8||yuefenjisuan==9||yuefenjisuan==10||yuefenjisuan==11){
                                jieshutianshu = 200;
                            }
                        }
                    }
                }
                if (a22==2){
                    yuefenjisuan=b22-a22;
                    if (a11%100!=0){
                        if (a11%4==0){
                            if (yuefenjisuan==1){
                                jieshutianshu=29+b33-a33;//这是一个最终计算借书天数
                            }
                            if (yuefenjisuan==2){
                                jieshutianshu=60+b33-a33;//这是一个最终计算借书天数
                            }
                            if (yuefenjisuan==3){
                                jieshutianshu=90+b33-a33;//这是一个最终计算借书天数
                            }
                            if (yuefenjisuan==4){
                                jieshutianshu=121+b33-a33;//这是一个最终计算借书天数
                            }
                            if (yuefenjisuan==5){
                                jieshutianshu=151+b33-a33;//这是一个最终计算借书天数
                            }
                            if (yuefenjisuan==6){
                                jieshutianshu=182+b33-a33;//已更正
                            }
                            if (yuefenjisuan==7||yuefenjisuan==8||yuefenjisuan==9||yuefenjisuan==10||yuefenjisuan==11){
                                jieshutianshu=200;
                            }
                        }
                        else{
                            if (yuefenjisuan==1){
                                jieshutianshu=28+b33-a33;//这是一个最终计算借书天数
                            }
                            if (yuefenjisuan==2){
                                jieshutianshu=59+b33-a33;//这是一个最终计算借书天数
                            }
                            if (yuefenjisuan==3){
                                jieshutianshu=89+b33-a33;//这是一个最终计算借书天数
                            }
                            if (yuefenjisuan==4){
                                jieshutianshu=120+b33-a33;//这是一个最终计算借书天数
                            }
                            if (yuefenjisuan==5){
                                jieshutianshu=150+b33-a33;//这是一个最终计算借书天数
                            }
                            if (yuefenjisuan==6){
                                jieshutianshu=181+b33-a33;//已更正
                            }
                            if (yuefenjisuan==7||yuefenjisuan==8||yuefenjisuan==9||yuefenjisuan==10||yuefenjisuan==11){
                                jieshutianshu=200;
                            }
                        }
                    }
                    else {
                        if (a11%400==0){
                            if (yuefenjisuan==1){
                                jieshutianshu=29+b33-a33;//这是一个最终计算借书天数
                            }
                            if (yuefenjisuan==2){
                                jieshutianshu=60+b33-a33;//这是一个最终计算借书天数
                            }
                            if (yuefenjisuan==3){
                                jieshutianshu=90+b33-a33;//这是一个最终计算借书天数
                            }
                            if (yuefenjisuan==4){
                                jieshutianshu=121+b33-a33;//这是一个最终计算借书天数
                            }
                            if (yuefenjisuan==5){
                                jieshutianshu=151+b33-a33;//这是一个最终计算借书天数
                            }
                            if (yuefenjisuan==6){
                                jieshutianshu=182+b33-a33;//已更正
                            }
                            if (yuefenjisuan==7||yuefenjisuan==8||yuefenjisuan==9||yuefenjisuan==10||yuefenjisuan==11){
                                jieshutianshu=200;
                            }
                        }
                        else{
                            if (yuefenjisuan==1){
                                jieshutianshu=28+b33-a33;//这是一个最终计算借书天数
                            }
                            if (yuefenjisuan==3){
                                jieshutianshu=59+b33-a33;//这是一个最终计算借书天数
                            }
                            if (yuefenjisuan==3){
                                jieshutianshu=89+b33-a33;//这是一个最终计算借书天数
                            }
                            if (yuefenjisuan==4){
                                jieshutianshu=120+b33-a33;//这是一个最终计算借书天数
                            }
                            if (yuefenjisuan==5){
                                jieshutianshu=150+b33-a33;//这是一个最终计算借书天数
                            }
                            if (yuefenjisuan==6){
                                jieshutianshu=181+b33-a33;//已更正
                            }
                            if (yuefenjisuan==7||yuefenjisuan==8||yuefenjisuan==9||yuefenjisuan==10||yuefenjisuan==11){
                                jieshutianshu=200;
                            }
                        }
                    }
                }
                if (a22==3){
                    yuefenjisuan=b22-a22;
                    if (yuefenjisuan==1){
                        jieshutianshu=31+b33-a33;//这是一个最终计算借书天数
                    }
                    if (yuefenjisuan==2){
                        jieshutianshu=61+b33-a33;//这是一个最终计算借书天数
                    }
                    if (yuefenjisuan==3){
                        jieshutianshu=92+b33-a33;//这是一个最终计算借书天数
                    }
                    if (yuefenjisuan==4){
                        jieshutianshu=122+b33-a33;//这是一个最终计算借书天数
                    }
                    if (yuefenjisuan==5){
                        jieshutianshu=153+b33-a33;//这是一个最终计算借书天数
                    }
                    if (yuefenjisuan==6){
                        jieshutianshu=184+b33-a33;//已更正
                    }
                    if (yuefenjisuan==7||yuefenjisuan==8||yuefenjisuan==9||yuefenjisuan==10||yuefenjisuan==11){
                        jieshutianshu=200;
                    }
                }
                if (a22==4){
                    yuefenjisuan=b22-a22;
                    if (yuefenjisuan==1){
                        jieshutianshu=30+b33-a33;//这是一个最终计算借书天数
                    }
                    if (yuefenjisuan==2){
                        jieshutianshu=61+b33-a33;//这是一个最终计算借书天数
                    }
                    if (yuefenjisuan==3){
                        jieshutianshu=91+b33-a33;//这是一个最终计算借书天数
                    }
                    if (yuefenjisuan==4){
                        jieshutianshu=122+b33-a33;//这是一个最终计算借书天数
                    }
                    if (yuefenjisuan==5){
                        jieshutianshu=153+b33-a33;//这是一个最终计算借书天数
                    }
                    if (yuefenjisuan==6){
                        jieshutianshu=183+b33-a33;//已更正
                    }
                    if (yuefenjisuan==7||yuefenjisuan==8||yuefenjisuan==9||yuefenjisuan==10||yuefenjisuan==11){
                        jieshutianshu=200;
                    }
                }
                if (a22==5) {
                    yuefenjisuan = b22 - a22;
                    if (yuefenjisuan == 1) {
                        jieshutianshu = 31 + b33 - a33;//这是一个最终计算借书天数
                    }
                    if (yuefenjisuan == 2) {
                        jieshutianshu = 61 + b33 - a33;//这是一个最终计算借书天数
                    }
                    if (yuefenjisuan == 3) {
                        jieshutianshu = 92 + b33 - a33;//这是一个最终计算借书天数
                    }
                    if (yuefenjisuan == 4) {
                        jieshutianshu = 123 + b33 - a33;//这是一个最终计算借书天数
                    }
                    if (yuefenjisuan == 5) {
                        jieshutianshu = 153 + b33 - a33;//这是一个最终计算借书天数
                    }
                    if (yuefenjisuan==6){
                        jieshutianshu=184+b33-a33;//已更正
                    }
                    if (yuefenjisuan==7||yuefenjisuan==8||yuefenjisuan==9||yuefenjisuan==10||yuefenjisuan==11){
                        jieshutianshu=200;
                    }
                }
                if (a22==6) {
                    yuefenjisuan = b22 - a22;
                    if (yuefenjisuan == 1) {
                        jieshutianshu = 30 + b33 - a33;//这是一个最终计算借书天数
                    }
                    if (yuefenjisuan == 2) {
                        jieshutianshu = 61 + b33 - a33;//这是一个最终计算借书天数
                    }
                    if (yuefenjisuan == 3) {
                        jieshutianshu = 92 + b33 - a33;//这是一个最终计算借书天数
                    }
                    if (yuefenjisuan == 4) {
                        jieshutianshu = 122 + b33 - a33;//这是一个最终计算借书天数
                    }
                    if (yuefenjisuan == 5) {
                        jieshutianshu = 153 + b33 - a33;//这是一个最终计算借书天数
                    }
                    if (yuefenjisuan == 6) {
                        jieshutianshu = 183 + b33 - a33;//已更正
                    }
                }
                if (a22==7) {
                    yuefenjisuan = b22 - a22;
                    if (yuefenjisuan == 1) {
                        jieshutianshu = 31 + b33 - a33;//这是一个最终计算借书天数
                    }
                    if (yuefenjisuan == 2) {
                        jieshutianshu = 62 + b33 - a33;//这是一个最终计算借书天数
                    }
                    if (yuefenjisuan == 3) {
                        jieshutianshu = 92 + b33 - a33;//这是一个最终计算借书天数
                    }
                    if (yuefenjisuan == 4) {
                        jieshutianshu = 123 + b33 - a33;//这是一个最终计算借书天数
                    }
                    if (yuefenjisuan == 5) {
                        jieshutianshu = 153 + b33 - a33;//已更正
                    }
                }
                if (a22==8) {
                    yuefenjisuan = b22 - a22;
                    if (yuefenjisuan == 1) {
                        jieshutianshu = 31 + b33 - a33;//这是一个最终计算借书天数
                    }
                    if (yuefenjisuan == 2) {
                        jieshutianshu = 61 + b33 - a33;//这是一个最终计算借书天数
                    }
                    if (yuefenjisuan == 3) {
                        jieshutianshu = 92 + b33 - a33;//这是一个最终计算借书天数
                    }
                    if (yuefenjisuan == 4) {
                        jieshutianshu = 122 + b33 - a33;//已更正
                    }
                }
                if (a22==9) {
                    yuefenjisuan = b22 - a22;
                    if (yuefenjisuan == 1) {
                        jieshutianshu = 30 + b33 - a33;//这是一个最终计算借书天数
                    }
                    if (yuefenjisuan == 2) {
                        jieshutianshu = 61 + b33 - a33;//这是一个最终计算借书天数
                    }
                    if (yuefenjisuan == 3) {
                        jieshutianshu = 91 + b33 - a33;//已更正
                    }
                }
                if (a22==10) {
                    yuefenjisuan = b22 - a22;
                    if (yuefenjisuan == 1) {
                        jieshutianshu = 31 + b33 - a33;//这是一个最终计算借书天数
                    }
                    if (yuefenjisuan == 2) {
                        jieshutianshu = 61 + b33 - a33;//已更正
                    }
                }
                if (a22==11) {
                    yuefenjisuan = b22 - a22;
                    if (yuefenjisuan == 1) {
                        jieshutianshu = 30 + b33 - a33;//已更正
                    }
                }
            }
        }
        else {
            if (b11-a11!=1){
                jieshutianshu= 200;
            }
            else {
                if (b11%100!=0){
                    if (b11%4!=0){
                          if (a22==1||a22==2||a22==3||a22==4||a22==5||a22==6){
                              jieshutianshu=200;
                          }
                          if (a22==7){
                              if (b22==1){
                                  jieshutianshu=31-a33+b33+153;//已更正
                              }
                              else {
                                  jieshutianshu=200;
                              }
                          }
                          if (a22==8){
                              if (b22==1){
                                  jieshutianshu=31-a33+b33+122;//已更正
                              }
                              if (b22==2){
                                  jieshutianshu=31-a33+b33+153;//已更正
                              }
                              if (b22==3||b22==4||b22==5||b22==6||b22==7||b22==8||b22==9||b22==10||b22==11||b22==12){
                                  jieshutianshu=200;
                              }
                          }
                          if (a22==9){
                              if (b22==1){
                                  jieshutianshu=30-a33+b33+92;//已更正
                              }
                              if (b22==2){
                                  jieshutianshu=30-a33+b33+123;
                              }
                              if (b22==3){
                                  jieshutianshu=30-a33+b33+151;//已更正
                              }
                              if (b22==4||b22==5||b22==6||b22==7||b22==8||b22==9||b22==10||b22==11||b22==12){
                                  jieshutianshu=200;
                              }
                          }
                          if (a22==10){
                              if (b22==1){
                                  jieshutianshu=31-a33+b33+61;//已更正
                              }
                              if (b22==2){
                                  jieshutianshu=31-a33+b33+92;
                              }
                              if (b22==3){
                                  jieshutianshu=31-a33+b33+120;
                              }
                              if (b22==4){
                                  jieshutianshu=31-a33+b33+151;//已更正
                              }
                              if (b22==5||b22==6||b22==7||b22==8||b22==9||b22==10||b22==11||b22==12){
                                  jieshutianshu=200;
                              }
                          }
                          if (a22==11){
                              if (b22==1){
                                  jieshutianshu=30-a33+b33+31;//已更正
                              }
                              if (b22==2){
                                  jieshutianshu=30-a33+b33+62;
                              }
                              if (b22==3){
                                  jieshutianshu=30-a33+b33+90;
                              }
                              if (b22==4){
                                  jieshutianshu=30-a33+b33+121;
                              }
                              if (b22==5){
                                  jieshutianshu=30-a33+b33+151;//已更正
                              }
                              if (b22==6||b22==7||b22==8||b22==9||b22==10||b22==11||b22==12){
                                  jieshutianshu=200;
                              }
                          }
                        if (a22==12){
                            if (b22==1){
                                jieshutianshu=31-a33+b33;//已更正
                            }
                            if (b22==2){
                                jieshutianshu=31-a33+b33+31;
                            }
                            if (b22==3){
                                jieshutianshu=31-a33+b33+59;
                            }
                            if (b22==4){
                                jieshutianshu=31-a33+b33+90;
                            }
                            if (b22==5){
                                jieshutianshu=31-a33+b33+120;
                            }
                            if (b22==6){
                                jieshutianshu=31-a33+b33+151;//已更正
                            }
                            if (b22==7||b22==8||b22==9||b22==10||b22==11||b22==12){
                                jieshutianshu=200;
                            }
                        }
                    }
                    else {
                        if (a22==1||a22==2||a22==3||a22==4||a22==5||a22==6){
                            jieshutianshu=200;
                        }
                        if (a22==7){
                            if (b22==1){
                                jieshutianshu=31-a33+b33+153;//已更正
                            }
                            else {
                                jieshutianshu=200;
                            }
                        }
                        if (a22==8){
                            if (b22==1){
                                jieshutianshu=31-a33+b33+122;//已更正
                            }
                            if (b22==2){
                                jieshutianshu=31-a33+b33+153;//已更正
                            }
                            if (b22==3||b22==4||b22==5||b22==6||b22==7||b22==8||b22==9||b22==10||b22==11||b22==12){
                                jieshutianshu=200;
                            }
                        }
                        if (a22==9){
                            if (b22==1){
                                jieshutianshu=30-a33+b33+92;//已更正
                            }
                            if (b22==2){
                                jieshutianshu=30-a33+b33+123;
                            }
                            if (b22==3){
                                jieshutianshu=30-a33+b33+152;//已更正
                            }
                            if (b22==4||b22==5||b22==6||b22==7||b22==8||b22==9||b22==10||b22==11||b22==12){
                                jieshutianshu=200;
                            }
                        }
                        if (a22==10){
                            if (b22==1){
                                jieshutianshu=31-a33+b33+61;//已更正
                            }
                            if (b22==2){
                                jieshutianshu=31-a33+b33+92;
                            }
                            if (b22==3){
                                jieshutianshu=31-a33+b33+121;
                            }
                            if (b22==4){
                                jieshutianshu=31-a33+b33+152;//已更正
                            }
                            if (b22==5||b22==6||b22==7||b22==8||b22==9||b22==10||b22==11||b22==12){
                                jieshutianshu=200;
                            }
                        }
                        if (a22==11){
                            if (b22==1){
                                jieshutianshu=30-a33+b33+31;//已更正
                            }
                            if (b22==2){
                                jieshutianshu=30-a33+b33+62;
                            }
                            if (b22==3){
                                jieshutianshu=30-a33+b33+91;
                            }
                            if (b22==4){
                                jieshutianshu=30-a33+b33+122;
                            }
                            if (b22==5){
                                jieshutianshu=30-a33+b33+152;//已更正
                            }
                            if (b22==6||b22==7||b22==8||b22==9||b22==10||b22==11||b22==12){
                                jieshutianshu=200;
                            }
                        }
                        if (a22==12){
                            if (b22==1){
                                jieshutianshu=31-a33+b33;//已更正
                            }
                            if (b22==2){
                                jieshutianshu=31-a33+b33+31;
                            }
                            if (b22==3){
                                jieshutianshu=31-a33+b33+60;
                            }
                            if (b22==4){
                                jieshutianshu=31-a33+b33+91;
                            }
                            if (b22==5){
                                jieshutianshu=31-a33+b33+121;
                            }
                            if (b22==6){
                                jieshutianshu=31-a33+b33+152;//已更正
                            }
                            if (b22==7||b22==8||b22==9||b22==10||b22==11||b22==12){
                                jieshutianshu=200;
                            }
                        }
                    }
                }
                else {
                    if (b11%400==0){
                        if (a22==1||a22==2||a22==3||a22==4||a22==5||a22==6){
                            jieshutianshu=200;
                        }
                        if (a22==7){
                            if (b22==1){
                                jieshutianshu=31-a33+b33+153;//已更正
                            }
                            else {
                                jieshutianshu=200;
                            }
                        }
                        if (a22==8){
                            if (b22==1){
                                jieshutianshu=31-a33+b33+122;//已更正
                            }
                            if (b22==2){
                                jieshutianshu=31-a33+b33+153;//已更正
                            }
                            if (b22==3||b22==4||b22==5||b22==6||b22==7||b22==8||b22==9||b22==10||b22==11||b22==12){
                                jieshutianshu=200;
                            }
                        }
                        if (a22==9){
                            if (b22==1){
                                jieshutianshu=30-a33+b33+92;//已更正
                            }
                            if (b22==2){
                                jieshutianshu=30-a33+b33+123;
                            }
                            if (b22==3){
                                jieshutianshu=30-a33+b33+152;//已更正
                            }
                            if (b22==4||b22==5||b22==6||b22==7||b22==8||b22==9||b22==10||b22==11||b22==12){
                                jieshutianshu=200;
                            }
                        }
                        if (a22==10){
                            if (b22==1){
                                jieshutianshu=31-a33+b33+61;//已更正
                            }
                            if (b22==2){
                                jieshutianshu=31-a33+b33+92;
                            }
                            if (b22==3){
                                jieshutianshu=31-a33+b33+121;
                            }
                            if (b22==4){
                                jieshutianshu=31-a33+b33+152;//已更正
                            }
                            if (b22==5||b22==6||b22==7||b22==8||b22==9||b22==10||b22==11||b22==12){
                                jieshutianshu=200;
                            }
                        }
                        if (a22==11){
                            if (b22==1){
                                jieshutianshu=30-a33+b33+31;//已更正
                            }
                            if (b22==2){
                                jieshutianshu=30-a33+b33+62;
                            }
                            if (b22==3){
                                jieshutianshu=30-a33+b33+91;
                            }
                            if (b22==4){
                                jieshutianshu=30-a33+b33+122;
                            }
                            if (b22==5){
                                jieshutianshu=30-a33+b33+152;//已更正
                            }
                            if (b22==6||b22==7||b22==8||b22==9||b22==10||b22==11||b22==12){
                                jieshutianshu=200;
                            }
                        }
                        if (a22==12){
                            if (b22==1){
                                jieshutianshu=31-a33+b33;//已更正
                            }
                            if (b22==2){
                                jieshutianshu=31-a33+b33+31;
                            }
                            if (b22==3){
                                jieshutianshu=31-a33+b33+60;
                            }
                            if (b22==4){
                                jieshutianshu=31-a33+b33+91;
                            }
                            if (b22==5){
                                jieshutianshu=31-a33+b33+121;
                            }
                            if (b22==6){
                                jieshutianshu=31-a33+b33+152;//已更正
                            }
                            if (b22==7||b22==8||b22==9||b22==10||b22==11||b22==12){
                                jieshutianshu=200;
                            }
                        }
                    }
                    else {
                        if (a22==1||a22==2||a22==3||a22==4||a22==5||a22==6){
                            jieshutianshu=200;
                        }
                        if (a22==7){
                            if (b22==1){
                                jieshutianshu=31-a33+b33+153;//已更正
                            }
                            else {
                                jieshutianshu=200;
                            }
                        }
                        if (a22==8){
                            if (b22==1){
                                jieshutianshu=31-a33+b33+122;//已更正
                            }
                            if (b22==2){
                                jieshutianshu=31-a33+b33+153;//已更正
                            }
                            if (b22==3||b22==4||b22==5||b22==6||b22==7||b22==8||b22==9||b22==10||b22==11||b22==12){
                                jieshutianshu=200;
                            }
                        }
                        if (a22==9){
                            if (b22==1){
                                jieshutianshu=30-a33+b33+92;//已更正
                            }
                            if (b22==2){
                                jieshutianshu=30-a33+b33+123;
                            }
                            if (b22==3){
                                jieshutianshu=30-a33+b33+151;//已更正
                            }
                            if (b22==4||b22==5||b22==6||b22==7||b22==8||b22==9||b22==10||b22==11||b22==12){
                                jieshutianshu=200;
                            }
                        }
                        if (a22==10){
                            if (b22==1){
                                jieshutianshu=31-a33+b33+61;//已更正
                            }
                            if (b22==2){
                                jieshutianshu=31-a33+b33+92;
                            }
                            if (b22==3){
                                jieshutianshu=31-a33+b33+120;
                            }
                            if (b22==4){
                                jieshutianshu=31-a33+b33+151;//已更正
                            }
                            if (b22==5||b22==6||b22==7||b22==8||b22==9||b22==10||b22==11||b22==12){
                                jieshutianshu=200;
                            }
                        }
                        if (a22==11){
                            if (b22==1){
                                jieshutianshu=30-a33+b33+31;//已更正
                            }
                            if (b22==2){
                                jieshutianshu=30-a33+b33+62;
                            }
                            if (b22==3){
                                jieshutianshu=30-a33+b33+90;
                            }
                            if (b22==4){
                                jieshutianshu=30-a33+b33+121;
                            }
                            if (b22==5){
                                jieshutianshu=30-a33+b33+151;//已更正
                            }
                            if (b22==6||b22==7||b22==8||b22==9||b22==10||b22==11||b22==12){
                                jieshutianshu=200;
                            }
                        }
                        if (a22==12){
                            if (b22==1){
                                jieshutianshu=31-a33+b33;//已更正
                            }
                            if (b22==2){
                                jieshutianshu=31-a33+b33+31;
                            }
                            if (b22==3){
                                jieshutianshu=31-a33+b33+59;
                            }
                            if (b22==4){
                                jieshutianshu=31-a33+b33+90;
                            }
                            if (b22==5){
                                jieshutianshu=31-a33+b33+120;
                            }
                            if (b22==6){
                                jieshutianshu=31-a33+b33+151;//已更正
                            }
                            if (b22==7||b22==8||b22==9||b22==10||b22==11||b22==12){
                                jieshutianshu=200;
                            }
                        }
                    }
                }
            }
        }
        System.out.printf("%d",jieshutianshu);
        if (jieshutianshu>180){
            System.out.print("You are late, please pay 250.0 yuan!");
        }
        else {
            if (jieshutianshu<=30){
                System.out.print("The return is successful!");
            }
            else {
                if (jieshutianshu<=60){
                    jine=(jieshutianshu-30)*0.5;
                    System.out.printf("You are late, please pay %.1f yuan!",jine);
                }
                else {
                    jine=30*0.5+(jieshutianshu-60)*0.7;
                    System.out.printf("You are late, please pay %.1f yuan!",jine);
                }
            }
        }
        input.close();
    }
}
