import java.util.Scanner;
public class A1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many elements present in array ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements value");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array are: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}