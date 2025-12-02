package Session1;

import java.util.Scanner;

public class gioi1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tử số của phân số thứ 1: ");
        double a = sc.nextDouble();
        System.out.print("Nhập mẫu số của phân số thứ 1: ");
        double b = sc.nextDouble();
        System.out.print("Nhập tử số cho phân số thứ 2: ");
        double c = sc.nextDouble();
        System.out.print("Nhập mẫu số cho phân số thứ 2: ");
        double d = sc.nextDouble();

        double res = (a / b) + (c / d);
        System.out.printf("\nTổng 2 phân số là: %.2f" , res);
    }
}
