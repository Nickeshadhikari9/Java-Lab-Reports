import java.util.Scanner;

public class Lab15_primeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Display Prime Numbers Between Two Intervals(Numbers).");
        System.out.println("Enter starting number:");
        int start = scan.nextInt();
        System.out.println("Enter ending number:");
        int end = scan.nextInt();
        System.out.println("Prime Numbers:");
        for (int i = start; i <= end; i++) {
            if (i == 1 || i == 0)
                continue;
            int flag = 1;
            for (int j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1)
                System.out.print(i + " ");
        }
    }

}
