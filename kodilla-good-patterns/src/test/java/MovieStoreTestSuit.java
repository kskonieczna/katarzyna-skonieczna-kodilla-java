import org.junit.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MovieStoreTestSuit {
    //nie testujemy printoutów, kod próbny

    private static int testCounter = 0;

    public Map<String, List<String>> createMovieStore() {

        //titles
        List<String> ironManTranslations = new ArrayList<>();
        ironManTranslations.add("Żelazny Człowiek");
        ironManTranslations.add("Iron Man");
        List<String> avengersTranslations = new ArrayList<>();
        avengersTranslations.add("Mściciele");
        avengersTranslations.add("Avengers");
        List<String> flashTranslations = new ArrayList<>();
        flashTranslations.add("Błyskawica");
        flashTranslations.add("Flash");

        //translation lists
        Map<String, List<String>> booksTitlesWithTranslations = new HashMap<>();
        booksTitlesWithTranslations.put("IM", ironManTranslations);
        booksTitlesWithTranslations.put("AV", avengersTranslations);
        booksTitlesWithTranslations.put("FL", flashTranslations);

        return booksTitlesWithTranslations;
    }


    @Test
    public void shouldReturnListOfMovies() {
        //Given
        Map<String, List<String>> preparedData = createMovieStore();

        //When
        String actual = preparedData.values().stream()
                .flatMap(entry -> entry.stream())
                .collect(Collectors.joining("! "));
        System.out.println(actual +"!");

        //Then

    }
}
