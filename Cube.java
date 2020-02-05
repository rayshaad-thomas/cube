import java.util.Random;

public class Cube {
	
	private double sideLength;
	
	public Cube (double side) 
	{
		sideLength = side;
	}
	
	public Cube() {
	}

	public void setSide (double side)
	{
		sideLength = side;
	}
	
	public double getSurfaceArea () 
	{
		return (sideLength * sideLength * 6);
	}
	
	public double getVolume () 
	{
		return (sideLength * sideLength * sideLength);
	}
	

	public static void main(String[] args) {
		
		Cube ray = new Cube();
		
		ray.setSide(15);
		System.out.printf("Cube volume: %,3.2f\n", ray.getVolume());
		System.out.printf("Cube surface area: %,3.2f\n", ray.getSurfaceArea());

		for (int i = 0; i < 2; i++) 
		{
			Random rand = new Random(1000);
			System.out.println(rand.nextDouble());
			ray.setSide(rand.nextDouble());
			System.out.printf("Cube volume: %,3.2f\n", ray.getVolume());
			System.out.printf("Cube surface area: %,3.2f\n", ray.getSurfaceArea());
			
		}
		
	}

}
