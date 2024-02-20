package org.example.kyu7;

import java.util.List;
import java.util.stream.Collectors;

public class ListFiltering {

    public static List<Object> filterList(final List<Object> list) {
        // Return the List with the Strings filtered out

        List<Object> result = list.stream().filter( x -> x instanceof Integer).map(obj -> (Integer) obj).collect(Collectors.toList());
        return result;

    }

}