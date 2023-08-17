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

    @Test
    public void shouldEpicMatches() {
        Epic epic = new Epic(1, new String[]
                {"Подстричься ", "помыться", "пообедать"});

        boolean expected = true;
        boolean actual = epic.matches("Подстричься");

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldEpicNotMatches() {
        Epic epic = new Epic(1, new String[]
                {"Подстричься ", "помыться", "пообедать"});

        boolean expected = false;
        boolean actual = epic.matches("подстричься");

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldMeetingMatches() {
        Meeting meeting = new Meeting(1, "Среда", "Встреча", "Покупка квартиры");

        boolean expected = true;
        boolean actual = meeting.matches("Встреча");

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldMeetingMatches2() {
        Meeting meeting = new Meeting(1, "Среда", "Встреча", "Покупка квартиры");

        boolean expected = true;
        boolean actual = meeting.matches("Покупка квартиры");

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldMeetingNotMatches() {
        Meeting meeting = new Meeting(1, "Среда", "Встреча", "Покупка квартиры");

        boolean expected = false;
        boolean actual = meeting.matches("встреча");

        Assertions.assertEquals(expected, actual);

    }


}
