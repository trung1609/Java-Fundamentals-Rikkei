package Session4;

import java.util.Scanner;

public class session04_bt1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap so luong sinh vien: ");
        n = Integer.parseInt(sc.nextLine());
        float[] arrScore = new float[n];
        int countSVpass = 0;
        int countSVfail = 0;
        do {
            System.out.println("************* QUAN LY DIEM *************");
            System.out.println("1. Nhap danh sach diem sinh vien");
            System.out.println("2. In danh sach diem");
            System.out.println("3. Tinh diem trung binh cac sinh vien");
            System.out.println("4. Tim diem cao nhat va thap nhat");
            System.out.println("5. Dem so luong sinh vien dat va truot");
            System.out.println("6. Sap xeo diem tang dan");
            System.out.println("7. Thong ke so luong sinh vien gioi va xuat sac");
            System.out.println("8. Thoat");
            System.out.print("Lua chon cua ban: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("1. Nhap danh sach diem sinh vien");
                    for (int i = 0; i < arrScore.length; i++) {
                        System.out.printf("Nhap diem cho sinh vien thu %d: ", i);
                        arrScore[i] = Float.parseFloat(sc.nextLine());
                    }
                    break;
                case 2:
                    System.out.println("2. In danh sach diem");
                    for (int i = 0; i < arrScore.length; i++) {
                        System.out.printf("%.2f ", arrScore[i]);
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("3. Tinh diem trung binh cac sinh vien");
                    float avg = 0;
                    float sum = 0;
                    for (int i = 0; i < arrScore.length; i++) {
                        sum += arrScore[i];
                    }
                    avg = sum / arrScore.length;
                    System.out.printf("Diem trung binh cac sinh vien la: %.2f\n", avg);
                    break;
                case 4:
                    System.out.println("4. Tim diem cao nhat va thap nhat");
                    float max = arrScore[0];
                    float min = arrScore[0];
                    for (int i = 0; i < arrScore.length; i++) {
                        if (arrScore[i] > max) {
                            max = arrScore[i];
                        }
                        if (arrScore[i] < min) {
                            min = arrScore[i];
                        }
                    }
                    System.out.printf("Diem cao nhat la %.2f - Diem thap nhat la %.2f\n", max, min);
                    break;
                case 5:
                    System.out.println("5. Dem so luong sinh vien dat va truot");
                    for (int i = 0; i < arrScore.length; i++) {
                        if (arrScore[i] >= 5) {
                            countSVpass++;
                        } else {
                            countSVfail++;
                        }

                    }
                    System.out.printf("So luong sinh vien dat la %d\n", countSVpass);
                    System.out.printf("So luong sinh vien fail la %d\n", countSVfail);
                    break;
                case 6:
                    System.out.println("6. Sap xeo diem tang dan");
                    for (int i = 0; i < arrScore.length; i++) {
                        for (int j = 0; j < arrScore.length - i - 1; j++) {
                            if (arrScore[j] > arrScore[j + 1]) {
                                float tmp = arrScore[j];
                                arrScore[j] = arrScore[j + 1];
                                arrScore[j + 1] = tmp;
                            }
                        }
                    }

                    //In lai mang
                    for (int i = 0; i < arrScore.length; i++) {
                        System.out.printf("%.2f ", arrScore[i]);
                    }
                    System.out.println();
                    break;
                case 7:
                    int rank = 0;
                    for (int i = 0; i < arrScore.length; i++) {
                        if (arrScore[i] >= 8) {
                            rank++;
                        }
                    }
                    System.out.printf("So luong sinh vien co thanh tich gioi va xuat sac la: %d\n" , rank);
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vui long nhap tu 1-8");
            }
        } while (true);
    }
}







































