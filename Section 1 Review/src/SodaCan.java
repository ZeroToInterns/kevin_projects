/**
 * Models a SodaCan 
 * 
 * @author Kathleen O'Brien
 */
public class SodaCan
{
    public static final double DEFAULT_RADIUS = 1.2109;
    public static final double DEFAULT_HEIGHT = 4.704;
    public static final double FLUID_OUNCES_PER_CUBIC_INCHES = 0.554112554;
    private double radius;
    private double height;
    private double volume;
    
    //Creates a default soda can
    public SodaCan()
    {
    	radius = DEFAULT_RADIUS;
    	height = DEFAULT_HEIGHT;
    	volume = Math.PI * (radius * radius) * height * FLUID_OUNCES_PER_CUBIC_INCHES;
    }
    
    //Creates a soda can with customized inputs
    //sets radius and height to default if inputs are invalid
    public SodaCan(double theRadius, double theHeight)
    {
    	radius = theRadius;
    	height = theHeight;
    	if(radius <= 0)
    		radius = DEFAULT_RADIUS;
    	if(height <= 0)
    		height = DEFAULT_HEIGHT;
    	volume = Math.PI * (radius * radius) * height * FLUID_OUNCES_PER_CUBIC_INCHES;
    }
    
    //finds the radius of the can
    public double getRadius()
    {
    	return radius;
    }
    
    //finds the height of the can
    public double getHeight()
    {
    	return height;
    }
    
    //Decreases the volume of the current volume of fluid in the soda can
    public void drink(double fluidOunces)
    {
    	volume = volume - fluidOunces;
    }
    
    //Gets the volume of the fluid left in the soda can
    public double getContents()
    {
    	return volume;
    }
}