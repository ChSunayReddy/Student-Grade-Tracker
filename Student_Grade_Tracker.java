import java.util.*;

public class Student_Grade_Tracker {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();

        // Input student grades
        System.out.println("Enter student grades (type -1 to stop):");
        while (true) {
            int grade = sc.nextInt();
            if (grade == -1) break;
            grades.add(grade);
        }

        if (grades.isEmpty()) {
            System.out.println("No grades entered.");
        } else {
            int highest = Integer.MIN_VALUE;
            int lowest = Integer.MAX_VALUE;
            int sum = 0;

            for (int grade : grades) {
                sum += grade;
                if (grade > highest) highest = grade;
                if (grade < lowest) lowest = grade;
            }

            double average = (double) sum / grades.size();

            // Display results
            System.out.println("\nGrade Statistics:");
            System.out.println("Average Grade: " + average);
            System.out.println("Highest Grade: " + highest);
            System.out.println("Lowest Grade: " + lowest);
        }
        sc.close();
    }
    
}