package com.kodilla.kodillapatterns2.adapter.bookclasifier.librarya;

import com.kodilla.kodillapatterns2.adapter.bookclasifier.librarya.Book;

import java.util.Set;

public interface Classifier {
    int publicationYearMedian(Set<Book> bookSet);
}
