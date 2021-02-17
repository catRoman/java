package chp1.duckExample.duckTypes;


import chp1.duckExample.behavior.fly.FlyNoWay;
import chp1.duckExample.behavior.quack.Squeak;

public class RubberDuck extends Duck {
    public RubberDuck(){
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new Squeak());
    }
    public void  display(){
        System.out.println("Im inanimate!");
    }
}
