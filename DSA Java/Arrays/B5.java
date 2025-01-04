public class B5 {
    //In this problem sort an Array consisting of only 0s and 1s.
    static int[] arrange(int[] arr){
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                count++;
            }
        }
        for(int i=0; i<count; i++){
            arr[i]=0;
        }
        for(int i=count; i<arr.length; i++){
            arr[i]=1;
        }
        return arr;
    }
    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={1,0,0,0,1,0,1,1,0,1,1,1,0};
        System.out.println("Array before sort:");
        printArray(arr);
        arrange(arr);
        System.out.println("Array after sort:");
        printArray(arr);
    }
}
