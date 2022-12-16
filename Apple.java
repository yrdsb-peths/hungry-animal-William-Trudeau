import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Food for our elephant.
 * 
 * @author William Wnag
 * @version 1.0.0
 */
public class Apple extends Actor
{
    int speed = 1;
    /**
     * Act - do whatever the Apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        int x = getX();
        int y = getY() + speed;
        setLocation(x, y);
        
        // Remove apple and draw game over when apple gets to bottom
        MyWorld world = (MyWorld) getWorld();

        if(getY() >= world.getHeight() && MyWorld.health > 0)
        {
            world.removeObject(this);
            MyWorld.health -= 1;
            world.healthLabel.setValue("\u2764"+MyWorld.health);
            if(MyWorld.health == 0)
            {
                world.gameOver();
                world.removeObject(this);	
            }
            else
            {
                world.createApple();
            }
        }
    }
    
    public void setSpeed(int spd)
    {
        speed = spd;
    }
}