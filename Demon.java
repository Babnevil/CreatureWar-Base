
/**
 * This is the first level of inheritence for the demon branch
 *
 * @author Matthew Schilling
 * @version 11.23.2017
 */
public class Demon extends Creature
{
    // instance variables - replace the example below with your own
    private static final int MAX_DEMON_HP = 25;
    private static final int MIN_DEMON_HP = 8;
    private static final int MAX_DEMON_STR = 18;
    private static final int MIN_DEMON_STR = 5;


    /**
     * Constructor for objects of class Elf
     */
    public Demon()
    {
        super(
        Randomizer.nextInt(MAX_DEMON_HP-MIN_DEMON_HP)+MIN_DEMON_HP,
        Randomizer.nextInt(MAX_DEMON_STR-MIN_DEMON_STR)+MIN_DEMON_STR
        );
    }
    public Demon(int hp, int str){
        super(hp, str);
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int damage()
    {
        // put your code here
        int roll = Randomizer.nextInt(20);
        int dmg;
        if (roll == 1){
            dmg = super.damage();
            dmg += 50;
        }
        else
            dmg = super.damage();
            
        return dmg;
    }
}
