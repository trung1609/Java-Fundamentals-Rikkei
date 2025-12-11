package Session4;

import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {1, 3, 7, 9, 5};
        System.out.println("Nhap vao gia tri can tim:");
        int searchValue = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == searchValue) {
                System.out.printf("Phan tu co chi so %d co gia tri bang %d\n", i, searchValue);
            }
        }
    }
}
