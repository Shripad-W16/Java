import java.util.Scanner;

public class InsertionSort {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

// Input size of array
System.out.print("Enter number of elements: ");
int n = sc.nextInt();

int[] arr = new int[n];

// Input array elements
System.out.println("Enter " + n + " numbers:");
for (int i = 0; i < n; i++) {
arr[i] = sc.nextInt();
}

// Insertion sort
for (int i = 1; i < arr.length; i++) {
int key = arr[i];
int j = i - 1;

while (j >= 0 && arr[j] > key) {
arr[j + 1] = arr[j];
j--;
}
arr[j + 1] = key;
}

// Print sorted array
System.out.println("Sorted array:");
for (int num : arr) {
System.out.print(num + " ");
}

sc.close();
}
}
