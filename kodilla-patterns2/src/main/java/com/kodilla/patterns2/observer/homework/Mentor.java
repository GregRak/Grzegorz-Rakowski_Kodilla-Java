package com.kodilla.patterns2.observer.homework;

public class Mentor implements ObserverCourse{
    private final String username;
    private int updateCount;

    public Mentor(String username) {
        this.username = username;
    }

    @Override
    public void update(Student student) {
        System.out.println(username+": new topic in: "+student.getCourse().toString()+" from: "+ student.getName()+
                "\n(total: "+student.getHomework().size()+" topics)");
        updateCount++;

    }
    public String getUsername() {
        return username;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
