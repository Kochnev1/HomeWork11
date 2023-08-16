package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TasksTest {
    @Test
    public void shouldSimpleTaskMatches() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean expected = true;
        boolean actual = simpleTask.matches("Позвонить");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSimpleTaskNotMatches() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean expected = false;
        boolean actual = simpleTask.matches("позвонить");

        Assertions.assertEquals(expected, actual);
    }

}
