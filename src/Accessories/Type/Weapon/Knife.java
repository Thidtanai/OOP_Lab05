package Accessories.Type.Weapon;

import Accessories.Type.ItemDamage;
import Accessories.Type.WeaponType;

public class Knife extends WeaponType implements ItemDamage{
    //Accessories variable add
    protected float Damage = 50; 

    //method
    public Knife(String itemName){
        setItemName(itemName);
        super.WeaponType = "Knife";
        super.WeaponRange = "short";
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
