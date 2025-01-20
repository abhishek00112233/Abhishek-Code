import com.sun.security.jgss.GSSUtil;

import java.awt.*;
import java.lang.reflect.Method;
import java.util.Random;

public class Methods {
     void cat(){
        System.out.println("cat is eating");
    }
    String oddEven(int a){
         if (a%2==0){
             System.out.println("Even");
             return "Even";}
    return "odd";
    }

    static boolean primeNum(int a){
           for (int i=2;i<a;i++){
               if (a%i==0)
                   return false;
           }
           return true;
    }

    static void hello(String say){
        System.out.print("hello");
        System.out.println(say);
    }
    static int randomDega(){
         int num=(int)(Math.random()*100);
     return num;
    }
    static String reverseString(String str){
         String str1="";

         for (int i=0;i<str.length();i++){
            char  ch=str.charAt(i);
              str1=ch+str1;
         }
         return str1;
    }

    public static void main(String[] args) {
        System.out.println(reverseString("hello"));
        System.out.println(randomDega());
        Method1.hello();
        hello(" Everyone");
//         Animal obj1=new Animal();
         Animal.say();
        System.out.println(primeNum(53));
        int i,j,start,end;
        end=22;
        start=5;
        for (i=start;i<=end;i++){
            for (j=2;j<=i;j++){
                if (i%j==0)
                    break;
            }
            if (i==j)
                System.out.println(j);
        }
//         Methods obj=new Methods();
//        obj.cat();
////        System.out.println(obj.oddEven(23));
//         obj.oddEven(24);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Math.sqrt(7));
        Random rand =new Random();
        double num=rand.nextDouble();
        System.out.println(num);

    }

}

class Animal{
    static void say(){
        System.out.println("good morning");
    }
}
