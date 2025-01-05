public class B7{
    //In this problem given an integer array, return the prefix sum/running sum.
    // Create new array and give output. 
    static int[] prefix(int[] arr){
        int n=arr.length;
        int[] ans=new int[n];
        ans[0]=arr[0];
        for(int i=1; i<arr.length; i++){
            ans[i]=ans[i-1]+arr[i];
        }
        return ans;
    }
    // Give output without creating new array.
    static int[] pref(int[] arr){
        for(int i=1; i<arr.length; i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }
    static void print(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={1,1,1,1,1,1,1,1};
        System.out.println("Original Array:");
        print(arr);
        // int[] ans=prefix(arr);
        // System.out.println("After prefix sum:");
        // print(ans);
        pref(arr);
        System.out.println("After prefix sum:");
        print(arr);
    }
}