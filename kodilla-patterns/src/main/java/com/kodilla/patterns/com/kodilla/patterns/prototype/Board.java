package com.kodilla.patterns.com.kodilla.patterns.prototype;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public final class Board extends Prototype<Board> {

    private String name;
    private final Set<TasksList> lists = new HashSet<>();

    public Board(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<TasksList> getLists() {
        return lists;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Board shallowCopy() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        String s = "Board [" + name + "]\n";
        for(TasksList tasksList: lists) {
            s = s + tasksList.toString() + "\n";
        }
        return s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Board board = (Board) o;
        return Objects.equals(name, board.name) &&
                Objects.equals(lists, board.lists);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lists);
    }
}
