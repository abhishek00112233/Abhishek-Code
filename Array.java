import java.sql.PreparedStatement;
import java.util.Arrays;
import java.util.Scanner;

public class Array {
     int[][] evenNum(int[][] arr){
        for (int i=0;i<arr.length;i++) {
            for (int j=0;j<arr[i].length;j++){
                if(arr[i][j]%2==0){
                    System.out.print(arr[i][j]+" ");
                }

            }
            System.out.println();
        }
        return arr;
    }
     int [] arr2 (int size){
        return new int [size];
    }
    // check sorted Array
    static boolean checkSort(int[] arr){
         int val=arr[0];
         for (int i=1;i<arr.length;i++) {
             if (arr[i]>val){
                 val=arr[i];
             }
             System.out.println("true");
         }
         return false;
    }
    static int targetCount(int[] arr,int x) {
        int count = 0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]!=x){
                count++;
            } else if (arr[i]==x) {
                break;
            }
        }
            System.out.println(count);
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int[] arr={1,2,3,4,5,77,342};
//        int x=77;
//        System.out.println(targetCount(arr,x));

//        int x=3;
//        int count=0;
//        for (int i=0;i<arr.length;i++){
//            if (arr[i]==x){
//                break;
//            }
//            count++;
//        }
//        System.out.println(count);
//        System.out.println(checkSort(arr));
//        int [][] arr1={
//                {1,2,3},
//                {4,5,6},
//                {5,4,3}
//        };
//        evenNum(arr1);
//        Array obj=new Array();
//        int [] arr3=obj.arr2(1);
//        System.out.println(Arrays.toString(arr3));
//        int [][]arr=new int [2][];
//        arr[0]=new int[3];
//        arr[1]=new int[5];
//        System.out.println(Arrays.toString(arr[1]));
//        System.out.println(Arrays.toString(arr[0]));

//        int [] a;
//        a=new int[6];
//        a[0]=3;
//        a[2]=2;
//        a[1]=1;
//        a[3]=11;
//        a[3]=32;
//        System.out.println(a);
//        System.out.println(a.toString());
//        System.out.println(Arrays.toString(a));
//
//        String str[]=new String[5];
//        System.out.println(Arrays.toString(str));
//
//        boolean bool[]=new boolean[5];
//        System.out.println(Arrays.toString(bool));
//
//        char ch[]=new char[5];
//        System.out.println(Arrays.toString(ch));
//
//        double db[]=new double[5];
//        System.out.println(Arrays.toString(db));
//
//
//        int arr[]=new int []{2,3,4,44,44,5,5,2,1,22,5};
//        System.out.println(arr[9]/arr[8]);
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//
//        int arr[]={2,3,4,5,6,7,8,9,55,44,33,334};
//        int i,j;
//        for (i=0;i<arr.length;i++){
//            for (j=2;j<=arr[i];j++){
//                if (i%j==0)
//                    break;
//            }
//            if (i==j)
//                System.out.print(j+" ");
//        }
//
//        int arr1[][]={
//                {2,3,4},
//                {3,4,5}
//        };
//        System.out.println();
//        System.out.println(arr1[1][0]);
//        int A,E,I;
//        A=0;
//        E=0;
//        I=0;
//        char ch[]={'a','e','e','i','i','d','r','i','k'};
//        for (int n=0;n<ch.length;n++){
//            if (ch[n]=='a')
//                A++;
//            else if (ch[n]=='e')
//                E++;
//            else if (ch[n]=='i')
//                I++;
//        }
//        System.out.println("A = "+A);
//        System.out.println("E = "+E);
//        System.out.println("I = "+I);

//        int [][] mat={
//                {3,4,9},
//                {2,5,6},
//                {9,25,25}
//        };
//        int x=78;
//        int i,j;
//        boolean bool=false;
//        for (i=0;i<mat.length;i++){
//            for (j=0;j<mat[i].length;j++){
////            System.out.println(mat[i][j]);
//                if (mat[i][j]==x){
//                 bool=true;
//                break;}
//            }
//        if (bool) {
//            break;
//        }
//        }
//         if (bool){
//             System.out.println("true");
//         }
//         else
//             System.out.println("false");

//       int a[][]={};
//       int []b={};
//        System.out.println(a);
//        System.out.println(b);


//        System.out.println("Enter the size of array : ");
//        int num=sc.nextInt();
//        int count=0;
//        int arr[]=new int[num];
//        for (int i=0;i<num;i++){
//            arr[i]=sc.nextInt();
////            count+=arr[i];
//            if (arr[i]%2==0){
//                System.out.println(arr[i]);
//            }
//
//        }
//        System.out.println(Arrays.toString(arr));
//        System.out.println(count);

//        int [] arr={2,3,44,55,66};
//        for (int i=0;i<arr.length;i++){
//            System.out.println("arr["+i+"] "+arr[i]);
      //  }


        // 2 D Array


