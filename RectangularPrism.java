/*
Kevin Nguyen
March 8, 2019
Ms. Krasteva
This class can create RectangularPrism objects.
*/
// The "RectangularPrism" class.
public class RectangularPrism extends Solid
{
    private double length;
    private double width;
    private double height;

    public RectangularPrism (String n, double l, double w, double h)
    {
	super (n);
	length = l;
	width = w;
	height = h;
    }


    public double volume ()
    {
	return length * width * height;
    }


    public double surfaceArea ()
    {
	return 2 * length * width + 2 * length * height + 2 * width * height;
    }
} // RectangularPrism class
