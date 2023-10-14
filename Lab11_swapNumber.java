import java.util.Scanner;
public class Lab11_swapNumber {
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter value of x:");
        int x=scan.nextInt();
        System.out.println("Enter value of y:");
        int y=scan.nextInt();
        System.out.println("Before Swapping:\nx:"+x+" y:"+y);
        int temp=x;
        x=y;
        y=temp;
        System.out.println("After Swapping:\nx:"+x+" y:"+y);
    }
}
