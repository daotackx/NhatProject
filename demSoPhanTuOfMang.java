package baiTapMang;

import java.util.Scanner;

public class demSoPhanTuOfMang {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int[] a ={1,2,4,56,4,22,235,2,2,2,5,7,2,5,3};
        System.out.print("Nhap 1 phan tu can tim trong mang: ");
        int x= scanner.nextInt();
        int count=0;
        for(int i=0;i<a.length;i++){
           if(x==a[i]){
              count +=1;
           }
        }
        System.out.print(" Co "+count+" phan tu co gia tri bang "+x+" trong mang");
    }
}
