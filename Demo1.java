import java.util.Scanner;

public class Demo1 {
    static int fibo(int n){
        int a,b,c;
        int count=0;
        a=0;b=1;c=a+b;
        for (int i=2;i<n;i++){
            c=a+b;
            count+=c;
            System.out.println(" "+c);
            a=b;
            b=c;
        }
        System.out.println(count);
        return c;
    }
    static int maximumProduct(int[] nums) {
        int max=1;
        for(int i:nums){
            max*=i;
        }
        System.out.print(max);

        return max;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=100;
        int [] arr={12,345,2,6,7896};
        int count=0;
        int num2=0;
        while(num>0){
            for (int i:arr){
                int num1=i%10;
                count=count*10+num1;
                i/=10;

            }


        }
//        System.out.println(fibo(3));
//        int [] arr={-100,-98,-1,2,3,4};
//        System.out.println(maximumProduct(arr));


//        int num=sc.nextInt();
//        int count=0;
//        for (int i=1;i<=num;i++){
//            if (num%i==0){
//
//            }
//            System.out.println("yes");
//            int num5=Integer.p
//        }
//        String str1="11";
//        String str2="22";
//        int store=0;
//        int num1=Integer.parseInt(str1);
//        int num2=Integer.parseInt(str2);
//        store =num1+num2;
////        System.out.println(store);
//        String str3=String.valueOf(store);
//        System.out.println(str3);



//        int num=sc.nextInt();
//        int count=0;
//        int num2=0;
//        for (int i=1;i<num;i++) {
//            if (num % i == 0)
//                count += i;
//            num2 = count;
//        }
//        System.out.println(count);
//        if (num==num2)
//            System.out.println("yes");
//        else
//            System.out.println("no");
    }
}
