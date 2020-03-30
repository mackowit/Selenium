package com.kodilla.kodillapatterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class TasksQueue implements Observable {
    private final List<Observer> observers;
    private final List<String> tasks;
    private final String username;

    public TasksQueue(String username) {
        observers = new ArrayList<>();
        tasks = new ArrayList<>();
        this.username = username;
    }

    public void addTask(String task) {
        tasks.add(task);
        notifyObservers(task);
    }

    @Override
    public void notifyObservers(String task) {
        for(Observer observer : observers) {
            observer.update(this, task);
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public List<String> getTasks() {
        return tasks;
    }

    public String getUsername() {
        return username;
    }
}
