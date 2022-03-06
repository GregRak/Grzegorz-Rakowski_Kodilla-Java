package com.kodilla.jdbc;

import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.*;

public class DbManagerTestSuite {

    @Test
    void testConnection() throws SQLException {
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        assertNotNull(dbManager.getConnection());
    }

    @Test
    void testSelectUsers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        //When
        String sqlQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);
        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        assertEquals(5, counter);
    }

    @Test
    void testSelectUsersAndPosts() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        //When
        String sqlQuery =
                "SELECT U.FIRSTNAME, U.LASTNAME, COUNT(*) AS NUMBER_OF_POSTS " +
                "FROM USERS U JOIN POSTS P ON U.ID = P.USER_ID " +
                "GROUP BY U.ID " +
                "HAVING NUMBER_OF_POSTS > 1;";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);
        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println("Users who posted more than one post:\n" +
                    rs.getString("FIRSTNAME") + " " +
                    rs.getString("LASTNAME") + ", number of posts: " +
                    rs.getInt("NUMBER_OF_POSTS"));
            counter++;
        }
        rs.close();
        statement.close();
        assertEquals(1, counter);
    }
}
