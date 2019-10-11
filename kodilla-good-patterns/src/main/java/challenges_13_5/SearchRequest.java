package challenges_13_5;

public class SearchRequest {
    private String searchType;
    private String cityName;

    public SearchRequest(String searchType, String cityName) {
        this.searchType = searchType;
        this.cityName = cityName;
    }

    public String getSearchType() {
        return searchType;
    }

    public String getCityName() {
        return cityName;
    }
}