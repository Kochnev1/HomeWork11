package ru.netology.javaqa;

public class Meeting extends Task {
    protected String start;
    protected String topic;
    protected String project;

    public Meeting(int id, String start, String topic, String project) {
        super(id); // вызов родительского конструктора
        this.start = start; // заполнение своих полей
        this.topic = topic; // тема обсуждения
        this.project = project; // Название проекта
    }

    public String getStart() {
        return start;
    }

    public String getTopic() {
        return topic;
    }

    public String getProject() {
        return project;
    }

}