import java.util.Scanner;
public class A8 {
    public static void main(String[] args) {
        //Find the total number of pairs in the array whose sum is equal to the given value x.
        Scanner sc=new Scanner(System.in);
        int[] arr={4,6,3,5,8,2};
        // int target=7;
        System.out.println("Enter target element: ");
        int target=sc.nextInt();
        int sum=0;
        for(int i=0; i<arr.length-1; i++){
            for(int j=1; j<arr.length; j++){
                if((arr[i]+arr[j])==target){
                    sum++;
                }
            }
        }
        System.out.println(sum+" Pairs");
    }
    
}
