package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeworkTestSuite {
    @Test
    void testUpdateMentor(){
        //Given
        Student adamBen = new Student("Adam Nowak", Course.JAVA_COURSE);
        Student tomHak = new Student("Andrzej Kowalski",Course.JAVA_COURSE);
        Student annBak = new Student("Anna Smith",Course.PYTHON_COURSE);

        Mentor mentor1 = new Mentor("John Snow");
        Mentor mentor2 = new Mentor("Eduardo Columbo");

        adamBen.registerObserver(mentor1);
        tomHak.registerObserver(mentor1);
        annBak.registerObserver(mentor2);
        //When
        adamBen.addHomework("Homework: Hello World!");
        adamBen.addHomework("Homework: Patterns");
        tomHak.addHomework("Homework: Lambdas");
        tomHak.addHomework(("Homework: Hibernate"));
        annBak.addHomework("Homework: Spring");
        //Then
        assertEquals(2,adamBen.getHomework().size());
        assertEquals(2,tomHak.getHomework().size());
        assertEquals(1,annBak.getHomework().size());
    }
}
