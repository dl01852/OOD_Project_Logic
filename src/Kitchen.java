package src;

/**
 * Created by jlarkin9 on 4/20/16.
 */

// Kitchen holds all food items and is able to call prepare messages for each

public class Kitchen {
    private Food burger;
    private Food pizza;
    private Food bacon;
    private Food baconBits;
    private Food cheese;
    private Food lettuce;
    private Food mushrooms;
    private Food olives;
    private Food onions;
    private Food pepperoni;
    private Food sausage;
    private Food tomatoes;


    public Kitchen() {

        burger = new Burger();
        pizza = new Pizza();
        bacon = new Bacon(burger);
        baconBits = new BaconBits(pizza);
        cheese = new Cheese(burger);
        lettuce = new Lettuce(burger);
        mushrooms = new Mushrooms(pizza);
        olives = new Olives(pizza);
        onions = new Onions(burger);
        pepperoni = new Pepperoni(pizza);
        sausage = new Sausage(pizza);
        tomatoes = new Tomatoes(burger);
    }

    public void prepareFood(Food food) {
        food.order();
    }






}
