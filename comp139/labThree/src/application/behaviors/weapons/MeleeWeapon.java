package application.behaviors.weapons;

import java.util.ArrayList;

import application.behaviors.weapons.weaponBehaviors.WeaponBehaviors;


public abstract class MeleeWeapon {
	protected int damage;
	protected String weaponType = this.getClass().getSimpleName();
	
	public static ArrayList<MeleeWeapon> weaponsAvailable = new ArrayList<>();
   
	public int getWeaponDamage(){
		return this.damage;
	}
	public String getWeaponType() {
        return this.weaponType;
    }

	@Override
    public String toString(){
        String info = "\tThe " + this.weaponType + " has a max damage of " + this.damage;
        return info;
    }
	public static MeleeWeapon getWeaponChoice(int choice){
		return weaponsAvailable.get(choice);
	}
}
