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
        return pizza.getFoodName() + "with bacon bits";
    }

    @Override
    public double cost()
    {
        return pizza.cost() + .50;
    }
}
