package baiTapMang;

import java.util.Scanner;

public class timPTuXuatHien1Lan {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Nhap n= ");
        int n= scanner.nextInt();
        int a[]= new int[n];
        int x=0;
        for(int i=0;i<n;i++){
            System.out.print("a["+i+"]= ");
            a[i]= scanner.nextInt();
        }
        for(int i=0;i<n;i++){
            int count =0;
            for(int j=0;j<n;j++){
                if(a[j]==a[i]){
                count+=1;
                }
            }
            if(count==1){
                System.out.print(a[i]+" ");
            }
        }
    }
}
