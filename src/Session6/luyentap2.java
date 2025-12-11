package Session6;

import java.util.Scanner;

public class luyentap2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = null;
        do {
            System.out.println("*******************QUAN LY NGUOI DUNG***********************");
            System.out.println("1. Nhap thong tin nguoi dung");
            System.out.println("2. Chuan hoa ho ten");
            System.out.println("3. Kiem tra email hop le");
            System.out.println("4. Kiem tra so dien thoai hop le");
            System.out.println("5. Kiem tra mat khau hop le");
            System.out.println("6. Thoat");
            System.out.print("Lua chon cua ban: ");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    System.err.println("Vui long nhap tu 1-6");
            }
        } while (true);
    }
}
