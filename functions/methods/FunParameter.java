package functions.methods;


import java.util.Scanner;

public class FunParameter {

    //making function for sum
    //in braceses we have to give parameters that we gnna use in the function.
    public static int GetSum(int num1, int num2){
        int sum= num1 + num2;
        return sum;
    }
    public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    int a= sc.nextInt(); 
    int b= sc.nextInt();

   int sum= GetSum(a,b); // function calling. 
   System.out.println("Sum is" +sum);
    }

}
