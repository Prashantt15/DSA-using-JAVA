public class A3 {
    static void maxvalue(int[] arr){
        int max=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum element in array are: "+max);
    }
    public static void main(String[] args) {
        int[] arr3={1,2,3,4,5,66,7,8,9};
        maxvalue(arr3);
    }
}
