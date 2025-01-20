import java.util.*;
import java.util.Scanner;
//public class Demo {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//////        int totalMarks=1;
//////        int percentage=1;
//////
//////        int a,b,c,d,e;
//////        a=sc.nextInt();
//////        b=sc.nextInt();
//////        c=sc.nextInt();
//////        d=sc.nextInt();
//////        e=sc.nextInt();
//////
//////        if(a>=60&&b>=60&&c>=60&&d>=60&&e>=60) {
//////            totalMarks = a + b + c + d + e;
//////            System.out.println("totalMarks = "+totalMarks);
//////            percentage=(totalMarks)/1/5;
//////            System.out.println("percentage = "+percentage+"%");
//////            if (percentage>=90){
//////                System.out.println("grade A");
//////
//////            } else if (percentage>=80) {
//////                System.out.println("grade B");
//////            } else if (percentage>=70) {
//////                System.out.println("grade C");
//////            } else if (percentage>=60) {
//////                System.out.println("grade D");
//////            }
//////            else System.out.println("fail");
//////
//////
//////        }else System.out.println("invalid marks");
////
////
//////         int count=0;
//////        int num =sc.nextInt();
//////        for (int i=1;i<=num;i++){
//////            num=sc.nextInt();
//////            count+=num;
//////
//////        }
//////        System.out.println(count);
////
////
////}}
//
//    }
//}

class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
        Arrays.sort(arr);
        int count = 0;
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                count++;
            }
            min += 1;
        }
        return count;
    }

    public static void main(String[] args) {
        Solution obj=new Solution();
        int[] arr={7,8,9,3,2,2,11,14,4};
        System.out.println(obj.longestConsecutive(arr));
    }}






