package Session2;

import java.util.Scanner;

public class kha1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 1 so nguyen duong: ");
        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;
        if (n <= 0) {
            System.out.println("So nhap vao khong hop le");
        } else {
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            System.out.printf("Tong cac so tu 1 den %d la: %d", n, sum);
        }
    }
}
