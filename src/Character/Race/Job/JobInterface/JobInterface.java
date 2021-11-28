package Character.Race.Job.JobInterface;

public interface JobInterface {
    void JobSkillUpdate();

    void JobStatUpdate();

    void setEquipItem(String weaponName, String armorName);

    boolean equipCheck(String weaponInputString);

}
