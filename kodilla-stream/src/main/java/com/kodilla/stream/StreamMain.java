package com.kodilla.stream;

import com.kodilla.stream.array.ArrayOperations;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.world.Continent;
import com.kodilla.stream.world.Country;
import com.kodilla.stream.world.World;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

//   int table[] = new int[6];
//        table[0] = 1;
//        table[1] = 12;
//        table[2] = 43;
//       table[3] = 4;
//       table[4] = 55;
//        table[5] = 6;

        int table[] = {2,4,6,8,9,4};

        ArrayOperations.getAverage(table);
        System.out.println();
    }
}
