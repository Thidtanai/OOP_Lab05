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
    /**
     * set character name and level
     * @param name input character name
     * @param level input character level
     */
    public void setStart(String name, int level) {
        this.Name = name;
        this.Level = level;
    }

    /**
     * for set character stat when didnt set job and race
     */
    public void statCharacterUpdate() {
        this.Hp = 100 + 10 * this.Level;
        this.Mp = 50 + 2 * this.Level;

        this.Atk = 10 + 2 * this.Level;
        this.Def = 5 + 2 * this.Level;
        this.Spd = 15 + 1 * this.Level;

        this.currHp = this.Hp;
        this.currMana = this.Mp;
    }

    /**
     * use when update stat with variant event ex equip new item
     * @param hp
     * @param mp
     * @param atk
     * @param def
     * @param spd
     */
    public void variantStatUpdate(float hp, float mp, float atk, float def, float spd) {
        this.Hp += hp;
        this.Mp += mp;

        this.Atk += atk;
        this.Def += def;
        this.Spd += spd;
    }

    /**
     * for level update
     * @param levelUpdate input new level
     */
    public void LevelUp(int levelUpdate) {
        this.Level = levelUpdate;

        statCharacterUpdate();
    }

    /**
     * to up new stat after add equipment
     * @param damage input weapon damage
     * @param defense input armor defense
     */
    public void equipmentStat(float damage, float defense) {
        variantStatUpdate(0, 0, damage, defense, 0);
    }

    /**
     * for print character got new item
     */
    public void playerGetItem() {
        System.out.println(this.Name + " Got " + this.Equipting[0] + this.Equipting[1]);
    }

    /* interact part */

    // variable
    protected float currHp;
    protected float currMana;

    // method

    /**
     * for print this character current stat when action
     */
    public void printCurrentStat() {
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("' " + this.Name + " '");
        System.out.println("Hp: " + this.currHp + "/" + this.Hp);
        System.out.println("Mana: " + this.currMana + "/" + this.Mp);
        System.out.println("--------------------------------------------------------------------------------------");
    }

    /**
     * for update stat after action
     * @param hpUpdate value for change current Hp
     * @param manaUpdate value for  change current Mp
     */
    private void statUpdate(float hpUpdate, float manaUpdate) {
        this.currHp += hpUpdate;
        this.currMana += manaUpdate;
    }

    /**
     * for calculate damage after action
     * @param Damage damage this character took before calculate
     * @return real damage this character took after calculate
     */
    private float damageCal(float Damage) {
        if (this.Def > Damage) {
            return 0;
        } else {
            float calculated = Damage - this.Def;
            statUpdate(-calculated, 0);
            return calculated;
        }
    }

    /**
     * for this character attack each character
     * @return this character damage
     */
    public float thisAttacking() {
        System.out.println(this.Name + " Attack!! " + "(do " + this.Atk + " )");
        return this.Atk;
    }

    /**
     * for recive damage from each character to this character
     * @param Damage damage this character took
     */
    public void thisAttacked(float Damage) {
        float damageCalcurated = damageCal(Damage);
        System.out.println(this.Name + " Be Attacked!! " + "(receive " + damageCalcurated + " )");
    }

    /**
     * for check is character died now ?
     * @return true if character died(Hp below 1)
     */
    public boolean thisDied(){
        if(this.currHp <= 0){
            System.out.println("' " + this.Name + " ' died");
            return true;
        }else {
            return false;
        }
    }
}
