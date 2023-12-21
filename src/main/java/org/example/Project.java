package org.example;

public class Project{
    public static void main(String[] args) {
        Team team = new Team();
        JavaDeveloper John = new JavaDeveloper();
        PythonDeveloper Michael = new PythonDeveloper();
        team.addDeveloper(John);
        team.addDeveloper(Michael);
        team.createProject();
    }
}