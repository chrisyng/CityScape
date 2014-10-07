import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.util.Random;
import java.awt.Graphics2D;
/**
 * Class that defines a building with starting positions, height, and width.
 * 
 * @author Christopher Ng 
 * @version 2 October 2014
 */
public class Building
{
    /** int specifying building's height */
    private int height;
    /** int specifying building's width */
    private int width;
    /**int specifying leftmost coordinate */
    private int xleft;
    /** int specifying top coordinate */
    private int ytop;
    /**
     * Default constructor for objects of class Building
     */
    public Building(int xleft, int ytop, int width, int height)
    {
        this.height = height;
        this.width = width;
        this.xleft = xleft;
        this.ytop = ytop;
    }
    
    public int getStartPos() 
    {
        return this.ytop;
    }    
    
    /**
     * Draws a building based on variables initialized in constructor
     */
    public void draw(Graphics2D g2)
    {
       Rectangle mainBuilding = new Rectangle(xleft, ytop, width, height);
       g2.setColor(Color.GRAY);
       g2.draw(mainBuilding);
       g2.fill(mainBuilding);        
              
    }    
       
    
}


