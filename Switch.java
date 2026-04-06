//Ternary operators are basically a operator which is having 3 operators

// import java.util.Scanner;
// public class TernaryOperator {
//     public static void main(String[]args){
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter your marks");
//         int Marks= sc.nextInt();
//         String Result= (Marks>=33)?"pass":"fail";
//         System.out.println(Result);
//     }
// }

// using switch case.

import java.util.Scanner;

public class Switch{
    public static void main(String[]args){
        int Number= 4;
        switch(Number){
            case 1: System.out.println("learning web dev in MERN");
            break;
            case 2: System.out.println("JAVA is my primary language");
            break;
            case 3: System.out.println("DSA is used for prblem solving");
            break;
            default: System.out.println("i didnt chosed tech tech choose me");

        }
    }
}