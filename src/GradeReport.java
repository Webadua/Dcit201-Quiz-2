public class GradeReport {

    // High-level method (QUESTION 1)
    public static void executeGradeReport(double score) {

        if (!validateScore(score)) {
            System.out.println("Invalid Score");
            return;
        }

        char grade = calculateLetterGrade(score);
        displayPerformanceMessage(grade);
    }

    // Checks if score is valid
    static boolean validateScore(double score) {
        return score >= 0 && score <= 100;
    }

    // Determines letter grade
    static char calculateLetterGrade(double score) {
        if (score >= 80)
            return 'A';
        else if (score >= 70)
            return 'B';
        else if (score >= 60)
            return 'C';
        else if (score >= 50)
            return 'D';
        else
            return 'F';
    }

    // Displays final message
    static void displayPerformanceMessage(char grade) {
        System.out.println("Grade: " + grade);
    }

    // Main method (to test)
    public static void main(String[] args) {
        executeGradeReport(75.0); // NOTE: 75.0 is a double
    }
}
