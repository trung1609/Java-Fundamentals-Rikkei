package Session2;

import java.util.Scanner;

public class session3_bt2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float score = 0;
        float sum = 0;
        int n = 1;
        int count = 0;
        float max = Float.MIN_VALUE;
        float min = Float.MAX_VALUE;
        do {
            System.out.println("*******MENU NHAP DIEM*********");
            System.out.println("1. Nhap diem hoc vien");
            System.out.println("2. Hien thi thong ke");
            System.out.println("3. Thoat");
            System.out.println("Lua chon cua ban: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    while (true) {
                        System.out.printf("Nhap diem hoc vien thu %d: ", n);
                        score = Float.parseFloat(sc.nextLine());
                        if (score == -1) {
                            break;
                        }
                        if (score < 0 || score > 10) {
                            System.err.println("Vui long nhap diem trong khoang 0-10.Nhap lai");
                            continue;
                        }
                        if (score > max) {
                            max = score;
                        }
                        if (score < min) {
                            min = score;
                        }

                        count++;
                        sum += score;

                        String xepLoai;
                        if (score < 5) {
                            xepLoai = "Yeu";
                        } else if (score < 7) {
                            xepLoai = "Trung binh";
                        } else if (score < 8) {
                            xepLoai = "Kha";
                        } else if (score < 9) {
                            xepLoai = "Gioi";
                        } else {
                            xepLoai = "Xuat sac";
                        }
                        System.out.println("Hoc luc: " + xepLoai);
                        n++;
                    }
                    break;
                case 2:
                    if (count == 0) {
                        System.out.println("Chua co du lieu");
                    } else {
                        float avg = sum / count;
                        System.out.println("\n----- KET QUA -----");
                        System.out.println("So hoc vien: " + count);
                        System.out.printf("Diem trung binh: %.2f\n", avg);
                        System.out.println("Diem cao nhat: " + max);
                        System.out.println("Diem thap nhat: " + min);
                    }
                    break;
                case 3:
                    System.out.println("Ket thuc chuong trinh.");
                    System.exit(0);
                default:
                    System.err.println("Vui long nhap lua chon tu 1-3.\n");
            }
        } while (true);
    }
}
