package Session2;

import java.util.Scanner;

public class gioi2 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao canh 1 cua tam giac: ");
        a = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap vao canh 2 cua tam giac: ");
        b = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap vao canh 3 cua tam giac: ");
        c = Integer.parseInt(sc.nextLine());
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("3 canh khong tao thanh 1 tam giac");
        } else {
            if (a == b && a == c && b == c) {
                System.out.println("Day la tam giac deu");
            } else if (a == c || a == b || b == c) {
                System.out.println("Day la tam giac can");
            } else if ((a * a) == (b * b) + (c * c) || (b * b) == (a * a) + (c * c) || (c * c) == (a * a) + (b * b)) {
                System.out.println("Day la tam giac vuong");
            } else {
                System.out.println("Day la tam giac thuong");
            }
        }
    }
}
