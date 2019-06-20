package com.kodilla.stream.forum;

import org.junit.*;

public class ForumUserTestSuite {
    private static int testCounter = 0;

    @Before
    public void before() {
        testCounter++;
        System.out.println("Test Case #" + testCounter + ": begin");
    }

    @After
    public void after() {
        System.out.println("Test Case #" + testCounter + ": finished");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: All tests are finished");
    }

    //sprawdzamy w nim listę lokalizacji znajomych użytkownika user1.
    // Jego znajomymi są user3, user7 oraz user10. Ich lokalizacje to odpowiednio:
    // Key West, Washington oraz Miami. Test sprawdza wpierw czy lista lokalizacji
    // zawiera dokładnie trzy elementy, a następnie weryfikuje istnienie w liście wynikowej konkretnych lokalizacji.

    @Test
    public void testGetLocationsOfFriends() {
        //Given
        //Create users
        ForumUser user1 = new ForumUser("alan01", "Alan Kosovsky", "Washington");
        ForumUser user2 = new ForumUser("ethanreard", "Ethan Reard", "Miami");
        ForumUser user3 = new ForumUser("eRiK", "Erik Hull", "Key West");
        ForumUser user4 = new ForumUser("booth", "Mya Booth", "Washington");
        ForumUser user5 = new ForumUser("nicole1987", "Nicole Lee", "Orlando");
        ForumUser user6 = new ForumUser("nobody", "Briana Williams", "Miami");
        ForumUser user7 = new ForumUser("bigmac", "Robert Macdonald", "Washington");
        ForumUser user8 = new ForumUser("thebigone", "Clay Small", "Orlando");
        ForumUser user9 = new ForumUser("user121212", "Marisa Frank", "Washington");
        ForumUser user10 = new ForumUser("lawyer", "Lexie John", "Miami");

        //When
        //Create relations for user1
        user1.addFriend(user3);
        user1.addFriend(user7);
        user1.addFriend(user10);
        //Create relations for user3
        user3.addFriend(user1);
        user3.addFriend(user7);
        user3.addFriend(user2);
        user3.addFriend(user9);
        //Create relations for user7
        user7.addFriend(user1);
        user7.addFriend(user3);
        //Create relations for user10
        user10.addFriend(user1);
        //Create relations for user2
        user2.addFriend(user3);
        //Create relations for user9
        user9.addFriend(user3);

        System.out.println("Testing " + user1.getLocationsOfFriends());

        //Then
        //user1 has 3 friends with following locations:
        //   user3:  "Key West"
        //   user7:  "Washington"
        //   user10: "Miami"
        Assert.assertEquals(3, user1.getLocationsOfFriends().size());
        Assert.assertTrue(user1.getLocationsOfFriends().contains("Key West"));
        Assert.assertTrue(user1.getLocationsOfFriends().contains("Washington"));
        Assert.assertTrue(user1.getLocationsOfFriends().contains("Miami"));
        Assert.assertFalse(user1.getLocationsOfFriends().contains("Orlando"));
    }

    @Test
    public void testGetLocationsOfFriendsOfFriends() {
        //test sprawdza czy lista lokalizacji "przyjaciół przyjaciół" zawiera dokładnie trzy lokalizacje.
        // Sprawdza również czy konkretne - oczekiwane lokalizacje - rzeczywiście występują w kolekcji wynikowej.
        //Given
        //Create users
        ForumUser user1 = new ForumUser("alan01", "Alan Kosovsky", "Washington");
        ForumUser user2 = new ForumUser("ethanreard", "Ethan Reard", "Miami");
        ForumUser user3 = new ForumUser("eRiK", "Erik Hull", "Key West");
        ForumUser user4 = new ForumUser("booth", "Mya Booth", "Washington");
        ForumUser user5 = new ForumUser("nicole1987", "Nicole Lee", "Orlando");
        ForumUser user6 = new ForumUser("nobody", "Briana Williams", "Miami");
        ForumUser user7 = new ForumUser("bigmac", "Robert Macdonald", "Washington");
        ForumUser user8 = new ForumUser("thebigone", "Clay Small", "Orlando");
        ForumUser user9 = new ForumUser("user121212", "Marisa Frank", "Washington");
        ForumUser user10 = new ForumUser("lawyer", "Lexie John", "Miami");

        //When
        //Create relations for user1
        user1.addFriend(user3);
        user1.addFriend(user7);
        user1.addFriend(user10);
        //Create relations for user3
        user3.addFriend(user1);
        user3.addFriend(user7);
        user3.addFriend(user2);
        user3.addFriend(user9);
        //Create relations for user7
        user7.addFriend(user1);
        user7.addFriend(user3);
        //Create relations for user10
        user10.addFriend(user1);
        //Create relations for user2
        user2.addFriend(user3);
        //Create relations for user9
        user9.addFriend(user3);
        System.out.println("Testing " + user2.getLocationsOfFriendsOfFriends());

        //Then
        //user1 has 3 friends with following friends and their locations:
        //   user3:  user1: - should be skipped ("this" in context of user1)
        //           user7: "Washington"
        //           user2: "Miami"
        //           user9: "Washington" - duplicated, should be skipped
        //   user7:  user1: - should be skipped ("this" in context of user1)
        //           user3: "Key West"
        //   user10: user1: - should be skipped ("this" in context of user1)
        Assert.assertEquals(3, user1.getLocationsOfFriendsOfFriends().size());
        Assert.assertTrue(user1.getLocationsOfFriendsOfFriends().contains("Key West"));
        Assert.assertTrue(user1.getLocationsOfFriendsOfFriends().contains("Washington"));
        Assert.assertTrue(user1.getLocationsOfFriendsOfFriends().contains("Miami"));
        Assert.assertFalse(user1.getLocationsOfFriendsOfFriends().contains("Orlando"));
    }
}