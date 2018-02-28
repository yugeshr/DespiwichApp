package cafe.despiwich.com.despiwich;

/**
 * Created by Yugesh on 9/15/2017.
 */

public class Dish {
    private String mdishName;
    private String mdishDescription;
    private String mdishPrice;

    public Dish(String dishName, String dishDescription, String dishPrice) {
        mdishName = dishName;
        mdishDescription = dishDescription;
        mdishPrice = dishPrice;

    }

    public String getDishName() {

        return mdishName;
    }

    public  String getDishDescription(){

        return  mdishDescription;
    }

    public String getDishPrice() {
        return  mdishPrice;
    }
}
