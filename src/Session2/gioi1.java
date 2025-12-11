package Session2;

import java.util.Scanner;

public class gioi1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao 1 so nguyen: ");
        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;
        n = Math.abs(n);
        int tmp = n;
        while (tmp > 0) {
            sum = sum + tmp % 10;
            tmp = tmp / 10;
        }
        System.out.printf("Tong cac chu so cua %d la: %d\n", n, sum);
    }
}
