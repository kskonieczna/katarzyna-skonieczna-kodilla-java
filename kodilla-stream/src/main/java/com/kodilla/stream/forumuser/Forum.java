package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theForumUserList = new ArrayList<>();

    public Forum() {
        theForumUserList.add(new ForumUser(01, "Kasia Skonieczna",
                'F', LocalDate.of(1950, 1, 12), 80));
        theForumUserList.add(new ForumUser(02, "Weronika Skonieczna",
                'F', LocalDate.of(1952, 1, 10), 47));
        theForumUserList.add(new ForumUser(03, "Dawid Skonieczny",
                'M', LocalDate.of(1958, 1, 19), 11));
        theForumUserList.add(new ForumUser(04, "Dawid Skonieczny",
                'M', LocalDate.of(2000, 1, 19), 11));
        theForumUserList.add(new ForumUser(05, "Dawid Skonieczny",
                'M', LocalDate.of(1975, 1, 19), 0));
    }

    public List<ForumUser> getList() {
        return new ArrayList<>(theForumUserList);
    }
}
