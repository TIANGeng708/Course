package HW2;

import java.util.*;
public class HW2_5 {
    public static void main(String[] args){
        int juzhengeshu=0;
        int x1=0;
        int y1=0;
        Scanner input=new Scanner(System.in);
        juzhengeshu=input.nextInt();
        x1=input.nextInt();
        y1=input.nextInt();
        int[][]a1=new int[x1][y1];
        for (int m=0;m<a1.length;m++){
            for (int n=0;n<a1[m].length;n++){
                a1[m][n]= input.nextInt();
            }
        }
        int x2=0;
        int y2=0;
        x2=input.nextInt();
        y2=input.nextInt();
        int[][]a2=new int[x2][y2];
        for (int m=0;m<a2.length;m++){
            for (int n=0;n<a2[m].length;n++){
                a2[m][n]= input.nextInt();
            }
        }
        int[][]a12=new int[x1][y2];
        for (int i1=0;i1<x1;i1++){
            for (int j1=0;j1<y2;j1++){
                int jieguo1=0;
                for (int k1=0;k1<y1;k1++){

                    jieguo1=jieguo1+a1[i1][k1]*a2[k1][j1];
                    //System.out.print(jieguo1);
                    if (j1<y2-1&&k1==y1-1){
                        if (juzhengeshu==2){
                            System.out.print(jieguo1+" ");
                        }
                        else {
                            a12[i1][j1]=jieguo1;
                        }
                    }
                    else if (j1==y2-1&&k1==y1-1){
                        if (juzhengeshu==2){
                            System.out.println(jieguo1);
                        }
                        else {
                            a12[i1][j1]=jieguo1;
                        }
                    }
                }
            }
        }
        /*for (int i1=0;i1<x1;i1++){
            for (int j1=0;j1<y2;j1++){
                System.out.print(a12[i1][j1]);
            }}*/
        if (juzhengeshu>=3){
        int x3=0;
        int y3=0;
        x3=input.nextInt();
        y3=input.nextInt();
        int[][]a3=new int[x3][y3];
        for (int m=0;m<a3.length;m++){
            for (int n=0;n<a3[m].length;n++){
                a3[m][n]= input.nextInt();
            }
        }
        int[][]a23=new int[x1][y3];
        for (int i1=0;i1<x1;i1++){
            for (int j1=0;j1<y3;j1++){
                int jieguo1=0;
                for (int k1=0;k1<y2;k1++){

                    jieguo1=jieguo1+a12[i1][k1]*a3[k1][j1];
                    //System.out.print(jieguo1);
                    if (j1<y3-1&&k1==y2-1) {
                        if (juzhengeshu==3){
                            System.out.print(jieguo1+" ");
                        }
                        else{
                            a23[i1][j1] = jieguo1;
                        }
                    }
                    else if (j1==y3-1&&k1==y2-1){
                        if (juzhengeshu==3){
                            System.out.println(jieguo1);
                        }
                        else {
                            a23[i1][j1]=jieguo1;
                        }
                    }
                }
            }
        }
        if (juzhengeshu>=4){
        int x4=0;
        int y4=0;
        x4=input.nextInt();
        y4=input.nextInt();
        int[][]a4=new int[x4][y4];
        for (int m=0;m<a4.length;m++){
            for (int n=0;n<a4[m].length;n++){
                a4[m][n]= input.nextInt();
            }
        }
        int[][]a34=new int[x1][y4];
        for (int i1=0;i1<x1;i1++){
            for (int j1=0;j1<y4;j1++){
                int jieguo1=0;
                for (int k1=0;k1<y3;k1++){

                    jieguo1=jieguo1+a23[i1][k1]*a4[k1][j1];
                    //System.out.print(jieguo1);
                    if (j1<y4-1&&k1==y3-1){
                        if (juzhengeshu==4){
                            System.out.print(jieguo1+" ");
                        }
                        else {
                            a34[i1][j1]=jieguo1;
                        }
                    }
                    else if (j1==y4-1&&k1==y3-1){
                        if (juzhengeshu==4){
                            System.out.println(jieguo1);
                        }
                        else {
                            a34[i1][j1]=jieguo1;
                        }
                    }
                }
            }
        }
        if (juzhengeshu>=5){
        int x5=0;
        int y5=0;
        x5=input.nextInt();
        y5=input.nextInt();
        int[][]a5=new int[x5][y5];
        for (int m=0;m<a5.length;m++){
            for (int n=0;n<a5[m].length;n++){
                a5[m][n]= input.nextInt();
            }
        }
        int[][]a45=new int[x1][y5];
        for (int i1=0;i1<x1;i1++){
            for (int j1=0;j1<y5;j1++){
                int jieguo1=0;
                for (int k1=0;k1<y4;k1++){

                    jieguo1=jieguo1+a34[i1][k1]*a5[k1][j1];
                    //if (juzhengeshu==5){
                        //System.out.print(jieguo1);
                    //}
                    if (j1<y5-1&&k1==y4-1){
                        if (juzhengeshu==5){
                            System.out.print(jieguo1+" ");
                        }
                        else{
                            a45[i1][j1]=jieguo1;
                        }
                    }
                    else if (j1==y5-1&&k1==y4-1){
                        if (juzhengeshu==5){
                            System.out.println(jieguo1);
                        }
                        else{
                            a45[i1][j1]=jieguo1;
                        }
                    }
                }
            }
        }
        if (juzhengeshu==6){
        int x6=0;
        int y6=0;
        x6=input.nextInt();
        y6=input.nextInt();
        int[][]a6=new int[x6][y6];
        for (int m=0;m<a6.length;m++){
            for (int n=0;n<a6[m].length;n++){
                a6[m][n]= input.nextInt();
            }
        }
        int[][]a56=new int[x1][y5];
        for (int i1=0;i1<x1;i1++){
            for (int j1=0;j1<y6;j1++){
                int jieguo1=0;
                for (int k1=0;k1<y5;k1++){

                    jieguo1=jieguo1+a45[i1][k1]*a6[k1][j1];
                    //System.out.print(jieguo1);
                    if (j1<y6-1&&k1==y5-1){
                        System.out.print(jieguo1+" ");
                        //a56[i1][j1]=jieguo1;
                    }
                    else if (j1==y6-1&&k1==y5-1){
                        System.out.println(jieguo1);
                        //a56[i1][j1]=jieguo1;
                    }
                }
            }
        }

    }
}}}}}
