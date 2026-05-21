public class TestResultAnalyzer {
    
    public static double calculatePassRate(int totalTests, int passedTests) {

        if(totalTests == 0) {
            return 0.0;
        }
        return ((double) passedTests / totalTests) * 100;
    }
         
        public static void main(String[] args) {
            
            int total = 50;
            int passed =47;

            double rate = calculatePassRate(total, passed);
            System.out.println("Ran " +total + " tests.");
            System.out.println("Passed: " + passed);
            System.out.println("Pass rate:" + rate + "%");
    }
}
