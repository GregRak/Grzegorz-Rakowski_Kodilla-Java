package com.kodilla.good.patterns.challenges;

import java.util.*;
import java.util.stream.*;

public class MovieStore {
    public Map<String, List<String>> getMovies() {
        List<String> ironManTranslations = new ArrayList<>();
        ironManTranslations.add("Żelazny Człowiek");
        ironManTranslations.add("Iron Man");

        List<String> avengersTranslations = new ArrayList<>();
        avengersTranslations.add("Mściciele");
        avengersTranslations.add("Avengers");

        List<String> flashTranslations = new ArrayList<>();
        flashTranslations.add("Błyskawica");
        flashTranslations.add("Flash");

        Map<String, List<String>> booksTitlesWithTranslations = new HashMap<>();
        booksTitlesWithTranslations.put("IM", ironManTranslations);
        booksTitlesWithTranslations.put("AV", avengersTranslations);
        booksTitlesWithTranslations.put("FL", flashTranslations);

        return booksTitlesWithTranslations;
    }

    public String titlePrinter(Map<String, List<String>> booksTitlesWithTranslations) {
        Set<Map.Entry <String, List<String>>> entries = booksTitlesWithTranslations.entrySet();
        String expected = entries.stream()
                .flatMap(key -> key.getValue().stream())
                .reduce("", (x, current) -> current = current + "!" + x);
        return expected;
    }
}
