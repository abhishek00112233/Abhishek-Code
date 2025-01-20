package ConditionalStatement;

public class ArrayQuestion {
    // Digit frequency in array
    static int [] digitCount(int []arr,int target){
        int count=0;
        for (int i=0;i<arr.length;i++)
            if (arr[i]==target){
                count+=1;
            }
        System.out.println("target = "+target);
        System.out.println(count);
        return arr;

    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7,3,4,54,3,2,4,5,5,4,3,3,};
        digitCount(arr,3);

    }
}
