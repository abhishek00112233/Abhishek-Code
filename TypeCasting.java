import java.lang.reflect.Type;
import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // Integer num=10;
        // int myNum=num;


        // int num1=11;
        // float newNum=num1;

        // System.out.println(myNum);
        // System.out.println(newNum);
    //   int a;
    //   float b=13.4f;
    //   a=(int)b;

    //   System.out.println(a);

    //   int num=12;
    //   float myNum=num;
    //   System.out.println(myNum);

    //   System.out.println(Integer.MAX_VALUE);
    //   System.out.println(Integer.MIN_VALUE);

    //   int c=Integer.parseInt("6");
    //   System.out.println(c);
    // System.out.println("Enter num to Change askii vlaue");
    // int num=sc.nextInt();
    
    // System.out.println((char)num);

    // char ch='A';
    // int chValue=(int)ch;
    // System.out.println(chValue);
    // float a=2.2f;
    // String ab=String.valueOf(a);
    // System.out.println(ab ); 

    String num="12";
    int num1=Integer.parseInt(num);
    System.out.println(num1);


    String str="123.77777777777777";
    float fl=Float.parseFloat(str);
    System.out.println(fl);

    String str1="123.44444444444";
    double db=Double.parseDouble(str1);
    System.out.println(db);

    String str2="12";
    boolean bl=Boolean.parseBoolean(str2);
    System.out.println(bl);
    }
}
