import java.util.Scanner;
public class A9 {
    public static void main(String[] args) {
        // In this problem :-Count the number of triplets whose sum is equal to the given value x.
        Scanner sc=new Scanner(System.in);
        int[] arr={1,4,5,6,3};
        // int target=12;
        System.out.println("Enter target: ");
        int target=sc.nextInt();
        int sum=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                for(int k=j+1; k<arr.length; k++){
                    if((arr[i]+arr[j]+arr[k])==target){
                        sum++;
                    }
                }
            }
        }
        System.out.println(sum+" triplets");
    }
    
}
