public class A5 {
    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void changeCopy(int[] arr){
        arr[0]=1;
        arr[1]=2;
    }
    public static void main(String[] args) {
        int[] arr={8,7,3,4,5,6};
        
        // 1.try to copy and change the element.
        // int[] arr2=arr;
        // changeCopy(arr2);
        // printArray(arr); //array not changed because address copy in the arr2 not the elements thats why whole array changed.
        // printArray(arr2);
        //2.now copy and change the third copied array.
        // int[] arr3=arr.clone();
        // changeCopy(arr3);
        // System.out.println("array before copy and changed.");
        // printArray(arr);
        // System.out.println("array after copy and changed.");
        // printArray(arr3);
        // 3. Copy and changing the array using Arrays class
        // int[] arr4=Arrays.copyOf(arr, arr.length); //We can you copyofrange function also.
        // changeCopy(arr4);
        // System.out.println("array before copy and changed.");
        // printArray(arr);
        // System.out.println("array after copy and changed.");
        // printArray(arr4);
        
    }
}
