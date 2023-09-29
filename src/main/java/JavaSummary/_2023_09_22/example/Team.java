package JavaSummary._2023_09_22.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team<T extends Participant> {
    private static String name;
    private static List<Participant> participants=new ArrayList<>();

    public Team(String name, List<Participant> participants) {
        this.name=name;
        this.participants = participants;

    }
    public Team() {
    }

    public void addNewParticipant(Participant participant) {
        participants.add((T)participant);
        System.out.println("Participant [" + participant + "] was added to team [" + name + "]");
    }

    public void playWith(Team<T> team) {
        String winnerName;
        Random random=new Random();

        int i=random.nextInt(2);
        if (i == 0) {
            winnerName=this.name;
        } else {
            winnerName=team.name;
        }
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        //sb.append(name).append(team.getClass()).append("------");
        for (Participant participant : participants) {
            sb.append("{").append(name).append("} ").append(participant.getName()).append(" age: ").append(participant.getAge()).append(", ");
        }
        if(sb.length()>2){
       sb.setLength(sb.length() - 2);}
        return sb.toString();
    }
}
