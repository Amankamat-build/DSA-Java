import java.util.Scanner;

//formula of circle is pi  *r*r

public class AreaofCircle {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the radius");
        float r= sc.nextFloat();

        // now we have to apply formula  area ofcircle 
        double A= Math.PI*r*r;
        System.out.println("Area of the circle"+" " +A);
    }
}
