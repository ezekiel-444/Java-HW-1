package homeworks.hw1.scooter;

/**
 * Tester class for the RentalCompany class.
 */
public class RentalCompanyTester {

    public static void main(String[] args) {
        // Create a rental company
        RentalCompany rentalCompany = new RentalCompany();

        // Create two scooters
        Scooter scooter1 = new Scooter();
        scooter1.setModel("Sparrow X10");

        Scooter scooter2 = new Scooter();
        scooter2.setModel("Omega X10");

        // Add the scooters to the rental company
        rentalCompany.addScooter(scooter1);
        rentalCompany.addScooter(scooter2);

        // Display all available scooters
        System.out.println("Available scooters:");
        rentalCompany.displayAllScooters();

        // Rent the first scooter
        rentalCompany.rentScooter(scooter1.getId());

        // Display all available scooters after renting
        System.out.println("\nAvailable scooters after renting:");
        rentalCompany.displayAllScooters();

        // Return the first scooter
        rentalCompany.returnScooter(scooter1.getId(), 41.7121106, 44.7489232);

        // Display all available scooters after returning
        System.out.println("\nAvailable scooters after returning:");
        rentalCompany.displayAllScooters();
    }
}

