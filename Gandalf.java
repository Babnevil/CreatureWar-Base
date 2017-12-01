
/**
 * A mystery to those who know him, Gandalf seems to come and go as he pleases
 * if the odds are just right, Gandalf may join the army of the light
 * Gandalf has overpowered stats but no bonus abilities as of now
 *
 * @author Matthew Schilling
 * @version 12.01.2017
 */
public class Gandalf extends Creature
{

    private static final int MAX_GANDALF_HP = 2000;
    private static final int MIN_GANDALF_HP = 1000;
    private static final int MAX_GANDALF_STR = 400;
    private static final int MIN_GANDALF_STR = 200;


    /**
     * Constructor for objects of class Gandalf
     */
    public Gandalf()
    {
        super(
        Randomizer.nextInt(MAX_GANDALF_HP-MIN_GANDALF_HP)+MIN_GANDALF_HP,
        Randomizer.nextInt(MAX_GANDALF_STR-MIN_GANDALF_STR)+MIN_GANDALF_STR
        );
    }
}
