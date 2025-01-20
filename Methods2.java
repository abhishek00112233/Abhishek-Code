public class Methods2 {
    static boolean oddEven(int a){

        return a%2==0;
    }
    static boolean primeCheck(int a){
        for (int i=2;i<a;i++){
             if (a%i==0)
              return false;
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(primeCheck(23));
        System.out.println("Number is Even: "+(oddEven(25)));
    }
}
