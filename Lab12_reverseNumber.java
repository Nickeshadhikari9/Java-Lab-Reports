import java.util.Scanner;
public class Lab12_reverseNumber {
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number with two or more digits:");
        int num=scan.nextInt();
        int reverse=reverse(num);
        System.out.println("Reversed Number:"+reverse);
    }
    public static int reverse(int num){
        int newNum=0;
        while(num!=0){
            newNum=newNum*10+num%10;
            num/=10;
        }
        return newNum;
    }
}
