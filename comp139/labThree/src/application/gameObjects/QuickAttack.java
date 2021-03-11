package application.gameObjects;


public class QuickAttack implements AttackBehavior {
    
    private int damage;
    private float hitChance = 0.9f;
    private String printAttack = "Quick Attack!";
    
    public int preform(){
        return this.damage;
    }
    public float getHitChance(){
        return this.hitChance;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public String getPrintAtttack(){
        return this.printAttack;
    }
}
