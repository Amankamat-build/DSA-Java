package loops;

import java.util.Scanner;
public class ExceptMulTen {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);

        // we will use do while loop for this multiple question
        //else we can use any loop..
        do {
            System.out.print("Enter Number:");
            int Num= sc.nextInt();

            if(Num%10==0) {
                continue; //continue is usually used for skipping the condition..
                
            }
            System.out.println("Num is not Mul of 10"+ " " +Num);
        }
        while(true);
      }

    }

