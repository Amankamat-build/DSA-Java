//Keep entring numbers till user enters mul of 10...
package loops;
import java.util.Scanner;
public class MulOfTen{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        do{
            System.out.println("Enter the Num");
            int Num=sc.nextInt();
            if(Num%10==0){
                System.out.println("Num is multiple of Num"+ " " +Num);
                break;
            } 
            System.out.println("Num is not multiple of "+ " "+Num);
        } 
        while(true);
    }
}