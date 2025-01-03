
import java.util.Scanner;

public class B3 {
    static int[] rotate(int[] arr, int k){
        int n=arr.length;
        int[] ans=new int[n];
        k= k % n;
        int j=0;
        for(int i=n-k; i<n; i++){
            ans[j++]=arr[i];
        }
        for(int i=0; i<n-k; i++){
            ans[j++]=arr[i];
        }
        // for(int i=0; i<arr.length; i++){
        //     System.out.println(ans[i]);
        // }
        return ans;
    }
    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter k:");
        int k=sc.nextInt();
        System.out.println("Original Array");
        printArray(arr);
        int[] ans=rotate(arr, k);
        System.out.println("Array after rotation");
        printArray(ans);
        
    }
}
