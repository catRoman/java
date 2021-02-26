package weapons;


public abstract class Weapon{
    int damage;
    int range;
    Double comboChance;
    String weaponName;

//setters
public Weapon(int damage, int range, Double comboChance){
    this.damage = damage;
    this.range = range;
    this.comboChance = comboChance;
}
public void setWeaponName(String weaponName) {
    this.weaponName = weaponName;
}
public void setComboChance(Double comboChance) {
    this.comboChance = comboChance;
}
public void setDamage(int damage) {
    this.damage = damage;
}
public void setRange(int range) {
    this.range = range;
}
//getters
public Double getComboChance() {
    return comboChance;
}
public String getWeaponName() {
    return weaponName;
}
public int getDamage() {
    return damage;
}
public int getRange() {
    return range;
}
}