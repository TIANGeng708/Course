package HW3;

import java.util.Scanner;

public class HW3_3 {
    public static void main(String[] args){
        int xy=0;int yx=0;
        int a=0;
        int b=0;
        int p=502;
        int dangqianzuobiao=600600;
        String zhdangqianzuobiao;
        String jisuan="501600600";
        Scanner n =new Scanner(System.in);
        a=n.nextInt();
        b=n.nextInt();
        int hengzuobiao=-(b*1000)+600000+1000;
        int zongzuobiao=-a+600+1;
        for (int i=1;i>0;i++) {
            //yzuobiao=yzuobiao-1;
            if (dangqianzuobiao % 1000 > zongzuobiao) {
                dangqianzuobiao = dangqianzuobiao - 1;
                zhdangqianzuobiao = dangqianzuobiao + "";
                jisuan = jisuan + p + zhdangqianzuobiao;
                p = p + 1;
                for (int j = 1; j >0; j++) {
                    //p=p+1;
                    if (dangqianzuobiao % 1000 == 600 || dangqianzuobiao - dangqianzuobiao % 1000 == hengzuobiao) {
                        break;
                    } else {
                        dangqianzuobiao = dangqianzuobiao +1 - 1000;
                        zhdangqianzuobiao = dangqianzuobiao + "";
                        jisuan = jisuan + p + zhdangqianzuobiao;
                        p = p + 1;
                        //heng=dangqianzuobiao%1000;
                        //zong=(dangqianzuobiao-heng);
                        if (dangqianzuobiao % 1000 == 600 || dangqianzuobiao - dangqianzuobiao % 1000 == hengzuobiao) {
                            break;
                        } else {
                            ;//System.out.printf("%d,%d,%d,%d\n",zong,zongzuobiao,heng,hengzuobiao);
                        }
                    }
                }
                if (dangqianzuobiao - dangqianzuobiao % 1000 > hengzuobiao) {
                    dangqianzuobiao = dangqianzuobiao - 1000;
                    zhdangqianzuobiao = dangqianzuobiao + "";
                    jisuan = jisuan + p + zhdangqianzuobiao;
                    p = p + 1;
                    for (int j = 1; j >0; j++) {
                        //p=p+1;
                        if (dangqianzuobiao % 1000 == zongzuobiao || dangqianzuobiao-dangqianzuobiao%1000  == 600000) {
                            break;
                        } else {
                            dangqianzuobiao = dangqianzuobiao - 1 + 1000;
                            zhdangqianzuobiao = dangqianzuobiao + "";
                            jisuan = jisuan + p + zhdangqianzuobiao;
                            p = p + 1;
                            //heng=dangqianzuobiao%1000;
                            //zong=(dangqianzuobiao-heng);
                            if (dangqianzuobiao % 1000 == zongzuobiao || dangqianzuobiao-dangqianzuobiao%1000  == 600000) {
                                break;
                            } else {
                                ;//System.out.printf("%d,%d,%d,%d\n",zong,zongzuobiao,heng,hengzuobiao);
                            }
                        }
                    }
                }
                else if (dangqianzuobiao % 1000 > zongzuobiao) {
                    dangqianzuobiao = dangqianzuobiao - 1;
                    zhdangqianzuobiao = dangqianzuobiao + "";
                    jisuan = jisuan + p + zhdangqianzuobiao;
                    p = p + 1;
                    for (int j = 1; j >0; j++) {
                        //p=p+1;
                        if (dangqianzuobiao % 1000 == zongzuobiao || dangqianzuobiao - dangqianzuobiao % 1000 == 600000) {
                            break;
                        } else {
                            dangqianzuobiao = dangqianzuobiao - 1 + 1000;
                            zhdangqianzuobiao = dangqianzuobiao + "";
                            jisuan = jisuan + p + zhdangqianzuobiao;
                            p = p + 1;
                            //heng=dangqianzuobiao%1000;
                            //zong=(dangqianzuobiao-heng);
                            if (dangqianzuobiao % 1000 == zongzuobiao || dangqianzuobiao - dangqianzuobiao % 1000 == 600000) {
                                break;
                            } else {
                                ;//System.out.printf("%d,%d,%d,%d\n",zong,zongzuobiao,heng,hengzuobiao);
                            }
                        }
                    }
                }//System.out.println(p);

            }//System.out.println(p);
            else if (dangqianzuobiao - dangqianzuobiao % 1000 > hengzuobiao) {
                dangqianzuobiao = dangqianzuobiao - 1000;
                zhdangqianzuobiao = dangqianzuobiao + "";
                jisuan = jisuan + p + zhdangqianzuobiao;
                p = p + 1;
                for (int j = 1; j >0; j++) {
                    //p=p+1;
                    if (dangqianzuobiao % 1000 == 600 || dangqianzuobiao - dangqianzuobiao % 1000 == hengzuobiao) {
                        break;
                    } else {
                        dangqianzuobiao = dangqianzuobiao + 1 - 1000;
                        zhdangqianzuobiao = dangqianzuobiao + "";
                        jisuan = jisuan + p + zhdangqianzuobiao;
                        p = p + 1;
                        //heng=dangqianzuobiao%1000;
                        //zong=(dangqianzuobiao-heng);
                        if (dangqianzuobiao % 1000 == 600 || dangqianzuobiao - dangqianzuobiao % 1000 == hengzuobiao) {
                            break;
                        } else {
                            ;//System.out.printf("%d,%d,%d,%d\n",zong,zongzuobiao,heng,hengzuobiao);
                        }
                    }
                }
                if (dangqianzuobiao - dangqianzuobiao % 1000 > hengzuobiao) {
                    dangqianzuobiao = dangqianzuobiao - 1000;
                    zhdangqianzuobiao = dangqianzuobiao + "";
                    jisuan = jisuan + p + zhdangqianzuobiao;
                    p = p + 1;
                    for (int j = 1; j >0; j++) {
                        //p=p+1;
                        if (dangqianzuobiao % 1000 == zongzuobiao || dangqianzuobiao - dangqianzuobiao % 1000 == 600000) {
                            break;
                        } else {
                            dangqianzuobiao = dangqianzuobiao - 1 + 1000;
                            zhdangqianzuobiao = dangqianzuobiao + "";
                            jisuan = jisuan + p + zhdangqianzuobiao;
                            p = p + 1;
                            //heng=dangqianzuobiao%1000;
                            //zong=(dangqianzuobiao-heng);
                            if (dangqianzuobiao % 1000 == zongzuobiao || dangqianzuobiao - dangqianzuobiao % 1000 == 600000) {
                                break;
                            } else {
                                ;//System.out.printf("%d,%d,%d,%d\n",zong,zongzuobiao,heng,hengzuobiao);
                            }
                        }
                    }
                }
                else if (dangqianzuobiao % 1000 > zongzuobiao) {
                    dangqianzuobiao = dangqianzuobiao - 1;
                    zhdangqianzuobiao = dangqianzuobiao + "";
                    jisuan = jisuan + p + zhdangqianzuobiao;
                    p = p + 1;
                    for (int j = 1; j >0; j++) {
                        //p=p+1;
                        if (dangqianzuobiao % 1000 == zongzuobiao || dangqianzuobiao - dangqianzuobiao % 1000 == 600000) {
                            break;
                        } else {
                            dangqianzuobiao = dangqianzuobiao - 1 + 1000;
                            zhdangqianzuobiao = dangqianzuobiao + "";
                            jisuan = jisuan + p + zhdangqianzuobiao;
                            p = p + 1;
                            //heng=dangqianzuobiao%1000;
                            //zong=(dangqianzuobiao-heng);
                            if (dangqianzuobiao % 1000 == zongzuobiao || dangqianzuobiao - dangqianzuobiao % 1000 == 600000) {
                                break;
                            } else {
                                ;//System.out.printf("%d,%d,%d,%d\n",zong,zongzuobiao,heng,hengzuobiao);
                            }
                        }
                    }
                }//System.out.println(p);*/
            }
            //System.out.println(p);
            if (p==a*b+501){
                break;
            }
        }
        //System.out.println(jisuan);
        p=a*b;
        int qqq=600;int ppp=600-a+1;
        for (int y=0;y>-a;y--) {
            for (int x = 1 - b; x <= 0; x++) {
                for (int z = 1; z <= a * b; z++) {
                    String chaifen1 = jisuan.substring(9 * z - 9, 9 * z - 9 + 3);
                    String chaifen2 = jisuan.substring(9 * z - 9 + 3, 9 * z - 9 + 6);
                    String chaifen3 = jisuan.substring(9 * z - 9 + 6, 9 * z - 9 + 9);
                    //System.out.print(Integer.parseInt(chaifen2));
                    //System.out.print(Integer.parseInt(chaifen3));
                    if (Integer.parseInt(chaifen2) - 600 == x) {
                        if (Integer.parseInt(chaifen3) - 600 == y) {
                            int xxx = Integer.parseInt(chaifen1);
                            xxx = xxx - 500;
                            System.out.printf("%3d", xxx);
                            xy = x;
                            yx = y;
                        }
                    }
                }
            }
            if (xy == 0 && yx == 1 - a) {
                ;
            } else {
                System.out.println();
            }
        }

    }
}
