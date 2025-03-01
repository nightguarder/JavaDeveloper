public class Flughafen {
    public static void main(String[] args) throws Exception {
        //Pro uložení seznamu letů, můžete použít pole.
        Flight[] flights = new Flight[3];
        flights[0] = new PassengerPlaneFlight("OK123", "Prague", 150, 200, "Economy");
        flights[1] = new CargoPlaneFlight("OK456", "Paris", 5, 1000, "Goods");
        flights[2] = new CargoPlaneFlight("OK789", "New York", 10, 2000, "Cargo");

        System.out.println("--- Wilkommen im München Flughafen! ---");

        for (Flight flight : flights) {
            System.out.println("Flug nummer: " + flight.getFlightNumber());
            System.out.println("Nach: " + flight.getDestination());
            System.out.println("Mit " + flight.getPassengerCount() + " Passagieren\n");

            //Pokud je let nákladní, vytiskne maximální váhu nákladu a typ nákladu.
            //instanceof is a keyword in Java. It is used to test whether the object is an instance of the specified type (class or subclass or interface). 
            //= Polymorfismus
            if (flight instanceof CargoPlaneFlight) {
                CargoPlaneFlight cargoFlight = (CargoPlaneFlight) flight;
                System.out.println("Maximalgewicht:  " + cargoFlight.getMaxCargoWeight());
                System.out.println("Frachttyp: " + cargoFlight.getCargoType());
                System.out.println();
            }
            //Pokud je let osobní, vytiskne počet sedadel a třídu letu.
            else if (flight instanceof PassengerPlaneFlight) {
                PassengerPlaneFlight passengerFlight = (PassengerPlaneFlight) flight;
                System.out.println("Sitze anzahl: " + passengerFlight.getSeats());
                System.out.println("Flug klasse:  " + passengerFlight.getFlightClass()+ "\n");
            }
        }
        System.out.println("Vielen Dank für Ihren Besuch im München Flughafen\n");
    }
}
