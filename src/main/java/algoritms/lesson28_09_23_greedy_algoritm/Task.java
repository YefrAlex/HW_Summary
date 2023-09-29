package algoritms.lesson28_09_23_greedy_algoritm;

public class Task {
    public static void main(String[] args) {
        int [] lifts = {4,27,39,45};
        int floor = 34;
        System.out.println("нужно вызвать лифт под номером -" + findLift(lifts,floor) + " который находится на этаже - " + lifts[findLift(lifts,floor)]);
    }
    public static int findLift (int [] lifts, int floor  ){
        int min = Integer.MAX_VALUE;
        int lift = -1;
        for (int i=0; i < lifts.length; i++) {
            if (Math.abs(floor-lifts[i]) < min) {
                min = Math.abs(floor-lifts[i]);
                lift = i;
            }
        }
        return lift;
    }
}
