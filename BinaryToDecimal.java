//binary is the num or language for the computers.
//convert binary to decimal..
//formula to convert frm binary to decimal = dec +(lastDigit*2Pow)->power will be inceasing till the num

import java.util.Scanner;
public class BinaryToDecimal {

    public static void binToDec(int BinNum){
        //for converting binToDec we want 3 things decNum-where we store the num,
        //pow-> that will be increasing along with the 2.
        //lastDigit for doing the function.
       
        int dec=0;
        int pow=0;
        // we will use one corner case that shld be satisfied.
        while(BinNum>0){
        // for getting the last num from the num.
        int lastDigit= BinNum%10; // to get lastDIgit use n%10;
        dec =dec + (lastDigit*(int)Math.pow(2,pow));
        pow++;
        BinNum=BinNum/10;
        System.out.println("The decimal of" +dec);
        }
      
    }
   public static void main(String[]args){
    binToDec(101);
   }
    }

