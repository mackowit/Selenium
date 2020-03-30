package com.kodilla.kodillapatterns2.adapter.bookclasifier;

import com.kodilla.kodillapatterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.kodillapatterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.*;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryb.Book> books = new HashMap<>();
        List<Book> bookList = new ArrayList<>();
        bookList.addAll(bookSet);
        for (int i = 0; i < bookSet.size(); i++) {
            books.put(new BookSignature(bookList.get(i).getSignature()), new com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryb.Book(bookList.get(i).getAuthor(), bookList.get(i).getTitle(), bookList.get(i).getPublicationYear()));
        }
        return medianPublicationYear(books);
    }
}
