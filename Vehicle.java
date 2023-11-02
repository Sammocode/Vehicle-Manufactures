/**
 * This class represents a generic vehicle with a manufacturer's name, number of
 * cylinders, and owner.
 */
public class Vehicle {

	private String manufacturersName = " ";

	private int cylinders = 0; 

	private String owner = " ";

	/**
	 * Constructor for creating a new vehicle object. 
	 * @param manufacturersName the manufacturer's name of the vehicle
	 * @param cylinders         the number of cylinders in the vehicle's engine
	 * @param owner             the owner of the vehicle
	 */
	// Constructor with parameters
	public Vehicle(String manufacturersName, int cylinders, String owner) {

		this.manufacturersName = manufacturersName;
		this.cylinders = cylinders;
		this.owner = owner;
	}

	/**
	 * Setter method for the manufacturer's name of the vehicle.
	 * @param manufacturersName the new manufacturer's name of the vehicle
	 */
	// Default constructor
	public void setManufacturersName(String manufacturersName) {
		this.manufacturersName = manufacturersName;
	}

	/**
	 * Setter method for the number of cylinders in the vehicle's engine.
	 * @param cylinders the new number of cylinders in the vehicle's engine
	 */
	public void setcylinders(int cylinders) {
		this.cylinders = cylinders;
	}

	/** 
	 * Setter method for the owner of the vehicle.
	 * @param owner the new owner of the vehicle
	 */

	// Accessor methods (getters)
	public void setowner(String owner) {
		this.owner = owner;
	}
	/**

	Getter method for the manufacturer's name of the vehicle.
	@return the manufacturer's name of the vehicle
	*/
	// Mutator methods (setters)
	public String getManufacturersName() {
		return manufacturersName;
	}
	/**
	Getter method for the number of cylinders in the vehicle's engine.
	@return the number of cylinders in the vehicle's engine
	*/
	public int getcylinders() {
		return cylinders;
	}
	/**

	Getter method for the owner of the vehicle.
	@return the owner of the vehicle
	*/
	public String getowner() {
		return owner;
	}
}
