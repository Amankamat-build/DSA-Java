package loops;

//countinue statement is used for skipping a particular iteration or function in a loop
public class ContinueStatement {
    public static void main(String[]args){
        for(int i=1;i<=5;i++){
            if(i==3){
                continue;
            }
            System.out.println(i);
        }
    }
}
