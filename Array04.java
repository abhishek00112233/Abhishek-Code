import java.util.Arrays;

public class Array04 {
    // find position of array target not present then print first smallest element of array
    static int binarySearch(int[] arr,int target){
        int ans=0;
        for (int i=0;i<arr.length;i++){
        if(arr[i]==target||arr[i]<target){
            ans=i;
        }
        }
        return ans;
    }

    // reverse Array
    static int[] reverse(int[] arr,int n,int m){
        while (n<m){
            int temp=arr[n];
            arr[n]=arr[m];
            arr[m]=temp;
            n++;
            m--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,9,67};
        int target=2;
        target%=arr.length;
//        System.out.println(binarySearch(arr,target));
;
        reverse(arr,0,arr.length-1);
        reverse(arr,0,target-1);
        reverse(arr,target,arr.length-1);
//        reverse(arr,2,5);
        System.out.println(Arrays.toString(arr));

    }
}
