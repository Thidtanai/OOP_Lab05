package Accessories.Type.Armor;

import Accessories.Type.ArmorType;
import Accessories.Type.ItemDefense;

public class Shield extends ArmorType implements ItemDefense{
    protected float Defense = 60;
    
    public Shield(String itemName){
        setItemName(itemName);
        super.ArmorType = "Shield";
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
