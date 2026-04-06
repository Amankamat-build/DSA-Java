package starPattern;

//Print character pattern..in right half-pyramid format
//outer loop from 1 to n;
//inner loop from 1 to line;
//print char A to I in spicified pattern.

import java.util.*;

class CharacterPattern{
    public static void main(String[]args){
    int n=4;
    char CH='A';

    // have to print character in increasing order.

    for(int line=1;line<=n;line++){
        for(int chars=1;chars<=line;chars++){
            System.out.print(CH);
            CH++ ; // for incresing the value of CH
        }
        System.out.println(" ");
    }
    }
}
