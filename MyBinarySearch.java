import java.util.*;
public class MyBinarySearch {
public static int binarySearch(int[] arr, int
target) {
int left = 0;
int right = arr.length - 1;
while (left <= right) {
int mid = left + (right - left) / 2;
if (arr[mid] == target)
return mid;
else if (arr[mid] < target)
left = mid + 1;
else
right = mid - 1;
}
return -1;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter number ot elements:
");
int n = sc.nextInt();
int[] numbers = new int[n];
System.out.println("Enter" + n + "sorted
numbers:");
for (int i = 0; i < n; i++) {
numbers[i] = sc.nextInt();
}
System.out.print("Enter number to search:
");
int target = sc.nextInt();
int result = binarySearch(numbers, target);
if (result == -1) {
System.out.println("Element not
found.");
} else {
System.out.println("Element found at
index: " + result);
}
sc.close();
}
}
