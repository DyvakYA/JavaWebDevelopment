package CoffeeMachine;

/**
 * Created by User on 17.03.2016.
 */
public class View {
    // Text's constants
    public final String FILTER_BY_COFFEE_TYPE = "Filter by coffee type";
    public final String FILTER_BY_WEIGHT = "Filter by weight";
    public final String FILTER_BY_PRICE = "Filter by price";
    public final String COMMON_LIST = "Common list";
    public final String SEPARATOR = "-------------------------";
    public final String TOTAL_PRICE_LIMIT = "You have price limit only: ";
    public final String TOTAL_WEIGHT_LIMIT = "You have weight limit only: ";
    public final String NOW_YOU_GOT = "Now you got: ";
    public final String UNSUPPORTED = "Unsupported type of coffee: ";
    public final String SORT_BY_PRICE_WEIGHT = "Sort by best value of price/weight  ";


    public void printMessage(String message){
        System.out.println(message);
    }
}
