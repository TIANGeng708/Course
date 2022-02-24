package HW3;

import java.util.Scanner;

public class HW3_5 {
    public static void main(String []args){
        //int row=0;int column=0;
        int x1=0;
        int x2=2;
        int y1=0;
        int y2=2;
        Scanner a=new Scanner(System.in);
        //row=a.nextInt();
        //column=a.nextInt();
        int [][]matrix=new int[9][9];
        for (int n = 0; n < matrix.length; n++) {
            for (int m = 0; m < matrix[n].length; m++) {
                matrix[n][m] = a.nextInt();
            }
        }
        //x1=a.nextInt();
        //x2=a.nextInt();
        //y1=a.nextInt();
        //y2=a.nextInt();
        //System.out.print(matrix[0][0]);
        //flatSubMatrix(matrix,x1,x2,y1,y2);
        //int aaa[];
        //for (int i=0;i<9;i++){
         int aaa[] =flatSubMatrix(matrix,x1,x2,y1,y2);
        int bbb[]=Sort(aaa);
        for (int xx=0;xx<bbb.length;xx++){
            //System.out.print(bbb[xx]);
        }
        x1=3;x2=5;y1=0;y2=2;
        int aaa1[] =flatSubMatrix(matrix,x1,x2,y1,y2);
        int bbb1[]=Sort(aaa1);
        for (int xx=0;xx<bbb1.length;xx++){
            //System.out.print(bbb1[xx]);
        }
        x1=6;x2=8;y1=0;y2=2;
        int aaa2[] =flatSubMatrix(matrix,x1,x2,y1,y2);
        int bbb2[]=Sort(aaa2);
        for (int xx=0;xx<bbb2.length;xx++){
            //System.out.print(bbb2[xx]);
        }
        x1=0;x2=2;y1=3;y2=5;
        int aaa3[] =flatSubMatrix(matrix,x1,x2,y1,y2);
        int bbb3[]=Sort(aaa3);
        for (int xx=0;xx<bbb3.length;xx++){
            //System.out.print(bbb3[xx]);
        }
        x1=3;x2=5;y1=3;y2=5;
        int aaa4[] =flatSubMatrix(matrix,x1,x2,y1,y2);
        int bbb4[]=Sort(aaa4);
        for (int xx=0;xx<bbb4.length;xx++){
            //System.out.print(bbb4[xx]);
        }
        x1=6;x2=8;y1=3;y2=5;
        int aaa5[] =flatSubMatrix(matrix,x1,x2,y1,y2);
        int bbb5[]=Sort(aaa5);
        for (int xx=0;xx<bbb5.length;xx++){
            //System.out.print(bbb5[xx]);
        }
        x1=0;x2=2;y1=6;y2=8;
        int aaa6[] =flatSubMatrix(matrix,x1,x2,y1,y2);
        int bbb6[]=Sort(aaa6);
        for (int xx=0;xx<bbb6.length;xx++){
            //System.out.print(bbb6[xx]);
        }
        x1=3;x2=5;y1=6;y2=8;
        int aaa7[] =flatSubMatrix(matrix,x1,x2,y1,y2);
        int bbb7[]=Sort(aaa7);
        for (int xx=0;xx<bbb7.length;xx++){
            //System.out.print(bbb7[xx]);
        }
        x1=6;x2=8;y1=6;y2=8;
        int aaa8[] =flatSubMatrix(matrix,x1,x2,y1,y2);
        int bbb8[]=Sort(aaa8);
        for (int xx=0;xx<bbb8.length;xx++){
            //System.out.print(bbb8[xx]);
        }
        x1=0;x2=0;y1=0;y2=8;
        int aaa9[] =flatSubMatrix(matrix,x1,x2,y1,y2);
        int bbb9[]=Sort(aaa9);
        for (int xx=0;xx<bbb8.length;xx++){
            //System.out.print(bbb9[xx]);
        }
        x1=1;x2=1;y1=0;y2=8;
        int aaa10[] =flatSubMatrix(matrix,x1,x2,y1,y2);
        int bbb10[]=Sort(aaa10);
        for (int xx=0;xx<bbb8.length;xx++){
            //System.out.print(bbb10[xx]);
        }
        x1=2;x2=2;y1=0;y2=8;
        int aaa11[] =flatSubMatrix(matrix,x1,x2,y1,y2);
        int bbb11[]=Sort(aaa11);
        for (int xx=0;xx<bbb8.length;xx++){
            //System.out.print(bbb11[xx]);
        }
        x1=3;x2=3;y1=0;y2=8;
        int aaa12[] =flatSubMatrix(matrix,x1,x2,y1,y2);
        int bbb12[]=Sort(aaa12);
        for (int xx=0;xx<bbb8.length;xx++){
            //System.out.print(bbb12[xx]);
        }
        x1=4;x2=4;y1=0;y2=8;
        int aaa13[] =flatSubMatrix(matrix,x1,x2,y1,y2);
        int bbb13[]=Sort(aaa13);
        for (int xx=0;xx<bbb8.length;xx++){
            //System.out.print(bbb13[xx]);
        }
        x1=5;x2=5;y1=0;y2=8;
        int aaa14[] =flatSubMatrix(matrix,x1,x2,y1,y2);
        int bbb14[]=Sort(aaa14);
        for (int xx=0;xx<bbb8.length;xx++){
            //System.out.print(bbb14[xx]);
        }
        x1=6;x2=6;y1=0;y2=8;
        int aaa15[] =flatSubMatrix(matrix,x1,x2,y1,y2);
        int bbb15[]=Sort(aaa15);
        for (int xx=0;xx<bbb8.length;xx++){
            //System.out.print(bbb15[xx]);
        }
        x1=7;x2=7;y1=0;y2=8;
        int aaa16[] =flatSubMatrix(matrix,x1,x2,y1,y2);
        int bbb16[]=Sort(aaa16);
        for (int xx=0;xx<bbb8.length;xx++){
            //System.out.print(bbb16[xx]);
        }
        x1=8;x2=8;y1=0;y2=8;
        int aaa17[] =flatSubMatrix(matrix,x1,x2,y1,y2);
        int bbb17[]=Sort(aaa17);
        for (int xx=0;xx<bbb8.length;xx++){
            //System.out.print(bbb17[xx]);
        }
        x1=0;x2=8;y1=0;y2=0;
        int aaa18[] =flatSubMatrix(matrix,x1,x2,y1,y2);
        int bbb18[]=Sort(aaa18);
        for (int xx=0;xx<bbb8.length;xx++){
            //System.out.print(bbb18[xx]);
        }
        x1=0;x2=8;y1=1;y2=1;
        int aaa19[] =flatSubMatrix(matrix,x1,x2,y1,y2);
        int bbb19[]=Sort(aaa19);
        for (int xx=0;xx<bbb8.length;xx++){
            //System.out.print(bbb19[xx]);
        }
        x1=0;x2=8;y1=2;y2=2;
        int aaa20[] =flatSubMatrix(matrix,x1,x2,y1,y2);
        int bbb20[]=Sort(aaa20);
        for (int xx=0;xx<bbb8.length;xx++){
            //System.out.print(bbb20[xx]);
        }
        x1=0;x2=8;y1=3;y2=3;
        int aaa21[] =flatSubMatrix(matrix,x1,x2,y1,y2);
        int bbb21[]=Sort(aaa21);
        for (int xx=0;xx<bbb8.length;xx++){
            //System.out.print(bbb21[xx]);
        }
        x1=0;x2=8;y1=4;y2=4;
        int aaa22[] =flatSubMatrix(matrix,x1,x2,y1,y2);
        int bbb22[]=Sort(aaa22);
        for (int xx=0;xx<bbb8.length;xx++){
            //System.out.print(bbb22[xx]);
        }
        x1=0;x2=8;y1=5;y2=5;
        int aaa23[] =flatSubMatrix(matrix,x1,x2,y1,y2);
        int bbb23[]=Sort(aaa23);
        for (int xx=0;xx<bbb8.length;xx++){
            //System.out.print(bbb23[xx]);
        }
        x1=0;x2=8;y1=6;y2=6;
        int aaa24[] =flatSubMatrix(matrix,x1,x2,y1,y2);
        int bbb24[]=Sort(aaa24);
        for (int xx=0;xx<bbb8.length;xx++){
            //System.out.print(bbb24[xx]);
        }
        x1=0;x2=8;y1=7;y2=7;
        int aaa25[] =flatSubMatrix(matrix,x1,x2,y1,y2);
        int bbb25[]=Sort(aaa25);
        for (int xx=0;xx<bbb8.length;xx++){
            //System.out.print(bbb25[xx]);
        }
        x1=0;x2=8;y1=8;y2=8;
        int aaa26[] =flatSubMatrix(matrix,x1,x2,y1,y2);
        int bbb26[]=Sort(aaa26);
        for (int xx=0;xx<bbb8.length;xx++){
            //System.out.print(bbb26[xx]);
        }
        String test[]=new String[27];
        test[0]=bbb[0]+""+bbb[1]+""+bbb[2]+""+bbb[3]+""+bbb[4]+""+bbb[5]+""+bbb[6]+""+bbb[7]+""+bbb[8]+"";
        test[1]=bbb1[0]+""+bbb1[1]+""+bbb1[2]+""+bbb1[3]+""+bbb1[4]+""+bbb1[5]+""+bbb1[6]+""+bbb1[7]+""+bbb1[8]+"";
        test[2]=bbb2[0]+""+bbb2[1]+""+bbb2[2]+""+bbb2[3]+""+bbb2[4]+""+bbb2[5]+""+bbb2[6]+""+bbb2[7]+""+bbb2[8]+"";
        test[3]=bbb3[0]+""+bbb3[1]+""+bbb3[2]+""+bbb3[3]+""+bbb3[4]+""+bbb3[5]+""+bbb3[6]+""+bbb3[7]+""+bbb3[8]+"";
        test[4]=bbb4[0]+""+bbb4[1]+""+bbb4[2]+""+bbb4[3]+""+bbb4[4]+""+bbb4[5]+""+bbb4[6]+""+bbb4[7]+""+bbb4[8]+"";
        test[5]=bbb5[0]+""+bbb5[1]+""+bbb5[2]+""+bbb5[3]+""+bbb5[4]+""+bbb5[5]+""+bbb5[6]+""+bbb5[7]+""+bbb5[8]+"";
        test[6]=bbb6[0]+""+bbb6[1]+""+bbb6[2]+""+bbb6[3]+""+bbb6[4]+""+bbb6[5]+""+bbb6[6]+""+bbb6[7]+""+bbb6[8]+"";
        test[7]=bbb7[0]+""+bbb7[1]+""+bbb7[2]+""+bbb7[3]+""+bbb7[4]+""+bbb7[5]+""+bbb7[6]+""+bbb7[7]+""+bbb7[8]+"";
        test[8]=bbb8[0]+""+bbb8[1]+""+bbb8[2]+""+bbb8[3]+""+bbb8[4]+""+bbb8[5]+""+bbb8[6]+""+bbb8[7]+""+bbb8[8]+"";
        test[9]=bbb9[0]+""+bbb9[1]+""+bbb9[2]+""+bbb9[3]+""+bbb9[4]+""+bbb9[5]+""+bbb9[6]+""+bbb9[7]+""+bbb9[8]+"";
        test[10]=bbb10[0]+""+bbb10[1]+""+bbb10[2]+""+bbb10[3]+""+bbb10[4]+""+bbb10[5]+""+bbb10[6]+""+bbb10[7]+""+bbb10[8]+"";
        test[11]=bbb11[0]+""+bbb11[1]+""+bbb11[2]+""+bbb11[3]+""+bbb11[4]+""+bbb11[5]+""+bbb11[6]+""+bbb11[7]+""+bbb11[8]+"";
        test[12]=bbb12[0]+""+bbb12[1]+""+bbb12[2]+""+bbb12[3]+""+bbb12[4]+""+bbb12[5]+""+bbb12[6]+""+bbb12[7]+""+bbb12[8]+"";
        test[13]=bbb13[0]+""+bbb13[1]+""+bbb13[2]+""+bbb13[3]+""+bbb13[4]+""+bbb13[5]+""+bbb13[6]+""+bbb13[7]+""+bbb13[8]+"";
        test[14]=bbb14[0]+""+bbb14[1]+""+bbb14[2]+""+bbb14[3]+""+bbb14[4]+""+bbb14[5]+""+bbb14[6]+""+bbb14[7]+""+bbb14[8]+"";
        test[15]=bbb15[0]+""+bbb15[1]+""+bbb15[2]+""+bbb15[3]+""+bbb15[4]+""+bbb15[5]+""+bbb15[6]+""+bbb15[7]+""+bbb15[8]+"";
        test[16]=bbb16[0]+""+bbb16[1]+""+bbb16[2]+""+bbb16[3]+""+bbb16[4]+""+bbb16[5]+""+bbb16[6]+""+bbb16[7]+""+bbb16[8]+"";
        test[17]=bbb17[0]+""+bbb17[1]+""+bbb17[2]+""+bbb17[3]+""+bbb17[4]+""+bbb17[5]+""+bbb17[6]+""+bbb17[7]+""+bbb17[8]+"";
        test[18]=bbb18[0]+""+bbb18[1]+""+bbb18[2]+""+bbb18[3]+""+bbb18[4]+""+bbb18[5]+""+bbb18[6]+""+bbb18[7]+""+bbb18[8]+"";
        test[19]=bbb19[0]+""+bbb19[1]+""+bbb19[2]+""+bbb19[3]+""+bbb19[4]+""+bbb19[5]+""+bbb19[6]+""+bbb19[7]+""+bbb19[8]+"";
        test[20]=bbb20[0]+""+bbb20[1]+""+bbb20[2]+""+bbb20[3]+""+bbb20[4]+""+bbb20[5]+""+bbb20[6]+""+bbb20[7]+""+bbb20[8]+"";
        test[21]=bbb21[0]+""+bbb21[1]+""+bbb21[2]+""+bbb21[3]+""+bbb21[4]+""+bbb21[5]+""+bbb21[6]+""+bbb21[7]+""+bbb21[8]+"";
        test[22]=bbb22[0]+""+bbb22[1]+""+bbb22[2]+""+bbb22[3]+""+bbb22[4]+""+bbb22[5]+""+bbb22[6]+""+bbb22[7]+""+bbb22[8]+"";
        test[23]=bbb23[0]+""+bbb23[1]+""+bbb23[2]+""+bbb23[3]+""+bbb23[4]+""+bbb23[5]+""+bbb23[6]+""+bbb23[7]+""+bbb23[8]+"";
        test[24]=bbb24[0]+""+bbb24[1]+""+bbb24[2]+""+bbb24[3]+""+bbb24[4]+""+bbb24[5]+""+bbb24[6]+""+bbb24[7]+""+bbb24[8]+"";
        test[25]=bbb25[0]+""+bbb25[1]+""+bbb25[2]+""+bbb25[3]+""+bbb25[4]+""+bbb25[5]+""+bbb25[6]+""+bbb25[7]+""+bbb25[8]+"";
        test[26]=bbb26[0]+""+bbb26[1]+""+bbb26[2]+""+bbb26[3]+""+bbb26[4]+""+bbb26[5]+""+bbb26[6]+""+bbb26[7]+""+bbb26[8]+"";




        //System.out.println(test[0]);
        //System.out.println(test[1]);
        //System.out.println(test[2]);
        //System.out.println(test[3]);
        //System.out.println(test[4]);
        //System.out.println(test[5]);
        //System.out.println(test[6]);
        //System.out.println(test[7]);
        //System.out.println(test[8]);
        if (test[0].equals("123456789")&&test[1].equals("123456789")&&test[2].equals("123456789")&&test[3].equals("123456789")&&test[4].equals("123456789")&&test[5].equals("123456789")&&test[6].equals("123456789")&&test[7].equals("123456789")&&test[8].equals("123456789")&&test[9].equals("123456789")&&test[10].equals("123456789")&&test[11].equals("123456789")&&test[12].equals("123456789")&&test[13].equals("123456789")&&test[14].equals("123456789")&&test[15].equals("123456789")&&test[16].equals("123456789")&&test[17].equals("123456789")&&test[18].equals("123456789")&&test[19].equals("123456789")&&test[20].equals("123456789")&&test[21].equals("123456789")&&test[22].equals("123456789")&&test[23].equals("123456789")&&test[24].equals("123456789")&&test[25].equals("123456789")&&test[26].equals("123456789")){
            System.out.print("Yes");
        }
        else {
            System.out.print("No");
        }
    }

