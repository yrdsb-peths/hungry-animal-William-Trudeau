import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen
 * 
 * @author William Wang
 * @version 1.0.0
 */
public class TittleScreen extends World
{
    Label titleLabel = new Label("Hungry Elephant", 60);
    /**
     * Constructor for objects of class TittleScreen.
     * 
     */
    public TittleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, getWidth()/2, getHeight()/2);
        prepare();
    }

    /*
     * The main world act loop.
     */
    public void act()
    {
        // Start the game if user presses the space bar
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
        if(Greenfoot.isKeyDown("tab"))
        {
            Guide guide = new Guide();
            Greenfoot.setWorld(guide);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,495,92);
        Label label = new Label("Use \u2190 and \u2192 to Move", 40);
        addObject(label,178,30);
        Label label2 = new Label("Press <space> to Start", 40);
        addObject(label2,185,70);
        Label label3 = new Label("<TAB> to view guide", 35);
        addObject(label3,295,250);
    }
}
