package Session2;

import java.util.Scanner;

public class session3_bt3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        float salary = 0;
        int count = 0;
        float max = Float.MIN_VALUE;
        float min = Float.MAX_VALUE;
        float sum = 0;
        float totalBonus = 0;
        do {
            System.out.println("********MENU NHẬP LƯƠNG***********");
            System.out.println("1. Nhập lương nhân viên");
            System.out.println("2. Hiển thị thống kê");
            System.out.println("3. Tính tổng số tiền thưởng cho nhân viên");
            System.out.println("4.Thoát");
            System.out.print("Lựa chọn của bạn: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhập lương nhân viên: ");
                    while (true) {
                        System.out.printf("\nNhập lương cho nhân viên thứ %d: ", n);
                        salary = Float.parseFloat(sc.nextLine());
                        if (salary == -1) {
                            break;
                        }
                        if (salary < 0 || salary > 500) {
                            System.err.println("Vui lòng nhập lương trong khoang 0-500 triệu. Nhập lại.");
                            continue;
                        }
                        String rank;
                        if (salary < 5) {
                            rank = "Thu nhập thấp";
                        } else if (salary < 15) {
                            rank = "Thu nhập trung bình";
                        } else if (salary < 50) {
                            rank = "Thu nhập khá";
                        } else {
                            rank = "Thu nhập cao";
                        }
                        System.out.printf("-> Phân loại: %s\n", rank);

                        float bonus;
                        if (salary <= 5) bonus = salary * 0.05f;
                        else if (salary <= 15) bonus = salary * 0.1f;
                        else if (salary <= 50) bonus = salary * 0.15f;
                        else if (salary <= 100) bonus = salary * 0.2f;
                        else bonus = salary * 0.25f;
                        totalBonus += bonus;

                        count++;
                        sum += salary;
                        if (salary > max) {
                            max = salary;
                        }
                        if (salary < min) {
                            min = salary;
                        }
                        n++;
                    }
                    break;
                case 2:
                    if (count == 0) {
                        System.out.println("Chưa có dữ liệu");
                    } else {
                        float avg = (sum / count);
                        System.out.println("---Thống kê---");
                        System.out.println("Số nhân viên:" + count);
                        System.out.println("Tổng lương:" + sum);
                        System.out.printf("Lương trung bình: %.2f\n", avg);
                        System.out.println("Lương cao nhất:" + max);
                        System.out.println("Lương thấp nhất:" + min);
                    }
                    break;
                case 3:
                    System.out.printf("Tổng số tiền thưởng nhân viên: %.2f\n", totalBonus);
                    break;
                case 4:
                    System.out.println("Kết thúc chương trình");
                    System.exit(0);
                default:
                    System.err.println("Vui lòng nhập lựa chọn từ 1-4");
            }
        } while (true);
    }
}
