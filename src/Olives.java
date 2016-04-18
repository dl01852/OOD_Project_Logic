/**
 * Created by Nicholas on 4/16/2016.
 */
public class Olives extends PizzaDecorator
{
    Pizza pizza;

    public Olives(Pizza pizzaToOrder)
    {
        this.pizza = pizzaToOrder;
    }
    @Override
    public String getDescription()
    {
        return pizza.getFoodName() + "with Olives";
    }

    @Override
    public double cost()
    {
        return pizza.cost() + 0;
    }
}
