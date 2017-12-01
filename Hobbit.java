
/**
 * Hobbits are surprisingly nimble, and have the small target buff, giving
 * them a 50% chance to avoid all damage. However, they have minimal 
 * health, and cant do much damage.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hobbit extends Creature
{

    private static final int MAX_HOBBIT_HP = 20;
    private static final int MIN_HOBBIT_HP = 10;
    private static final int MAX_HOBBIT_STR = 10;
    private static final int MIN_HOBBIT_STR = 5;


    /**
     * Constructor for objects of class Hobbit
     */
    public Hobbit()
    {
        super(
        Randomizer.nextInt(MAX_HOBBIT_HP-MIN_HOBBIT_HP)+MIN_HOBBIT_HP,
        Randomizer.nextInt(MAX_HOBBIT_STR-MIN_HOBBIT_STR)+MIN_HOBBIT_STR
        );
    }

    /**
     * evaluate a 50% chance, returning 0 damage on proc
     */
    public void takeDamage(int damage) {
        int take = damage;
        int roll = Randomizer.nextInt(1);
        if (roll == 0)
        take = 0;
        super.takeDamage(take);
    }
}
