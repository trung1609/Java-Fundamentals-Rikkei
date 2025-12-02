package Session1;

import java.util.Scanner;

public class kha1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập bán kính hình tròn: ");
        double r = Double.parseDouble(sc.nextLine());
        final double PI = 3.14;

        double a = PI * r * r;
        System.out.printf("Dien tich hinh tron voi ban kinh %.2f la: %.2f", r, a);
    }

}
