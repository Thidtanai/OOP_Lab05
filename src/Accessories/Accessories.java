package Accessories;

public class Accessories {
    protected String itemName;

    /**
     * for set name to this item
     * @param name input this item name
     */
    public void setItemName(String name){
        this.itemName = name;
    }

    /**
     * for get this item name
     * @return this item name
     */
    public String getItemName(){
        return this.itemName;
    }
}
