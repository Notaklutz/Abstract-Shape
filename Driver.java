/*
Kevin Nguyen
March 8, 2019
Ms. Krasteva
This class will control the execution of the program.
*/
// The "Driver" class.
public class Driver
{
    public static void main (String[] args)
    {
	RectangularPrism box = new RectangularPrism ("Boxer", 50, 50, 20);
	System.out.println (box.getName ());
	System.out.println (box.volume ());
	System.out.println (box.surfaceArea ());
	Sphere ball = new Sphere ("Bally", 30);
	System.out.println (ball.getName ());
	System.out.println (ball.volume ());
	System.out.println (ball.surfaceArea ());
    }
} // Driver class
