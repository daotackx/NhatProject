package baiTapMang;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        //them vao vi tri nao, them bao nhieu phan tu
        Scanner scanner= new Scanner(System.in);
        System.out.print(" Nhap so phan tu trong mang a: ");
        int n= scanner.nextInt();
        int a[]= new int[n];
        for(int i=0;i<n;i++){
            System.out.print("a["+i+"]= ");
            a[i]= scanner.nextInt();
        }
        System.out.print("\nSap xep tang dan:");
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
               if(a[i]>a[j]){
                   int t= a[i];
                   a[i]= a[j];
                   a[j]= t;
               }
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.print("\nNhap vi tri can chen: ");
        int index= scanner.nextInt();
        System.out.print("\nNhap so phan tu can them: ");
        int z= scanner.nextInt();
        System.out.print("\nNhap gia tri: ");
        int v[]= new int[z];
        for(int i=0;i<v.length;i++){
            v[i]= scanner.nextInt();
        }
        int m=0;
        m=n+z;
        int b[]= new int[m];
        for(int i=0;i<n;i++){
            b[i]=a[i];
        }
        int d=0;
        for(int i=0;i<b.length;i++){
            if(i<index){
                b[i]=a[i];
            }else if((i>=index) && (i<index+z)){
                b[i]= v[d];
                d++;
            }else{
                b[i]=a[i-z];
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
