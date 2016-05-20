public class Truck extends Automobile {

	public Truck (int year, String make, String model, String color, String name, int numOfGears)
	{
		super (year, make, model, color, name, numOfGears);
	}
	@Override
	public void drive (int opCycle)
	{
		setOperatingCycle(opCycle);
		if (getGear() < getNumOfGears())
		{
			increaseGear();
			setSpeed(getGear()*10);
		}
		setDistanceTraveled (getDistanceTraveled() + getSpeed()/60.0);
	}
}