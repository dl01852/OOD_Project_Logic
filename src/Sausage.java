package src;
/**
 * Created by Nicholas on 4/16/2016.
 */
public class Sausage extends PizzaDecorator
{
    Food pizza;


    public Sausage(Food pizzaToOrder)
    {
        this.pizza = pizzaToOrder;
       // pizza = new Pizza();
    }
    @Override
    public String getDescription()
    {
        return pizza.getDescription() + "with Sausage";
    }

    @Override
    public double cost()
    {
        return pizza.cost() + 0;
    }

    @Override
    public void order() {
        System.out.println("Added Sausage...");
    }
}
