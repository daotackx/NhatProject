package baiTapMang;

import java.util.Scanner;

public class sapXepMang {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.print(" Nhap so phan tu trong mang: ");
        int n= scanner.nextInt();
        int a[]= new int[n];
        for(int i=0;i<n;i++){
            System.out.print("a["+i+"]= ");
            a[i]= scanner.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
               if(a[i]>a[j]){
                   int t= a[i];
                   a[i]= a[j];
                   a[j]= t;
               }
            }
        }
        System.out.print(" Sap xep tang dan:");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        // for(int i=0;i<n-1;i++){
        //     for(int j=i+1;j<n;j++){
        //        if(a[j]>a[i]){
        //            int t= a[i];
        //            a[i]= a[j];
        //            a[j]= t;
        //        }
        //     }
        // }
        System.out.print("\n Sap xep giam dan: ");
        for(int i=n-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }
        // System.out.print("\n Sap xep giam dan: ");
        // for(int i=0;i<n;i++){
        //     System.out.print(a[i]+" ");
        // }
    }
}
