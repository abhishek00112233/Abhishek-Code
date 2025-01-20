import java.util.Scanner;

class Demo5{
    static int factorial(int n){
        int fact=1;
        for (int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(factorial(sc.nextInt()));
//        System.out.println("Enter user name : ");
//        String user="kyabhishek0@gmail.com";
//        String password="Golu1234@";
//        int maxLimit=3;
//        int max=0;
//        while (max<maxLimit){
//            if (sc.nextLine().equals(user)){
//                System.out.println("Enter you password");
//                if (sc.nextLine().equals(password)){
//                    System.out.println("Welcome to your account :");
//                }
//                else
//                    System.out.println("Wrong password");
//                max=0;
//
//            }
//            else{
//                System.out.println("login failed ");
//                max+=1;
//
//            }
//        }
//            System.out.println("limit expire");


        String str1=sc.next();
        String str2=sc.next();
//        String str3=str1.contains('a');
    }
}