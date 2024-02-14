package org.example;

import com.sun.source.tree.BreakTree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Int32ToIpv4 {

    public static String longToIP(long ip) {
        // Java doesn't have uint32, so here we use long to represent int32

        String stringer = Long.toString(ip, 2);

        String stringer2 = Long.toString(ip);

        Long longer = Long.parseLong(stringer.substring(24, 32), 2);

        List<Integer> strings = new ArrayList<>();

        int counter = 0;
        for (int i = 0; i < 4; i++) {

            strings.add(Integer.valueOf(stringer.substring(counter, counter + 8), 2));
            counter += 8;

        }
        System.out.println(strings);

//        System.out.println(stringer);
//        System.out.println(stringer2);

        System.out.println(longer);

        String result = "";

        for (int i = 0; i < strings.size(); i++) {

            if (i != strings.size() - 1){

                result += strings.get(i) + ".";

            } else {

                result += strings.get(i);

            }

        }


        return result; // do it!
    }

}