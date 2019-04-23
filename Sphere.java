/*
Kevin Nguyen
March 8, 2019
Ms. Krasteva
This class can create Sphere objects.
*/
// The "Sphere" class.
public class Sphere extends Solid
{

    private double radius;
    private final double PI = 3.14;

    public Sphere (String n, double r)
    {
	super (n);
	radius = r;
    }


    public double volume ()
    {
	return (4 / 3) * PI * (radius * radius * radius);
    }


    public double surfaceArea ()
    {
	return 4 * PI * (radius * radius);
    }
} // Sphere class
