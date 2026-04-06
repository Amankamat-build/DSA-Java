package functions.methods;

// function overload is depended upon the parameter not on the return type

public class FunctionOverload {

    // public static int sum(int a, int b){
    //     return a+b;
    // }

    // public  static int sum(int a, int b,int c){
    //     return a+b+c;
    // }
    public static int sum(int a, int b){
        return a+b;
    }

    public static float sum(float a, float b, float c){
        return a + b + c;
    }

    public static void main(String[]args){
    System.out.println(sum(12,8));
    System.out.println(sum(2.0f,12.33f,6.23f));
    }
}
