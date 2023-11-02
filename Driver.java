/**
This class represents a driver who interacts with different vehicles.
*/
public class Driver {

	public static void main(String[] args) {
		// Create a Vehicle object representing a Tesla
		Vehicle Tesla = new Vehicle("Tesla", 1000,"Josh");
		// Create a Truck object representing a Nissan truck
		Truck Nissan = new Truck ("Nissan", 1000, "Michael", 200, 55); // 
		// Print information about the vehicles
		System.out.println(Tesla.getManufacturersName());
		System.out.println(Tesla.getcylinders());
		System.out.println(Tesla.getowner());
		System.out.println(Nissan.getLoadCapacity());
		System.out.println(Nissan.getTowCapacity());
		
	}

}
