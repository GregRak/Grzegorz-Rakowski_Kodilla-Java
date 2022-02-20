package com.kodilla.patterns.prototype.library;

public class LibraryPrototype<T> implements Cloneable {

    @Override
    public T clone() throws CloneNotSupportedException {
        return (T) super.clone();
    }
}
