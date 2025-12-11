package Session4;

import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {
        /**
         * Bai tap ung dung
         * 1. Nhap so phan tu mang n va khai bao mang so nguyen gom n phan tu
         * 2. In menu va thuc hien cac chuc nang theo menu
         *  *************Menu*************
         *  1.Nhap gia tri cac phan tu
         *  2.In gia tri cac phan tu
         *  3.Tinh tong cac phan tu cua mang
         *  4.In ra cac phan tu co chi so le trong mang
         *  5.In ra cac phan tu la so nguyen to trong mang
         *  6.In phan tu co gia tri lon nhat va nho nhat trong mang
         *  7.Thoat
         */
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap so phan tu mang: ");
        n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];

        do {
            System.out.println("************** MENU ************");
            System.out.println("1.Nhap gia tri cac phan tu");
            System.out.println("2.In gia tri cac phan tu");
            System.out.println("3.Tinh tong cac phan tu cua mang");
            System.out.println("4.In ra cac phan tu co chi so le trong mang");
            System.out.println("5.In ra cac phan tu la so nguyen to trong mang");
            System.out.println("6.In phan tu co gia tri lon nhat va nho nhat trong mang");
            System.out.println("7.Thoat");
            System.out.print("Lua chon cua ban: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("1.Nhap gia tri cac phan tu");
                    for (int i = 0; i < arr.length; i++) {
                        System.out.printf("Nhap gia tri phan tu thu %d: ", i);
                        arr[i] = Integer.parseInt(sc.nextLine());
                    }
                    break;
                case 2:
                    System.out.println("2.In gia tri cac phan tu");
                    for (int i = 0; i < arr.length; i++) {
                        System.out.printf("%d \n", arr[i]);
                    }
                    break;
                case 3:
                    System.out.println("3.Tinh tong cac phan tu cua mang");
                    int sum = 0;
                    for (int i = 0; i < arr.length; i++) {
                        sum += arr[i];
                    }
                    System.out.printf("Tong cac phan tu cua mang la: %d\n", sum);
                    break;
                case 4:
                    System.out.println("4.In ra cac phan tu co chi so le trong mang");
                    for (int i = 0; i < arr.length; i++) {
                        if (i % 2 == 1) {
                            System.out.printf("%d \n", arr[i]);
                        }
                    }
                    break;
                case 5:
                    System.out.println("5.In ra cac phan tu la so nguyen to trong mang");

                    for (int i = 0; i < arr.length; i++) {
                        boolean checkPrime = true;
                        int m = arr[i];
                        if (m < 2) {
                            checkPrime = false;
                        } else {
                            for (int j = 2; j <= Math.sqrt(m); j++) {
                                if (m % j == 0) {
                                    checkPrime = false;
                                    break;
                                }
                            }
                        }
                        if (checkPrime) {
                            System.out.printf("%d \n", m);
                        }
                    }
                    break;
                case 6:
                    int min = arr[0];
                    int max = arr[0];
                    for (int i = 1; i < arr.length; i++) {
                        if (arr[i] < min) {
                            min = arr[i];
                        } else {
                            max = arr[i];
                        }
                    }
                    System.out.println("Phan tu co gia tri lon nhat cua mang la: " + max);
                    System.out.println("Phan tu co gia tri nho nhat cua mang la: " + min);
                    break;
                case 7:
                    System.out.println("Thoat chuong trinh ....");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vui long nhap tu 1-7.");
            }
        } while (true);
    }
}
