package strategy.Ducks;

import strategy.*;

public class MallardDuck extends Duck {

    public MallardDuck () {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("Display Mallard Duck");
    }

}
