import java.util.Arrays;
import java.util.Scanner;

public class Demo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Welcome to toys Shop: ");
//
//        System.out.println("Enter SI No : ");
//        int sn=sc.nextInt();
//        int product=1;
//        if (sn==1){
//            System.out.println("Enter item no : ");
//            int itemNo1=sc.nextInt();
//             product=itemNo1*50;
//        }
//        else if (sn==2){
//            System.out.println("Enter item No : ");
//            int itemNo2= sc.nextInt();
//            product=itemNo2*100;
//        }
//        else System.out.println("invalid SI No ");
//        int totalAmount;
//        if (product>=5000){
//           int discount=product*10/100;
//            System.out.println("Discount Amount = "+discount);
//            System.out.println("TotalAmount you pay = "+(product-discount));
//
//        }
//         System.out.println("Total amount you pay = "+product);

//
//        int sum=0;
//        System.out.println("Enter value of num1 : ");
//        int num1=sc.nextInt();
//        System.out.println("Enter value of num2 : ");
//        int num2=sc.nextInt();
//
//        if (num2>num1){
//            if (num1>1 && num2<100){
//                for (int i=num1;i<=num2;i++){
//                    System.out.print(i+"+");
//                    sum+=i;
//                }
////                System.out.println();
//                System.out.println("="+sum);
//            }
//            else System.out.println("number is not follow the rule");
//        }
//     else System.out.println("num1 is less than num2 ");
//
//        int arr [][][]={
//                {
//                        {1,2,3},
//                        {2,1,4},
//                        {2,3,4}
//                },
//                {
//                        {2,3,4},
//                        {6,7,8},
//                        {9,8,7}
//                }
//        };
//        System.out.println(arr[1][2][2]);

        // digit frequency
//        int num=23432243;
//        int target=4;
//        int count=0;
//        int check=0;
//        while (num>0) {
//            int res = num % 10;
//            if (res==target){
//                count+=1;
//            }
//            num/=10;
//        }
//        System.out.println(count);


        // Number System
//        int num=1172;
//        int power=8;
//        int store=0;
//        int p=1;
//        while(num>0){
//            int val=num%10;
//            store+=val*p;
//            p*=power;
//            num/=10;
//        }
//        System.out.println(store);

//        // Binary to Decimal
//        int num=1172;
//        int store=0;
//        int power=1;
//        while(num>0){
//            int num1=num%10;
//            store+=num1*power;
//            num/=10;
//            power*=8;
//        }
//        System.out.println(store);


//      int n=sc.nextInt();
//      int [] arr=new int [n];
//      for (int i =0;i<arr.length;i++){
//          System.out.println("Enter value of "+i+" = ");
//          arr[i]=sc.nextInt();
//      }



//        int [] arr={2,3,4,5999,6,7,82,22,222};
//        int max=arr[0];
//        int min=arr[0];
//        for (int i=1;i<arr.length;i++){
//            if (arr[i]>max){
//                max=arr[i];
//            }
//        }
//        System.out.println(max);
//
//        int [] arr={3,-98,4,5,0,6,7,8,322,44,56,-1};
//        int min=arr[0];
//        for (int i=1;i<arr.length;i++){
//            if (arr[i]<min){
//                min=arr[i];
//            }
//        }
//        System.out.println(min);

//        int num=1534236469;
//        long rev=0;
//        while(num!=0){
//            long num1=num%10;
//            rev=rev*10+num1;
//            num/=10;
//        }
//        System.out.println(rev);


        // reverse word
//        String store="";
//        String str="my name is abhishek";
//        String[] rev=str.split(" ");
//        System.out.println(rev.length);
//        for (int i=rev.length-1;i>=0;i--){
//        store+=rev[i]+" ";
//        }
//        System.out.println(store);


        // positive  number average find
//        int[] arr={-3,-2,0,-7,25,12,-11};
//        float count=0;
//        int x=0;
//        for (int i=0;i<arr.length;i++){
//            if (arr[i]>0){
//                count+=arr[i];
//                x++;
//            }
//        }
//            System.out.println("Avg = "+count/x);

        // substring question
//        int count=0;
//        String str="abcdef";
//        for (int i=0;i<str.length();i++){
//            for (int j=i+1;j<=str.length();j++){
////                System.out.println(str.substring(i,j));
//            String[] str=
//                count++;
//            }
//        }
//        System.out.println(count);

        // String reverse word
//        String str="hello every one";
//        String[] str1=str.split(" ");
//        String add="";
//        for (int i=0;i<str1.length;i++){
//            char ch=str1.
//            add=ch+add;
//            System.out.print(add);
//        }
//        System.out.println(" ");

//        int[] arr={1,2,3,4,6,7};
//        int max=arr[0];
//        int n=0;
//        for (int i=0;i<arr.length;i++){
//            if (arr[i]>max);
//            max=arr[i];
//        }
//        for (int i=0;i<arr.length;i++){
//            if (arr[i]==max){
//                n++;
//            }
//            else max++;
//
//        }
//        System.out.println(n);

        System.out.println("Take a input");
        int n=sc.nextInt();
//        do {
//            int num=n/2;
//            System.out.println(num);
//        }while (n>0);

        int count=0;
            int num=0;
        for (int i=n;i>0;i/=2){
            System.out.println(i);
            count++;
            if (i%2!=0){
                num=num*10+i;
//                System.out.println(i);
            }

            if (count>=5){
                break;}
//            System.out.println(i);
        }
        System.out.println(num+" ");

    }
}