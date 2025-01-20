public class Method3 {
//    public void myMethod1(){
//        System.out.println("1 to 100 line code  1");
//        myMethod3();
//        System.out.println();
//    }
//    public void myMethod2(){
//        System.out.println("1 to 100 line code 2");
//        myMethod3();
//        System.out.println();
//    }
//    protected void myMethod3(){
//        System.out.println("1 to 100 line code 3");
//    }

//    // parameter but no return type
//    public void addNum(int a){
////         a=12;
//        System.out.println(a+(+3));
//    }
//
//    // No parameter but return
//    public int ret(){
////        int a=12,b=23;
////        int c=a+b;
//        return 12+23;
//    }

//    // parameter and return type
//    public String checkOdd(int n){
//        String str=(n%2==0)?"even":"odd";
//        return str;

//}

        public int sum(int a,int b){
            int c=a+b;
            System.out.println(c);
            return c;
    }
    public int sub(int a,int b){
            int c=a-b;
        System.out.println(c);
        return c;
    }
    public int mul(int a,int b) {
        int c = a * b;
        System.out.println(c);
        return c;
    }
    public int div(int a,int b) {
        int c = a / b;
        System.out.println(c);
        return c;
    }
    void error(){
        System.out.println("you select incorrect option");
    }
    int k=10;
    public void fib(){
        int i=0;
        if (i<k){
            System.out.println(i);
            i++;
            fib();
        }

    }
        // Armstrong number

        public int armNum(int a){
        int count=0;
        while(a>0){
            int num=a%10;
            count++;
            a/=10;
        }
        return count;
        }

    }
