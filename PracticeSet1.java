import java.util.Scanner;
public class PracticeSet1 {
  //Check number is posetive negative or zero
static int checkPosetivenegative(int a){
  if (a>0) {
    System.out.println("Number is posetive");
  }
  else if (a<0) {
    System.out.println("Number is negative");
  }
  else System.out.println("Zero");
  return a;
}
//check eligable or not eligable for vote
static int checkAge(int a){
  if (a>=18) System.out.println("Eligable to give vote");
  else System.out.println("Not eligable to give vote");
    return a;
}


// check number is Odd or even
static int oddEven(int a){
  if (a%2==0) {
    System.out.println("Even");
  }
  else System.out.println("Odd");
  return a;
}

//  cehck year is leap or not 
static int yearCheck(int year){
  if (year%4==0) {System.out.println(year+" leap Year");
  }
  else System.out.println(year+" Not leap year");
  return year;
}

// Student marks based Grade
static int marksToGrade(int marks){
  if (marks >90) System.out.println("A");
  else if (marks >80 && marks <=90) System.out.println("B");
  else if(marks >70 && marks <=80) System.out.println("C");
  else if( marks >60 && marks<=70) System.out.println("D");
  else System.out.println("Fail");
  return marks;
}

// check number is divisable by 5 and 11
static int cheeckDivisable(int num){
  if (num%5==0 && num%11==0) {
    System.out.println("Number is divisable by 5 and 11");
  }
  else System.out.println("Not  divisable by 5 and 11");
  return num;
}
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Number : ");
      int num=sc.nextInt();
      checkPosetivenegative(num);
      
      checkAge(num);

      oddEven(num);
      cheeckDivisable(num);
      marksToGrade(num);

      // System.out.println("check number is odd/even");
      // int num2=sc.nextInt();
      // oddEven(num2);


      }
        
      }

    
  
    

