
/**
 * Write a description of class Balerog here.
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
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int damage(){
        int deal = super.damage()+ super.damage();
        return deal;
    }
}
