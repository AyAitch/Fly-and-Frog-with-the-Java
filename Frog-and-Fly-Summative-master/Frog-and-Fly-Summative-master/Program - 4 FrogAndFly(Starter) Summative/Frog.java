import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 10 marks
 */
public class Frog extends Creature
{
    // The Frog's speed ...
    private int speed;
    
    public Frog()
    {        
        // set the Frog's speed to a random number between 4 and 8
        speed = Greenfoot.getRandomNumber(4)+4;
    }
    
    public void act() 
    {
        // make the Frog move at its speed, in the direction it is facing
        movement();
        /*
         * Make the frog turn off course 35% of the time.
         * It will turn left or right 15 degrees equally as often. 
         */ 
        /*
         * If the frog is near an edge of the world, make it turn
         * 7 degrees to the right. 
         * 
         * Hint: use the atEdgeOfWorld method in the Creature class.
         */
        if( atEdgeOfWorld() == true )
        {
            turn(7);
        }
    }   
    
    /**
     * movement is what makes the Frog move by the computer, it turns 35% of 
     * the time and then moves forward. If it touches the Fly, it then removes
     * it from the world.
     * 
     * @param there are no parameters
     * @return it does not return anything
     */
    private void movement()
    {
        if( Greenfoot.getRandomNumber(100) < 35 )
        {
            if ( Greenfoot.getRandomNumber(100) < 50 )
            {
                turn(15);
            }
            else  
            {
                turn(-15);
            }
        }
        
        move(speed);
        if (isTouching(Fly.class) == true )
        {
            //if the Frog is touching the Fly remove the Fly from the world
            removeTouching(Fly.class);
            Greenfoot.stop();
        }    
    }
}
