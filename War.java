
import java.util.ArrayList;
/**
 * This is the main loop of a battle simulator. It requires 2 ints for
 * army sizes. The constructor wll create the armies and the battle
 * method will simulate the battle
 *
 * @author Matthew Schilling
 * @version 12.01.2017
 */
public class War
{
    private ArrayList<Creature> good = new ArrayList<Creature>();
    private ArrayList<Creature> evil = new ArrayList<Creature>();
    private int humanCount;
    private int elfCount;
    private int dwarfCount;
    private int demonCount;
    private int cyberCount;
    private int balerogCount;
    private int hobbitCount;
    
    public War(int goodArmy, int evilArmy)
    {
        // populate the armies
        for(int i=0; i<goodArmy; i++){
            int roll = Randomizer.nextInt(4);
            switch (roll){
                case 0: good.add(new Elf());
                elfCount++;
                break;
                case 1: good.add(new Dwarf());
                dwarfCount++;
                break;
                case 2:
                good.add(new Hobbit());
                hobbitCount++;
                break;
                case 3: good.add(new Human());
                humanCount++;
                break;
            }
            
        if(elfCount==1 &&dwarfCount==1 &&hobbitCount==4 &&humanCount==2){
        good.add(new Gandalf());
        System.out.println("A Wizzard arrives percisely when he means to");
    }
        }
        for(int i=0; i<evilArmy; i++){
            int roll = Randomizer.nextInt(5);
            switch (roll){
                case 0: evil.add(new Cyberdemon());
                cyberCount++;
                break;
                case 1: evil.add(new Balerog());
                balerogCount++;
                break;
                case 2: case 3: case 4:
                evil.add(new Demon());
                demonCount++;
                break;
            }
   
        }
        
    }
    /**
     * Methods to manually add units into the armies
     */
    public void addElf(){
        good.add(new Elf());
    }
    public void addDwarf(){
        good.add(new Dwarf());
    }
    public void addHobbit(){
        good.add(new Hobbit());
    }
    public void addHuman(){
        good.add(new Human());
    }
    public void addGandalf(){
        good.add(new Gandalf());
    }
    public void addDemon(){
        evil.add(new Demon());
    }
    public void addCyberdemon(){
        evil.add(new Cyberdemon());
    }
    public void addBalerog(){
        evil.add(new Balerog());
    }
    /**
     * Start the "battle" by stepping through the arraylists with an
     * index and the get method, and using break statements to exit the loop
     */
    public void battle(){
        int g =0;
        int e =0;
        int goodDead=0;
        int evilDead=0;
        
        //used to ensure the array were created correctly and can be 
        //referenced to see if the damage loop seems accurate
        // for(Creature here: good){
        // System.out.println(here);
        // int dam = here.damage();
        // System.out.println(dam);
    // }
        // for(Creature there: evil){
        // System.out.println(there);
        // int dam = there.damage();
        // System.out.println(dam);
    // }
    System.out.println(">>>>>>>Its Time For The Main Event!<<<<<<<\n");
    System.out.println("Todays battle will be fought by ");
    System.out.println("----Good----   vs   ----Evil----");
    System.out.println("Humans: "+humanCount+ "\t\tDemons: " +demonCount);
    System.out.println("Elves: "+elfCount+"\t\tCyberdemons: "+cyberCount);
    System.out.println("Dwarves: "+dwarfCount+"\t\tBalerogs: "+ balerogCount);
    System.out.println("Hobbits: "+hobbitCount);
    
    //begin looping through the array lists, use breaks to avoid out of bounds
    //there are also a few println tests and reports commented out that can
    //show steps through the loops, but they congest the terminal
        for(Creature loop: evil){
            if(g==good.size()||e==evil.size())
            break;
            
            //begin the damage loop, which continues until an amry is defeated
        while(good.get(g).isAlive()&& evil.get(e).isAlive()){
            good.get(g).takeDamage(evil.get(e).damage());
            //System.out.println("Good HP: " + good.get(g).showHealth());
            evil.get(e).takeDamage(good.get(g).damage());
            //System.out.println("Evil HP: " + evil.get(e).showHealth());
            
            //check if the ally has taken enough damage to kill it
            if(good.get(g).isDead()){
                g++;
                //System.out.println("A hero of the light was vanquished!\n");
                goodDead++;
            }
            
            //check if the demon has taken enough damage to kill it
            if(evil.get(e).isDead()){
                e++;
                //System.out.println("An evil foe was slain!\n");
                evilDead++;
            }
        if(g==good.size()||e==evil.size())
        break;
    }
}
    if (goodDead<evilDead)
    System.out.println("The Light Has Prevailed!");
    else
    System.out.println("Evil Has Trimuphed This Day");
    System.out.println("\nGood Dead: "+goodDead + "\nEvil Dead: "+ evilDead);
    }
    
}
