package JavaSummary._2023_09_22.example;

import com.github.javafaker.Faker;

import java.util.*;

public class TeamGenerator<T extends Participant> {
    private static final Faker faker=new Faker();


    public static void main(String[] args) {
        Set<Participant> participantSet = new HashSet<>();
        List<Team> allTeams = new ArrayList<>();
        for (int i=0; i < 100; i++) {
            participantSet.add(makeParticipant());
        }
       TeamGenerator<Adalt> teamGenerator = new TeamGenerator<>();
        Adalt adalt = new Adalt();
        Team<Adalt> team = teamGenerator.makeTeame(adalt, participantSet);
        allTeams.add(team);
        Team<Adalt> team1 = teamGenerator.makeTeame(adalt, participantSet);
        allTeams.add(team1);


        System.out.println(allTeams);


    }
    public static  Participant makeParticipant() {
        String name=faker.name().firstName() + " " +  (faker.name().lastName());
        int age=(int) (Math.random() * 40 + 8);
        return  new Participant (name, age);
    }
    public  Team<T> makeTeame (T t, Set<Participant> participantSet){
        Iterator<Participant> iterator =participantSet.iterator();
        int maxAge;
        int minAge;

        String name = faker.team().name().toUpperCase();
        List<Participant> teamList = new ArrayList<>();

        if (t.getClass() == Adalt.class){
            minAge = 26;
            maxAge = 50;
            while (iterator.hasNext()){
                Participant curentParticipant = iterator.next();
                if (curentParticipant.getAge()<maxAge && curentParticipant.getAge() > minAge){
                    Adalt newAdalt = new Adalt(curentParticipant.getName(), curentParticipant.getAge());
                    teamList.add(newAdalt);
               //     iterator.remove();

                }
                if (teamList.size()==4){
                    break;
                }
            }
        }
        if (t.getClass() == Student.class){
            minAge = 16;
            maxAge = 25;
            while (iterator.hasNext()){
                Participant curentParticipant = iterator.next();
                if (curentParticipant.getAge()<maxAge && curentParticipant.getAge() > minAge){
                    Student newStudent = new Student(curentParticipant.getName(), curentParticipant.getAge());
                    teamList.add(newStudent);                    
                    iterator.remove();
                    if (teamList.size()==4){
                        break;
                    }
                }
            }
        }
        if (t.getClass() == Puple.class){
            minAge = 8;
            maxAge = 15;
            while (iterator.hasNext()){
                Participant curentParticipant = iterator.next();
                if (curentParticipant.getAge()<maxAge && curentParticipant.getAge() > minAge){
                    Puple newPuple = new Puple(curentParticipant.getName(), curentParticipant.getAge());
                    teamList.add(newPuple);
                    iterator.remove();
                    if (teamList.size()==4){
                        break;
                    }
                }
            }
        }

        return new Team<>(name, teamList);
    }
}

