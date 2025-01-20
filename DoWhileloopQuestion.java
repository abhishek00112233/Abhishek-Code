package ConditionalStatement;
import java.util.Scanner;

public class DoWhileloopQuestion {
    public static  void main(String[] args) {
        Scanner sc=new Scanner (System.in);
//          int num=sc.nextInt();


        //  create a menu driven program to perform arithmetic operations like additions subtraction  etc
//        int a,b,c,d;
//        int count=0;
//        System.out.println("Enter value of a : ");
//        a = sc.nextInt();
//        System.out.println("Enter value of b : ");
//        b = sc.nextInt();
//        System.out.println("what are you doing (sum+,sub-,mul*,div/");
//        String  input=sc.nextLine();
//        do {
//            if (input == "sum")
//                System.out.println("Sum of a and b = "+a+b);
//             else if (input=="sub")
//                System.out.println("Subtract of a and b = "+(a-b));
//             else if (input=="mul")
//                System.out.println("multiply of a and b = "+ a*b);
//
//            else if (input=="div")
//                System.out.println("Divide of a and b = "+ a/b);
//
//        }while (input>0);
//
//       int a,b,c;
//        int maxAttempt=3;
//        int attempt=0;
////        int pin=0011;pin
//        do {
//            if (sc.nextInt()==11) {
//                System.out.println("you are enter correct pin");
//                System.out.println("attempt = " + attempt);
//                attempt = 0;
//                System.out.println("what are you doing addition ,subtraction,multiply , divide ");
//                String str = sc.nextLine();
//                (str == "sm") {
//                    System.out.println("Enter value of a : ");
//                    a = sc.nextInt();
//                    System.out.println("Enter value of b : ");
//                    b = sc.nextInt();
//                    System.out.println("Sum of two number is :" + a + b);
//                }  if (str == "sub") {
//                    System.out.println("Enter value of a : ");
//                    a = sc.nextInt();
//                    System.out.println("Enter value of b : ");
//                    b = sc.nextInt();
//                    System.out.println("Sub of two number is : " + (a - b));
//                } else if (str == "mul") {
//                    System.out.println("Enter value of a : ");
//                    a = sc.nextInt();
//                    System.out.println("Enter value of b : ");
//                    b = sc.nextInt();
//                    System.out.println("multiply of two number is : " + (a * b));
//                } else if (str == "div") {
//                    System.out.println("Enter value of a : ");
//                    a = sc.nextInt();
//                    System.out.println("Enter value of b : ");
//                    b = sc.nextInt();
//                    System.out.println("Divide of two number is : " + (a / b));
//                } else
//                    System.out.println("Retry again");
//            }else {
//                System.out.println("incorrect pin \n Retry");
//                attempt+=1;
//            }
//        }while (attempt<maxAttempt);
//
//        String st="hello";
//        if (st=="hello")
//            System.out.println("yes");
//        else
//            System.out.println("no");
//
//        // keep asking for valid input (eg between 1 and 10) until the user enters correctly
//        int attempt =0;
//        int maxattempt=3;
////        int num=sc.nextInt();
//        do {''
//            if (int num=sc.nextInt()==1){
//                System.out.println("you inter correct number ");
//                System.out.println("attempt = "+attempt);
//                attempt=0;
//            }
//            else {
//                System.out.println("you enter incorrect number ");
//                System.out.println("attempt = "+attempt);
//                attempt+=1;
//            }
//        }while (attempt<maxattempt);

//        int maxattempt=3;
//        int attempt=0;
//
//        System.out.println("What are you doing (Sum,Subtract,Multiply,Divide)");
//        String str=sc.nextLine();
//        System.out.println("Enter value of a : ");
//        int num1=sc.nextInt();
//        System.out.println("Enter value of b : ");
//        int num2=sc.nextInt();
//
//        do {
//            if (str=="Sum"){
//                System.out.println("Sum of two number = "+num1+num2);
//                attempt=0;
//            } else if (str=="Sub") {
//                System.out.println("Subtract of two number = "+(num1-num2));
//                attempt=0;
//
//            } else if (str=="Mul") {
//                System.out.println("multiply of two number = "+num1*num2);
//                attempt=0;
//
//            } else if (str=="Div") {
//                System.out.println("Divide of two number = "+num1/num2);
//                attempt=0;
//
//            }
//            else {
//                System.out.println("please enter correct number");
//                attempt+=1;
//            }
//        }while(attempt<maxattempt);

        int num=sc.nextInt();
        int binary=0;
        while(num>0){
            int num1=num/2;
            binary=binary*num1+ num1;
            num/=2;
            num++;

        }
        System.out.println(binary);

    }
}
