package challenges_13_5;

public class SearchRequestRetriver {
    public SearchRequest retrieve() {

        String searchType = "Departure";
        String cityName = "Warszawa";

        return new SearchRequest(searchType, cityName);
    }
}