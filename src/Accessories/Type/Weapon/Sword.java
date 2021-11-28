package Accessories.Type.Weapon;

import Accessories.Type.ItemDamage;
import Accessories.Type.WeaponType;

public class Sword extends WeaponType implements ItemDamage {
    // Accessories variable add
    protected float Damage = 100;

    //method
    public Sword(String itemName){
        setItemName(itemName);
        super.WeaponType = "Sword";
        super.WeaponRange = "mid";
    }

    @Override
    public void itemInfo(){
        System.out.println(super.itemName + ": ");
        System.out.println("    " + "Damage: " + this.Damage + " Type: " + super.WeaponType);
        System.out.println("    " + "Range: " + super.WeaponRange);
    }

    @Override
    public float Damage() {
        return this.Damage;
    }

    @Override
    public String AttackRange() {
        return super.WeaponRange;
    }
}
