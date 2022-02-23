package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

        public static final String SHOPPINGTASK = "SHOPPINGTASK";
        public static final String PAINTINGTASK = "PAINTINGTASK";
        public static final String DRIVINGTASK = "DRIVINGTASK";

        public static Task makeTask(final String taskClass) {
            switch (taskClass){
                case SHOPPINGTASK:
                    return new ShoppingTask("Food", "Egs", 10);
                case PAINTINGTASK:
                    return new PaintingTask("Flat painting", "White", "Kitchen");
                case DRIVINGTASK:
                    return new DrivingTask("Drive1", "Cracow", "Car");
                default:
                    return null;
            }
        }
}
