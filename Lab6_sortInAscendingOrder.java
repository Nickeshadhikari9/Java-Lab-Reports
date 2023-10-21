import java.util.Scanner;
public class Lab6_sortInAscendingOrder {
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=scan.nextInt();
        int array[]=new int[size];
        System.out.println("Enter "+size+" elements of array:");
        for(int i=0;i<size;i++){
            array[i]=scan.nextInt();
        }
        for(int i=0;i<size;i++){
            for(int j=i;j<size;j++){
                if(array[i]>array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Elements of array in Ascending order:");
        for(int i=0;i<size;i++){
            System.out.print(array[i]+" ");
        }

    }
}
