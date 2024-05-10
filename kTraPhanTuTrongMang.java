package baiTapMang;

import java.util.Scanner;

public class kTraPhanTuTrongMang {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print(" Nhap so phan tu trong mang: ");
        int n= scanner.nextInt();
        int a[]= new int[n];
        boolean flag= false;
        for(int i=0;i<n;i++){
            System.out.print("a["+i+"]= ");
            a[i]= scanner.nextInt();
        }
        System.out.print("Nhap 1 phan tu can tim trong mang: ");
        int x= scanner.nextInt();
        for(int i=0;i<n;i++){
           if(x==a[i]){
              flag= true;
           }
        }
        if(flag){
            System.out.print("Co gia tri "+x+" trong mang");
        }else{
            System.out.print("Khong co gia tri "+x+" trong mang");
        }
    }
}
