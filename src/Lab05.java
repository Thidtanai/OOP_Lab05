
import Accessories.Type.Armor.Ring;
import Accessories.Type.Armor.Shield;
import Accessories.Type.Weapon.Knife;
import Accessories.Type.Weapon.Staff;
import Accessories.Type.Weapon.Sword;
import Character.Race.Job.DwarfJob.Dwarf_Swordman;
import Character.Race.Job.DwarfJob.Dwarf_Thief;
import Character.Race.Job.HumanJob.Human_Summoner;
import Character.Race.Job.HumanJob.Human_Swordman;

public class Lab05 {
    //setCharacter
    public static Human_Swordman Yusha = new Human_Swordman("Yusha", 50);
    public static Human_Summoner Yuna = new Human_Summoner("Yuna", 1);
    public static Dwarf_Swordman Jett = new Dwarf_Swordman("Jett", 1);
    public static Dwarf_Thief Riku = new Dwarf_Thief("Riku", 1);
    //setItem
    public static Ring OnionRing = new Ring("OnionRing");
    public static Shield ChillShield = new Shield("ChillShield");
    public static Sword TomatoSword = new Sword("TomatoSword");
    public static Staff TAStaff = new Staff("TAStaff");
    public static Knife Knifel = new Knife("Knifel");

    public static void printCharacterInfo(){
        Yusha.printInfo();
        Yuna.printInfo();
        Jett.printInfo();
        Riku.printInfo();
    }

    public static void printItemInfo(){
        OnionRing.itemInfo();
        ChillShield.itemInfo();
        TomatoSword.itemInfo();
        TAStaff.itemInfo();
        Knifel.itemInfo();
    }

    public static void main(String[] args) throws Exception {      
        //help variable
        float Damage;
        
        System.out.println("-------------Start Player---------------");
        printCharacterInfo();
        System.out.println("----------------------------------------");

        System.out.println("----------------Item-----------------");
        printItemInfo();
        System.out.println("-------------------------------------");

        //Give character equipment
        Yusha.equipmentStat(TomatoSword.Damage(), ChillShield.Defense());
        Yusha.setEquipItem(TomatoSword.getItemName(), ChillShield.getItemName());
        Yuna.equipmentStat(TAStaff.Damage(), OnionRing.Defense());
        Yuna.setEquipItem(TAStaff.getItemName(), OnionRing.getItemName());
        Jett.equipmentStat(TomatoSword.Damage(), ChillShield.Defense());
        Jett.setEquipItem(TomatoSword.getItemName(), ChillShield.getItemName());
        Riku.equipmentStat(Knifel.Damage(), 0);
        Riku.setEquipItem(Knifel.getItemName(), "none");


        System.out.println("-------------Player update status---------------");
        Yusha.playerGetItem();
        Yuna.playerGetItem();
        Jett.playerGetItem();
        Riku.playerGetItem();
        printCharacterInfo();
        System.out.println("----------------------------------------");

        System.out.println("");
        System.out.println("Yusha vs Jett");
        System.out.println("");

        while(!Yusha.thisDied() || !Jett.thisDied()){
            Damage = Yusha.thisAttacking();
            Jett.thisAttacked(Damage);
            if (Yusha.thisDied() || Jett.thisDied()) break;
            Yusha.printCurrentStat();
            Jett.printCurrentStat();

            Damage = Jett.thisAttacking();
            Yusha.thisAttacked(Damage);
            if (Yusha.thisDied() || Jett.thisDied()) break;
            Yusha.printCurrentStat();
            Jett.printCurrentStat();

        }
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("GAME OVER!!!");
    }
}
