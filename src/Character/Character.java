package Character;

public class Character {
    // variable
    protected String Name;
    protected int Level;
    protected float Hp, Mp;
    protected float Atk, Def, Spd;

    protected String[] skill;
    protected int SkillCount;

    protected String[] Equipable;

    protected String Race = "Human";
    protected String Job;

    protected String[] Equipting;

    // method
    public void setStart(String name, int level) {
        this.Name = name;
        this.Level = level;
    }

    public void statCharacterUpdate() {
        this.Hp = 100 + 10 * this.Level;
        this.Mp = 50 + 2 * this.Level;

        this.Atk = 10 + 2 * this.Level;
        this.Def = 5 + 2 * this.Level;
        this.Spd = 15 + 1 * this.Level;

        this.currHp = this.Hp;
        this.currMana = this.Mp;
    }

    public void variantStatUpdate(float hp, float mp, float atk, float def, float spd) {
        this.Hp += hp;
        this.Mp += mp;

        this.Atk += atk;
        this.Def += def;
        this.Spd += spd;
    }

    public void LevelUp(int levelUpdate) {
        this.Level = levelUpdate;

        statCharacterUpdate();
    }

    public void equipmentStat(float damage, float defense) {
        variantStatUpdate(0, 0, damage, defense, 0);
    }

    public void playerGetItem() {
        System.out.println(this.Name + " Got " + this.Equipting[0] + this.Equipting[1]);
    }

    /* interact part */

    // variable
    protected float currHp;
    protected float currMana;

    // method

    public void printCurrentStat() {
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("' " + this.Name + " '");
        System.out.println("Hp: " + this.currHp + "/" + this.Hp);
        System.out.println("Mana: " + this.currMana + "/" + this.Mp);
        System.out.println("--------------------------------------------------------------------------------------");
    }

    private void statUpdate(float hpUpdate, float manaUpdate) {
        this.currHp += hpUpdate;
        this.currMana += manaUpdate;
    }

    private float damageCal(float Damage) {
        if (this.Def > Damage) {
            return 0;
        } else {
            float calculated = Damage - this.Def;
            statUpdate(-calculated, 0);
            return calculated;
        }
    }

    public float thisAttacking() {
        System.out.println(this.Name + " Attack!! " + "(do " + this.Atk + " )");
        return this.Atk;
    }

    public void thisAttacked(float Damage) {
        float damageCalcurated = damageCal(Damage);
        System.out.println(this.Name + " Be Attacked!! " + "(receive " + damageCalcurated + " )");
    }

    public boolean thisDied(){
        if(this.currHp <= 0){
            System.out.println("' " + this.Name + " ' died");
            return true;
        }else {
            return false;
        }
    }
}
