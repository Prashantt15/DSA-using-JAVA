import java.util.Scanner;
public class A4 {
    static void searchindex(int[] arr){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter index searching element: ");
        int ans=-1;
        int element=sc.nextInt();
        for(int i=0; i<arr.length; i++){
            if(element==arr[i]){
                ans=i;
                break;
            }
        }
        if(ans==-1){
            System.out.println("Element are not present in the array.");
        }else{
            System.out.println("Yes element is present in the array at the index of "+ans);
        }
    }
    public static void main(String[] args) {
        int[] arr4={1,22,33,44,55,66,77,88,35,46,69};
        searchindex(arr4);
    }
}
