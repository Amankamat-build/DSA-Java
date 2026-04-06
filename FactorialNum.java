
import java.util.Scanner;
public class FactorialNum {
    public static void main(String[]factorial){
    Scanner sc= new Scanner(System.in);

    int num;

    int fact=1;

    System.out.println("Enter positive number");
    num=sc.nextInt();

    for(int i=1;i<=num;i++){
        fact*=i;
    }
    System.out.println("Factorial of the num is"+ " "+fact);

    }

}
