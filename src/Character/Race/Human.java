package Character.Race;

import Character.Character;

public class Human extends Character implements RaceInterface{
    //Character varriable add
    
    //Human variable
    private float HumanHp = 50;
    private float HumanMp = 20;
    private float HumanAtk = 10;
    private float HumanDef = 10;
    private float HumanSpd = 5;

    //Human method

    @Override
    public void RaceStatUpdate() {
        variantStatUpdate(HumanHp, HumanMp, HumanAtk, HumanDef, HumanSpd);     
        super.Race = "Human";
    }

    @Override
    public void RaceSkillUpdate() {
        // Human non special skill
        
    }

    @Override
    public void setJob(String job) {
        super.Job = job;
        
    }

    @Override
    public void printInfo() {
        System.out.println("=======================================================================================");
        System.out.println("' " + super.Name + " '");
        System.out.println("Race: " + super.Race + "     Job: " + super.Job);
        System.out.println("Level: " + super.Level);
        System.out.println("maxHP: " + super.Hp + "     maxMP: " + super.Mp);
        System.out.println("Attack: " + super.Atk + "     Defend: " + super.Def + "     Speed: " + super.Spd);
        System.out.print("Equipment: ");
        for(int i=0; i<super.Equipting.length; i++){
            System.out.print(i+1 + ")" + super.Equipting[i] + "   ");
        }
        System.out.print("Skill: ");
        for(int i=0; i<super.skill.length; i++){
            System.out.print(i+1 + ")" + super.skill[i] + "   ");
        }
        System.out.println("");
        System.out.println("=======================================================================================");
    }

    
}
