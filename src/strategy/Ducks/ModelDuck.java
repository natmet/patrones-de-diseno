package strategy.Ducks;

import strategy.*;

public class ModelDuck extends Duck {

    public ModelDuck () {
        flyBehavior = new FlyRocketPowered();
    }

    @Override
    public void display() {
        System.out.println("Display ModelDuck");
    }


}
