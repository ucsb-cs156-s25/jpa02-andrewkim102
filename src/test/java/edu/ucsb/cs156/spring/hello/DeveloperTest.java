package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.jupiter.api.Test;

public class DeveloperTest {

    @Test
    public void testPrivateConstructor() throws Exception {
        // this hack is from https://www.timomeinen.de/2013/10/test-for-private-constructor-to-get-full-code-coverage/
        Constructor<Developer> constructor = Developer.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()),"Constructor is not private");

        constructor.setAccessible(true);
        constructor.newInstance();
    }

    @Test
    public void getName_returns_correct_name() {
        assertEquals("Andrew K.", Developer.getName());
    }

    @Test
    public void getGithubId_returns_correct_githubId() {
        assertEquals("andrewkim102", Developer.getGithubId());
    }

    @Test
    public void getTeam_returns_team_with_correct_name() {
        Team  t = Developer.getTeam();
        assertEquals("s25-09", t.getName());
    }

    @Test
    public void getTeam_returns_team_with_correct_members() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Andrew Kim"),"Team should contain Andrew Kim");
        assertTrue(t.getMembers().contains("Fred Zheng"),"Team should contain Fred Zheng");
        assertTrue(t.getMembers().contains("Jason Zhao"),"Team should contain Jason Zhao");
        assertTrue(t.getMembers().contains("Joel Sanchez"),"Team should contain Joel Sanchez");
        assertTrue(t.getMembers().contains("Moiez Baqar"),"Team should contain Moiez Baqar");
        assertTrue(t.getMembers().contains("Ruben Alvarez-Gutierrez"),"Team should contain Ruben Alvarez-Gutierrez");

    }

    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)

}
