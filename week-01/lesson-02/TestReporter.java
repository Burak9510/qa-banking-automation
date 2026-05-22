

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
    
    public static int countPassed(String[] testResults){
        int passed = 0;
        for(String result : testResults){
            if("PASS".equals(result)){
                passed++;
            }
        }
        return passed;
    }

    public static void runFullReport(String[] testResults){
        int total = testResults.length;
        int passed = countPassed(testResults);
        double rate = calculatePassRate(total, passed);
        String status = evaluateBuild(rate);

        System.out.println("====== TEST REPORT ======");
        System.out.println("Total tests:  " + total);
        System.out.println("Passed:       " + passed);
        System.out.println("Not passed:   " + (total - passed));
        System.out.println("Pass rate:    " + rate + "%");
        System.out.println("Status:       " + status);
        System.out.println("=========================");
    }

    // Main method to test the functionality
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

        System.out.println("\n=== Full Report Test ===");
        String[] results = {"PASS", "FAIL", "PASS", "PASS", "FAIL", "PASS", "SKIP", "PASS"};
        runFullReport(results);
    }
}

