public class A10 {
    public static void main(String[] args) {
        //In this problem find the unique number in a given array where all the elements are being repeated twice with one value being unique.
        int[] arr={1,2,3,4,2,1,3};
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }   
            }
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
                System.out.println(arr[i]);
            }
        }
    }
}
