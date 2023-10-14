import java.util.Scanner;
public class Lab1_even {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter till where even number to be printed:");
        int n= scan.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.println(i+"\t");
            }
        }
    }
}
