package Session1;

import java.util.Scanner;

public class kha2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");
        int firstNumber = sc.nextInt();
        System.out.print("Nhập số thứ hai: ");
        int secondNumber = sc.nextInt();
        System.out.println("\n--- Kết quả ---");
        System.out.println("firstNumber = " + firstNumber);
        System.out.println("secondNumber = " + secondNumber);
        System.out.println("Tổng = " + (firstNumber + secondNumber));
        System.out.println("Hiệu = " + (firstNumber - secondNumber));
        System.out.println("Tích = " + (firstNumber * secondNumber));
        System.out.println("Thương = " + (firstNumber / secondNumber));
        System.out.println("Phần dư = " + (firstNumber % secondNumber));
        sc.close();
    }
}
