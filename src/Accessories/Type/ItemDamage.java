package Accessories.Type;

/**
 * Interface for damage item
 */
public interface ItemDamage {
    /**
     * for get this item damage value
     * @return this item damge value
     */
    public float Damage();

    /**
     * for get this item attack range
     * @return this item attack range
     */
    public String AttackRange();

    /**
     * for print this damage item info
     */
    public void itemInfo();
}
