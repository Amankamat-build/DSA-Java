package loops;


//when we have to do the reverse or have to get the last digit use n%10->will give the last digit//
//to remove the digit from the last use n/10;

public class ReverseNum {
    public static void main(String[]reverse){
        int num=7654322;

        //reverse of the num;

        while(num>0){

            // have to get last digit from the num ;

            int lastNum= num%10; // by using this we will get the last digit..

            System.out.print(lastNum+ " ");

            //now we have to remove digit from the num
            
            num=num/10;
        }
        System.out.println();
            
        
    }
}
