import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    public void act()
    {
        checkKeyPress();
        move();   
        lookForWorm();
        
    }
    
    public void move( )
    {
        move(5);
    }
    
    /*
     *  Check whether we have stumbles upon a Worm
     *  If we have, eat it. If not, do nothing. 
     */
    public void lookForWorm()
    {
        if( isTouching(Worm.class) )
        {
            removeTouching( Worm.class );
            Greenfoot.playSound("slurp.wav");
        }
    }
    
    /*
     * Check whether a user a pressed the keyboard key
     *  If so, turn the Crab
     */
    public void checkKeyPress()
    {
        if( Greenfoot.isKeyDown("left") )
        {
            turn(-4);
        }
        if( Greenfoot.isKeyDown("right") )
        {
            turn(4);
        }
    }
}




