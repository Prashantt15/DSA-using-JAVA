public class A2 {
    static void sumarray(int[] arr){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int[] arr2={1,2,3,4,5,6,7,8,9};
        sumarray(arr2);
        // int sum=0;
        // for(int i=0; i<arr2.length; i++){
        //     sum+=arr2[i];
        // }
        // System.out.println(sum);
    }
}
