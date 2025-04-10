package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Override
    public boolean equals(Object obj) {
        // Case 1: these are the same object
        if (obj == this) {
            return true;
        }
        // Case 2: the other object isn't even an instance of this class
        if (!(obj instanceof Team)) { 
            return false;
        }
        // Case 3: Cast the other object to this class, and compare all of the fields
        Team other = (Team) obj;
        return this.name.equals(other.name) && this.members.equals(other.members);
    }

    @Test
    public void hashCode_is_equal_for_equal_objects() {
        Team t1 = new Team();
        t1.setName("foo");
        t1.addMember("bar");

        Team t2 = new Team();
        t2.setName("foo");
        t2.addMember("bar");

        // first confirm equality, then hashCode
        assertTrue(t1.equals(t2));
        assertEquals(t1.hashCode(), t2.hashCode());
    }

   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)

}
