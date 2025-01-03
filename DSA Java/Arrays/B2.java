public class B2 {
    static int max(int[] arr){
        int a=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>a){
                a=arr[i];
            }
        }
        return a;
    }
    static int secondMax(int[] arr){
        int a=max(arr);
        for(int i=0; i<arr.length; i++){
            if(arr[i]==a){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        return max(arr);
    }
    public static void main(String[] args) {
        // In this problem find the second largest element in the given Array.
        int[] arr={1,2,3,4,5,6,55,43,67,23};
        System.out.println("The Second largest element in the Array are:");
        System.out.println(secondMax(arr));
    }
}