//        int arr [][]={
//                {2,3,4,23},
//                {5,44,7,121},
//                {66,12,31,11}
//        };
//        System.out.println(arr.length);
//        System.out.println(arr[0].length);
//        System.out.println(arr[1].length);
//        System.out.println(arr[2].length);

//        for (int i=0;i<arr.length;i++){
//            for (int j=0;j<arr[i].length;j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//        System.out.println();
//        }


//        for (int i=0;i<arr.length;i++){
//            for (int j=0;j<arr[i].length;j++){
//                if (arr[i][j]%2==0) {
//                    System.out.print(arr[i][j]+" ");
//                }
//            }
//            System.out.println();
//        }

//        for (int [] i:arr){
//            for (int ele:i){
//                System.out.print(ele+" ");
//            }
//            System.out.println();
//        }

        // user input 2D Array;

//        System.out.println("Enter how many class : ");
//        int  clss=sc.nextInt();
//        System.out.println("Enter Marks of student : ");
//        int marks=sc.nextInt();
//        int studentMarks [][]=new int [clss][marks];
//        for (int i=0;i<studentMarks.length;i++){
//            for (int j=0;j<studentMarks[i].length;j++){
//                System.out.println("Enter value "+i+" of "+j);
//                studentMarks[i][j]=sc.nextInt();
//            }
//        }
//        for (int n=0;n<studentMarks.length;n++){
//            for (int m=0;m<studentMarks[n].length;m++){
////                if (studentMarks[n][m]>=60){
//                    System.out.print(studentMarks[n][m]+" ");
////                }
//            }
//            System.out.println();
//        }


        // Jagged Array


//        System.out.println("Enter how many Department : ");
//        int dept=sc.nextInt();
//        int arr [][]=new int [dept][];
//        for (int i=0;i<arr.length;i++){
//            System.out.println("Enter class  of department  :");
//            int cls=sc.nextInt();
//            arr[i]=new int[cls];
//        }
//        for (int n=0;n<arr.length;n++){
//            for (int m=0;m<arr[n].length;m++){
//                System.out.println("Enter how much student  in the class :"+n+" "+m);
//                arr[n][m]=sc.nextInt();
//            }
//        }
//        for (int s=0;s<arr.length;s++){
//            for (int k=0;k<arr[s].length;k++){
//                System.out.print(arr[s][k]+" ");
//            }
//            System.out.println();
//        }


//        System.out.println("Enter how many Section in MCA department : ");
//        int dept=sc.nextInt();
//        int [][] arr=new int [dept][];
//        for (int i=0;i<arr.length;i++){
//            System.out.println("Enter how many student in  section "+i+" : ");
//            int std=sc.nextInt();
//            arr[i]=new int[std];
//        }
//        for (int i1=0;i1<arr.length;i1++){
//            for (int i2=0;i2<arr[i1].length;i2++){
//                System.out.println("Enter marks of student "+i1+"  "+i2);
//                arr[i1][i2]=sc.nextInt();
//            }
//        }
//        for (int []s:arr){
//            for (int s1:s){
//                    System.out.print(s1+" ");
//            }
//            System.out.println();
//        }

//        int count=0;
//        System.out.println("Enter how many department : ");
//        int dept=sc.nextInt();
//        int [][] arr=new int [dept][];
//        for (int i=0;i<arr.length;i++){
//            System.out.println("Enter how many student : ");
//            int std=sc.nextInt();
//            arr[i]=new int[std];
//        }
//        for (int j=0;j<arr.length;j++){
//            for(int k=0;k<arr[j].length;k++){
//                System.out.println("Enter value of "+j+" of  "+k);
//                arr[j][k]=sc.nextInt();
//            }
//        }
//        for (int s1=0;s1<arr.length;s1++){
//            for (int s2=0;s2<arr[s1].length;s2++){
//                System.out.print(arr[s1][s2]+" ");
//            }
//            System.out.println();
//        }
//        for (int n=0;n<arr.length;n++){
//            for (int m=0;m<n+1;m++){
//                count+=arr[n][m];
//            }
//        }
//        System.out.println(count);

//
//        System.out.println("Enter how many department  : ");
//        int dept=sc.nextInt();
//        System.out.println("Enter how many section in  department");
//        int section=sc.nextInt();
//        int [][] marks=new int [dept][section];
//        for (int i=0;i<marks.length;i++){
//            System.out.println("Enter how many student in section "+i+" : ");
//            int sec=sc.nextInt();
//            marks[i]=new int [sec];
//        }
//
//        for (int j=0;j<marks.length;j++){
//            for (int k=0;k<marks[j].length;k++){
//                System.out.println("Enter department  "+j+" section "+k+" student marks: ");
//                marks[j][k]=sc.nextInt();
//            }
//        }
//        for (int [] arr:marks){
//            for (int p:arr){
//                if (p>60){
//                    System.out.print(p+" ");
//                }
//            }
//            System.out.println();
//        }



        // 3 D Array
