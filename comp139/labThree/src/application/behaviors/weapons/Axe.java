package application.behaviors.weapons;



final class Axe extends MeleeWeapon {
    
    public Axe() {
        weaponsAvailable.add(this);
        this.damage = 75;
    }

}
