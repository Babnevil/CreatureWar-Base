
/**
 * This is the model for a enhanced cyberdemon, which has
 * drastically increased base stats, but no bonus attacks
 * therefore, we dont need to over ride any methods.
 *
 * @author Matthew Schilling
 * @version 11.23.2017
 */
public class Cyberdemon extends Demon 
{
    private static final int MAX_CYBERDEMON_HP = 100;
    private static final int MIN_CYBERDEMON_HP = 25;
    private static final int MAX_CYBERDEMON_STR = 40;
    private static final int MIN_CYBERDEMON_STR = 20;


    /**
     * Constructor for objects of class Cyberdemon
     */
    public Cyberdemon()
    {
        super(
        Randomizer.nextInt(MAX_CYBERDEMON_HP-MIN_CYBERDEMON_HP)+MIN_CYBERDEMON_HP,
        Randomizer.nextInt(MAX_CYBERDEMON_STR-MIN_CYBERDEMON_STR)+MIN_CYBERDEMON_STR
        );
    }
       
}
