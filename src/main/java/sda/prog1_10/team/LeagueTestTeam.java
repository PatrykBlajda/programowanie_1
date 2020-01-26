package sda.prog1_10.team;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LeagueTestTeam {

    public static void main(String[] args) throws NoSuchFieldException {
        Team footballTeam1 = new FootballTeam("Atletico Madrid");
        Team footballTeam2 = new FootballTeam("Real Madrid");
        FootballTeam footballTeam3 = new FootballTeam("Barcelon");
        FootballTeam footballTeam4 = new FootballTeam("Valencia FC");


        Team volleyballTeam1 = new VolleyballTeam();
        Team volleyballTeam2 = new VolleyballTeam();
        VolleyballTeam volleyballTeam3 = new VolleyballTeam();
        VolleyballTeam volleyballTeam4 = new VolleyballTeam();

        footballTeam1.setPoints(10);
        footballTeam2.setPoints(12);
        footballTeam3.setPoints(15);
        footballTeam4.setPoints(8);


        volleyballTeam1.setPoints(10);volleyballTeam1.setName("Asseco");
        volleyballTeam2.setPoints(12);volleyballTeam2.setName("Skra");
        volleyballTeam3.setPoints(15);volleyballTeam3.setName("Zaksa");
        volleyballTeam4.setPoints(8);volleyballTeam4.setName("Jastrzębski");

        LeagueTeam<FootballTeam> footballLeague = new LeagueTeam("Primiera Division");
        LeagueTeam<VolleyballTeam> volleyballLeague = new LeagueTeam ("Plus liga");

        footballLeague.addTeam((FootballTeam)footballTeam1);
        footballLeague.addTeam((FootballTeam)footballTeam2);
        footballLeague.addTeam(footballTeam3);
        footballLeague.addTeam(footballTeam4);


        volleyballLeague.addTeam((VolleyballTeam)volleyballTeam1);
        volleyballLeague.addTeam((VolleyballTeam)volleyballTeam2);
        volleyballLeague.addTeam(volleyballTeam3);
        volleyballLeague.addTeam(volleyballTeam4);

        //footballLeague.addTeam(volleyballTeam1);

        System.out.println("-------------------------");

        volleyballLeague.printTable();

        for (Object o : footballLeague.getTeams()) {
            System.out.println(((Team) o).getName());

            System.out.println("-------------------------");
            for (FootballTeam footballTeam : footballLeague.getTeams()){
                System.out.println(footballTeam.getName());
            }

        }

        System.out.println("-------------------------");
        System.out.println("Stream print");
        footballLeague.getTeams().stream().forEach(x -> System.out.println(x.getName()));

        System.out.println("-------------------------");
        System.out.println("Stream print with maping teams to names");
        footballLeague.getTeams().stream().map(x -> x.getName()).forEach(x -> System.out.println(x));

        System.out.println("-------------------------");
        System.out.println("Stream with maping teams to names v.2");
        footballLeague.getTeams().stream().map(x -> x.getName()).forEach(System.out::println);

        System.out.println("-------------------------");
        System.out.println("Stream with maping teams to names v.3");
        footballLeague.getTeams().stream().map(Team::getName).forEach(System.out::println);

        System.out.println("-------------------------");
        System.out.println("Stream with maping teams to names and add limits to 2");
        footballLeague.getTeams().stream().limit(2).map(Team::getName).forEach(System.out::println);

        System.out.println("-------------------------");
        System.out.println("Stream with maping teams to names where pints >10");
        footballLeague.getTeams().stream()
                .filter(x -> x.getPoints() > 10)
                .limit(2).map(Team::getName)
                .forEach(System.out::println);

        System.out.println("-------------------------");
        System.out.println("League copy with teams to names where pints >10");
        List<FootballTeam> teamCopy = footballLeague.getTeams().stream()
                .filter(x -> x.getPoints() > 10)
                .collect(Collectors.toList());
                teamCopy.stream().forEach(x -> System.out.println(x.getName()));



        System.out.println("-------------------------");
        System.out.println("łączeie strumieni");

        List<FootballTeam> teamCopy2 = footballLeague.getTeams();

        List<FootballTeam> teamConcat =
                Stream.concat(teamCopy.stream(), teamCopy2.stream())
                .collect(Collectors.toList());

        System.out.println("-------------------------");
        System.out.println("łączeie strumieni v.2");

        List<FootballTeam> teamConcat2 =
                Stream.of(teamCopy, teamCopy2)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());


        System.out.println("-------------------------");
        System.out.println("lista nazw drużyn z listy drużyn");

        List<String> teamNames = teamConcat2.stream()
                .map(Team::retriveName)
                .collect(Collectors.toList());
        teamNames.stream().forEach(System.out::println);

        Set<String> teamNamesSet= teamConcat2.stream()
                .map(Team::retriveName)
                .collect(Collectors.toSet());
        teamNamesSet.stream().forEach(System.out::println);

        System.out.println("-------------------------");
        System.out.println("Suma punktów");
int sumPoints = footballLeague.getTeams().stream()
        .map(Team::getPoints)
        .reduce(0, Integer::sum);
        System.out.println(sumPoints);

        System.out.println("-------------------------");
        System.out.println("Zliczanie elementów");

        long countElements = footballLeague.getTeams().stream()
                .map(Team::getPoints)
                .count();
        System.out.println("Zliczenie punktów: " + countElements);

        countElements = footballLeague.getTeams().stream()
                .count();
        System.out.println("Zliczenie drużyn: " + countElements);


        countElements = footballLeague.getTeams().stream()
                .filter(x-> x.getPoints() <=8)
                .count();
        System.out.println("Zliczenie drużyn, która ma mniej niż 8 pkt: " + countElements);


        sumPoints = footballLeague.getTeams().stream()
                .filter(t-> t.getPoints() >=10)
                .map(Team::getPoints)
                .reduce(0, Integer::sum);

        System.out.println("-------------------------");
        System.out.println("Suma punktów gdzie druzyna ma co najmniej 10 punktów :" + sumPoints);

        //Przekształcanie strumienia drużyn na strumień integer
        System.out.println("-------------------------");
        Integer max = footballLeague.getTeams().stream()
                .mapToInt(t-> t.getPoints())
                .max()
                .orElse(new Integer(0));
        System.out.println("max " + max);

        Team teamExpected = footballLeague.getTeams().stream()
                .max(Comparator.comparing(Team::getPoints))
                .orElseThrow(NoSuchFieldException::new);
        System.out.println("max from team : " + teamExpected.getPoints());

        Integer max2 = footballLeague.getTeams().stream()
                .max(Comparator.comparing(Team::getPoints))
                .map(Team::getPoints)
                .orElseThrow(NoSuchElementException::new);
        System.out.println("max2 :" + max2);

        Optional<Integer> max3 = footballLeague.getTeams().stream()
                .max(Comparator.comparing(Team::getPoints))
                .map(Team::getPoints);
                if(max3.isPresent())
        System.out.println("max3 :" + max3);



    }

}
