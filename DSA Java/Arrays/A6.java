
import java.util.Scanner;

public class A6 {
    static void repetition(int[] arr,int x){
        int repeat=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==x){
                repeat++;
            }
        }
        if(repeat>0){
            System.out.println("this element present "+repeat+" times in the array.");
        }else{
            System.out.println("Element not present in the array.");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={2,3,4,2,5,2,2,2,7,9,0,7,2,2};
        System.out.println("enter element");
        int a=sc.nextInt();
        repetition(arr, a);
    }
}
