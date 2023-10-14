import java.util.Scanner;
class Factorial{
   public static long factorial(int n){
       if(n==0){
           return 1;
       }
       else{
           return n*factorial(n-1);
       }
   }
}
public class Lab10_Factorial {
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=scan.nextInt();
        long result=Factorial.factorial(num);
        System.out.println("Factorial of "+num+" is "+result);
    }
}
