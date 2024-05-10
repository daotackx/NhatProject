package baiTapMang;

import java.util.Scanner;

public class inRa10SoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int num = 2;
        while (count < 10) {
            boolean flag = true;
            for (int j = 2; j < num; j++) {
                if (num % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) { 
                System.out.print(num + " ");
                count += 1;
            }
            num++;
        }
    }
}
