package Character.Race.Job.DwarfJob;

import Character.Race.Dwarf;
import Character.Race.Job.JobInterface.Buff;
import Character.Race.Job.JobInterface.JobInterface;

public class Dwarf_Swordman extends Dwarf implements JobInterface, Buff{
     /**
     * Swordman can use
     *    -buff skill
     */

    //Character variable add
    protected String Job = "Swordman";

    //Jobvariable
    private float SwordmanHp = 100;
    private float SwordmanMp = 10;
    private float SwordmanAtk = 20;
    private float SwordmanDef = 30;
    private float SwordmanSpd = 5;

    private String[] JobSkill = new String[0];
    private int JobSkillCount;

    //method
    /**
     * for create character with race dwarf job swordman
     * @param name input character name
     * @param level input charcter level
     */
    public Dwarf_Swordman(String name, int level){
        setStart(name, level);
        LevelUp(level);
        RaceStatUpdate();
        JobStatUpdate();
        setEquipItem("null", "null");
        BuffSkill();
        JobSkillUpdate();

        super.currHp = super.Hp;
        super.currMana = super.Mp;
    }

    @Override
    public void BuffSkill() {
        int oldSkillCount = this.JobSkill.length;
        int buffCount = 0;

        this.JobSkillCount += buff.length;
        this.JobSkill = new String[this.JobSkillCount];

        for(int i=oldSkillCount; i<this.JobSkillCount; i++){
            this.JobSkill[i] = buff[buffCount];
            buffCount++;
        }
    }
    @Override
    public void JobSkillUpdate() {
        int oldSkillCount = super.SkillCount;
        int JobSkillCount = 0;

        super.SkillCount += JobSkill.length;
        super.skill = new String[SkillCount];

        for(int i=oldSkillCount; i<super.SkillCount; i++){
            super.skill[i] = JobSkill[JobSkillCount];
            JobSkillCount++;
        }
        
    }
    @Override
    public void JobStatUpdate() {
        variantStatUpdate(SwordmanHp, SwordmanMp, SwordmanAtk, SwordmanDef, SwordmanSpd);
        setJob(this.Job);

        super.Equipable = new String[2];
        super.Equipable[0] = "Sword";
        super.Equipable[1] = "Shield";
        
    }
    @Override
    public boolean equipCheck(String accessoriesInputString) {
        //check is equipable
        for(int i=0; i<super.Equipable.length; i++){
            if(accessoriesInputString == Equipable[i])return true;
        }
        return false;
    }
    @Override
    public void setEquipItem(String weaponName, String armorName) {
        super.Equipting = new String[2];
        super.Equipting[0] = weaponName;
        super.Equipting[1] = armorName;
        
    }
    //change job skill to Human and Dwarf
}
