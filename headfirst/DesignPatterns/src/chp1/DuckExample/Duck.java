package chp1.DuckExample;

public abstract class Duck {
    FlyBehaviour flyBehavior;
    QuackBehavoir quackBehaviour;
    public Duck() { }

    public abstract void Display;
    
    public void performFly(){
        flyBehaviour.fly();
    }

    public void preformQuack(){
        quackBehavoir();
    }
    public void swim(){
        System.out.println("All ducks float, even decoys!");
    }

    
}
