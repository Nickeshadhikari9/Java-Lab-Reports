import java.util.Scanner;

public class Lab17_transposeMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter order as (2 for 2x2, 3 for 3x3) matrix:");
        int order = scan.nextInt();
        int matrix[][] = new int[order][order];
        System.out.println("Enter the elements of Matrix:");
        for (int i = 0; i < order; i++) {
            for (int j = 0; j < order; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        int transpose[][] = new int[order][order];
        System.out.println("Original Matrix:");
        for (int i = 0; i < order; i++) {
            for (int j = 0; j < order; j++) {
                System.out.print(matrix[i][j] + " ");
                transpose[j][i] = matrix[i][j];
            }
            System.out.println();
        }
        System.out.println("Transpose of Matrix:");
        for (int i = 0; i < order; i++) {
            for (int j = 0; j < order; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
