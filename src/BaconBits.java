package src;
/**
 * Created by Nicholas on 4/16/2016.
 */
public class BaconBits extends PizzaDecorator
{
    Pizza pizza;
    public BaconBits(Pizza pizzaToOrder)
    {
        this.pizza = pizzaToOrder;
    }
    @Override
    public String getDescription()
    {
        return pizza.getDescription() + "with bacon bits";
    }

    @Override
    public double cost()
    {
        return pizza.cost() + .50;
    }

    @Override
    public void order() {
        System.out.println("Added Bacon Bits...");
    }
}
