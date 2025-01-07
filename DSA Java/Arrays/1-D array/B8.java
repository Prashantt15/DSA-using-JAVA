import java.util.Scanner;
public class B8{
    //In this problem given an array of integer of size n.
    //Answer q queries where you need to print the sum of values in a given range of indices from L to R (both included).
    //Note:- The values of L and R in queries follow 1-based indexing.
    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int[] prefix(int[] arr){
        for(int i=1; i<arr.length; i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n=sc.nextInt();
        int[] arr=new int[n+1];
        System.out.println("Enter elements : ");
        for(int i=1; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        // System.out.println("Original Array: ");
        // printArray(arr);
        // System.out.println("After prefix : ");
        int[] pre=prefix(arr);
        // printArray(pre);
        System.out.println("How many queries you entered:");
        int q=sc.nextInt();
        while(q>0){
            System.out.println("Enter starting index : ");
            int strt=sc.nextInt();
            System.out.println("Enter last index : ");
            int last=sc.nextInt();
            int ans=pre[last]-pre[strt-1];
            System.out.println("The sum ="+ans);
            q--;
        }
    }
}