package chp1.duckExample.duckTypes;

import chp1.duckExample.behavior.fly.FlyWithWings;
import chp1.duckExample.behavior.quack.Quack;

public class RedheadDuck extends Duck{
    public RedheadDuck(){
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }
    public void display(){
        System.out.println("Im a red head duck lol");
    }
    
}
