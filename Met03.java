import java.util.Arrays;

public class Met03 {
    public static void main(String[] args) {
//        int[] arr={1,2,3,4,5,6,7,8,9,10};
//
//        System.out.println("Array element");
//
//        for(int i: arr){
//            System.out.print(i+" ");
//        }
//
//        System.out.println("\nPrefix Sum Array");
//
//        for(int i=1; i<arr.length; i++){
//            arr[i]+=arr[i-1];
//        }
//        for(int i: arr){
//            System.out.print(i+" ");
//        }
//        int[] arr={1,2,3,4,5};
//        int[] arr1=new int[arr.length];
//        for (int j=0;j<arr.length;j++){
//        for (int i=arr.length-1;i>=0;i--){
//            arr1[j]=arr[i];
//            System.out.println(arr[i]);
//        }
//        }
//        System.out.println(Arrays.toString(arr1));

//        int[] arr=new int[5];
//        for (int i=1;i<=5;i++)+{
//            arr=new int[i];
//        }
//        System.out.println(Arrays.toString(arr));


        int[] arr={1,2,3,4,5,6,8,9};
        int min=arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
//        System.out.println(min);
        for (int i=0;i<arr.length;i++){
            if (arr[i]==min){
                min++;
            }
        }
        System.out.println(min);
    }
}
