package com.stackroute;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.Locale.filter;

public class FilterStringLambdaStreamDemo {

    public List<String> search(List<String> words) {
        Predicate<String> startsWitha = (n) -> n.startsWith("a");
        Predicate<String> threeLetterLong = (n) -> n.length() == 3;

        List<String> word1 =   words.stream().filter(startsWitha.and(threeLetterLong)).collect(Collectors.toList());


        return word1;
    }
}
