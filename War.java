
import java.util.ArrayList;
/**
 * Write a description of class Battle here.
 * Create the armies and simulate the battle
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class War
{
    private ArrayList<Creature> good = new ArrayList<Creature>();
    private ArrayList<Creature> evil = new ArrayList<Creature>();
    
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
     * index and the get method, and using 
     */
    public void battle(){
        int g =0;
        int e =0;
        int goodDead=0;
        int evilDead=0;
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
            if(g==good.size()||e==evil.size())
            break;
        while(good.get(g).isAlive()&& evil.get(e).isAlive()){
            good.get(g).takeDamage(evil.get(e).damage());
            System.out.println("Good HP: " + good.get(g).showHealth());
            evil.get(e).takeDamage(good.get(g).damage());
            System.out.println("Evil HP: " + evil.get(e).showHealth());
            if(good.get(g).isDead()){
               // good.remove(g);
                g++;
                System.out.println("A good man has died today");
                goodDead++;
                // if(g==good.size()){
                    // e = evil.size();

                // }
            }
            if(evil.get(e).isDead()){
                //evil.remove(e);
                e++;
                System.out.println("An evil foe was slain!");
                evilDead++;
            }
        if(g==good.size()||e==evil.size())
        break;
    }
}
    System.out.println("Good Dead: "+goodDead + "\nEvil Dead: "+ evilDead);
    }
    
}
