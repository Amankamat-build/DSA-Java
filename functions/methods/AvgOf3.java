package functions.methods;

import java.util.Scanner;

public class AvgOf3 {

    public static void GetAvg(float a, float b,float c){
        float sum= a+b+c;
        float avg=sum/3;
        System.out.println(avg);
    }
    public static void main(String[]args){
    GetAvg(5f,8f,9f);
    }
}
