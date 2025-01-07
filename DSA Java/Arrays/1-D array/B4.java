import java.util.Scanner;
public class B4 {
    //In this problem check if the given number is present in the array or not 
    //Note:- all the elements in the array is less than 10 to the pwer 5. 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] freq=new int[100009];
        int[] arr={1,2,3,4,5,6,7,9,7,5,4,4,56,6,5,544,3,3,3,222,234,67,34};
        for(int i=0; i<arr.length; i++){
            freq[arr[i]]++;
        }
        System.out.println("How much elements you want to searched.");
        int k=sc.nextInt();
        System.out.println("Search elements:");
        while(k>0){
            int x=sc.nextInt();
            if(freq[x]>0){
                System.out.println("Yes element is presented.");
            }else{
                System.out.println("no.");
            }
            k--;
        }

    }
}
