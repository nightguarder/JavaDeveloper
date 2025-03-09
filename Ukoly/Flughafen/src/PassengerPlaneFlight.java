// Tato třída bude reprezentovat osobní letadlo. Může obsahovat atributy jako počet sedadel a třídu letu (první třída, ekonomická třída).
public class PassengerPlaneFlight extends AbstractAircraftFlight {
    private int seats;
    private String flightClass;

    public PassengerPlaneFlight(String flightNumber, String destination, int passengers, int seats, String flightClass) {
        //Use the constructor in the AbstractAircraftFlight(the parent class) to set up the flight number, destination, and passengers FIRST.
        super(flightNumber, destination, passengers);
        this.seats = seats;
        this.flightClass = flightClass;
    }
    //PassengerPlaneFlight inherits the passengerCount attribute from the AbstractAircraftFlight class.
    //It has nothing to do with this seats method.
    //The seats method is specific to the PassengerPlaneFlight class.
    public int getSeats() { return seats; }
    // Vrátí třídu letu (první třída, ekonomická třída).
    public String getFlightClass() { return flightClass; }
}
