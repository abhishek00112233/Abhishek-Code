import java.util.Arrays;
import java.util.Scanner;

public class Met04{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter size of array");
//        int size=3;
//        int[][] arr1=new int [3][size];
//        for (int i=0;i< arr1.length;i++) {
//            for (int j=0;j<arr1[i].length;j++){
//                System.out.println("Enter value of "+i+" in "+j+" = ");
//                arr1[i][j]=sc.nextInt();
//            }
//        }
//        for (int[] i:arr1){
//            for (int j:i){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

        System.out.println("Enter row of array : ");
        int row=sc.nextInt();
        System.out.println("Enter column of array : ");
        int col=sc.nextInt();
        int[][] arr1=new int[row][col];

    }
}
