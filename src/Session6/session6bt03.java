package Session6;

import java.util.Scanner;

public class session6bt03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so bien so xe: ");
        int n = Integer.parseInt(sc.nextLine());
        String[] arrBienSo = new String[n];
        do {
            System.out.println("*********** QUAN LY BIEN SO XE ************");
            System.out.println("1. Them cac bien so xe");
            System.out.println("2. Hien thi danh sach bien so xe");
            System.out.println("3. Tim kiem bien so xe");
            System.out.println("4. Tim bien so xe theo ma tinh");
            System.out.println("5. Sap xep bien so xe tang dan");
            System.out.println("6. Thoat");
            System.out.print("Lua chon cua ban: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Them cac bien so xe");
                    for (int i = 0; i < arrBienSo.length; i++) {
                        System.out.printf("Nhap bien so xe thu %d: ", i + 1);
                        arrBienSo[i] = sc.nextLine();
                    }
                    break;
                case 2:
                    System.out.println("Hien thi danh sach bien so xe");
                    for (int i = 0; i < arrBienSo.length; i++) {
                        System.out.printf("Bien so xe thu %d: %s\n", i + 1, arrBienSo[i]);
                    }
                    break;
                case 3:
                    System.out.print("Nhap bien so xe can tim: ");
                    String searchValue = sc.nextLine();
                    boolean isFound = false;
                    for (int i = 0; i < arrBienSo.length; i++) {
                        if (arrBienSo[i].equals(searchValue)) {
                            System.out.println("Bien so xe co ton tai");
                            isFound = true;
                        }
                    }
                    if (!isFound) {
                        System.out.println("Bien so xe khong ton tai");
                    }
                    break;
                case 4:
                    System.out.print("Nhap ma tinh can tim: ");
                    String matinh = sc.nextLine();
                    boolean isFoundIt = false;
                    for (int i = 0; i < arrBienSo.length; i++) {
                        if (arrBienSo[i].contains(matinh)) {
                            System.out.println("Bien so xe " + arrBienSo[i]);
                            isFoundIt = true;
                        }
                    }
                    if (!isFoundIt) {
                        System.out.println("Bien so xe khong ton tai");
                    }
                    break;
                case 5:
                    for (int i = 0; i < arrBienSo.length; i++) {
                        for (int j = 0; j < arrBienSo.length - i - 1; j++) {
                            if (arrBienSo[j].compareTo(arrBienSo[j + 1]) > 0) {
                                String tmp = arrBienSo[j];
                                arrBienSo[j] = arrBienSo[j + 1];
                                arrBienSo[j + 1] = tmp;
                            }
                        }
                    }
                    System.out.println("Da sap xep bien so xe tang dan");
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.err.println("Vui long nhap tu 1-6");
            }
        } while (true);
    }
}
