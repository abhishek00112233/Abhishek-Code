package ConditionalStatement;

import java.util.Scanner;

public class SwitchCasePractice {
    public static void main(String[] args ) {

        Scanner sc=new Scanner(System.in);

        // determine the day of the week based on a number


//        int num1=sc.nextInt();
//        switch (num1){
//            case 1:
//                System.out.println("Sunday");
//                break;
//            case 2:
//                System.out.println("Monday");
//                break;
//            case 3:
//                System.out.println("Tuesday");
//                break;
//            case 4:
//                System.out.println("Wednesday");
//                break;
//            case 5:
//                System.out.println("Thursday");
//                break;
//            case 6:
//                System.out.println("Friday");
//                break;
//            case 7:
//                System.out.println("Saturday");
//                break;
//            default:
//                System.out.println("invalid number ");
//                break;
//        }



        // Simple calculator using switch (add,subtract ,multiply, divide )

//        System.out.println(" Chose what are you doing   +  -  *  /  % ");
//        String num=sc.nextLine();
//        System.out.println("enter value of a : ");
//        int a=sc.nextInt();
//        System.out.println("enter value of b : ");
//        int b=sc.nextInt();
//        switch(num){
//            case "add":
//                System.out.println("a + b ="+(a+b));
//                break;
//            case "Subtract":
//                System.out.println("a - b ="+(a-b));
//                break;
//            case "Multiply":
//                System.out.println("a * b ="+a*b);
//                break;
//            case "Divide":
//                System.out.println("a / b ="+a/b);
//                break;
//            case "Modulo":
//                System.out.println("a % b ="+a%b);
//                break;
//            default:
//                System.out.println("invalid number");
//                break;

//         // Display the name of the month based on a user input (1-12)

//        System.out.println("enter month number :");
//    int Month=sc.nextInt();
//    switch(Month){
//        case 1:
//            System.out.println("january");
//            break;
//        case 2:
//            System.out.println("february");
//            break;
//        case 3:
//            System.out.println("March");
//            break;
//        case 4:
//            System.out.println("April");
//            break;
//        case 5:
//            System.out.println("may");
//            break;
//        case 6:
//            System.out.println("june");
//            break;
//        case 7:
//            System.out.println("july");
//            break;
//        case 8:
//            System.out.println("August");
//            break;
//        case 9:
//            System.out.println("September");
//            break;
//        case 10:
//            System.out.println("October");break;
//        case 11:
//            System.out.println("November");break;
//        case 12:
//            System.out.println("December");
//            break;
//        default:
//            System.out.println("Invalid month");
//    }


//      // find the number of days in a month based on month number

//        String str=sc.nextLine();
//        switch(str){
//            case "january":
//            case "march":
//            case "may":
//            case "july":
//            case"August":
//            case "october":
//            case "december":
//                System.out.println("31 day in this month ");
//                break;
//
//            case "february":
//                System.out.println("28/29 day in this month ");
//            case "april":
//            case "june":
//            case "september":
//            case "november":
//                System.out.println("30 day in this month ");
//                break;
//            default:
//                System.out.println("invalid month");
//        }

//        System.out.println("Enter Value to check : ");
//        int value=sc.next();


        // determine the type of a character (vowel, consonant,digit,special,character)





        // menu drive program to convert temperature (Celsius to fahrenheit and vice versa)
//        System.out.println("Enter temperature : ");
//        int temp=sc.nextInt();
//        int celc=(temp-32)*5/9;
//        System.out.println("Celsius  is : "+celc);
        System.out.println("Enter value : ");
        int celc1=sc.nextInt();
        int temp1=(celc1*9/5)*32;
        System.out.println("fahrenheit value : "+temp1);




        // find the given year in leap year

//        int year=sc.nextInt();
//        var check=year%2==0;
//        switch(year){
//            case 2:
//            case 4:
//            case 6:
//            case 8:
//            case 10:
//                System.out.println("number is Even ");
//                break;
//
//            case 1:
//            case 3:
//            case 5:
//            case 7:
//            case 9:
//            case 11:
//            case 13:
//                System.out.println("Number is Odd ");
//                break;
//            default:
//                if (check)
//                    System.out.println("num is even");
//                else
//                    System.out.println("num is odd");
//                break;
//
//
//        }

        // Display the grade (A,B,C,D,F) based on percentage using Switch case
//
//        System.out.println("Enter your percentage to see your grade : ");
//        int marks=sc.nextInt();
//        switch(marks){
//            case 100:
//            case 99:
//            case 98:
//            case 97:
//            case 96:
//            case 95:
//            case 94:
//            case 93:
//            case 92:
//            case 91:
//            case 90:
//                System.out.println("Grade A");
//                break;
//            case 89:
//            case 88:
//            case 87:
//            case 86:
//            case 85:
//            case 84:
//            case 83:
//            case 82:
//            case 81:
//            case 80:
//                System.out.println("Grade B");
//                break;
//            case 79:
//            case 78:
//            case 77:
//            case 76:
//            case 75:
//            case 74:
//            case 73:
//            case 72:
//            case 71:
//            case 70:
//                System.out.println("Grade C");
//            case 69:
//            case 68:
//            case 67:
//            case 66:
//            case 65:
//            case 64:
//            case 63:
//            case 62:
//            case 61:
//            case 60:
//                System.out.println("Grade D");
//                break;
//            case 59:
//            case 58:
//            case 57:
//            case 56:
//            case 55:
//            case 54:
//            case 53:
//            case 52:
//            case 51:
//            case 50:
//                System.out.println("fail");
//                break;
//            default:
//                System.out.println("invalid marks");
//                break;
//        }
//
//
//        // Determine the type of character (vowel ,consonant, digit ,special character)
//        char value=sc.next().charAt(0);
//        if(value=='a'||value=='e'||value=='i'||value=='o'||value=='u')
//            System.out.println("value is vowel ");
//        else-if ('0' && '9') {
//
//        }


        // check given number is even or odd

//        int num=sc.nextInt();
//            if(num%2==0) {
//                switch (num) {
//                    case num:
//                }
//            }
    }
}
