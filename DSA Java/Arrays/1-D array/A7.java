public class A7 {
    static void checkSort(int[] arr){
        boolean x=true;
        for(int i=1;i<arr.length; i++){
            if(arr[i]<arr[i-1]){
                x=false;
                break;
            }
        }
        if(x==true){
            System.out.println("array is sorted");
        }else{
            System.out.println("Array is not sorted.");
        }
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6};
        int[] arr2={5,3,6,4,7};
        checkSort(arr);
        checkSort(arr2);
    }
}
