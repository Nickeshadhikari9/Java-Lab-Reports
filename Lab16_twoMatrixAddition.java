import java.util.Scanner;

public class Lab16_twoMatrixAddition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter order as (2 for 2x2, 3 for 3x3) matrix:");
        int order = scan.nextInt();
        int matrix1[][] = new int[order][order];
        int matrix2[][] = new int[order][order];
        System.out.println("Enter elements of Matrix1:");
        for (int i = 0; i < order; i++) {
            for (int j = 0; j < order; j++) {
                matrix1[i][j] = scan.nextInt();
            }
        }
        System.out.println("Enter elements of Matrix2:");
        for (int i = 0; i < order; i++) {
            for (int j = 0; j < order; j++) {
                matrix2[i][j] = scan.nextInt();
            }
        }
        System.out.println("Addition of Two Matrix:");
        for (int i = 0; i < order; i++) {
            for (int j = 0; j < order; j++) {
                matrix2[i][j] += matrix1[i][j];
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

    }
}
