package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.ForumUser;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@DisplayName("Forum Statistics Tests")
public class ForumStatisticsTestSuite {

    @BeforeEach
    void beforeEach() {
        System.out.println("The beginning of test");
    }

    @AfterEach
    void afterEach() {
        System.out.println("The end of test");
    }

    @Mock
    private Statistics statisticsMock;

    public List<String> usersGenerator(int users) {
        List<String> listOfUsers = new ArrayList<>();
        for (int i = 1; i <= users; i++) {
            String user = "User" + i;
            listOfUsers.add(user);
        }
        return listOfUsers;
    }

    @Test
    void calculateAdvStatistics0Posts () {
        //Given
        ForumStatistics statistics = new ForumStatistics();
        List<String> theListOfUsers = usersGenerator(10);
        int postsNumber = 0;
        int commentsNumber = 0;
        when(statisticsMock.postsCount()).thenReturn(postsNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);
        when(statisticsMock.usersNames()).thenReturn(theListOfUsers);
        //When
        statistics.calculateAdvStatistics(statisticsMock);
        double avePostPerUserResult = statistics.getAverageNumberOfPostsPerUser();
        double aveCommentsPerPostResult = statistics.getAverageNumberOfCommentsPerPost();
        //Then
        Assertions.assertEquals(0, avePostPerUserResult);
        Assertions.assertEquals(0, aveCommentsPerPostResult);
    }

    @Test
    void calculateAdvStatistics1000Posts() {
        //Given
        ForumStatistics statistics = new ForumStatistics();
        List<String> theUsersList = usersGenerator(10);
        int postsNumber = 1000;
        int commentsNumber = 100;
        when(statisticsMock.usersNames()).thenReturn(theUsersList);
        when(statisticsMock.postsCount()).thenReturn(postsNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);
        //When
        statistics.calculateAdvStatistics(statisticsMock);
        double avePostPerUserResult = statistics.getAverageNumberOfPostsPerUser();
        double aveCommentsPerPostResult = statistics.getAverageNumberOfCommentsPerPost();
        //Then
        Assertions.assertEquals(100, avePostPerUserResult);
        Assertions.assertEquals(0.1, aveCommentsPerPostResult);
    }

    @Test
    void calculateAdvStatistics0Comments() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> theUsersList = usersGenerator(10);
        int postsNumber = 10;
        int commentsNumber = 0;
        when(statisticsMock.usersNames()).thenReturn(theUsersList);
        when(statisticsMock.postsCount()).thenReturn(postsNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        double aveCommentsPerUserResult = forumStatistics.getAverageNumberOfCommentsPerUser();
        double aveCommentsPerPostResult = forumStatistics.getAverageNumberOfCommentsPerPost();
        //Then
        Assertions.assertEquals(0, aveCommentsPerUserResult);
        Assertions.assertEquals(0, aveCommentsPerPostResult);
    }

    @Test
    void calculateAdvStatisticsMorePostsThanComments() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> theUsersList = usersGenerator(10);
        int postsNumber = 100;
        int commentsNumber = 50;
        when(statisticsMock.usersNames()).thenReturn(theUsersList);
        when(statisticsMock.postsCount()).thenReturn(postsNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        double avePostPerUserResult = forumStatistics.getAverageNumberOfPostsPerUser();
        double aveCommentsPerUserResult = forumStatistics.getAverageNumberOfCommentsPerUser();
        double aveCommentsPerPostResult = forumStatistics.getAverageNumberOfCommentsPerPost();
        //Then
        Assertions.assertEquals(10, avePostPerUserResult);
        Assertions.assertEquals(5, aveCommentsPerUserResult);
        Assertions.assertEquals(0.5, aveCommentsPerPostResult);
    }

    @Test
    void calculateAdvStatisticsMoreCommentsThanPosts() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> theUsersList = usersGenerator(10);
        int postsNumber = 100;
        int commentsNumber = 500;
        when(statisticsMock.usersNames()).thenReturn(theUsersList);
        when(statisticsMock.postsCount()).thenReturn(postsNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        double avePostPerUserResult = forumStatistics.getAverageNumberOfPostsPerUser();
        double aveCommentsPerUserResult = forumStatistics.getAverageNumberOfCommentsPerUser();
        double aveCommentsPerPostResult = forumStatistics.getAverageNumberOfCommentsPerPost();
        //Then
        Assertions.assertEquals(10, avePostPerUserResult);
        Assertions.assertEquals(50, aveCommentsPerUserResult);
        Assertions.assertEquals(5, aveCommentsPerPostResult);
    }

    @Test
    void calculateAdvStatistics0Users() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> theUserList = usersGenerator(0);
        int postsNumber = 10;
        int commentsNumber = 20;
        when(statisticsMock.usersNames()).thenReturn(theUserList);
        when(statisticsMock.postsCount()).thenReturn(postsNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        double avePostPerUserResult = forumStatistics.getAverageNumberOfPostsPerUser();
        double aveCommentsPerUserResult = forumStatistics.getAverageNumberOfCommentsPerUser();
        double aveCommentsPerPostResult = forumStatistics.getAverageNumberOfCommentsPerPost();
        //Then
        Assertions.assertEquals(0, avePostPerUserResult);
        Assertions.assertEquals(0, aveCommentsPerUserResult);
        Assertions.assertEquals(2, aveCommentsPerPostResult);
    }

    @Test
    void calculateAdvStatistics100Users() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> theUserList = usersGenerator(100);
        int postsNumber = 20;
        int commentsNumber = 50;
        when(statisticsMock.usersNames()).thenReturn(theUserList);
        when(statisticsMock.postsCount()).thenReturn(postsNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        double avePostPerUserResult = forumStatistics.getAverageNumberOfPostsPerUser();
        double aveCommentsPerUserResult = forumStatistics.getAverageNumberOfCommentsPerUser();
        double aveCommentsPerPostResult = forumStatistics.getAverageNumberOfCommentsPerPost();
        //Then
        Assertions.assertEquals(0.2, avePostPerUserResult);
        Assertions.assertEquals(0.5, aveCommentsPerUserResult);
        Assertions.assertEquals(2.5, aveCommentsPerPostResult);
    }
}
