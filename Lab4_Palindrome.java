import java.util.Scanner;
public class Lab4_Palindrome {
    public static void main(String [] args){
        char ch;
     Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=scan.nextLine();
        String reverseStr="";
        for(int i=0;i<str.length();i++){
            ch = str.charAt(i);
            reverseStr=ch + reverseStr;
        }
            if(str.equals(reverseStr)){
                System.out.println("Palindrome.");
        }
            else{
                System.out.println("Not Palindrome.");
            }
    }
}
