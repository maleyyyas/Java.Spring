package org.example.app.services;

import org.example.app.exceptions.BookShelfQueryRegexException;

import java.util.List;

public interface ProjectRepository<T> {
    List<T> retreiveAll();

    void store(T book);

    boolean removeItemById(Integer bookIdToRemove);

    void removeItemByRegex(String queryRegex) throws BookShelfQueryRegexException;
}
