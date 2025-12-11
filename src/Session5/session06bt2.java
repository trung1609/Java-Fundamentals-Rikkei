package Session5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class session06bt2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fullName = null;
        String email = null;
        String password = null;
        String phone = null;
        do {
            System.out.println("**************** QUAN LY NGUOI DUNG ***************");
            System.out.println("1. Nhap thong tin nguoi dung");
            System.out.println("2. Chuan hoa ho ten");
            System.out.println("3. Kiem tra email hop le");
            System.out.println("4. Kiem tra so dien thoai hop le");
            System.out.println("5. Kiem tra mat khau hop le");
            System.out.println("6. Thoat");
            System.out.print("Lua chon cua ban: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhap thong tin nguoi dung");
                    System.out.print("Nhap ho va ten: \n");
                    fullName = sc.nextLine();
                    System.out.print("Nhap email: \n");
                    email = sc.nextLine();
                    System.out.print("Nhap so dien thoai: \n");
                    phone = sc.nextLine();
                    System.out.print("Nhap mat khau: \n");
                    password = sc.nextLine();
                    break;
                case 2:
                    System.out.println("Chuan hoa ho ten");
                    String str = fullName.trim().replaceAll("\\s+", " ");
                    String[] arr = str.split(" ");
                    StringBuilder fullNameStandard = new StringBuilder();
                    for (String element : arr) {
                        fullNameStandard.append(Character.toUpperCase(element.charAt(0)))
                                .append(element.substring(1).toLowerCase())
                                .append(" ");
                    }
                    System.out.println("Ho ten sau chuan hoa: " + fullNameStandard.toString().trim());
                    break;
                case 3:
                    System.out.println("Kiem tra email hop le");
                    Matcher emailRegex = Pattern.compile("[\\w!@#$%^*()]+@+[\\w]+[\\.]+[a-zA-Z]").matcher(email);
                    if (emailRegex.find()) {
                        System.out.println("Email hop le.");
                    } else {
                        System.out.println("Email khong hop le.");
                    }
                    break;
                case 4:
                    System.out.println("Kiem tra so dien thoai hop le");
                    Matcher checkPhone = Pattern.compile("[086|091|092|093|038][0-9]{7}").matcher(phone);
                    if (checkPhone.find()) {
                        System.out.println("Phone hop le.");
                    } else {
                        System.out.println("Phone khong hop le.");
                    }
                    break;
                case 5:
                    System.out.println("Kiem tra mat khau hop le");
                    Matcher checkPassword = Pattern.compile("(?=.*[a-zA-Z]) + (?=.*[\\d]) + (?=.*[!@#$%^&*()]){8,}").matcher(password);
                    if (checkPassword.find()) {
                        System.out.println("Password hop le.");
                    } else {
                        System.out.println("Password khong hop le.");
                    }
                    break;
                case 6:
                    System.out.println("Thoat chuong trinh");
                    System.exit(0);
                    break;
                default:
                    System.err.println("Vui long nhap tu 1-6");
            }
        } while (true);
    }
}
