import javax.swing.plaf.IconUIResource;
import java.math.*;
public class MethodQuestion {
    //1 find the factorial of a numbers using a method
    static int factNum(int a){
        int fact=1;
        for (int i=1;i<=a;i++){
            fact*=i;
        }
        return fact;
    }

    //2 check if a number is prime using a method
    static boolean primeCheck(int a){
        for (int i=2;i<a;i++){
            if (a%i==0)
                return false;
        }
        return true;
    }
    //3 find the gcd (greatest common divisor) of two numbers
    static int gcdNumber(int a,int b){
        int gcd=1;
        for (int i=1;i<=a&&i<=b;i++){
            if (a%i==0 && b%i==0)
                gcd=i;
        }
        System.out.println("gcd of "+a+" and "+b+" is "+gcd);
        return gcd;
    }

    //4 check is a string is palindrome using method

    static boolean palindromeCheck(String str){
        String reverse="";
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            reverse=ch+reverse;
        }
        if(str.equals(reverse))
            return true;
        else
            return false;
    }

    //5 find the maximum of three numbers using a methods
    static int maxNum(int a,int b,int c){
        if (a>b && a>c)
            return a;
        else if (b>c && b>a)
            return b;
        else
            return c;
    }

    //6 write a method to calculate the power of a number
    static int power(int a,int b){
        int power=1;
        for ( int i=1;i<=b;i++){
            power*=a;
        }
        return power;
    }

    //7 create a method to convert celsius to fahrenheit
    static float fahrenheitConvert(float a){
        return (a*9/5)+32;
    }

    //8 find the sum of digits of a numbers using method
    static int sumofDigit(int a){
        int count=0;
        while(a>0){
            int num=a%10;
            count+=num;
            a/=10;
        }
        return count;
    }

    //9 write a method to reverse a string
    static String reverseStr(String str){
        String reverse="";
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            reverse=ch+reverse;
        }
        System.out.println("Before reverse \n"+str);
        System.out.println("After reverse \n"+reverse);
        return reverse;
    }

    //10 write a method to count the number of vowel is a String
    static int vowelCount(String str){
        int count=0;
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count+=1;
            }
        }
            System.out.println("number is vowel in this "+str+" is : "+count);
        return count;
    }

    // inputCount
    static int inputCount(int a){
        int numCount=0;
        while(a>0){
            numCount+=1;
            a/=10;
        }
        System.out.println(numCount);
        return numCount;
    }
    //Armstrong Number
    static double armNum(int a){

        double count=0;
        int digit=inputCount(a);
        while(a>0) {
            int num = a % 10;
            count += Math.pow(num,digit);
            a /= 10;
        }
        return count;
    }
    public static void main(String[] args) {


//        inputCount(123);
        System.out.println(armNum(123));

        // factorial number
        System.out.println("factorial of number is : "+(factNum(4)));

        // prime number
        System.out.println("number is prime: "+(primeCheck(11)));

        //GCD number
//        System.out.println(gcdNumber(36,60));
        gcdNumber(2,15);

        //palindrome check
        System.out.println("String is palindrome: "+(palindromeCheck("gug")));

        // maximum of three number
        System.out.println("maximum number is three is : "+(maxNum(22,322,6)));

        // power calculate
        System.out.println(power(2,5));

        // celsius to fahrenheit
        System.out.println(fahrenheitConvert(28)+" degree fahrenheit");

        // sum of a digit
        System.out.println("sum of digit is : "+(sumofDigit(777077)));

        //reverse String
        reverseStr("hello");

      // vowel count
        vowelCount("hello");
        vowelCount("aasseeii");

        // NumCount
        inputCount(1234);


        System.out.println(Math.pow(3,5));

    }
}
