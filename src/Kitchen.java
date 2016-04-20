package src;

/**
 * Created by jlarkin9 on 4/20/16.
 */
public class Kitchen {
    private Burger burger;
    private Pizza pizza;
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

    public void prepareBurger() {
        burger.order();
    }

    public void preparePizza() {pizza.order();}
    public void prepareBacon() {
        bacon.order();
    }
    public void prepareBaconBits() {
        baconBits.order();
    }
    public void prepareCheese() {
        cheese.order();
    }
    public void prepareLettuce() {
        lettuce.order();
    }
    public void prepareMushrooms() {
        mushrooms.order();
    }
    public void prepareOlives() {
        olives.order();
    }
    public void prepareOnions() {
        olives.order();
    }
    public void preparePepperoni() {
        pepperoni.order();
    }
    public void prepareSausage() {
        sausage.order();
    }
    public void prepareTomatoes() {
        tomatoes.order();
    }




}
