import java.util.Arrays;
import java.util.Scanner;

public class Array2 {
    // inserceArray
    static int[] insertArray(int[] arr,int pos,int element){
        for (int i=arr.length-2;i>=pos;i--){
            arr[i+1]=arr[i];
        }
        arr[pos]=element;
        return arr;
    }
    // delete Array
    static int[] deleteArray(int[] arr,int pos){
        for (int i=pos;i<=arr.length-2;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=0;

        return arr;
    }
    static boolean sortCheck(int [] arr){
        for (int i=0;i<arr.length-1;i++) {
            if (arr[i]<arr[i+1]){
                return true;

            }

        }
        return false;
    }

    // Linear search
    static int linearSearch(int[] arr,int target){
        int ans=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==target){
                ans=i;
            }
        }
        System.out.println(ans);
        return ans;
    }
    // number of occur
    static int[] multipleOccur(int[] arr,int target){
//        int n=0;
        int[] ans=new int[arr.length];
        int k=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==target){
                ans[k]=i;
                k++;
            }
        }
        if (k==0){
            System.out.println("element  is not present in array");
        }
        else
            for (int i=0;i<k;i++){
                System.out.print(ans[i]+" ");
            }
        return arr;
        }

        //prime check
    static boolean primeCheck(int a){
        for (int i=2;i<a;i++){
            if (a%i==0){
                break;
            }
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(primeCheck(6));
//        int[] arr={1,2,3,4,6};
//        System.out.println(Arrays.toString(insertArray(arr,2,43)));
//          System.out.println(Arrays.toString(deleteArray(arr,2)));


//        int[][] arr2=new int[4][5];
//        System.out.println(arr2.length);
//        System.out.println(arr2[0].length);
//        System.out.println(arr2[1].length);
//      for (int[]arr:arr2){
//          for (int i:arr){
//              System.out.print(i+" ");
//          }
//          System.out.println();
////      }

        // jagged Array
//        System.out.println("Enter value of row : ");
//        int a1=sc.nextInt();
//        int[][] arr1=new int[a1][];
//        for (int i=0;i< arr1.length;i++){
//            int s=sc.nextInt();
//            arr1[i]=new int[s];
//        }
//        for (int i=0;i< arr1.length;i++){
//            for (int j=0;j<arr1[i].length;j++){
//                System.out.println("Enter value : ");
//                arr1[i][j]=sc.nextInt();
//            }
//        }
//        for (int[] i:arr1){
//            for (int j:i){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
//        int[] arr={1,2,3,4,7,5};
//        int pos=3;
//        for (int i=pos;i<arr.length-1;i++){
//            arr[i]=arr[i+1];
//        }
//        arr[arr.length-1]=0;
//        System.out.println(Arrays.toString(arr));


//        int target = 2;
//        int[] arr = {1,2,3,2,5,2,9,6};
//        int k=0;
//        int[] store=new int[arr.length];
//        for (int i=0;i<arr.length;i++){
//            if (arr[i]==target){
//                store[k]=i;
//                k++;
//            }
//        }
//        for (int i=0;i<k;i++){
//            System.out.print(store[i] +" ");
//        }


//        int[] arr={-23,-43,-234,-7};
//        int min=Integer.MAX_VALUE;
//        for (int i=1;i<arr.length;i++){
//            if (arr[i]<min){
//                min=arr[i];
//            }
//        }
//        System.out.println(min);

//        int[][] arr={
//                {1,9,3,5},
//                {4,5,6,8,9},
//                {7,8,9,5}
//        };
//        int target=8;
//        int n=0;
//        int k=0;
//        for (int i=0;i<arr.length;i++){
//            for (int j=0;j<arr[i].length;j++){
//                if (arr[i][j]==target){
//                    n=i;
//                    k=j;
//                    break;
//                }
//            }
//
//        }
//
//        System.out.print(n+" "+(k));

//        int[][] arr={
//                {1,2,3},
//                {3,4,5},
//                {5,4,3,9}
//        };
//        int[][] arr1={
//                {3,2,1},
//                {2,3,1},
//                {8,7,9}
//        };
//        for (int i=0;i<arr.length;i++){
//            for (int j=0;j<arr[i].length;j++){
//                System.out.print(arr[i][j]+arr1[i][j]+" ");
//            }
//            System.out.println();
//        }
//
//        int count=0;
//        for (int i=0;i<arr.length;i++){
//            count+=arr[i].length;
//        }
//        System.out.println(count);


        int[] arr=new int[5];
        for (int i=0;i<arr.length;i++){
            System.out.println("enter array value : ");
            arr[i]=sc.nextInt();
        }
        int[] arr1=new int[arr.length];
        int k=0;
        for (int i=arr.length-1;i>=0;i--){
            arr1[k]=arr[i];
            k++;
        }
        System.out.println("before reverse ");
        System.out.println(Arrays.toString(arr));
        System.out.println("After reverse");
        System.out.println(Arrays.toString(arr1));
    }
    }