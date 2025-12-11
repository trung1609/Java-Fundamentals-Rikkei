package Session4;

public class exchangeSort {
    public static void main(String[] args) {
        int[] numbers = {3, 6, 3, 7, 8, 3};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int tmp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tmp;
                }
            }
        }
        System.out.println("Mang sau khi sap xep:");
        for (int element : numbers) {
            System.out.println(element);
        }
    }
}
