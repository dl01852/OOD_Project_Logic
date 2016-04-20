package src;
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
        return pizza.getDescription() + "with Olives";
    }

    @Override
    public double cost()
    {
        return pizza.cost() + 0;
    }

    @Override
    public void order() {
        System.out.println("Added Olives...");
    }
}
