import java.io.StreamTokenizer;
import java.util.Random;
import java.util.Scanner;
import java.math.*;

class Hello{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        String str="Hello";
//        //int num=Integer.parseInt(str);
//        //float num=Float.parseFloat(str);
//        boolean num=Boolean.parseBoolean(str);
//        System.out.println(num);
//
//
//        int num1=12;
//        String st=String.valueOf(num1);
//        System.out.println(st);
////        System.out.println(st instanceof String);
//        int num=sc.nextInt();
//        int reverse_Num=0;
//        while (num>0){
//            int num1=num%10;
//            reverse_Num=(reverse_Num*10)+num1;
//            num/=10;
//        }
//        System.out.println(reverse_Num);

//        int num=sc.nextInt();
//        int sumNum=0;
//        for (int i=1;i<num;i++)
//             if(num%i==0)
//                sumNum+=i;
//        System.out.println(sumNum);

//
//
//        int num=15;
//        int check=num%2;
//        System.out.println(check);


//        int x=0;
//        while (x++<5){
//            System.out.println(x+" ");
//        }

//        int i=0;
//        do {
//            System.out.println(i++ +" ");
//        }while (i<3);

//        for (;;){
//            System.out.println("hello");
//        }
//
//
//        int num=5;
//        for (int i=0;i<3;i++) {
//            if (num % 2 == 0) {
//                num += i;
//            } else {
//                num *= i;
//            }
//            System.out.println(num);
//
//        }

//        int i=1,j=3;
//        while (i<=3){
//            switch (i){
//                case 1:
//                    j+=2;break;
//                case 2:
//                    j*=3;break;
//                case 3:
////                    j/=4;break;
////
////
////            }i++;
////        }
////        System.out.println(j);
//
//
//        int input=sc.nextInt();
//        int mul=1;
//        int add=0;
//        while (input>0){
//            int num1=input%10;
//            add+=
//        }
//
////        int num=sc.nextInt();
////        String checkyear=(num%4==0)?" Yes year is leap year":" No year is not leap year";
////        System.out.println(checkyear);
//
////        int num=sc.nextInt();
//        int maxattempt=3;
//        int attempt=0;
//        do {
//            if (sc.nextInt() == 1122){
////                System.out.println("you enter correct pin ");
//                String str=sc.nextLine();
//                if (str=="sum"){
//                    int num1=sc.nextInt();
//                    int num2=sc.nextInt();
//                    System.out.println("Sum of two number = "+num1+num2);
//
//                }
//                System.out.println("attempt = "+attempt);
//                attempt=0;
//
//            }else {
//                System.out.println("you enter incorrect pin \n Retry");
//                System.out.println("attempt = "+attempt);
//                attempt+=1;
//            }
//        }while (attempt<maxattempt);


//        String str=sc.nextLine();
//        int num=Integer.parseInt(str);
//        System.out.println(num);

//
//        int num=sc.nextInt();
//        int a=0,b=1,sum=0;
//        System.out.println("0");
//        System.out.println("1");
//        for (int i=2;i<=num;i++){
//            sum=a+b;
//
//            System.out.println(" "+sum);
//            a=b;
//            b=sum;
//        }



        //user generated randomly check number is prime and not prime

//        Random random=new Random();
//        int num=random.nextInt(100);
//        System.out.println(num);
//
//
////        int num=sc.nextInt();
//        int count=0;
//        for (int i=1;i<=num;i++){
//            if (num%i==0)
//                count++;
//        }
//        if (count==2){
//            System.out.println("yes prime");
//        }
//        else
//            System.out.println("no prime");

       // random number

//        Random rand=new Random();
//        int num=rand.nextInt();
//        System.out.println(num);

        int [] arr={2,3,4,23,11};
       int max=0;
        for (int i=0;i<arr.length;i++){
            max+=arr[i];

            System.out.println(arr[i]);

        }
        System.out.println(max/arr.length);

    }
}