package com.kodilla.kodillapatterns2.observer.homework;

public class Mentor implements Observer {
    private final String name;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(TasksQueue tasksQueue, String task) {
        System.out.println("You have task " + task + " from username " + tasksQueue.getUsername() + " to check in your queue. Total number of tasks to check from " + tasksQueue.getUsername() + ": " + tasksQueue.getTasks().size() + ".");
    }

    public String getName() {
        return name;
    }
}
