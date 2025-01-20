public class Person {
    String name;
    int age;
    Person(String name,int age){
        this.name=name;
        this.age=age;
//        System.out.println("hello ");

    }

    public static void main(String[] args) {
//        Person ps=new Person("");
        Person ps=new Person("abhi",21);
        Person ps2=new Person("aman",22);
        System.out.println();
//        ps.name="abhi";
//        ps.age=20;
//        ps2.name="golu";
//        ps2.age=21;

        System.out.println(ps2.name);
        System.out.println(ps2.age);
        System.out.println(ps.name);
        System.out.println(ps.age);
//        System.out.println();
//        System.out.println();
//        System.out.println();
//        System.out.println();

//        System.out.println(ps.age);
//        System.out.println(ps.name);

    }

}
