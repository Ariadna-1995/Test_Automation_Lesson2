package org.example;

import static org.assertj.core.api.Assertions.assertThat;

public class CompositePatternTest {

    @Test
    void addDeveloperTest{
        Team team = new Team();
        team.addDeveloper(new JavaDeveloper());
        team.addDeveloper(new PythonDeveloper());
        team.addDeveloper(new JavaDeveloper());
        assertThat(team.addDeveloper.hasSize(5);
    }
}
