import java.util.ArrayList;

public class StudentMarks {
    public static void main(String[] args) {

        ArrayList<Integer> marks = new ArrayList<>();

        // Add marks
        marks.add(75);
        marks.add(32);
        marks.add(60);
        marks.add(45);
        marks.add(28);

        // Find highest and average
        int highest = marks.get(0);
        int sum = 0;

        for (int mark : marks) {
            if (mark > highest) {
                highest = mark;
            }
            sum += mark;
        }

        double average = (double) sum / marks.size();

        System.out.println("Highest mark: " + highest);
        System.out.println("Average mark: " + average);

        // Remove marks below 40
        for (int i = 0; i < marks.size(); i++) {
            if (marks.get(i) < 40) {
                marks.remove(i);
                i--; // adjust index after removal
            }
        }

        System.out.println("Final marks list: " + marks);
    }
}
