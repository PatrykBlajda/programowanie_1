package sda.prog1_10.team;

public class LeagueTest {

    public static void main(String[] args) {
        Team FootballTeam1 = new FootballTeam("Atletico Madrid");
        Team FootballTeam2 = new FootballTeam("Real Madrid");
        Team FootballTeam3 = new FootballTeam("Barcelon");
        Team FootballTeam4 = new FootballTeam("Valencia FC");
        Team FootballTeam5 = new FootballTeam("Wisła Kraków");

        Team volleyballTeam1 = new VolleyballTeam();
        Team volleyballTeam2 = new VolleyballTeam();
        Team volleyballTeam3 = new VolleyballTeam();
        Team volleyballTeam4 = new VolleyballTeam();

        FootballTeam1.setPoints(10);
        FootballTeam2.setPoints(12);
        FootballTeam3.setPoints(15);
        FootballTeam4.setPoints(8);
        FootballTeam5.setPoints(1);

        volleyballTeam1.setPoints(10);volleyballTeam1.setName("Asseco");
        volleyballTeam2.setPoints(12);volleyballTeam2.setName("Skra");
        volleyballTeam3.setPoints(15);volleyballTeam3.setName("Zaksa");
        volleyballTeam4.setPoints(8);volleyballTeam4.setName("Jastrzębski");

        League footballLeague = new League("Primiera Division");
        League volleyballLeague = new League ("Plus liga");

        footballLeague.addTeam(FootballTeam1);
        footballLeague.addTeam(FootballTeam2);
        footballLeague.addTeam(FootballTeam3);
        footballLeague.addTeam(FootballTeam4);
        footballLeague.addTeam(FootballTeam5);

        volleyballLeague.addTeam(volleyballTeam1);
        volleyballLeague.addTeam(volleyballTeam2);
        volleyballLeague.addTeam(volleyballTeam3);
        volleyballLeague.addTeam(volleyballTeam4);

    }

}
