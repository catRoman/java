package ca.skritches.games.components;

import ca.skritches.games.skritch.Component;

public class SpriteRenderer extends Component{
    private boolean firstTime = false;

    public SpriteRenderer(){

    }

    @Override
    public void start(){
        System.out.println("I am starting");
    }

    @Override
    public void update(float dt){
        if(!firstTime){
            System.out.println("I am updating");
            firstTime = true;
        }
    }
}
