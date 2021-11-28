package Character.Race.Job.DwarfJob;

import Character.Race.Dwarf;
import Character.Race.Job.JobInterface.JobInterface;
import Character.Race.Job.JobInterface.Steal;

public class Dwarf_Thief extends Dwarf implements JobInterface, Steal{
     /**
     * Thief can use
     *    -steal skill
     */

    //Character variable add
    protected String Job = "Thief";

    //Jobvariable
    private float ThiefHp = 40;
    private float ThiefMp = 10;
    private float ThiefAtk = 10;
    private float ThiefDef = 10;
    private float ThiefSpd = 30;

    private String[] JobSkill = new String[0];
    private int JobSkillCount;

    //method
    public Dwarf_Thief(String name, int level){
        setStart(name, level);
        LevelUp(level);
        RaceStatUpdate();
        JobStatUpdate();
        setEquipItem("null", "null");
        StealSkill();
        JobSkillUpdate();

        super.currHp = super.Hp;
        super.currMana = super.Mp;
    }


    @Override
    public void StealSkill() {
        int oldSkillCount = this.JobSkill.length;
        int stealCount = 0;

        this.JobSkillCount += steal.length;
        this.JobSkill = new String[this.JobSkillCount];

        for(int i=oldSkillCount; i<this.JobSkillCount; i++){
            this.JobSkill[i] = steal[stealCount];
            stealCount++;
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
        variantStatUpdate(ThiefHp, ThiefMp, ThiefAtk, ThiefDef, ThiefSpd);
        setJob(this.Job);

        super.Equipable = new String[2];
        super.Equipable[0] = "Knife";
        super.Equipable[1] = "Shield";
        
    }
    @Override
    public void setEquipItem(String weaponName, String armorName) {
        super.Equipting = new String[2];
        super.Equipting[0] = weaponName;
        super.Equipting[1] = armorName;
        
    }
    @Override
    public boolean equipCheck(String weaponInputString) {

        for(int i=0; i<super.Equipable.length; i++){
            if(weaponInputString == Equipable[i])return true;
        }
        return false;
    }
}
