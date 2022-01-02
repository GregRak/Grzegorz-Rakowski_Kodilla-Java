package com.kodilla.exception.nullpointer;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        User user1 = new User("user1", 30, 100, "Test");

        //first example - Optional
        Optional<User> optionalUser = Optional.of(user1);

        //second - get info about user in Optional box
        String userName = optionalUser.orElse(new User("", 0, 0, "")).getName();
        System.out.println(userName);

        //third - This method works by doing what Optional wrapped,
        // but only if the wrapped object is non-null. Otherwise, no action is performed.
        optionalUser.ifPresent(u -> System.out.println(u.getName()));
    }
}
