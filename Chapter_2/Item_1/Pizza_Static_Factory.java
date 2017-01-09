import java.util.ArrayList;

/**
 * Created by Trevor Jackson on 01-Jan-2017.
 */
public class Pizza_Static_Factory {

    private ArrayList toppings;

    public Pizza_Static_Factory() {
        toppings = new ArrayList<Pizza_Toppings>();
        toppings.add(Pizza_Toppings.TOMATO_SAUCE);
        toppings.add(Pizza_Toppings.MOZZARELLA);
    }

    public static Pizza_Static_Factory newCheesePizzaInstance() {
        Pizza_Static_Factory pizza = new Pizza_Static_Factory();
        pizza.toppings = new ArrayList<String>();
        pizza.toppings.add(Pizza_Toppings.PARMESAN);
        return pizza;
    }

    public static Pizza_Static_Factory newHawaiianPizzaInstance() {
        Pizza_Static_Factory pizza = new Pizza_Static_Factory();
        pizza.toppings = new ArrayList<String>();
        pizza.toppings.add(Pizza_Toppings.PINEAPPLE_CHUNKS);
        pizza.toppings.add(Pizza_Toppings.CRUMBLED_BACON);
        return pizza;
    }

    public static Pizza_Static_Factory newPepperoniPizzaInstance() {
        Pizza_Static_Factory pizza = new Pizza_Static_Factory();
        pizza.toppings = new ArrayList<String>();
        pizza.toppings.add(Pizza_Toppings.PEPPERONI);
        return pizza;
    }
}
