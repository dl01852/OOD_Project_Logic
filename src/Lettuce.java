/**
 * Created by david-lewis on 3/28/2016.
 *
 * Nick Things to do:
 * Create a Burger object. This will be the burger that's going to be decorated.
 * Have the burger object get passed in from the constructor.
 */

public class Lettuce extends BurgerDecorator {


    @Override
    public String getDescription() {

        return null;
        // get the description from the burger object and then add on the description from this class
        // soo for this particular class, the description you'd add is  ' with lettuce'
        // then return that(don't return null).
    }

    @Override
    public double cost() {

        return 0;
        // get the cost from the burger object and then add on the cost for lettuce(if there is a cost) and return that value.
        // (don't return 0)
    }
}
