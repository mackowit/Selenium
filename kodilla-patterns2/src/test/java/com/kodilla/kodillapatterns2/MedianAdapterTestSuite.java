package com.kodilla.kodillapatterns2;

import com.kodilla.kodillapatterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.kodillapatterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        Book book1 = new Book("author1", "title1", 1980, "sign1");
        Book book2 = new Book("author2", "title2", 1970, "sign2");
        Book book3 = new Book("author3", "title3", 1960, "sign3");
        Book book4 = new Book("author4", "title4", 1950, "sign4");
        Book book5 = new Book("author5", "title5", 1940, "sign5");
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int publYearMedian = medianAdapter.publicationYearMedian(bookSet);
        //Then
        System.out.println(publYearMedian);
    }
}
