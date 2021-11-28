package Character.Race;

import Character.Character;

public class Dwarf extends Character implements RaceInterface{
    //Character varriable add
    
    //Dwarf variable
    private float DwarfHp = 20;
    private float DwarfMp = 0;
    private float DwarfAtk = 5;
    private float DwarfDef = 5;
    private float DwarfSpd = 20;

    //Dwarf method
    public String CraftingItem(){
        return "craftItem";
    }

    @Override
    public void RaceStatUpdate() {
        variantStatUpdate(DwarfHp, DwarfMp, DwarfAtk, DwarfDef, DwarfSpd);    
        super.Race = "Dwarf";
    }

    @Override
    public void RaceSkillUpdate() {
        super.SkillCount += 1;
        super.skill = new String[SkillCount];
        super.skill[SkillCount-1] = CraftingItem();
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
