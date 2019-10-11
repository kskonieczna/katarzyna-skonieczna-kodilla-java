package challenges_13_5;

public class Flight {
    private String departureCity;
    private String transferCity;
    private String arrivalCity;

    public Flight(String departureCity, String transferCity, String arrivalCity) {
        this.departureCity = departureCity;
        this.transferCity = transferCity;
        this.arrivalCity = arrivalCity;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public String getTransferCity() {
        return transferCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    @Override
    public String toString() {
        return "Departure: " + getDepartureCity() + ", Transfer: " + getTransferCity()
                + ", Arrival: " + getArrivalCity() + ".";
    }
}