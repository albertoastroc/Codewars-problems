package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Character> collection = List.of('a', 'b', 'c', 'd', 'e', 'f');
        List<Character> collection2 = List.of('a', 'b', 'c', 'd');
        List<Character> collection3 = List.of('a', 'b', 'c', 'd', 'a', 'b', 'c', 'd'
                , 'a', 'b', 'c', 'd', 'a', 'b', 'c', 'd'
                , 'a', 'b', 'c', 'd', 'a', 'b', 'c', 'd'
                , 'a', 'b', 'c', 'd', 'a', 'b', 'c', 'd'
                , 'a', 'b', 'c', 'd', 'a', 'b', 'c', 'd'
                , 'a', 'b', 'c', 'd', 'a', 'b', 'c'
        );

        System.out.println("Size " + collection3.size());

        System.out.println("Hello world!");


        // PaginationHelper paginationHelper = new PaginationHelper(collection, 4);

        PaginationHelper paginationHelper2 = new PaginationHelper(collection3, 8);

        System.out.println("Page count " + paginationHelper2.pageCount());

        //System.out.println(paginationHelper.pageItemCount(-10));
//        System.out.println(paginationHelper.pageItemCount(1));
//        System.out.println(paginationHelper.pageItemCount(0));

        //total minus per



        int[][] array = new int[][] {
                {0, 0, 1},
                {0, 1, 2},
                {2, 1, 0}
        };

    }
}