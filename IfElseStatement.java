public class IfElseStatement {
    public static void main(String[] args) {
        int num=10;
       if(num>2) System.out.println("Num is greater then 2");

        int num1=11;
        if (num1%2==0) System.out.println("Num is div by 2");

        int checkPosetivenegative=-21;
        if (checkPosetivenegative>0) System.out.println("Num is +ve");
        else System.out.println("Num is -ve");

        int marks=90;
        if (marks>90)  System.out.println("A grade");
        else if(marks>80 && marks<=90) System.out.println("B grade");
        else if(marks >70 && marks <=80) System.out.println("C grade");
        else System.out.println("Fail");


        int cheeckDivisable=10;
        if (cheeckDivisable %2 ==0 && cheeckDivisable%5==0) System.out.println("Num is divisable by 2/5 ");
        else System.out.println("Num is not divisable by 2/5 ");

        int cheeckDivisable1=14;
        if (cheeckDivisable1 % 2==0 && cheeckDivisable1 %3==0) System.out.println("Num is divisable by 2/3");
        else System.out.println("Num is not Divisable by 2/3");

        int cheeckDivisable2=10;
        if (cheeckDivisable2 % 2==0 || cheeckDivisable2 %3==0) System.out.println("Num is divisable by 2/3");
        else System.out.println("Num is not Divisable by 2/3");

        int n=10;
        if(n>5 | n<2)System.out.println( n);

        int n1=15;
        if (n1 >2 & n1<55)  System.out.println(n1);

        char ch='A';
        if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='O'||ch=='I'||ch=='U')  System.out.println("Character is vowel");
        else System.out.println( "Character is consonent");
            
        
            
        
        
            
        
            
        
            
        


    }
}
