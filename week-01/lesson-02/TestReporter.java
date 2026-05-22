

public class TestReporter {
    
    public static double calculatePassRate(int totalTests, int passedTests) {
        if (totalTests == 0) {
            return 0.0;
        }
        return ((double) passedTests / totalTests) * 100;
    }

    public static String evaluateBuild(double passRate) {
        if (passRate >= 95.0) {
            return "BUILD PASSED (GREEN)";
        } else if (passRate >= 80.0) {
            return "BUILD UNSTABLE (YELLOW)";
        } else {
            return "BUILD FAILED (RED)";
        }
    }

    public static void main(String[] args) {
        double rate = calculatePassRate(50, 47);
        System.out.println("Pass rate: " + rate + "%");
        System.out.println("Status: " + evaluateBuild(rate));

        // Test boundaries
        System.out.println("\n=== Boundary Tests ===");
        System.out.println("95.0% -> " + evaluateBuild(95.0));
        System.out.println("94.9% -> " + evaluateBuild(94.9));
        System.out.println("80.0% -> " + evaluateBuild(80.0));
        System.out.println("79.9% -> " + evaluateBuild(79.9));
    }
}

