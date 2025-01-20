package ConditionalStatement;

import javax.swing.plaf.IconUIResource;
import java.lang.reflect.Array;
import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
//        float marks[]={88,99.7f,87.99f,86,54,90.88f};
//        float average=0;
//        float TotalMarks=0;
//        for (int i=0;i<marks.length;i++){
////            System.out.println(marks[i]);
//            TotalMarks+=marks[i];
//        }
//        System.out.println("TotalMarks = "+TotalMarks);
//        System.out.println("Average of TotalMarks = "+TotalMarks/marks.length);



        //2 find the largest and smallest numbers in an array.

        int[] arr={23,44,55,54,3,890,765,2};
        for (int i:arr){
            System.out.print(i+" ");}
        Arrays.sort(arr);
//        for (int i:arr){
//            System.out.print(i+" ");
//            System.out.print();
//        }
//        System.out.println("After sort");
        System.out.println();
        int max=arr[arr.length-1];
        int min=arr[0];

        System.out.println("maximum value of this array : "+max);
        System.out.println("minimum value of this array : "+min);




        //4 Count the number of vowels in a string using foreach loop

//        int alphabate[]={'a','f','c','e','i','o','u','s','d','q'};
//        int vowelCount=0;
//        for (int n=0;n<alphabate.length;n++){
//            if (alphabate[n]=='a'|| alphabate[n]=='e'||alphabate[n]=='i'||alphabate[n]=='o'||alphabate[n]=='u'){
//                vowelCount+=1;
//            }
//        }
//        System.out.println("Number of vowel in this array = "+vowelCount);



        //5 separate or count odd even number in this arrays.

//        int [] num={22,33,44,53,55,34,45,5,434,4565,345,345,65,45,6,456,54};
//        int EvenCount=0;
//        int OddCount=0;
//        for (int i:num){
//            if (i%2==0){
//                EvenCount+=1;
//            }
//            else
//                OddCount+=1;
//        }
//        System.out.println("length of array = "+num.length);
//        System.out.println("Number of Even in array = "+EvenCount);
//        System.out.println("Number of Odd in array = "+OddCount);


        //5 Encrypt the String with consecutive increasing ASCII values.
//        int num=0;
//        int num1=0;
//        String str="HELLO HOW ARE YOU";
//        for (int i=0;i<str.length();i++){
//            char ch=str.charAt(i);
//            System.out.print(num=ch);

//    }


    //

        }
    }