    public static int[] flatSubMatrix(int[][] matrix, int x1, int x2, int y1, int y2){
        int abc[]=new int[(Math.abs(x2-x1)+1)*(Math.abs(y1-y2)+1)];
        int b=0;
        //System.out.println(matrix.length);
        //System.out.println(matrix[0].length);
        for (int n = 0; n < matrix.length; n++) {
            for (int m = 0; m < matrix[n].length; m++) {
                if (Math.min(x1,x2)<=n&&n<=Math.max(x1,x2)&&Math.min(y1,y2)<=m&&m<=Math.max(y1,y2)){
                    abc[b]=matrix[n][m];
                    //System.out.print(n);
                    //System.out.print(m);
                    //System.out.println(abc[b]+" ");
                    b=b+1;
                }
                else {
                    ;
                }
            }
        }
        return abc;
    }
    public static int[] Sort(int[] array){
        int bc=array.length;
        int xxx=0;
        int ab[]=new int [bc];
        int ef[]=new int[array.length];
        for (int i=0;i<bc;i++){
            int a=1;
            for (int j=0;j<bc;j++){
                //int a=1;
                if (array[i]>array[j]){
                    a=a+1;
                }
            }
            ab[i]=a;
        }
        for (int n=1;n<=array.length;n++){
            for (int m=0;m<array.length;m++){
                if (ab[m]==n){
                    ef[xxx]=array[m];
                    //System.out.print(xxx);
                    //System.out.print(array[m]);
                    //System.out.println(ab[m]);
                    xxx=xxx+1;
                }
            }
        }

        return ef;
    }
}
