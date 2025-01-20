package ConditionalStatement;

import javax.swing.plaf.IconUIResource;
import java.sql.SQLOutput;
import java.util.Scanner;

public class BreakContinueQuestion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


//        //1  print the sum of even numbner form 1 to 100 (use continue to skip odd number)
//        int EvenAdd=0;
//        for (int i=1;i<=100;i++){
//            if(i%2!=0){
//                continue;
//            }
//            EvenAdd+=i;
//        System.out.println(i);
//        }
//        System.out.println(EvenAdd);


        //2 print all prime number between 1 to 50 use break to stop when prime number is found

//        int i, j;
//        int start = 1;
//        int end = 100;
//        for (i = start; i <= end; i++) {
//            for (j = 2; j <= i; j++) {
//                if (i % j == 0)
//                    break;
//            }
//            if (i == j)
//                System.out.println(j);
//        }
//    }


        //3  find the first 5 multiple of a number use break after the 5th multiple
//        int count=0;
//        int num=90;
//        for (int i=1;i<num;i++){
//            if (num%i==0){
//                count+=1;
//                System.out.println(i);
//                if (count==5)break;
//            }
//
//        }
//
//        //4 print all odd number from 1 to 100 (use continue to skip even number)
//
//        int oddAdd=0;
//        for (int i=1;i<=100;i++){
//            if (i%2==0){
//                continue;
//            }
//            System.out.println(i);
//            count+=i;
//        }
//        System.out.println(count);
//
//
//        //5  calculate the sum of digits of a number stop when the sum exceeds 20
//        int max=20;
//        int count=0;
//        int num=sc.nextInt();
//       do {
//           int num1=num%10;
//           count+=num1;
//           num/=10;
//       }while (count<max);
//        System.out.println("LIMIT EXCEEDS 20 ");
//        System.out.println(count);
        }

//        System.out.println(count);

        //6  find the factorial of a number exits the loop if the result exceeds a limit using break

//        int factCount=1;
//        int num=3;
//        for (int i=1;i<=num;i++){
//            if (factCount<120)break;
//            factCount*=i;
//        }
//            System.out.println(factCount);


        //7  print numbers form 1 to 100 skip numbers divisible by 3 using continue

//        for (int i=1;i<=100;i++){
//            if (i%3==0)continue;
//        System.out.println(i);
//        }


        //8  print numbers form 1 to 10 but break loop if the number equals 5

//        int num=10;
//        for (int i=1;i<=num;i++){
//            if (i==5)break;
//            System.out.println(i);
//        }

        //9  count digits of a numbers use continue to skip Zero

//        int num=123000;
//        int digit=0;
//        while(num>0){
//            int num1=num%10;
//            num/=10;
//            if (num1==0) {
//                continue;
//            }
//            digit+=1;
//        }
//        System.out.println(digit);


        //10  check if number is palindrome break if the numbers is not
////
//        int num=129;
//        int reverse=0;
//        int check=num;
//        while(num>0){
//            int num1=num%10;
//            reverse=reverse*10+num1;
//            num/=10;
//        }
//
//        if (reverse==check){
//            System.out.println("yes palindrome");}
//        else
//            System.out.println("Not palindrome");
    }

