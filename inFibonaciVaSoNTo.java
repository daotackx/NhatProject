package baiTapMang;

import java.util.Scanner;

public class inFibonaciVaSoNTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Nhap n: ");
        int n = scanner.nextInt();
        int a[] = new int[n];
        a[0] = 1;
        a[1] = 1;
        for (int i = 2; i < a.length; i++) {
            a[i] = a[i - 1] + a[i - 2];
            if (a[i] > n) {
                a[i] = 0;
                break;
            }
        }
        // for (int i = 0; i < a.length; i++) {
        //     if (a[i] == 0) {
        //         n = n- 1;
        //         break;
        //     }
        // }
        for (int i = 0; i < a.length; i++) {
            boolean flag = true;
            if ( a[i]==0||a[i] == 1) {
                flag = false;
            } else {
                for (int j = 2; j < a[i]; j++) {
                    if (a[i] % j == 0) {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag == true) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
