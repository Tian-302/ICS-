import java.util.LinkedList;

public class TaskQueue {
    public static void main(String[] args) {

        LinkedList<String> tasks = new LinkedList<>();

        // Add normal tasks
        tasks.add("Write report");
        tasks.add("Check emails");
        tasks.add("Attend lecture");

        // Add urgent task
        tasks.addFirst("Fix server issue");

        // Process tasks
        while (!tasks.isEmpty()) {
            String currentTask = tasks.removeFirst();
            System.out.println("Processing task: " + currentTask);
        }

        System.out.println("All tasks completed.");
    }
}
