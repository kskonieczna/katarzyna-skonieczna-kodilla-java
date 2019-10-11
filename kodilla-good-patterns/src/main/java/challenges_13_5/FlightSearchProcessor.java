package challenges_13_5;

public class FlightSearchProcessor {

    public void process() {
        SearchRequestRetriver searchRequestRetriver = new SearchRequestRetriver();
        SearchRequest searchRequest = searchRequestRetriver.retrieve();
        String cityName = searchRequest.getCityName();
        String searchType = searchRequest.getSearchType();

        FlightSearchEngine flightSearchEngine = new FlightSearchEngine();

        switch (searchType) {
            case "Departure":
                flightSearchEngine.returnAllFlightsFromGivenCity(cityName);
                break;
            case "Transfer":
                flightSearchEngine.returnAllFlightsWithGivenTransferCity(cityName);
                break;
            case "Arrival":
                flightSearchEngine.returnAllFlightsToGivenCity(cityName);
                break;
            default:
                break;
        }
    }
}