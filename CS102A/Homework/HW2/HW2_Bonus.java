package HW2;

import java.util.*;
public class HW2_Bonus {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        String chushi;
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        y = input.nextInt();
        String []yuanshi=new String[x];
        for (int p=0;p<yuanshi.length;p++){
            yuanshi[p]=input.next();
        }
        chushi=yuanshi[0];
        for (int q=1;q<yuanshi.length;q++){
            chushi=chushi+yuanshi[q];
        }
        int jishuqi=0;
        String[][] a = new String[x][y];
        for (int n = 0; n < a.length; n++) {
            for (int m = 0; m < y; m++) {
                String head= chushi.substring(jishuqi,jishuqi+1);
                a[n][m] = head;
                jishuqi=jishuqi+1;
            }
        }
        if (x==1){
            for (int i = 0; i < y; i++) {
                if (i==0){
                    if(a[0][i].equals("*")){
                        System.out.print("F");
                    }
                    else {
                        int dileigeshu=0;
                        if (a[0][i + 1].equals("*")) {
                            dileigeshu = dileigeshu + 1;
                        }
                        if (dileigeshu!=0){
                            System.out.print(dileigeshu);
                        }
                        else {
                            System.out.print("-");
                        }
                    }
                }
                else if (i!=y-1){
                    if(a[0][i].equals("*")){
                        System.out.print("F");
                    }
                    else{
                        int dileigeshu=0;
                        if (a[0][i-1].equals("*")){
                            dileigeshu=dileigeshu+1;
                        }
                        if (a[0][i+1].equals("*")){
                            dileigeshu=dileigeshu+1;
                        }
                        if (dileigeshu!=0){
                            System.out.print(dileigeshu);
                        }
                        else {
                            System.out.print("-");
                        }
                    }
                }
                else {
                    if(a[0][i].equals("*")){
                        System.out.println("F");
                    }
                    else {
                        int dileigeshu=0;
                        if (a[0][i - 1].equals("*")) {
                            dileigeshu = dileigeshu + 1;
                        }
                        if (dileigeshu!=0){
                            System.out.println(dileigeshu);
                        }
                        else {
                            System.out.println("-");
                        }
                    }
                }
            }//这是只有一行的情况
        }else if (y==1){
            for (int i = 0; i < x; i++) {
                if (i==0){
                    if(a[i][0].equals("*")){
                        System.out.println("F");
                    }
                    else {
                        int dileigeshu=0;
                        if (a[i+1][0].equals("*")) {
                            dileigeshu = dileigeshu + 1;
                        }
                        if (dileigeshu!=0){
                            System.out.println(dileigeshu);
                        }
                        else {
                            System.out.println("-");
                        }
                    }
                }
                else if (i!=x-1){
                    if(a[i][0].equals("*")){
                        System.out.println("F");
                    }
                    else{
                        int dileigeshu=0;
                        if (a[i+1][0].equals("*")){
                            dileigeshu=dileigeshu+1;
                        }
                        if (a[i-1][0].equals("*")){
                            dileigeshu=dileigeshu+1;
                        }
                        if (dileigeshu!=0){
                            System.out.println(dileigeshu);
                        }
                        else {
                            System.out.println("-");
                        }
                    }
                }
                else {
                    if(a[i][0].equals("*")){
                        System.out.println("F");
                    }
                    else {
                        int dileigeshu=0;
                        if (a[i-1][0].equals("*")) {
                            dileigeshu = dileigeshu + 1;
                        }
                        if (dileigeshu!=0){
                            System.out.println(dileigeshu);
                        }
                        else {
                            System.out.println("-");
                        }
                    }
                }
            }//这是只有一列的情况
        }
        else{
        for (int i = 0; i < y; i++) {
            if (i==0){
                if(a[0][i].equals("*")){
                    System.out.print("F");
                }
                else {
                    int dileigeshu=0;
                    if (a[0][i + 1].equals("*")) {
                        dileigeshu = dileigeshu + 1;
                    }
                    if (a[1][i + 1].equals("*")) {
                        dileigeshu = dileigeshu + 1;
                    }
                    if (a[1][i].equals("*")) {
                        dileigeshu = dileigeshu + 1;
                    }
                    if (dileigeshu!=0){
                        System.out.print(dileigeshu);
                    }
                    else {
                        System.out.print("-");
                    }
                }
            }
            else if (i!=y-1){
                if(a[0][i].equals("*")){
                    System.out.print("F");
                }
                else{
                    int dileigeshu=0;
                    if (a[0][i-1].equals("*")){
                        dileigeshu=dileigeshu+1;
                    }
                    if (a[0][i+1].equals("*")){
                        dileigeshu=dileigeshu+1;
                    }
                    if (a[1][i-1].equals("*")){
                        dileigeshu=dileigeshu+1;
                    }
                    if (a[1][i].equals("*")){
                        dileigeshu=dileigeshu+1;
                    }
                    if (a[1][i+1].equals("*")){
                        dileigeshu=dileigeshu+1;
                    }
                    if (dileigeshu!=0){
                        System.out.print(dileigeshu);
                    }
                    else {
                        System.out.print("-");
                    }
                }
            }
            else {
                if(a[0][i].equals("*")){
                    System.out.println("F");
                }
                else {
                    int dileigeshu=0;
                    if (a[0][i - 1].equals("*")) {
                        dileigeshu = dileigeshu + 1;
                    }
                    if (a[1][i - 1].equals("*")) {
                        dileigeshu = dileigeshu + 1;
                    }
                    if (a[1][i].equals("*")) {
                        dileigeshu = dileigeshu + 1;
                    }
                    if (dileigeshu!=0){
                        System.out.println(dileigeshu);
                    }
                    else {
                        System.out.println("-");
                    }
                }
            }
        }//上面是第一行的遍历
        for (int j=1;j<a.length-1;j++){
            for (int i=0;i<y;i++){
                if (i==0){
                    if(a[j][i].equals("*")){
                        System.out.print("F");
                    }
                    else {
                        int dileigeshu=0;
                        if (a[j-1][i].equals("*")) {
                            dileigeshu = dileigeshu + 1;
                        }
                        if (a[j-1][i+1].equals("*")) {
                            dileigeshu = dileigeshu + 1;
                        }
                        if (a[j][i + 1].equals("*")) {
                            dileigeshu = dileigeshu + 1;
                        }
                        if (a[j+1][i+1].equals("*")) {
                            dileigeshu = dileigeshu + 1;
                        }
                        if (a[j+1][i].equals("*")) {
                            dileigeshu = dileigeshu + 1;
                        }
                        if (dileigeshu!=0){
                            System.out.print(dileigeshu);
                        }
                        else {
                            System.out.print("-");
                        }
                    }
                }
                else if (i!=y-1){
                    if(a[j][i].equals("*")){
                        System.out.print("F");
                    }
                    else{
                        int dileigeshu=0;
                        if (a[j-1][i-1].equals("*")){
                            dileigeshu=dileigeshu+1;
                        }
                        if (a[j-1][i].equals("*")){
                            dileigeshu=dileigeshu+1;
                        }
                        if (a[j-1][i+1].equals("*")){
                            dileigeshu=dileigeshu+1;
                        }
                        if (a[j][i-1].equals("*")){
                            dileigeshu=dileigeshu+1;
                        }
                        if (a[j][i+1].equals("*")){
                            dileigeshu=dileigeshu+1;
                        }
                        if (a[j+1][i-1].equals("*")){
                            dileigeshu=dileigeshu+1;
                        }
                        if (a[j+1][i].equals("*")){
                            dileigeshu=dileigeshu+1;
                        }
                        if (a[j+1][i+1].equals("*")){
                            dileigeshu=dileigeshu+1;
                        }
                        if (dileigeshu!=0){
                            System.out.print(dileigeshu);
                        }
                        else {
                            System.out.print("-");
                        }
                    }
                }
                else {
                    if(a[j][i].equals("*")){
                        System.out.println("F");
                    }
                    else {
                        int dileigeshu=0;
                        if (a[j-1][i - 1].equals("*")) {
                            dileigeshu = dileigeshu + 1;
                        }
                        if (a[j-1][i].equals("*")) {
                            dileigeshu = dileigeshu + 1;
                        }
                        if (a[j][i - 1].equals("*")) {
                            dileigeshu = dileigeshu + 1;
                        }
                        if (a[j+1][i-1].equals("*")) {
                            dileigeshu = dileigeshu + 1;
                        }
                        if (a[j+1][i].equals("*")) {
                            dileigeshu = dileigeshu + 1;
                        }
                        if (dileigeshu!=0){
                            System.out.println(dileigeshu);
                        }
                        else {
                            System.out.println("-");
                        }
                    }
                }
            }
        }//这是对中间x-2行的遍历
        for (int i = 0; i < y; i++) {
            if (i==0){
                if(a[x-1][i].equals("*")){
                    System.out.print("F");
                }
                else {
                    int dileigeshu=0;
                    if (a[x-1][i + 1].equals("*")) {
                        dileigeshu = dileigeshu + 1;
                    }
                    if (a[x-2][i].equals("*")) {
                        dileigeshu = dileigeshu + 1;
                    }
                    if (a[x-2][i+1].equals("*")) {
                        dileigeshu = dileigeshu + 1;
                    }
                    if (dileigeshu!=0){
                        System.out.print(dileigeshu);
                    }
                    else {
                        System.out.print("-");
                    }
                }
            }
            else if (i!=y-1){
                if(a[x-1][i].equals("*")){
                    System.out.print("F");
                }
                else{
                    int dileigeshu=0;
                    if (a[x-1][i-1].equals("*")){
                        dileigeshu=dileigeshu+1;
                    }
                    if (a[x-1][i+1].equals("*")){
                        dileigeshu=dileigeshu+1;
                    }
                    if (a[x-2][i-1].equals("*")){
                        dileigeshu=dileigeshu+1;
                    }
                    if (a[x-2][i].equals("*")){
                        dileigeshu=dileigeshu+1;
                    }
                    if (a[x-2][i+1].equals("*")){
                        dileigeshu=dileigeshu+1;
                    }
                    if (dileigeshu!=0){
                        System.out.print(dileigeshu);
                    }
                    else {
                        System.out.print("-");
                    }
                }
            }
            else {
                if(a[x-1][i].equals("*")){
                    System.out.println("F");
                }
                else {
                    int dileigeshu=0;
                    if (a[x-1][i - 1].equals("*")) {
                        dileigeshu = dileigeshu + 1;
                    }
                    if (a[x-2][i - 1].equals("*")) {
                        dileigeshu = dileigeshu + 1;
                    }
                    if (a[x-2][i].equals("*")) {
                        dileigeshu = dileigeshu + 1;
                    }
                    if (dileigeshu!=0){
                        System.out.println(dileigeshu);
                    }
                    else {
                        System.out.println("-");
                    }
                }
            }
        }//这是对最后一行的遍历
    }
}}
