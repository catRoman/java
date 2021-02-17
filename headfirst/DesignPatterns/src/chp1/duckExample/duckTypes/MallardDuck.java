package chp1.duckExample.duckTypes;


import chp1.duckExample.behavior.fly.FlyWithWings;
import chp1.duckExample.behavior.quack.Quack;

public class MallardDuck extends Duck {
    public MallardDuck(){
        setQuackBehavior(new Quack());
        setFlyBehavior(new FlyWithWings());
    }

    public void display(){
        System.out.println("I'm a real Mallard duck");
    }
    
}
