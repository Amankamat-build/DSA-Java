package ARRAYS;

public class StringLinearSearch {

    public static int StringSearch(String menu[],String fav){
        for(int i=0;i<menu.length;i++){

            if(menu[i].equals(fav)){ //this function is used for comparing to fav 
                return i;
            }
    }
    return -1;
}
    public static void main(String[]args){
        String menu[]={"Dosa","Puri","CholeBhature","Noodels","Samosa"};
        String fav= "burger";

        int favv= StringSearch(menu, fav);
        if(favv==-1){
            System.out.println("Dish not available");
        }
        else{
            System.out.println("Your dish is"+ " " +favv);
        }
    }
}
