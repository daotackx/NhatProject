package baiTapMang;

import java.util.Scanner;

public class kiemTraSoDoiXung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen num= ");
        int num = scanner.nextInt();
        int digit = 0, z = num, count = 0;
        while (z > 0) {
            z = z / 10;
            count++;
        }
        int n = count;
        int j = num;
        int a[] = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            digit = j % 10;
            a[i] = digit;
            j = j / 10;
        }
        boolean flag = false;
        for (int i = 0; i <= n / 2; i++) {
            flag = false;
            if (a[i] == a[n - i - 1]) {
                flag = true;
            } else {
                break;
            }
        }
        if (flag == true) {
            System.out.print(num + " la so doi");
        } else {
            System.out.print(num + " khong phai la so doi");
        }
    }
}
