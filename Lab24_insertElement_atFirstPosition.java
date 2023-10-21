import java.util.Scanner;
import java.util.ArrayList;

public class Lab24_insertElement_atFirstPosition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("Enter the size of array list:");
        int size = scan.nextInt();
        System.out.println("Enter " + size + " elements of array list:");
        for (int i = 0; i < size; i++) {
            int element = scan.nextInt();
            arrayList.add(element);
        }
        System.out.println("Original array list:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println("\nEnter new element to be inserted at first position into array list:");
        int element = scan.nextInt();
        arrayList.add(0, element);
        System.out.println("Array List after new element inserted:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
    }
}
