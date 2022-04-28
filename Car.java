/** Car.java
 * 
 * @author Ethan Olmsted
 * Date:   4/28/22
 *
 * 
 */
 
 import java.lang.*;


public class Car extends Vehicle
{
	
	private int numDoors;
	private int numPassengers;

	public Car(String aMake, String aModel, String aPlate, 
		int doors, int passengers) 
	{
		super(aMake, aModel, aPlate);
		this.numDoors = doors;
		this.numPassengers = passengers;
		
	}
	
	
	public int getNumDoors()
	{
		return this.numDoors;	
		
	}
	
	public int getNumPassengers()
	{
		return this.numPassengers;	
	}
	
	@Override
	public String toString()
	{
		String carInfo =  String.format("%d-door %s %s with license %s", 
			this.numDoors, this.getMake(), this.getModel(), this.getPlate());
		

		
		return carInfo;
			
	}
	
	@Override
	public boolean equals(Object other)
	{
		if(!(other instanceof Car)) 
		{
			return false;
		}
		
		Car otherCar = (Car) other;
		
		if(super.equals(other))
		{
			if(this.numDoors == otherCar.getNumDoors())
			{
				if(this.numPassengers == otherCar.getNumPassengers())
				{
					return true;
				}
			}
		}
		
		return false;
	}
	
	
	
	public Car copy()
	{
		String copyMake = this.getMake();
		String copyModel = this.getModel();
		String copyPlate = this.getPlate();
		int copyNumDoors = this.numDoors;
		int copyNumPassengers = this.numPassengers;
		
		Car theCopy = new Car(copyMake, copyModel, 
			copyPlate, copyNumDoors, copyNumPassengers);
		
		
		return theCopy;
		
		
		
		
		
	}
	
	
	
	
	
	
	
}