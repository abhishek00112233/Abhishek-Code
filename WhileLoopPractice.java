package ConditionalStatement;
import java.util.Scanner;

public class WhileLoopPractice {

//    static  int firstTerm(int a){
//        int num=1;
//        int store=0;
//        while(num>0){
//            int num1=num%10;
//            store+=1;
//            num/=10;
//        }
//        System.out.println(store);
//        return store;
//    }
//      static int secomdTerm(int b){
//        int num=1;
//        int power=0;
//        int count=1;
//        while(num>0){
//            int value=num%10;
////            value**power;
//        }
//        return b;
//      }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number : ");
//         int num=sc.nextInt();

        //reverse given number

//        int num=sc.nextInt();
//        int revNum=0;
//        while(num>0){
//            int reverse=num%10;
//            revNum=(revNum*10)+reverse;
//            num/=10;
//        }
//        System.out.println(revNum);

        // check if number or String ia palindrome
//        System.out.println("Enter number : ");
//        int num=sc.nextInt();
//        int value=num;
//
//        int count=0;
//        while(num>0){
//            int storeNum=num%10;
//            count=(count*10)+storeNum;
//            num/=10;
//        }
//
//        System.out.println(count);
////        if ()
//        String check=(value == count)?"number is palindrome":"number is not palindrome ";
//        System.out.println(check);


        // check if number is ArmStrong number
//
//        int reverseNum=0;
//        while (num>0) {
//            int reverse = num % 10;
//            reverseNum += 1;
//            num /= 10;
//        }
////            System.out.println(reverseNum);
//
//        int power=reverseNum;
////        System.out.println(power);
//        while (num>0){
//        }
//        int addValue=0;
//        while(num>0){
//            int result=num%10;
//            addValue+=(result*power);
//            num/=10;
//        }
//            System.out.println(addValue);
//        }


        // print first n fibonacci number
//        int fibo=0;
//        while (num>0){
//            int fibo1=(num-1)+(num-2);
//            fibo+=fibo1;
//
//        }
//        System.out.println(fibo);


//        String str=sc.nextLine();
//        String reverse="";
//        for(char ch:str.toCharArray()){
//            reverse=ch+reverse;
//        }
//        System.out.println(reverse);

        int num=10;
        int store=1;
        int a=0,b=1,sum=0;
        for (int i=2;i<num;i++){
            sum=a+b;
            store+=sum;
            System.out.println(" "+sum);
            a=b;
            b=sum;
        }
        System.out.println(store);


        }

    }

