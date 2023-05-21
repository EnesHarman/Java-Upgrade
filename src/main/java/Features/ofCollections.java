package Features;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ofCollections {
    public static void main(String[] args) {
        List<String> people = List.of("Enes", "Ali", "Mert", "Beyza", "İrem", "Ahmet");
        Set<String> games = Set.of("Skyrim", "Witcher 3", "Elden Ring", "Fifa");
        Map<String, Integer> notes = Map.of("Enes", 90, "Şimal", 76, "Mert", 54);
        Map<String, Integer> levels = Map.ofEntries(Map.entry("Enes", 10), Map.entry("Emir", 5));
    }
}
