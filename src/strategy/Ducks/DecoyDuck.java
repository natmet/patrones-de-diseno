package strategy.Ducks;

import com.sun.org.apache.xalan.internal.xsltc.dom.AnyNodeCounter;
import strategy.Duck;
import strategy.FlyNoWay;
import strategy.QuackBehavior;
import strategy.Squeak;

public class DecoyDuck extends Duck {


    public DecoyDuck (){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("Display Decoy Duck");
    }


}
