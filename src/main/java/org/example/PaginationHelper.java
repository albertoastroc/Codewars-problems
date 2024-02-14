package org.example;

import java.util.List;

// TODO: complete this object/class

public class PaginationHelper<I> {

    private List<I> collection;
    int itemsPerPage;

    /**
     * The constructor takes in an array of items and a integer indicating how many
     * items fit within a single page
     */
    public PaginationHelper(List<I> collection, int itemsPerPage) {
        this.collection = collection;
        this.itemsPerPage = itemsPerPage;
        System.out.println("Items per page " + itemsPerPage);
        System.out.println("Collection size " + collection.size());



    }

    /**
     * returns the number of items within the entire collection
     */
    public int itemCount() {
        return collection.size();
    }

    /**
     * returns the number of pages
     */
    public int pageCount() {



        if (collection.size() == 0) {

            return 0;

        }

        if (itemsPerPage == collection.size()) {

            return 1;

        }

        int pages = collection.size() % itemsPerPage;


        if (pages != 0){

            return (collection.size() / itemsPerPage) + 1;

        } else return collection.size() / itemsPerPage;
    }

    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    public int pageItemCount(int pageIndex) {

        if (collection.size() == itemsPerPage && pageIndex > 0) {

            return -1;

        }

        int pages = pageCount();

        System.out.println("Inside pagesCount " + pages);


        if (collection.isEmpty() || pageIndex < 0 || pageIndex > pages -1){

            return -1;

        }

        if (pageIndex == pages- 1){

            int remaining = collection.size() % itemsPerPage;

            if (remaining == 0) {

                return itemsPerPage;

            } else {

                return collection.size() % itemsPerPage;

            }

        }

        return itemsPerPage;
    }

    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    public int pageIndex(int itemIndex) {

        if (itemIndex > collection.size() - 1){
            return -1;
        } else if (itemIndex < 0){
            return -1;
        }

        int pageNumber = itemIndex / itemsPerPage;
        return pageNumber;

    }
}