import java.util.Scanner;
public class Lab19_bubbleSort {
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n=scan.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter "+n+" elements:");
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        bubble(arr,n);
        System.out.println("Elements after sorting are:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void bubble(int arr[],int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                int temp=arr[j];
                if(arr[j]>arr[j+1]){
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
