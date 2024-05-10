package baiTapMang;

import java.util.Scanner;

public class timPTuLonNhatLonNhi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Nhap so phan tu trong mang a: ");
        int n = scanner.nextInt();
        int a[] = new int[n];
        int max = 0, max2 = 0, min = 0;
        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "]= ");
            a[i] = scanner.nextInt();
        }
        max = a[0];
        // for(int i=0;i<a.length;i++){
        // if(max<a[i]){
        // max=a[i];
        // }
        // }
        // for(int i=0;i<a.length;i++){
        // if(a[i]!=max){
        // max2=a[i];
        // }
        // }
        // for(int i=0;i<a.length;i++){
        // if((a[i]!=max) && (a[i])>max2){
        // max2= a[i];
        // }
        // }
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
            for (int j = 0; j < a.length-n+i; j++) {
                if ((a[j] != max) && (a[j]) > max2) {
                    max2 = a[j];
                }
            }

        }
        System.out.print("Gia tri lon nhat trong mang la " + max);
        System.out.print("\nGia tri lon nhi trong mang la " + max2);
    }
}
