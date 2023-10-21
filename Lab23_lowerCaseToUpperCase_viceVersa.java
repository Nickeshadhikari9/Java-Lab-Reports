import java.util.Scanner;

public class Lab23_lowerCaseToUpperCase_viceVersa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String which contains both Upper and Lower case letters:");
        String str = scan.nextLine();
        char c[] = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                c[i] = Character.toLowerCase(str.charAt(i));
            } else {
                c[i] = Character.toUpperCase(str.charAt(i));
            }
        }
        System.out.println("Replaced String:");
        for (int i = 0; i < str.length(); i++) {
            System.out.print(c[i]);

        }
    }
}
