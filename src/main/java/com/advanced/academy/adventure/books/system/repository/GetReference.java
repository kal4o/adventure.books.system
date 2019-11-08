package com.advanced.academy.adventure.books.system.repository;


public interface GetReference {

    <T> T getReference(Class<T> tClass, Integer id);

}
