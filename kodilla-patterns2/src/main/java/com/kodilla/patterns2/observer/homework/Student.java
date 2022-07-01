package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Student implements ObservableCourse {

    private String name;
    private List<ObserverCourse> observers;
    private List<String> homework;
    private Course course;

    public Student(String name, Course course) {
        this.name = name;
        observers = new ArrayList<>();
        homework = new ArrayList<>();
        this.course = course;
    }

    public void addHomework(String task){
        homework.add(task);
        notifyObservers();
    }


    @Override
    public void registerObserver(ObserverCourse observerCourse) {
        observers.add(observerCourse);
    }

    @Override
    public void notifyObservers() {
        for (ObserverCourse observerCourse: observers){
            observerCourse.update(this);
        }
    }

    @Override
    public void removeObserver(ObserverCourse observerCourse) {
        observers.remove(observerCourse);

    }

    public String getName() {
        return name;
    }

    public List<ObserverCourse> getObservers() {
        return observers;
    }

    public List<String> getHomework() {
        return homework;
    }

    public Course getCourse() {
        return course;
    }
}
