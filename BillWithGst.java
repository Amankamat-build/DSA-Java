//enter 3 items from the user in float.. print total bill with 18% gst...

import java.util.Scanner;

public class BillWithGst {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the price of pencil");
        float pencil= sc.nextFloat();
        System.out.println("Enter the price of Eraser");
        float eraser= sc.nextFloat();
        System.out.println("Enter the price of pen");
        float pen=sc.nextFloat();

        // print the bill including 18% gst..

        double TotalAmount= pencil+eraser+pen ;
        
        // to get bill with gst add totalAmount+(gst/100). 
        //like gst is 18% means it will be 18% of the total amount..
        double GST= TotalAmount * 0.18;
        double FinalBill= TotalAmount + GST;
        

        
        System.out.println("Bill of the product:"+ ""+FinalBill);

    }
}
