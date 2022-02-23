package com.kodilla.patterns.factory.tasks;

public interface Task {

    String executeTask();
    String getTaskName();
    boolean isTaskExecuted();
    void setDone(boolean done);
}
