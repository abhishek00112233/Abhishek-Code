package ConditionalStatement;

public class BreakContinue {
    static int sumTwoNumber(int a,int b){
        int c=a+b;
        System.out.println("sum = "+c);
        return c;
    }
    static int sum(){
        int a,b,c;
        a=33;
        b=24;
        c=a+b;
        return  c;
    }
    public static void main(String[] args) {
        int num=5;
        for (int i=0;i<num;i++){
            if (i==2){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("loop ke bahar");
        sumTwoNumber(22,44);
        System.out.println(sumTwoNumber(2,3));
        sum();
        int sum=sum();
        System.out.println(sum);
    }
}
