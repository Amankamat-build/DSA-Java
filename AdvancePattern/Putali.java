package AdvancePattern;

public class Putali {
    //for the butterfly pattern.

    public static void ButterFly(int n){
        //outerloop for rowss
        for(int i=1;i<=n;i++){
            //print star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //print space
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //print star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    //     for(int i=n;i>=n;i--){
    //            for(int j=1;j<=i;j++){
    //             System.out.print("*");
    //         }
    //         //print space
    //         for(int j=1;j<=2*(n-i);j++){
    //             System.out.print(" ");
    //         }
    //         //print star
    //         for(int j=1;j<=i;j++){
    //             System.out.print("*");
    //         }
    //     }
    //     System.out.println();
    // }
     // now we have to reverse or mirror the upper part of the pattern in so for that we
    // to run the loop in reverse.
    for(int i=n;i>=1;i--){
        //for printing star in the reverse direction
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        // for printing gap btwn the stars
        for(int j=1;j<=2*(n-i);j++){
            System.out.print(" ");
        }
        // for printing star that increses as the row increses
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    }
    public static void main(String[]args){
        ButterFly(4);
    }
    
}
