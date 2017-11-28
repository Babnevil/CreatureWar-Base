
/**
 * Another subclass of the creature type. An elf can proc extra damage on attack, so
 * the damage method had to be overrided 
 *
 * @author Matthew Schilling
 * @version 11.23.2017
 */
public class Elf extends Creature
{
    // instance variables - replace the example below with your own
    private static final int MAX_ELF_HP = 25;
    private static final int MIN_ELF_HP = 8;
    private static final int MAX_ELF_STR = 18;
    private static final int MIN_ELF_STR = 5;


    /**
     * Constructor for objects of class Elf
     */
    public Elf()
    {
        super(
        Randomizer.nextInt(MAX_ELF_HP-MIN_ELF_HP)+MIN_ELF_HP,
        Randomizer.nextInt(MAX_ELF_STR-MIN_ELF_STR)+MIN_ELF_STR
        );
    }

    /**
     * Override creature's damage method to allow for an elf to deal a magic attack
     * @return the total damage to be dealt
     */
    public int damage()
    {
        int deal;
        int roll;
        roll = Randomizer.nextInt(10);
        if (roll == 1){
            deal = super.damage(); 
            deal = deal *2;
        }
        else
        deal = super.damage();
        return deal;
    }
}
