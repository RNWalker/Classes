import java.util.ArrayList;

public class ShoppingTrolley {

    ArrayList<String> shopping_trolley = new ArrayList<>();

    public String addToTrolley (String item){
        shopping_trolley.add(item);
        return item;
    }

    public int countItems (){
        return shopping_trolley.size();
    }

    public boolean checkItem (String check){
        return shopping_trolley.contains(check);
    }


}
