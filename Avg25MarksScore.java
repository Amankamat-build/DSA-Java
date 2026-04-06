//Avg of 25 Exam marks score..
//so in this questoin we will initalize score as 25.
//and make a variable sum and initalize it with 0.
//then run a loop that will run till score.
//all the scores will be added to the summ.
//so we then apply avg formula ie total num/25..

import java.util.Scanner;

public class Avg25MarksScore{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);

        int score=25;
        int Sum=0 ; // whenever we have to find total or perfrm any operation we will create a variable with 0 and later add the value to it.

        for(int i=0;i<score;i++){
            System.out.println("Enter the marks");
            int marks= sc.nextInt();
            Sum+=marks;
        }
        int avg= Sum/score;
        System.out.println("Avg of the 25marks score is:"+ " " +avg);
    }
}