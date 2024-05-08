package xunit;

public class XUnitTest {
    public static void main(String[] args) {
        TestSuite suite = TestCaseTest.suite();
//        suite.add(new TestCaseTest("testTemplateMethod"));
//        suite.add(new TestCaseTest("testResult"));
//        suite.add(new TestCaseTest("testFailedResultFormatting"));
//        suite.add(new TestCaseTest("testFailedResult"));
//        suite.add(new TestCaseTest("testSuite"));
        TestResult result = new TestResult();
        suite.run(result);
        System.out.println(result.getSummary());

        TestSuite suite2 = TestCaseTest.suite();
        suite2.add(new TestCaseTest("testTemplateMethod"));
        suite2.add(suite);
        TestResult result2 = new TestResult();
        suite2.run(result2);
        System.out.println(result2.getSummary());
     }
}
