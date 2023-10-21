import java.util.Scanner;

public class Lab21_binarySearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " sorted elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Enter element to be searched:");
        int search = scan.nextInt();
        int flag;
        flag = binary(arr, 0, n - 1, search);
        if (flag == -1) {
            System.out.println("Element not found!!");
        } else {
            System.out.println("Element " + search + " found at position " + (flag + 1));
        }
    }

    public static int binary(int arr[], int left, int right, int search) {
        int flag = -1, middle;
        if (left <= right) {
            middle = (left + right) / 2;
            if (search == arr[middle]) {
                flag = middle;
            } else if (search < arr[middle])
                return binary(arr, left, middle - 1, search);

            else
                return binary(arr, middle + 1, right, search);
        }
        return flag;
    }
}
