import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 5 marks
 */
public class Beach extends World
{
    private Scoreboard score;
    /**
     * Beach is the background of this game, it is the area that the Fly, Frog and the Fruit. It adds the fruit, fly and frog and 
     * scoreboard 
     * 
     * @param None
     * @return Nothing is returned
     */
    public Beach()
    {    
       super(800, 600, 1); 
       // add 10 Food objects to the world (NOTE: YOU SHOULD BE CALLING A METHOD FROM THIS CLASS TO 
       // DO THIS!)
       addFood(10);
       // add a Fly object at a random position somewhere in the world
       addObject(new Fly(), Greenfoot.getRandomNumber( getWidth() ), Greenfoot.getRandomNumber( getHeight() ) );
       // add a Frog object at the center of the world 
       addObject(new Frog(), ( getWidth()/2 ), ( getHeight()/2 ) );
       //scoreboard
       score = new Scoreboard();
        addObject( score, 75, 25);
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
        if( getObjects(Food.class).size()==0)
        {
         addFood(10);   
        }
    }
    
    /**
     * Update updates the scoreboard on the screen
     * 
     * @param There are no parameters
     * \@return Nothing is returned
     */
    public void update()
    {
     score.addToScore();
    }
    
    /**
     * addFood creates the food objeccts to the world
     * 
     * @param The parameters hold an integer
     * @return Nothing is returned
     */
    /**
     * Adds n Food objects to the world
     */
    public void addFood(int n)
    {
        for(int f=0; f<n; f++) {
            int x = Greenfoot.getRandomNumber( getWidth() );
            int y = Greenfoot.getRandomNumber( getHeight() );
            addObject(new Food(),x,y);
        }
    }
}
