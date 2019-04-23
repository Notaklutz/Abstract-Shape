/*
Kevin Nguyen
March 8, 2019
Ms. Krasteva
This class is an abstract class that will be extended by the RectangularPrism and Sphere class.
*/
// The "Solid" class.
public abstract class Solid
{
    private String name;

    public Solid (String name)
    {
	this.name = name;
    }


    public String getName ()
    {
	return name;
    }


    public abstract double volume ();
    public abstract double surfaceArea ();
} // Solid class
