package ConditionalStatement;

import java.util.concurrent.ScheduledExecutorService;

public class JumpStatement {
    public static void main(String[] args) {
//        String Grocery[]={"apple","Banana","soap","oil","flower","shampoo","mobile fault","brush","colgate"};
//        for (String str:Grocery) {
//             System.out.println(str);
//            if (str.contains("fault"))
//             break;
//        }
//        System.out.println("default item this item is not grocery item");





        // while processing a list of employees skip those on leave and continue processing the rest

//        String employee[]={"aman","suraj","ajit leave","abhishek","sonu leave","ved","owais leave","karan","chhotu"};
//        for (int i=0;i<employee.length;i++){
//            if (employee[i].contains("leave")){
//                System.out.println("why are you leave "+employee[i]);
//               continue;}
//            System.out.println("come to meeting 2 pm "+employee[i]);
//        }


// in a delivery system if a specific package id is found in a warehouse stop searching across all shelves

        String item[]={"phone","tShirt","Shirt","pant","laptop","bag","jacket","hoodie","vest"};
        check: for (String i:item){
            if (i=="laptop"){
            System.out.println(i);
                break check;
            }

        }


    }
}
