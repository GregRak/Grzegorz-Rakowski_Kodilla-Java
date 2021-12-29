package com.kodilla.stream.portfolio;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardTestSuite {

    @Test
    void testAddTaskList() {
        //Given
        Board project = prepareTestData();
        //When
        //Then
        assertEquals(3, project.getTaskLists().size());
    }

    @Test
    void testAddTaskListFindUsersTasks() {
        //Given
        Board project = prepareTestData();
        //When
        User user = new User("developer1", "John Smith");
        List<Task> tasks = project.getTaskLists().stream()
                .flatMap(l -> l.getTasks().stream())
                .filter(t -> t.getAssignedUser().equals(user))
                .collect(toList());
        //Then
        assertEquals(2, tasks.size());
        assertEquals(user, tasks.get(0).getAssignedUser());
        assertEquals(user, tasks.get(1).getAssignedUser());
    }


    @Test
    void testAddTaskListFindOutdatedTasks() {
        //Given
        Board project = prepareTestData();

        //When
        List<TaskList> undoneTasks = new ArrayList<>();
        undoneTasks.add(new TaskList("To do"));
        undoneTasks.add(new TaskList("In progress"));
        List<Task> tasks = project.getTaskLists().stream()
                .filter(undoneTasks::contains)
                .flatMap(tl -> tl.getTasks().stream())
                .filter(t -> t.getDeadline().isBefore(LocalDate.now()))
                .collect(toList());

        //Then
        assertEquals(1, tasks.size());
        assertEquals("HQLs for analysis", tasks.get(0).getTitle());
    }


    @Test
    void testAddTaskListFindLongTasks() {
        //Given
        Board project = prepareTestData();

        //When
        List<TaskList> inProgressTasks = new ArrayList<>();
        inProgressTasks.add(new TaskList("In progress"));
        long longTasks = project.getTaskLists().stream()
                .filter(inProgressTasks::contains)
                .flatMap(tl -> tl.getTasks().stream())
                .map(Task::getCreated)
                .filter(d -> d.compareTo(LocalDate.now().minusDays(10)) <= 0)
                .count();

        //Then
        assertEquals(2, longTasks);
    }

    @Test
    void testAddTaskListFindOutdatedTasks2() {
        //Given
        Board project = prepareTestData();

        //When
        List<TaskList> undoneTasks = new ArrayList<>();
        undoneTasks.add(new TaskList("To do"));
        undoneTasks.add(new TaskList("In progress"));
        List<Task> tasks = project.getTaskLists().stream()
                .filter(n -> n.getName().equals("To do") || n.getName().equals("In progress"))
                .flatMap(tl -> tl.getTasks().stream())
                .filter(t -> t.getDeadline().isBefore(LocalDate.now()))
                .collect(toList());

        //Then
        assertEquals(1, tasks.size());
        assertEquals("HQLs for analysis", tasks.get(0).getTitle());
    }


    @Test
    void testAddTaskListFindLongTasks() {
        //Given
        Board project = prepareTestData();

        //When
        List<TaskList> inProgressTasks = new ArrayList<>();
        inProgressTasks.add(new TaskList("In progress"));
        long longTasks = project.getTaskLists().stream()
                .filter(list -> list.getName().equals("In progress"))
                .flatMap(tl -> tl.getTasks().stream())
                .map(Task::getCreated)
                .filter(d -> d.compareTo(LocalDate.now().minusDays(10)) <= 0)
                .count();

        //Then
        assertEquals(2, longTasks);
    }


    //My test
    @Test
    void myTestAddTaskListFindOutdatedTasks() {
        //Given
        Board project = prepareTestData();
        //When
//        User user1 = new User("developer1", "John Smith");
//        User user2 = new User("projectmanager1", "Nina White");
//        Task taskToCheck = new Task("HQLs for analysis",
//                "Prepare some HQL queries for analysis",
//                user1,
//                user2,
//                LocalDate.now().minusDays(20),
//                LocalDate.now().minusDays(5));
        List<Task> tasks = project.getTaskLists().stream()
                .filter(n -> n.getName().equals("To do") || n.getName().equals("In progress"))
                .flatMap(l -> l.getTasks().stream())
                .filter(t -> t.getDeadline().isBefore(LocalDate.now()))
                .collect(toList());
        //Then
        assertEquals(1, tasks.size());
        assertEquals("HQLs for analysis", tasks.get(0).getTitle());
    }


    //My test
    @Test
    void myTestAddTaskListFindLongTasks() {
        //Given
        Board project = prepareTestData();
        //When
        List<Task> tasks = project.getTaskLists().stream()
                .filter(list -> list.getName().equals("In progress"))
                .flatMap(tl -> tl.getTasks().stream())
                .filter((t -> t.getCreated().isBefore(LocalDate.now().minusDays(9))))
                .collect(toList());
        //Then
        assertEquals(2, tasks.size());
    }

    @Test
    void testAddTaskListAverageWorkingOnTask() {
        //Given
        Board project = prepareTestData();
        //When
        List<TaskList> inProgresTasks = new ArrayList<>();
        inProgresTasks.add(new TaskList("In progress"));
        long sumOfDays = project.getTaskLists().stream()
                .filter(inProgresTasks::contains)
                .flatMap(l -> l.getTasks().stream())
                .map(t -> LocalDate.now().toEpochDay() - t.getCreated().toEpochDay())
                .mapToInt(d -> d.intValue())
                .sum();
                //.reduce(0, (sum, current) -> sum = sum + current);

        long numberOfTasks = project.getTaskLists().stream()
                .filter(inProgresTasks::contains)
                .flatMap(l -> l.getTasks().stream())
                .count();

        long calculationAverage = sumOfDays / numberOfTasks;
        //Then
        assertEquals(3, numberOfTasks);
        assertEquals(10, calculationAverage);
    }

    @Test
    void testAddTaskListAverageWorkingOnTaskWithAverage() {
        //Given
        Board project = prepareTestData();
        //When
        List<TaskList> progressTaskList = new ArrayList<>();
        progressTaskList.add(new TaskList("In progress"));
        double averageDays = project.getTaskLists().stream()
                .filter(progressTaskList::contains)
                .flatMap(l -> l.getTasks().stream())
                .map(t -> LocalDate.now().toEpochDay() - t.getCreated().toEpochDay())
                .mapToDouble(d -> d.doubleValue())
                .average().getAsDouble();

        //Then
        assertEquals(10.0, averageDays);
    }

    private Board prepareTestData() {
        //Users
        User user1 = new User("developer1", "John Smith");
        User user2 = new User("projectmanager1", "Nina White");
        User user3 = new User("developer2", "Emilia Stephanson");
        User user4 = new User("developer3", "Konrad Bridge");

        //tasks
        Task task1 = new Task("Microservice for taking temperature",
                "Write and test the microservice taking\n" +
                        "the temperaure from external service",
                user1,
                user2,
                LocalDate.now().minusDays(20),
                LocalDate.now().plusDays(30));
        Task task2 = new Task("HQLs for analysis",
                "Prepare some HQL queries for analysis",
                user1,
                user2,
                LocalDate.now().minusDays(20),
                LocalDate.now().minusDays(5));
        Task task3 = new Task("Temperatures entity",
                "Prepare entity for temperatures",
                user3,
                user2,
                LocalDate.now().minusDays(20),
                LocalDate.now().plusDays(15));
        Task task4 = new Task("Own logger",
                "Refactor company logger to meet our needs",
                user3,
                user2,
                LocalDate.now().minusDays(10),
                LocalDate.now().plusDays(25));
        Task task5 = new Task("Optimize searching",
                "Archive data searching has to be optimized",
                user4,
                user2,
                LocalDate.now(),
                LocalDate.now().plusDays(5));
        Task task6 = new Task("Use Streams",
                "use Streams rather than for-loops in predictions",
                user4,
                user2,
                LocalDate.now().minusDays(15),
                LocalDate.now().minusDays(2));

        //taskList
        TaskList taskListToDo = new TaskList("To do");
        taskListToDo.addTask(task1);
        taskListToDo.addTask(task3);
        TaskList taskListInProgress = new TaskList("In progress");
        taskListInProgress.addTask(task5);
        taskListInProgress.addTask(task4);
        taskListInProgress.addTask(task2);
        TaskList taskListDone = new TaskList("Done");
        taskListDone.addTask(task6);

        //
        Board project = new Board("Project Weather Prediction");
        project.addTaskList(taskListToDo);
        project.addTaskList(taskListInProgress);
        project.addTaskList(taskListDone);
        return project;
    }
}
