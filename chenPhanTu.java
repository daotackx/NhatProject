package baiTapMang;

import java.util.Scanner;

public class chenPhanTu {
    public static void main(String[] args) {
        //them vao vi tri nao, them bao nhieu phan tu
        Scanner scanner= new Scanner(System.in);
        System.out.print(" Nhap so phan tu trong mang a: ");
        int n= scanner.nextInt();
        int a[]= new int[n];
        System.out.print(" Nhap vi tri can chen: ");
        int index= scanner.nextInt();
        System.out.print(" Nhap gia tri: ");
        int v= scanner.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("a["+i+"]= ");
            a[i]= scanner.nextInt();
        }
        int m=0;
        m=n+1;
        int b[]= new int[m];
        for(int i=0;i<n;i++){
            b[i]=a[i];
        }
        for(int i=0;i<b.length;i++){
            if(i<index){
                b[i]=a[i];
            }else if((i>=index) && (i<index+1)){
                b[i]= v;
            }else{
                b[i]=a[i-1];
            }
        }
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
        for(int i=0;i<b.length-1;i++){
            for(int j=i+1;j<b.length;j++){
               if(b[i]>b[j]){
                   int t= b[i];
                   b[i]= b[j];
                   b[j]= t;
               }
            }
        }
        System.err.print("\n");
        System.out.print(" Sap xep tang dan:");
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }    
    }
}
