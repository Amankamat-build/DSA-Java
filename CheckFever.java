//Check fever or not
//if above 100 fever else no fever..

import java.util.Scanner;

public class CheckFever {
    public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter your temperature");
    int Fever=sc.nextInt();
    if(Fever>=100){
        System.out.println("Patient have fever:"+ " " +Fever);
    }
    else{
        System.out.println("Patient is not having fever:"+ " " +Fever);
    }
    }
}
