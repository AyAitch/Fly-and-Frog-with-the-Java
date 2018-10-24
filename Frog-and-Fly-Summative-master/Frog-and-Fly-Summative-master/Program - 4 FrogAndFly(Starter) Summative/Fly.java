import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *
 * Have the fly count how many Food object it eats (2 marks)
 * Every time the fly eats all 10 Food objects, add 10 more Food
 * objects to the world and continue playing. (3 marks)
 * 
 */
public class Fly extends Creature
{
    /**
     * This fly constructer randomizes the rotation of the fly at the start of
     * the games\
     * @param there are no parameters
     * @return None Nothing is returned
     */
    public Fly()
    {
        /*
         * modify this code to make the turtle face any random 
         * initial direction
         */
        setRotation( Greenfoot.getRandomNumber(360)  );
    }
    
    
    /**
    * act is the method that
    * runs during every act cycle
    * of the scenario
    *
    * @param There are no parameters
    * @return Nothing is returned
    */
    public void act() 
    {
        // make the fly move 4 steps in the direction it is facing
        
        /*
         * Make the fly turn left or right 5 degrees when
         * the left or right arrow key is pressed. 
         */
        
        
        /*
         * If the fly touches a Food object, remove the Food object
         * from the world. 
         */
        checkKeys();
        checkForFood();
        
    }    
    
    /**
     * check keys checks if the user pressed any keys, if any of the arrow keys 
     * are pressed, the fly moves the corrsponding way
     */
    private void checkKeys()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            turn(5);
        }
        if(Greenfoot.isKeyDown("left"))
        {
            turn(-5);
        }
        if(Greenfoot.isKeyDown("up"))
        {
            move(4);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            move(-7);
        }
    }
    
    /**
     * check for food allows the fly to check if the fly is over any food, it
     * removes it from the world
     * 
     * @param there is nothing in the parameters
     * @return Nothing is returned
     */
    private void checkForFood()
    {
        if(isTouching(Food.class))
        {
            removeTouching(Food.class);
            
            ( (Beach)getWorld()  ).update();
        }
    } 
}
