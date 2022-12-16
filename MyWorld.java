import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The World our hero lives in.
 * 
 * @author William Wang
 * @version 1.0.0
 */
public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel;
    Label healthLabel;
    int level = 1;
    public static int health = 1;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1,false);
        
        // Create the elephant object
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 300);
        
        // Create a label
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 550, 50);
        
        // Create a health label
        healthLabel = new Label("\u2764 " + 1,80);
        addObject(healthLabel,50, 50);
        
        createApple();
    }
    
    /**
     * Draw the game and draw 'GameOver'
     */
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200); 
    }
    
    /**
     * Increase score
     */
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
        
        if(score % 5 == 0)
        {
            level += 1;
        }
    }
    
    /**
     * Create a new apple at random location at top of screen.
     */
    public void createApple()
    {
        Apple apple = new Apple();
        apple.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(apple, x, y);
    }
    
    /**
     * Create a new banana at random location at top of screen.
     */
    public void createBanana()
    {
        Banana banana = new Banana();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(banana, x, y);
    }
    
    /**
     * Check and Spawn a banana every 3 apple ate.
     */
    public void banana()
    {
        if(score % 3 == 0)
        {
            createBanana();
        }
    }
}    

