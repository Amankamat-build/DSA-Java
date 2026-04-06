import java.util.*;

public class MultiplicationNum {
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter num to get table");
    int num =sc.nextInt();

    int mul;

    for(int i=1;i<=10;i++){
        mul=num*i;
        System.out.println("Multiple of:"+num+ "X" + i+ " "+mul);
    }
    }
}
