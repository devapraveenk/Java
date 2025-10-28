package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ActivitySelection {
    private static class Activity{
        private final int start;
        private final int end;
        Activity(int a, int b){
            start = a;
            end = b;
        }
        public int getStart(){
            return start;
        }
        public int getEnd(){
            return end;
        }
        public String toString() {
            return "(" + start + "," + end + ")";
        }
    }
    private static List<Activity> selectMaxActivities(List<Activity> activities){
            activities.sort(Comparator.comparingInt(a->a.getEnd()));
            List<Activity> result = new ArrayList<>();
            int lastend = Integer.MIN_VALUE;
            for(Activity a: activities){
                if(a.getStart() >= lastend){
                    result.add(a);
                    lastend = a.getEnd();
                }
            }
        return result;
    }
    public static void main(String[] args){
        List<Activity> activities = Arrays.asList(
                new Activity(1, 3),
                new Activity(2, 4),
                new Activity(3, 5),
                new Activity(0, 7),
                new Activity(5, 9),
                new Activity(5, 7)
        );
        System.out.println(selectMaxActivities(activities));
    }
}
