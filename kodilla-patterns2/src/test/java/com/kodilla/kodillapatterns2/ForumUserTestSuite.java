package com.kodilla.kodillapatterns2;

import com.kodilla.kodillapatterns2.observer.forum.ForumTopic;
import com.kodilla.kodillapatterns2.observer.forum.ForumUser;
import com.kodilla.kodillapatterns2.observer.forum.JavaHelpForumTopic;
import com.kodilla.kodillapatterns2.observer.forum.JavaToolsForumTopic;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ForumUserTestSuite {
    @Test
    public void testUpdate() {
        //Given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaTollsForum = new JavaToolsForumTopic();
        ForumUser johnSmith = new ForumUser("John Smith");
        ForumUser ivoneEscobar = new ForumUser("Ivone Escobar");
        ForumUser jessiePinkman = new ForumUser("Jessie Pinkman");
        javaHelpForum.registerObserver(johnSmith);
        javaTollsForum.registerObserver(ivoneEscobar);
        javaHelpForum.registerObserver(jessiePinkman);
        javaTollsForum.registerObserver(jessiePinkman);
        //When
        javaHelpForum.addPost("post 1");
        javaHelpForum.addPost("post 2");
        javaHelpForum.addPost("post 3");
        javaTollsForum.addPost("post 4");
        javaTollsForum.addPost("post 5");
        //Then
        assertEquals(3, johnSmith.getUpdateCount());
        assertEquals(2, ivoneEscobar.getUpdateCount());
        assertEquals(5, jessiePinkman.getUpdateCount());
    }
}
