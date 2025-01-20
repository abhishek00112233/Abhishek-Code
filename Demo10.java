import java.util.Arrays;
import java.util.Scanner;

public class Demo10 {
    static int productofDigit(int a){
        int store=1;
        while (a>0){
            int n=a%10;
            store*=n;
            a/=10;
        }
        return store;
    }
    static int sumofDigit(int a){
        int store=0;
        while (a>0){
            int n=a%10;
            store+=n;
            a/=10;
        }
        return store;
    }
    public static boolean isPerfect(int[] arr) {
        // code here
        int[] st=new int[arr.length];
        int k=0;
        for(int i=arr.length-1;i>=0;i--){
            st[k]=arr[i];
            k++;
        }
        if(arr==st){
            return true;
        }
        else{
            return false;}
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//        int n=sc.nextInt();
//        int count=0;
//        for (int i=1;i<=n/2;i++){
//            if (n%i==0){
//                count++;
//                System.out.print(i+" ");
//            }
//        }
//            System.out.println("\n total factor of "+n+" = "+count);


//        int n=sc.nextInt();
//        int count=0;
//        for (int i=1;i*i<=n;i++){
//            if (n%i==0){
//                if (i!=n/i){
//                    count+=2;
//                }
//                else{
//                    count+=1;
//                }
//            }
//        }
//        System.out.println(count);

//        int i,j;
//        int first=10;
//        int last=30;
//        for ( i=first;i<=last;i++){
//            for (j=2;j<i;j++){
//                if (i%j==0){
//                    break;
//                }
//            }
//            System.out.print(j+" ");
//        }

//        System.out.println("Enter value of a : ");
//        int a=sc.nextInt();
//        int count=0;
//        for (int i=1;i<=a;i++){
//            count+=i;
//        }
//        System.out.println(count);



        // Natural number sum
//        System.out.println("Enter valur of a : ");
//        int a=sc.nextInt();
//        int res=a*(a)/2;
//        System.out.println(res);


//        System.out.println(Math.floor(12.99));
//        System.out.println(Math.ceil(12.08));
//        System.out.println(Math.sqrt(29));



//        System.out.println("Enter number : ");
//        int a=sc.nextInt();
//        var res=Math.sqrt(a);
//        System.out.println(Math.floor(res));


//        System.out.println("Enter value of a : ");
//        int a=sc.nextInt();
//        System.out.println(productofDigit(a)-(sumofDigit(a)));

        int[] arr={1,2,3,4,2,5,2};
        int target=2;
        int n=0;
        int[] store=new int[arr.length];
        int k=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==target){
                store[k]=i;
                k++;
            }
        }
        int[] st=new int[k];

        for (int i=0;i<k;i++){
            st[n]=i;
            n++;
        }

//        System.out.println(Arrays.toString(store));
        System.out.println(Arrays.toString(st));




//        int[] arr={1,2,3,2,1};
//        int [] arr1={1,2,3,2,1};
//        System.out.println(arr==arr1);

//        int[]arr={10,23,44};
//        for (int i=0;i<arr.length-1;i++){
//            if (arr[i]>=arr[i+1]){
//                break;
//            }
//            System.out.println("false");
//        }
//        System.out.println("true");


    }
    }

