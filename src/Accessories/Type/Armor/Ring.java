package Accessories.Type.Armor;

import Accessories.Type.ArmorType;
import Accessories.Type.ItemDefense;

public class Ring extends ArmorType implements ItemDefense {
    protected float Defense = 10;

    /**
     * for create item
     * @param itemName input item name
     */
    public Ring(String itemName){
        setItemName(itemName);
        super.ArmorType = "Ring";
    }

    @Override
    public float Defense() {
        return Defense;
    }

    @Override
    public void itemInfo() {
        System.out.println(super.itemName + ": ");
        System.out.println("    " + "Defense: " + this.Defense + " Type: " + this.ArmorType);
    }
    
}
