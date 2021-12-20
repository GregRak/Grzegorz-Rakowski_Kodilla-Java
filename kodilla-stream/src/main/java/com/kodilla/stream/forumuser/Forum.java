package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> listOfForumUser = new ArrayList<>();

    public Forum() {
        listOfForumUser.add(new ForumUser(1, "user1", 'M', 1976, 11, 04,1));
        listOfForumUser.add(new ForumUser(2, "user2", 'M', 1985, 10, 10,5));
        listOfForumUser.add(new ForumUser(3, "user3", 'F', 2004, 4, 12,7));
        listOfForumUser.add(new ForumUser(4, "user4", 'M', 2006, 5, 21,3));
        listOfForumUser.add(new ForumUser(5, "user5", 'F', 1999, 9, 14,11));
        listOfForumUser.add(new ForumUser(6, "user6", 'M', 2011, 10, 20,8));
        listOfForumUser.add(new ForumUser(7, "user7", 'F', 2004, 12, 22,7));
        listOfForumUser.add(new ForumUser(8, "user8", 'M', 2007, 9, 15,14));
        listOfForumUser.add(new ForumUser(9, "user9", 'M', 1999, 7, 06,15));
        listOfForumUser.add(new ForumUser(10, "user10", 'F', 2007, 8, 28,17));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(listOfForumUser);
    }
}
