//Tato třída bude reprezentovat nákladní letadlo. Může obsahovat atributy jako maximální váha nákladu a typ nákladu (např. zboží, potraviny).
public class CargoPlaneFlight extends AbstractAircraftFlight {
    private double maxCargoWeight;
    private String cargoType;

    public CargoPlaneFlight(String flightNumber, String destination, int crew, double maxCargoWeight, String cargoType) {
        super(flightNumber, destination, crew);
        this.maxCargoWeight = maxCargoWeight;
        this.cargoType = cargoType;
    }

    public double getMaxCargoWeight() { return maxCargoWeight; }
    public String getCargoType() { return cargoType; }
}