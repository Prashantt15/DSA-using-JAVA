import java.util.Scanner;
public class C3 {
    //In this problem display traspose of square matrix entered by the user.
    static void printArray(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] transposeArray(int[][] arr, int r, int c){
        int[][] ans=new int[c][r];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                ans[i][j]=arr[j][i];
            }
        }
        return ans;
    }
    static void transposeInplace(int[][] matrix, int r, int c){
        for(int i=0; i<matrix.length; i++){
            for(int j=i+1; j<matrix.length; j++){
                //Swap the arr[i][j] =arr[j][i]
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        printArray(matrix);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows and column in matrix.");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] arr=new int[r][c];
        System.out.println("Enter elements:");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Original matrix :");
        printArray(arr);
        System.out.println("Transpose of matrix :");
        int[][] trans=transposeArray(arr, r, c);
        printArray(trans);
        // transposeInplace(arr, r, c);
    }
}
