package Character.Race.Job.JobInterface;

/**
 * Interface for who can use whitemagic skill
 */
public interface WhiteMagic {
    //magic skill list
    public String[] whiteMagic = {"Heal", "Life", "Reflex"};

    /**
     * for use whitemagic skill
     */
    void WhiteMagicSkill();
}
