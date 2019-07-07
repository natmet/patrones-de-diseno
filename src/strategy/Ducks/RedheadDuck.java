package strategy.Ducks;

import strategy.*;

public class RedheadDuck extends Duck {

    public RedheadDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("Display Redhead Duck");
    }


}
