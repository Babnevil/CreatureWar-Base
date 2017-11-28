
import java.util.ArrayList;
/**
 * Create the armies and simulate the battle
 *
 * @author Matthew Schilling
 * @version 11.27.2017
 */
public class War
{
    //Store the monsters in array lists
    private ArrayList<Creature> good = new ArrayList<Creature>();
    private ArrayList<Creature> evil = new ArrayList<Creature>();
    
    /**
     * Create the two armies, letting the randomizer determine what subclasses will be
     * added for each side. Adjust the index boundries for larger battles
     */
    public War()
    {
        // populate the armies
        for(int i=0; i<3; i++){
            int roll = Randomizer.nextInt(4);
            if (roll == 1 || roll == 2 || roll == 3)
            good.add(new Human());
            if(roll ==0)
            good.add(new Elf());
        }
        for(int i=0; i<3; i++){
            int roll = Randomizer.nextInt(5);
            if (roll == 0 || roll == 1 || roll == 2)
            evil.add(new Demon());
            if(roll ==3 || roll ==4)
            evil.add(new Cyberdemon());
            if(roll ==5)
            evil.add(new Balerog());
            
        }
        
    }
    /**
     * Start the "battle" by stepping through the arraylists with an
     * index and the get method, and using a while loop to check if each object
     * at the index is still returning true for its isAlive method. Once a creature has
     * taken more damage than its max health, we increment the index for that army's 
     * arraylist to move to the next creature. This is repeated until one arraylist has
     * been completley steeped through. And as each creature is defeated, we add +1 to 
     * the count of fallen for that army.
     * 
     * There are also a few println tests in place to show what the arraylists actually
     * contain, health levels after damage has been taken, a message as each creature
     * is determined to be "dead", and a final body count is displayed after the loop
     * has finished. 
     */
    public void battle(){
        int g =0;
        int e =0;
        int goodDead=0;
        int evilDead=0;
        //a few test cases
        for(Creature here: good){
        System.out.println(here);
        int dam = here.damage();
        System.out.println(dam);
    }
        for(Creature there: evil){
        System.out.println(there);
        int dam = there.damage();
        System.out.println(dam);
    }
        for(Creature loop: evil){
            //lazy way to defend against index out of bounds errors
            if(g==good.size()||e==evil.size())
            break;
        while(good.get(g).isAlive()&& evil.get(e).isAlive()){
            good.get(g).takeDamage(evil.get(e).damage());
            //make sure we are calculating the damage correctly
            System.out.println("Good HP: " + good.get(g).showHealth());
            evil.get(e).takeDamage(good.get(g).damage());
            System.out.println("Evil HP: " + evil.get(e).showHealth());
            if(good.get(g).isDead()){
                g++;
                System.out.println("A good man has died today");
                goodDead++;
            }
            if(evil.get(e).isDead()){
                e++;
                System.out.println("An evil foe was slain!");
                evilDead++;
            }
            //lazy way to defend against index out of bounds errors
        if(g==good.size()||e==evil.size())
        break;
    }
}
    System.out.println("Good Dead: "+goodDead + "\nEvil Dead: "+ evilDead);
    }
    
}
