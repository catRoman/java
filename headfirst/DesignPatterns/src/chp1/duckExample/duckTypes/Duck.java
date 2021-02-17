package chp1.duckExample.duckTypes;
import chp1.duckExample.behavior.*;

public abstract class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;
    public Duck() { }

    public abstract void display();
    
    
    public void performFly(){
        flyBehavior.fly();
    }
    
    public void performQuack(){
        quackBehavior.quack();
    }
    public void swim(){
        System.out.println("All ducks float, even decoys!");
    }
    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }
    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }

    
}
