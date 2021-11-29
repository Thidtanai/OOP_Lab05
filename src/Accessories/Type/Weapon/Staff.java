package Accessories.Type.Weapon;

import Accessories.Type.ItemDamage;
import Accessories.Type.WeaponType;

public class Staff extends WeaponType implements ItemDamage {
    // Accessories variable add
    protected float Damage = 5;

    //method
    /**
     * for create item
     * @param itemName input item name
     */
    public Staff(String itemName){
        setItemName(itemName);
        super.WeaponType = "Staff";
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
