import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author maher
 * @version march 16 version 1
 */
public class Lobster extends Actor
{
    public void act()
    {
        
        turnAtEdge();
        randomTurn();
        move();   
        lookForCrab();
        
    }
    
    public void move( )
    {
        move(5);
    }
    
    /*
     *  Check whether we have stumbles upon a Crab
     *  If we have, eat it. If not, do nothing. 
     */
    public void lookForCrab()
    {
        if( isTouching(Crab.class) )
        {
            removeTouching( Crab.class );
        }
    }
    
    /*
     * Make the Lobster randomly turn left or right
     *   between 0 and 45 degrees
     */
    public void randomTurn()
    {
        if(Greenfoot.getRandomNumber(100) < 10)
        {
            turn( Greenfoot.getRandomNumber(91)-45 );
        }
    }
    
    /*
     * When the Lobster is at the world's edge, turn 
     */
    public void turnAtEdge()
    {
        if( isAtEdge() ) 
        {
            turn(17);
        }
    }
    
}
