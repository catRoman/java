package chp1.duckExample;

import chp1.duckExample.behavior.fly.FlyRocketPowered;
import chp1.duckExample.duckTypes.*;

public class MiniDuckSimulator {
    public static void main(String[] args){
        Duck mallard = new MallardDuck();
        System.out.println(mallard.getClass().getSimpleName());
        mallard.performQuack();
        mallard.performFly();

        System.out.println("---------------------");

        Duck model = new ModelDuck();
        System.out.println(model.getClass().getSimpleName());
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

        System.out.println("----------------------");
        Duck  redHead = new RedheadDuck();
        System.out.println(redHead.getClass().getSimpleName());
        redHead.performFly();

        
        System.out.println("----------------------");
        Duck decoy = new DecoyDuck();
        System.out.println(decoy.getClass().getSimpleName());
        decoy.performFly();
    }
}
