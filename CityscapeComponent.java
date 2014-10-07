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
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Random randomGen = new Random();
        Building building1 = new Building(0, 0, 400, 500);
        building1.draw(g2);
        Sky sky = new Sky(this.getWidth(), this.getHeight());
        sky.draw(g2);        
        Hill hill = new Hill(0, this.getHeight()-this.getHeight()/4, this.getWidth(), this.getHeight()/4);
        hill.draw(g2);
        // draws a random number of buildigns between 1 and 6
        for (int i = 0; i<(randomGen.nextInt(6)+1); i++);{
            int buildingWidth = this.getWidth()/(i*2);
            int xLeft = xLeft + buildingWidth;
                        
        }
    }        
}
