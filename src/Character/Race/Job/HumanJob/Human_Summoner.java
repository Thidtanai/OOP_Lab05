package Character.Race.Job.HumanJob;

import Character.Race.Human;
import Character.Race.Job.JobInterface.JobInterface;
import Character.Race.Job.JobInterface.Summon;
import Character.Race.Job.JobInterface.WhiteMagic;

public class Human_Summoner extends Human implements JobInterface, WhiteMagic, Summon{
    /**
     * Summoner can use
     *    -whiteMagic skill
     *    -Summon skill
     */

    //Character variable add
    protected String Job = "Summoner";

    //Jobvariable
    private float SummonerHp = 20;
    private float SummonerMp = 100;
    private float SummonerAtk = 0;
    private float SummonerDef = 5;
    private float SummonerSpd = 18;

    private String[] JobSkill = new String[0];
    private int JobSkillCount;

    //method
    public Human_Summoner(String name, int level){
        setStart(name, level);
        LevelUp(level);
        RaceStatUpdate();
        JobStatUpdate();
        setEquipItem("null", "null");
        setSkillSize(summon.length, whiteMagic.length);
        SummonSkill();
        WhiteMagicSkill();
        JobSkillUpdate();

        super.currHp = super.Hp;
        super.currMana = super.Mp;
    }

    //for quick fix bug
    public void setSkillSize(int skill1, int skill2){
        int summonCount = skill1;
        int whitemagicCount = skill2;
        this.JobSkill = new String[summonCount+whitemagicCount];
        this.JobSkillCount = 0;
    }

    @Override
    public void SummonSkill() {
        int oldSkillCount = this.JobSkillCount;
        int summonCount = 0;

        this.JobSkillCount += summon.length;

        for(int i=oldSkillCount; i<this.JobSkillCount; i++){
            this.JobSkill[i] = summon[summonCount];
            summonCount++;
        }
        
    }

    @Override
    public void WhiteMagicSkill() {
        int oldSkillCount = this.JobSkillCount;
        int whitemagicCount = 0;

        this.JobSkillCount += whiteMagic.length;

        for(int i=oldSkillCount; i<this.JobSkillCount; i++){
            this.JobSkill[i] = whiteMagic[whitemagicCount];
            whitemagicCount++;
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
        variantStatUpdate(SummonerHp, SummonerMp, SummonerAtk, SummonerDef, SummonerSpd);
        setJob(this.Job);

        super.Equipable = new String[2];
        super.Equipable[0] = "Staff";
        super.Equipable[1] = "Ring";
        
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
