import java.util.Scanner;
public class B9 {
    //In this problem check if we can partition the array into two subarrays with equal sum.
    static int arraySum(int[] arr){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        return sum;
    }
    static boolean equalSum(int[] arr){
         int totalSum = arraySum(arr);
        int prefixSum=0;
        for(int i=0; i<arr.length; i++){
            prefixSum += arr[i];
            int suffixSum = totalSum-prefixSum;
            if(suffixSum==prefixSum){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements: ");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Equal partition possible: " + equalSum(arr));
    }
}
