package com.kodilla.kodillapatterns2;

import com.kodilla.kodillapatterns2.observer.homework.Mentor;
import com.kodilla.kodillapatterns2.observer.homework.TasksQueue;
import org.junit.Test;

public class MentorTestSuite {
    @Test
    public void testUpdate() {
        //Given
        TasksQueue user1queue = new TasksQueue("user1");
        TasksQueue user2queue = new TasksQueue("user2");
        TasksQueue user3queue = new TasksQueue("user3");
        TasksQueue user4queue = new TasksQueue("user4");
        Mentor mentor1 = new Mentor("mentor1");
        Mentor mentor2 = new Mentor("mentor2");
        user1queue.registerObserver(mentor1);
        user2queue.registerObserver(mentor1);
        user3queue.registerObserver(mentor1);
        user4queue.registerObserver(mentor2);

        //When
        user1queue.addTask("task1.1");
        user1queue.addTask("task1.2");
        user1queue.addTask("task1.3");
        user2queue.addTask("task2.1");
        user2queue.addTask("task2.2");
        user4queue.addTask("task4.1");
        user4queue.addTask("task4.2");

        //Then
    }
}
