package chp1.duckExample.duckTypes;

import chp1.duckExample.behavior.fly.FlyNoWay;
import chp1.duckExample.behavior.quack.MuteQuack;

public class DecoyDuck extends Duck {
    public DecoyDuck(){
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }
    public void display(){
        System.out.println("I'm made of Wood...dumb ducks!");
    }
    
}
