package it.develhope.es2;

public class Competition {
    public static void main(String[] args) {

    CompetitionRules allRules = CompetitionRules.getInstance();

    allRules.printRules();

    Team teamA = new Team();
    Team teamB = new Team();

    teamA.teamName = "BesTeam";
    teamB.teamName = "GreaTeam";

    teamA.p1.name = "Jason";
    teamA.p1.yearsOfExperience = 2;
    teamA.p1.programmingLanguage = "Java";

    teamA.p2.name = "Marco";
    teamA.p2.yearsOfExperience = 2;
    teamA.p2.programmingLanguage = "Kotlin";

    teamB.p1.name = "Giovanni";
    teamB.p1.yearsOfExperience = 3;
    teamB.p1.programmingLanguage = "C++";

    teamB.p2.name = "Mario";
    teamB.p2.yearsOfExperience = 3;
    teamB.p2.programmingLanguage = "Java";

    teamA.printTeamDetails();
    teamB.printTeamDetails();


    }
}
