package Session4;

import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 7, 9, 10, 12};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao gia tri can tim: ");
        int searchValue = Integer.parseInt(sc.nextLine());
        int left = 0;
        int right = numbers.length - 1;
        int mid;
        do {
            mid = (left+right)/2;
            if(numbers[mid] < searchValue){
                left = mid + 1;
            }
            if(numbers[mid] > searchValue){
                right = mid - 1;
            }
        } while (numbers[mid] != searchValue && left <= right);
        if(searchValue == numbers[mid]){
            System.out.printf("Gia tri can tim o vi tri thu %d co gia tri la %d ", mid,searchValue);
        }
        else {
            System.out.println("Khong tim thay gia tri");
        }

    }
}
