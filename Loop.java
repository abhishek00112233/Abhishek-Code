package ConditionalStatement;

import javax.swing.*;
import java.util.*;

public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // for loop

        //    int num=sc.nextInt();
//    for (int i=0;i<num;i++)
//        System.out.println("i = "+i);


        // while loop

//        while(num<100){
//            System.out.println(num+" i = "+num);
//            num++;
//        }

        // do While loop

//        do {
//            System.out.println((num+" = "+num));;
//            num++;
//
//        }while(num<100);


//        int num1=sc.nextInt();
//        while(num1%3!=0){
//            System.out.println((num1));
//            num1++;
//        }

//        int num=91;
//        boolean flag=true;
//        while(flag){
//            System.out.println(num);
//            if (num%9==0)
//             flag =false;
//            num++;
//        }


//   int maxTime=3;
//   int attempt=0;
//   int value;
//   int pin=121;
//        System.out.println("Enter your pin ");
//       // int num=sc.nextInt();
//   do {
//       if(sc.nextInt()==pin){
//           System.out.println("you are enter correct pin ");
//           System.out.println("attempt ="+attempt);
//           attempt=0;}
//       else {
//           System.out.println("you enter incorrect pin ");
//           attempt+=1;
//           System.out.println("attempt ="+attempt);
//           if (sc.nextInt()!=pin){
//               System.out.println("you enter incorrect pin ");
//               System.out.println("you have a only "+maxTime+" attempt "+"you waste you "+attempt);
//               attempt+=1;
//           }
//           else if (attempt<3)
//               System.out.println("your pin is block in 24 hour \n please retry after 24 hour");
//       }
//       }while (attempt<maxTime);


        // phone lock create

//        int attempt = 0;
//        int matAttempt = 3;
//        int pin = 9999;
//        System.out.println("Enter your pin ");
//        do {
//            if (sc.nextInt() == pin) {
//                System.out.println("you are enter correct pin");
//                System.out.println("attempt = " + attempt);
//                attempt = 0;
//            } else {
//                System.out.println("you are enter incorrect pin");
//                System.out.println("attempt = " + attempt);
//                System.out.println("re try");
//                attempt+=1;
//            }
//        } while (attempt < matAttempt);



        int countNum=0;
        int num=0;
        int num1;
        int num2=1;
        num1=sc.nextInt();

        do {
           num1+=countNum;
           System.out.println(num1);



        }while (num<num2);
        System.out.println(countNum);
    }
}