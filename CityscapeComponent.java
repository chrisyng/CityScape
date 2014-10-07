import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.util.Random;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class CityscapeComponent extends JComponent
{
    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    
    private int calculateBuildingHeight(Building building, Hill hill)
    {
        return this.getHeight()-building.getStartPos()-hill.getHillHeight();
    }
    public void paintComponent(Graphics g)
    {        
        
        Graphics2D g2 = (Graphics2D) g;
        Random randomGen = new Random();        
        Sky sky = new Sky(this.getWidth(), this.getHeight());
        sky.draw(g2);        
        Hill hill = new Hill(0, this.getHeight()-this.getHeight()/4, this.getWidth(), this.getHeight()/4);
        hill.draw(g2);
        int space = this.getWidth()/9;
        Building building1 = new Building(space, this.getHeight()/6, space, this.calculateBuildingHeight(building1, hill));
        building1.draw(g2);
        
        
                        
    }
}        

