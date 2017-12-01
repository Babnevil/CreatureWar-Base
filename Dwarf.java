
/**
 * A stout ally of the light, dwarves have increased health and strength
 * and also have the resilient buff, a 10% chance to take half damage
 *
 * @author Matthew Schilling
 * @version 12.01.2017
 */
public class Dwarf extends Creature
{

    private static final int MAX_DWARF_HP = 65;
    private static final int MIN_DWARF_HP = 20;
    private static final int MAX_DWARF_STR = 30;
    private static final int MIN_DWARF_STR = 15;


    /**
     * Constructor for objects of class Elf
     */
    public Dwarf()
    {
        super(
        Randomizer.nextInt(MAX_DWARF_HP-MIN_DWARF_HP)+MIN_DWARF_HP,
        Randomizer.nextInt(MAX_DWARF_STR-MIN_DWARF_STR)+MIN_DWARF_STR
        );
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void takeDamage(int damage) {
        int take = damage;
        int roll = Randomizer.nextInt(10);
        if (roll == 7)
        take = damage /2;
        super.takeDamage(take);
    }
}
