package Character.Race.Job.HumanJob;

import Character.Race.Human;
import Character.Race.Job.JobInterface.Buff;
import Character.Race.Job.JobInterface.JobInterface;

public class Human_Swordman extends Human implements JobInterface, Buff{
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
    public Human_Swordman(String name, int level){
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
        this.JobSkill = new String[JobSkillCount];

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
    //printInfo
}
