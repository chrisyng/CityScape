import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
/**
 * Draws a hill at the front of the CityScape
 * 
 * @author Christopher Ng
 * @version 6 October 2014
 */
public class Hill
{
    /** holds value for maximum height of the hill in pixels */   
    private int maxHeight;
    private int hillWidth;
    private int yBottom;
    private int xLeft;        
    public Hill(int maxHeight, int hillWidth, int yTop, int xLeft)
    {
        this.maxHeight = maxHeight;
        this.hillWidth = hillWidth;
        this.yBottom = yTop;
        this.xLeft = xLeft;
    }

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
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double hill = new Ellipse2D.Double(yBottom, xLeft, hillWidth, maxHeight);
        g2.setColor(Color.GREEN);
        g2.draw(hill);
        g2.fill(hill);
    }

}
