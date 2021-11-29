package Character.Race;

/**
 * Interface for implement race
 */
public interface RaceInterface {

    /**
     * Enhance character stat from race stat
     */
    void RaceStatUpdate();


    /**
     * Add race unique skill to character skill
     */
    void RaceSkillUpdate();


    /**
     * 
     * @param job set character job name
     */
    void setJob(String job);


    /**
     * print character info
     */
    void printInfo();
}
