package chp1.duckExample.duckTypes;

import chp1.duckExample.behavior.fly.*;
import chp1.duckExample.behavior.quack.*;

public class ModelDuck extends Duck{
    public ModelDuck(){
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new Quack());
        
    }
    public void display() {
        System.out.println("I'm a model duck");
    }

}

