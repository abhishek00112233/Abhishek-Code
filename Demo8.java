import java.util.Arrays;
import java.util.Scanner;

public class Demo8 {
    static int maxNum(int [] arr){
        int max=arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];

            }
        }
        return max;
    }
    static int minNum(int [] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    static boolean findElement(int [][] arr2,int n){
        for (int i=0;i< arr2.length;i++){
            for (int j=0;j<arr2[i].length;j++){
                if (arr2[i][j]==n){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//
//        int [] arr={2,3,4,5,6,33,777,6,555,444};
//        int num1=maxNum(arr);
//        int num2=minNum(arr);
//        System.out.println("Gap of number "+num1+" and "+num2+" = "+(num1-num2));
//
//
//        System.out.println();
//        System.out.println();
//        System.out.println();
//        int [][] arr1={
//                {1,222,3},
//                {4,5,6},
//                {7,8,22}
//        };

//        int absent=0;
//        int present=0;
//        System.out.println("Enter how many classes doing now : ");
//        int cls=sc.nextInt();
//        System.out.println("how many attendance to enter the exam hall : ");
//        int attendance=sc.nextInt();
//        int [] arr =new int[cls];
//        for (int i=0;i<arr.length;i++){
//            System.out.println("Enter student day "+i+" attendance (0 for absent)( 1 is present)  : ");
//            arr[i]=sc.nextInt();
//            if (arr[i]==0)
//                absent+=1;
//            else if (arr[i]==1)
//            present+=1;
//
//        }
//        System.out.println("Student attendance format ="+(Arrays.toString(arr)+" "));
//        int percentage =present*100/(absent+present);
//        if (percentage>=attendance){
//            System.out.println("Student attendance : "+percentage+"%");
//            System.out.println("criteria of attendance to enter = "+attendance+"%");
//            System.out.println("Yes Students  is eligible for the exam ");
//
//        }
//        else {
//            System.out.println("Student attendance : "+percentage+"%");
//            System.out.println("criteria of attendance to enter = "+attendance+"%");
//            System.out.println("No students are is not eligible for the exam ");
//
//        }
//
        int [][] arr2={
                {1,2,3},
                {688,5,7888},
                {33,22,11}
        };
        int num=688;
        System.out.println(findElement(arr2,num));
//        int max=arr2[0][0];
//        for (int i=1;i<arr2.length;i++){
//            for (int j=0;j<arr2[i].length;j++){
//                if (arr2[i][j]>max){
//                    max=arr2[i][j];
//                }
//            }
//            System.out.println(max);
//        }

//        int num=1001;
//        int store=0;
//        int power=1;
//        while(num>0){
//            int temp=num/10;
//            store+=temp*power;
//            num/=10;
//            power*=2;
//
//        }
//        System.out.println(store);
//
//
//        int n=10;
//        int i,j,count=0;
//        for (i=0;i<n;i++){
//            for (j=2;j<=i;j++){
//                if (i%j==0){
//                    break;
//                }
//                }
//                if (i==j){
//                    count++;
////                    System.out.println(j);
//            }
//        }
//            System.out.println(count);
//
//        System.out.println(5^25);

//
//        int [] arr={1,2,1,1,1};
//        int target=3,count=0,sum=0;
//        for (int i=0;i<arr.length;i++){
//             sum+=arr[i];
//             count++;
//        if (sum==target){
//            System.out.println(count);
//        }
//        }

        int n=50;
        for (int i=0;i< arr2.length;i++){
            for (int j=0;j<arr2[i].length;j++){
                if (arr2[i][j]==n){
                    System.out.println("true");
                }
            }
        }
    }
}
