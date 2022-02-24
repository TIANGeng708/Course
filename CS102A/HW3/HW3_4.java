package HW3;

import java.util.Scanner;

/*public class HW3_4 {
    public static void main(String[] args){
        int row=0;int column=0;
        int x1;
        int x2;
        int y1;
        int y2;
        Scanner a=new Scanner(System.in);
        row=a.nextInt();
        column=a.nextInt();
        int [][]matrix=new int[row][column];
        x1=a.nextInt();
        x2=a.nextInt();
        y1=a.nextInt();
        y2=a.nextInt();
        for (int n = 0; n < matrix.length; n++) {
            for (int m = 0; m < matrix[n].length; m++) {
                matrix[n][m] = a.nextInt();
            }
        }
        //System.out.print(matrix[0][0]);
        //flatSubMatrix(matrix,x1,x2,y1,y2);
        int aaa[]=flatSubMatrix(matrix,x1,x2,y1,y2);
        int bbb[]=Sort(aaa);
        //System.out.println(Math.min(x1,x2));
        //System.out.println(Math.max(x1,x2));
        //System.out.println(Math.min(y1,y2));
        //System.out.println(Math.max(y1,y2));
        for (int xx=0;xx<bbb.length;xx++){
            System.out.print(bbb[xx]+" ");
        }

    }

    public static int[] flatSubMatrix(int[][] matrix, int x1, int x2, int y1, int y2){
        int abc[]=new int[(Math.abs(x2-x1)+1)*(Math.abs(y1-y2)+1)];
        int b=0;
        //System.out.println(matrix.length);
        //System.out.println(matrix[0].length);
        for (int n = 0; n < matrix.length; n++) {
            for (int m = 0; m < matrix[n].length; m++) {
                //if (n>=0){
                //System.out.println(n);
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
}*/

public class HW3_4 {
    public static void main(String[] args){
        int row=0;int column=0;
        int x1;
        int x2;
        int y1;
        int y2;
        Scanner a=new Scanner(System.in);
        row=a.nextInt();
        column=a.nextInt();
        int [][]matrix=new int[row][column];
        for (int n = 0; n < matrix.length; n++) {
            for (int m = 0; m < matrix[n].length; m++) {
                matrix[n][m] = a.nextInt();
            }
        }
        x1=a.nextInt();
        x2=a.nextInt();
        y1=a.nextInt();
        y2=a.nextInt();
        //System.out.print(matrix[0][0]);
        //flatSubMatrix(matrix,x1,x2,y1,y2);
        int aaa[]=flatSubMatrix(matrix,x1,x2,y1,y2);
        int bbb[]=Sort(aaa);
        for (int xx=0;xx<bbb.length;xx++){
            System.out.print(bbb[xx]+" ");
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
