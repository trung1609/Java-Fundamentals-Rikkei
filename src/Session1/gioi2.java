package Session1;

import java.util.Scanner;

public class gioi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai cua hinh chu nhat tu ban phim: ");
        float height = sc.nextFloat();
        System.out.print("Nhap chieu rong cua hinh chu nhat tu ban phim: ");
        float width = sc.nextFloat();

        float area = height * width;
        float perimeter = 2 * (height + width);

        System.out.printf("\nChu vi hinh chu nhat voi chieu dai %.2f va chieu rong %.2f la: %.2f", height, width, perimeter);
        System.out.printf("\nDien tich hinh chu nhat voi chieu dai %.2f va chieu rong %.2f la: %.2f", height, width, area);
    }
}
