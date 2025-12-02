package Session1;

import java.util.Scanner;

public class xuatsac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap can nang (kg): ");
        float weight = sc.nextFloat();
        System.out.print("Nhap chieu cao (m): ");
        float height = sc.nextFloat();

        float bmi = weight / (height * height);
        System.out.printf("Chi so BMI cua chieu cao %.2f (m) va can nang %.2f (kg) la: %.2f", height, weight, bmi);
    }
}
