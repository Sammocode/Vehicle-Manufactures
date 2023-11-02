/**
 * This class represents a truck, which is a specific type of vehicle,
 * inheriting from the Vehicle class.
 * It adds additional attributes specific to trucks such as load capacity and
 * tow capacity.
 */
public class Truck extends Vehicle {

	private int loadCapacity = 0;
	private int towCapacity = 0;

	/**
	 * Constructor for creating a new Truck object.
	 * @param manufacturersName the manufacturer's name of the truck
	 * @param cylinders         the number of cylinders in the truck's engine
	 * @param owner             the owner of the truck
	 * @param loadCapacity      the load capacity of the truck in pounds
	 * @param towCapacity       the tow capacity of the truck in pounds
	 */
	public Truck(String manufacturersName, int cylinders, String owner, int loadCapacity, int towCapacity) {
		super(manufacturersName, cylinders, owner);
		this.loadCapacity = loadCapacity;
		this.towCapacity = towCapacity;
	}

	/**
	 * Getter method for the load capacity of the truck.
	 * @return the load capacity of the truck in pounds
	 */
	public int getLoadCapacity() {
		return loadCapacity;
	}

	/** 
	 * Setter method for the load capacity of the truck. 
	 * @param loadCapacity the new load capacity of the truck in pounds
	 */
	public void setLoadCapacity(int loadCapacity) {
		this.loadCapacity = loadCapacity;
	}

	/**
	 * Getter method for the tow capacity of the truck.
	 * @return the tow capacity of the truck in pounds
	 */
	public int getTowCapacity() {
		return towCapacity;
	}

	/** 
	 * Setter method for the tow capacity of the truck.
	 * @param towCapacity the new tow capacity of the truck in pounds
	 */
	public void setTowCapacity(int towCapacity) {
		this.towCapacity = towCapacity;
	}
}
