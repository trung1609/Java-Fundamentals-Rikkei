import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] numbers = new int[5];
        //Khai bao mang so thuc gom 6 phan tu
//        float[] floatNumbers = new float[6];
//        //Khai bao va khoi tao mang so nguyen voi gia tri cac phan tu la: 2,4,6,8
//        int[] intNumbers = {2, 4, 6, 8};
        //Nhap gia tri cho cac phan tu cua mang numbers
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.printf("Numbers[%d]: ", i);
//            numbers[i] = Integer.parseInt(sc.nextLine());
//        }
        //In ra gia tri cac phan tu cua mang
//        System.out.println("Gia tri cac phan tu trong mang la:");
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.printf("%d\t", numbers[i]);
//        }





        //Mang 2 chieu
        //Khai bao
        int[][] numbers = new int[3][4];
        //Nhap gia tri
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.printf("Numbers[%d][%d] = " , numbers[i][j]);
                numbers[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        //In gia tri
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.printf("%5d", numbers[i][j]);
            }
            System.out.printf("\n");
        }

    }
}