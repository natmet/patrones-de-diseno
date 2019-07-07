package strategy;

public abstract class Duck {

   public FlyBehavior flyBehavior;
   public QuackBehavior quackBehavior;

 public abstract void display();

 public void swim(){
     System.out.println("Swim");
 }

 public void performQuack(){
     quackBehavior.quack();
 }

 public void performFly(){
    flyBehavior.fly();
 }

 public void  setFlyBehavior(FlyBehavior fb){
    flyBehavior = fb;
 }

 public void setQuackBehaviod(QuackBehavior qb){
     quackBehavior = qb;

 }
}
