import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Guide
 * 
 * @author William Wang
 * @version 1.0.0
 */
public class Guide extends World
{
    Label titleLabel = new Label("Hungry Elephant", 60);
    /**
     * Constructor for objects of class Guide.
     * 
     */
    public Guide()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, getWidth()/2, 50);
        prepare();
    }

    /*
     * The main world act loop. Q will sent player back to tittle screen.
     */
    public void act()
    {
        // Back to TittleScreen if user press q
        if(Greenfoot.isKeyDown("q"))
        {
            TittleScreen tittle = new TittleScreen();
            Greenfoot.setWorld(tittle);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Label label = new Label("Welcome to Hungry Elephant! You will be sent\nto a jungle, and you have to catch apple to\n survive. Every 3 apple you ate, there\n will be a banana falling down.\n Every 5 apple you ate, apple will falling faster.\n If you catch the banana, you will\n gain a health. Each health will save you one time.", 28);
        addObject(label,300,200);
        Label label3 = new Label("<Q> back to TittleScreen", 40);
        addObject(label3,300,350);
    }
}
