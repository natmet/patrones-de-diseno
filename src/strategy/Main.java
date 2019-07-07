package strategy;

import strategy.Ducks.DecoyDuck;
import strategy.Ducks.MallardDuck;
import strategy.Ducks.ModelDuck;

public class Main {

    public static void main(String[] args) {


        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();



        DecoyDuck decoyDuck = new DecoyDuck();
        decoyDuck.performFly();
        decoyDuck.performQuack();


        //decoyDuck.setFlyBehavior(new FlyWithWings());
        //decoyDuck.performFly();

        ModelDuck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyWithWings());
        model.performFly();
    }
}
