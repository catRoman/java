package application.gameObjects;

public interface AttackBehavior {
    
    public int preform();
    public float getHitChance();
    public void setDamage(int damage);
    public String getPrintAtttack();

}
