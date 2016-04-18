/**
 * Created by Nicholas on 4/16/2016.
 */
public class Mushrooms extends PizzaDecorator
{
    Pizza pizza;

    public Mushrooms(Pizza pizzaToOrder)
    {
        this.pizza = pizzaToOrder;
    }
    @Override
    public String getDescription()
    {
        return pizza.getFoodName() + "with mushrooms";
    }

    @Override
    public double cost()
    {
        return pizza.cost() + 0;
    }
}
