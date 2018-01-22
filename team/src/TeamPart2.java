import java.util.ArrayList;
import java.util.Collections;

public class TeamPart2 {

        public static void main(String args[]) {
            ArrayList <String> students = new ArrayList <String>();
            students.add("First, 3, 22");
            students.add("Second, 1, 19");
            students.add("Third, 4, 23");
            students.add("Fours, 2, 20");
            students.add("Fifth, 5, 24");

            System.out.println("Before:");
            for (String counter : students) {
                System.out.println(counter);
            }


            Collections.sort(students);


            System.out.println("After:");
            for (String counter : students) {
                System.out.println(counter);
            }
        }
    }

