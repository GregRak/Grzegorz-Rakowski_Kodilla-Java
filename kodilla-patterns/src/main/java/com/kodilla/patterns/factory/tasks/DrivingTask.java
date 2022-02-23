package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {

    private final String taskName;
    private final String where;
    private final String using;
    private boolean isDone = false;

    public DrivingTask(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    @Override
    public String executeTask() {
        return "I'm going into " + where + " by " + using;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if (isDone) {
            return true;
        } else {
            return false;
        }
    }


}