//        int [][][] arr= {
//                {
//                        {1,2,3},
//                        {3,4,5},
//                        {3,4,3}
//                },
//                {
//                        {9,8,7},
//                        {5,6,7},
//                        {8,2,1}
//                },
//        };

//
//        for (int i=0;i<arr.length;i++){
//            for (int j=0;j<arr[i].length;j++){
//                for (int k=0;k<arr[i][j].length;k++){
//                    if (arr[i][j][k]==3){
//                        System.out.print(arr[i][j][k]+" ");
//                    }
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }



        // Max - min (span array)

//        System.out.println("Enter how many time input : ");
//        int num=sc.nextInt();
//        int [] arr=new int[num];
//        System.out.println("Enter value of array : ");
//        for (int i=0;i<num;i++){
//            arr[i]=sc.nextInt();
//        }
//        int min=arr[0];
//        int max=arr[0];
//        for (int i=1;i<arr.length;i++){
//            if (arr[i]<min){
//                min=arr[i];
//            }
//            if (arr[i]>max){
//                max=arr[i];
//            }
//        }
//        System.out.println(max);
//        System.out.println(min);
//        System.out.println("span = "+(max-min));



        // element find in array
//
//        System.out.println("Enter input how many time : ");
//        int num=sc.nextInt();
//        int [] arr=new int [num];
//        for (int i=0;i<num;i++){
//            System.out.println("Enter value of array : ");
//            arr[i]=sc.nextInt();
//        }
//        int count=0;
//        System.out.println("which element you find : ");
//        int find=sc.nextInt();
//        for (int i=0;i<arr.length;i++){
//            if (arr[i]==find){
//                break;
//            }
//            count++;
//        }
//        System.out.println(count);


        // a bar chart of asteriks representing value of array a
//        int[] arr={3,6,1,0,0,2,2};
//        for (int i=0;i<arr.length;i++){
//            for (int j=0;j<arr[i];j++){
//                System.out.print("* \t");
//            }
//            System.out.println();
//        }
//        System.out.println();



        // add two array
//        System.out.println("Enter length of array : ");
//        int num1=sc.nextInt();
//        int[] arr1=new int [num1];
//        for (int i=0;i<num1;i++){
//            System.out.print("Enter num : ");
//            arr1[i]=sc.nextInt();
//        }
//        System.out.println("Enter length of array : ");
//        int num2=sc.nextInt();
//        int[] arr2=new int [num2];
//        for (int i=0;i<num2;i++){
//            System.out.print("Enter num : ");
//            arr2[i]=sc.nextInt();
//        }
//        for (int i=0;i<arr2.length;i++){
//            System.out.print(arr1[i]+arr2[i]+" ");
//        }
//        System.out.println();

//
//        int[] arr={2,3,4};
//        for (int i=0;i<arr.length;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print(arr[i]+""+(arr[j])+" ");
//            }
//        }

        // add two array
//        int[] sum={};
//        System.out.println("Enter how many number you Need : ");
//        int num1=sc.nextInt();
//        int[] arr1=new int[num1];
//        for (int i=0;i<arr1.length;i++){
//            System.out.println("Enter value of array1 "+i+" = ");
//            arr1[i]=sc.nextInt();
//        }
//
//        System.out.println("Enter how many number you Need : ");
//        int num2=sc.nextInt();
//        int[] arr2=new int[num2];
//        for (int i=0;i<arr2.length;i++){
//            System.out.println("Enter value of array2 "+i+" = ");
//            arr2[i]=sc.nextInt();
//        }
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));
//         sum=new int[num1 >= num2 ?num1:num2];
//        for (int i=0;i<sum.length;i++){
//             sum={arr1[i]+arr2[i]};
//            System.out.print(Arrays.toString(sum1));
//        }

//
//        int[] arr1={1,2,3,4,5,7,8};
//        int min=arr1[0];
////        System.out.println(min);
//        for (int i=0;i<arr1.length;i++){
//            if (arr1[i]<min){
//                min=arr1[i];
//            }
//        }
//        int n=1;
//        for (int i=0;i<arr1.length;i++){
//            if (arr1[i]==min){
//                n++;
//                min++;
//            } else if (arr1[i]!=min) {
//                break;
//            }
//        }
//            System.out.println(n);


//        int[] arr={1,2,1,2};
//        int rev1=0;
//        for (int j=0;j<arr.length;j++){
//            rev1=rev1*10+arr[j];
//        }
//        int rev=0;
//        for (int i=arr.length-1;i>=0;i--){
//            rev=rev*10+arr[i];
//
//        }
//        if (rev==rev1){
//            System.out.println("true");}
//        else System.out.println("false");


//        int[] arr={1,2,3,2,1};
//        int s=arr.length;
//        int[] arr1=new int[s];
//        for (int i=arr.length-1;i>=0;i--){
//            arr1=new int[arr[i]];
//        }
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr));
//       if (arr==arr1)
//           System.out.println("true");
//       else System.out.println("false");

     }
        }




