package baiTapMang;

import java.util.Scanner;

public class lietKeSoLanXHienTrgMang {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Nhap n= ");
        int n= scanner.nextInt();
        int a[]= new int[n];
        int b[]= new int[n];
     
        for(int i=0;i<a.length;i++){
            System.out.print("a["+i+"]= ");
            a[i]= scanner.nextInt();
        }
        for(int i=0;i<n;i++){
            boolean flag= true;
            int count =0;
                for(int j=0;j<n;j++){
                    if(b[j]==a[i]){
                       flag=false;
                       break;
                    }
                }
                if(flag){
                    for(int z=0;z<n;z++){
                        b[i]=a[i];
                        if(b[i]==a[z]){
                            count++;
                        }
                    }
                }
            if(count>0){
            System.out.print("Gia tri "+a[i]+" co "+count+" lan xuat hien trong mang\n");
            }
        }
    }
}
