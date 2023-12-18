import java.util.Scanner;

public class Lab5_Largest_element_array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = scan.nextInt();
        int array[] = new int[size];
        System.out.println("Enter " + size + " elements of array: ");
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }
        int largest = array[0];
        for (int i = 0; i < size; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }
        System.out.println("Largest element of array: " + largest);
    }
}
