package chp1.duckExample.behavior.quack;

import chp1.duckExample.behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    public void quack( ) {
        System.out.println("<< Silence >>");
    }
}
