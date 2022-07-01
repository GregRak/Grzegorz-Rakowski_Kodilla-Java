package com.kodilla.patterns2.observer.homework;

public interface ObservableCourse {
    void registerObserver(ObserverCourse observerCourse);
    void notifyObservers();
    void removeObserver(ObserverCourse observerCourse);
}
