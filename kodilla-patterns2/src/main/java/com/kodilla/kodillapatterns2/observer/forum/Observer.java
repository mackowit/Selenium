package com.kodilla.kodillapatterns2.observer.forum;

import com.kodilla.kodillapatterns2.observer.homework.TasksQueue;

public interface Observer {
    void update(ForumTopic forumTopic);
}
