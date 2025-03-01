public abstract class AbstractAircraftFlight implements Flight{
    private String flightNumber;
    private String destination;
    private int passengerCount;

    public AbstractAircraftFlight(String flightNumber, String destination, int passengerCount) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.passengerCount = passengerCount;
    }

    @Override
    public String getFlightNumber() {
        return flightNumber;
    }

    @Override
    public String getDestination() {
        return destination;
    }

    @Override
    public int getPassengerCount() {
        return passengerCount;
    }
    
}
