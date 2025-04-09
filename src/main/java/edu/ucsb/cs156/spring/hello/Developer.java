package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {
        return "Andrew K.";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGithubId() {
        return "andrewkim102";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {
        Team team = new Team("s25-09");
        team.addMember("Andrew Kim");
        team.addMember("Fred Zheng");
        team.addMember("Jason Zhao");
        team.addMember("Joel Sanchez");
        team.addMember("Moiez Baqar");
        team.addMember("Ruben Alvarez-Gutierrez");
        return team;
    }
}
