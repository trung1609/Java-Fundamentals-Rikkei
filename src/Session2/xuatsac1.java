package Session2;

import java.util.Scanner;

public class xuatsac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Nhap 1 so n(100-999): ");
            n = Integer.parseInt(sc.nextLine());
            if (n < 100 || n > 999) {
                System.err.println("Vui long nhap so trong khoang (100-999).");
            }
        } while (n < 100 || n > 999);
        int hundreds = n / 100;
        int tens = (n % 100) / 10;
        int units = n % 10;

        switch (hundreds) {
            case 1:
                System.out.print("Một trăm ");
                break;
            case 2:
                System.out.print("Hai trăm ");
                break;
            case 3:
                System.out.print("Ba trăm ");
                break;
            case 4:
                System.out.print("Bốn trăm ");
                break;
            case 5:
                System.out.print("Năm trăm ");
                break;
            case 6:
                System.out.print("Sáu trăm ");
                break;
            case 7:
                System.out.print("Bảy trăm ");
                break;
            case 8:
                System.out.print("Tám trăm ");
                break;
            case 9:
                System.out.print("Chín trăm ");
                break;
        }

        switch (tens) {
            case 0:
                if (units != 0) {
                    System.out.print("linh ");
                }
                break;
            case 1:
                System.out.print("mười ");
                break;
            case 2:
                System.out.print("hai mươi ");
                break;
            case 3:
                System.out.print("ba mươi ");
                break;
            case 4:
                System.out.print("bốn mươi ");
                break;
            case 5:
                System.out.print("năm mươi ");
                break;
            case 6:
                System.out.print("sáu mươi ");
                break;
            case 7:
                System.out.print("bảy mươi ");
                break;
            case 8:
                System.out.print("tám mươi ");
                break;
            case 9:
                System.out.print("chín mươi ");
                break;
        }

        switch (units) {
            case 1:
                System.out.print("một ");
                break;
            case 2:
                System.out.print("hai ");
                break;
            case 3:
                System.out.print("ba ");
                break;
            case 4:
                System.out.print("bốn ");
                break;
            case 5:
                System.out.print("lăm ");
                break;
            case 6:
                System.out.print("sáu ");
                break;
            case 7:
                System.out.print("bảy ");
                break;
            case 8:
                System.out.print("tám ");
                break;
            case 9:
                System.out.print("chín ");
                break;
        }
    }
}
