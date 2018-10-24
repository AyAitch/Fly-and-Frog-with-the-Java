import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Scoreboard extends Actor
{
    private int points;
    private Font myFont = new Font("Comic Sans MS", true, false, 24);
    /*
     * This generates the image of the scoreboard that you can see in the top left corner of the world  
     * 
     * @param None
     * @return Nothing is returned
     */
    public Scoreboard()
    {
        points = 0;
        GreenfootImage img = new GreenfootImage(150,30);
        img.setFont( myFont );
        img.drawString("Score: " + points, 5,25);
        setImage(img);
    }
    /*
     * Add to Score adds points to the image score board every time the fly eats a peice of fruit
     * 
     * @param NONE There are or parameters
     * @return Nothing is returned
     * 
     */
    public void addToScore() 
    {
        points++;
        GreenfootImage img = getImage();
        img.clear();
        if(points < 20) {
            img.drawString("Score: " + points, 5,25); 
        } else {
            img.drawString("You win!!!", 5,25);
            Greenfoot.stop();
        }        
    }  
}


