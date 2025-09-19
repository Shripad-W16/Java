import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int d = arr.length;
        boolean swapped;

        for (int i = 0; i < d - 1; i++) {
            swapped = false;

            for (int n = 0; n < d - 1 - i; n++) {
                if (arr[n] > arr[n + 1]) {
                    int temp = arr[n];
                    arr[n] = arr[n + 1];
                    arr[n + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SIZE FOR ARRAY");
        int size = sc.nextInt();
        int[] data = new int[size];

        System.out.println("ENTER THE DATA FOR ARRAY");
        for (int i = 0; i < size; i++) {
            data[i] = sc.nextInt();
        }

        System.out.println("Array before sorting: " + Arrays.toString(data));
        bubbleSort(data);
        System.out.println("Array after sorting: " + Arrays.toString(data));
    }
}
