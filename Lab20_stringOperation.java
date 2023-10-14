import java.util.Scanner;
public class Lab20_stringOperation {
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a String to perform String operation:");
        String str=scan.nextLine();
        int length=str.length();
        System.out.println("Length of String:"+length);
        String upper=str.toUpperCase();
        System.out.println("String in Uppercase:"+upper);
        String lower=str.toLowerCase();
        System.out.println("String in Lowercase:"+lower);
        System.out.println("Enter a new String:");
        String newStr=scan.nextLine();
        String concat=str.concat(newStr);
        System.out.println("String after Concatenation:"+concat);
        char character=concat.charAt(3);
        System.out.println("Position of "+character+" is 3");
    }
}
