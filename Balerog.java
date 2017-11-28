
/**
 * A subtype of the demon class, a balerog attacks twice on each attack
 *
 * @author Matthew Schilling
 * @version 11.24.2017
 */
public class Balerog extends Demon 
{
    private static final int MAX_BALEROG_HP = 200;
    private static final int MIN_BALEROG_HP = 80;
    private static final int MAX_BALEROG_STR = 100;
    private static final int MIN_BALEROG_STR = 50;


    /**
     * Constructor for objects of class Cyberdemon
     */
    public Balerog()
    {
        super(
        Randomizer.nextInt(MAX_BALEROG_HP-MIN_BALEROG_HP)+MIN_BALEROG_HP,
        Randomizer.nextInt(MAX_BALEROG_STR-MIN_BALEROG_STR)+MIN_BALEROG_STR
        );
    }

    /**
     * To achieve the double attack, we call the Demon's damage method twice to ensure
     * two seperate damage values, then combine the attacks to be measured easier
     * @return the total damage to be dealt
     */
    public int damage(){
        int deal = super.damage()+ super.damage();
        return deal;
    }
}
