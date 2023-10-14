import java.util.Scanner;
public class Lab14_calculator_SwitchCase {
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number1:");
        int num1=scan.nextInt();
        System.out.println("Enter number2:");
        int num2=scan.nextInt();
        System.out.println("Operations:\n1.Addition(+)\n2.Subtraction(-)\n3.Multiplication(*)\n4.Division(/)\nEnter any operator:");
        char choice=scan.next().charAt(0);
        switch(choice){
            case '+':
                System.out.println("Result of "+num1+"+"+num2+" is "+(num1+num2));
                break;
            case '-':
                System.out.println("Result of "+num1+"-"+num2+" is "+(num1-num2));
                break;
            case '*':
                System.out.println("Result of "+num1+"*"+num2+" is "+(num1*num2));
                break;
            case '/':
                System.out.println("Result of "+num1+"/"+num2+" is "+(num1/num2));
                break;
            default:
                System.out.println("Invalid choice!!");
        }

    }
}
