import java.util.Scanner;
public class C1{
    static void printArray(int[][] arr){
        System.out.println("Array:");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[2][3];//Creation.
        System.out.println("Enter 6 elements: ");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        printArray(arr);
    }
}