import java.util.Scanner;
public class Lab3_fibonacci {
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number of fibonacci series:");
        int n=scan.nextInt();
        int first=0,second=1;
        System.out.print(first+"\t"+second+"\t");
        for(int i=2;i<n;i++){
           int next=first+second;
            System.out.print(next+"\t");
           first=second;
           second=next;
        }
    }
}
