public class B6 {
    //In this problem sort an Array consisting of only 0s and 1s by using two pointer concept.
    static int[] arrange(int[] arr){
        int strt=0;
        int end =arr.length-1;
        while(strt<end){
            if(arr[strt]==1 && arr[end]==0){
                arr[strt]=arr[strt]+arr[end];
                arr[end]=arr[strt]-arr[end];
                arr[strt]=arr[strt]-arr[end];
                strt++;
                end--;
            }else if(arr[strt]==0){
                strt++;
            }else if(arr[end]==1){
                end--;
            }
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