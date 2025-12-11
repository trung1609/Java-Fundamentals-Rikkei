package Session2;

import java.util.Scanner;

import static java.lang.Math.pow;

public class xuatsac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Nhap so nguyen duong n: ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Số nhập vào không hợp lệ");
            }
        } while (n <= 0);
        System.out.printf("Danh dach so armstrong tu 1 den %d: \n", n);
        for (int i = 0; i <= n; i++) {
            int sum = 0;
            int k = String.valueOf(i).length();
            int tmp = i;

            while (tmp > 0) {
                int digit = tmp % 10;
                sum += pow(digit, k);
                tmp /= 10;
            }

            if (i == 0) {
                sum = 0;
            }
            if (sum == i) {
                System.out.println(i);
            }
        }
    }
}
