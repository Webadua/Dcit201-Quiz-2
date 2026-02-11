public class Average {

    // Question 2 methods
    static double calculateClassAverage(double a, double b) {
        return (a + b) / 2;
    }

    static double calculateClassAverage(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    static double calculateClassAverage(double[] scores) {
        double sum = 0;
        for (double s : scores) {
            sum += s;
        }
        return sum / scores.length;
    }

    // main method to test
    public static void main(String[] args) {
        // Test version 1
        double avg2 = calculateClassAverage(80, 90);
        System.out.println("Average of 2 scores: " + avg2);

        // Test version 2
        double avg3 = calculateClassAverage(70, 85, 90);
        System.out.println("Average of 3 scores: " + avg3);

        // Test version 3
        double[] scores = {60, 70, 80, 90};
        double avgArray = calculateClassAverage(scores);
        System.out.println("Average of array scores: " + avgArray);
    }
}
