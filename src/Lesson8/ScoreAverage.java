package Lesson8;

public class ScoreAverage {
    public static void main(String[] args) {
        int[] scores = {79, 40, 72, 60, 92, 74, 3, 40, 88, 98};
        float avg = 0F;
        for (int count = 0; count < scores.length; count++) {
            System.out.println(scores[count]);
            avg += scores[count];
        }
        avg = avg/scores.length;
        System.out.println("The average score is: " + Math.round(avg));
    }
}
