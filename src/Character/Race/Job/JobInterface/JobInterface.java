package Character.Race.Job.JobInterface;

/**
 * Interface implement job class
 */
public interface JobInterface {
    /**
     * update character skill after set job
     */
    void JobSkillUpdate();

    /**
     * udate character stat after set job
     */
    void JobStatUpdate();

    /**
     * 
     * update equipment character is equip now
     * @param weaponName input weapon name
     * @param armorName input armor name
     */
    void setEquipItem(String weaponName, String armorName);

    /**
     * 
     * for check character can equip this equipment
     * @param weaponInputString input equipment name
     * @return true if equipable
     */
    boolean equipCheck(String weaponInputString);

}
