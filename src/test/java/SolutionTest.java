import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void testGenerateParenthesis() {

        List<TestCase> testCases = getTestCases();

        for (int i = 0; i < testCases.size(); i++) {
            TestCase testCase = testCases.get(i);

            List<String> results = Solution.generateParenthesis(testCase.input);

            results.sort(null);
            testCase.expect.sort(null);

            assertEquals(results.size(), testCase.expect.size());

            for (int j = 0; j < results.size(); j++) {
                assertEquals(results.get(j), testCase.expect.get(j));
            }
        }
    }

    private List<TestCase> getTestCases() {
        List<TestCase> testCases = new ArrayList<>();
        testCases.add(new TestCase(0, Arrays.asList("")));
        testCases.add(new TestCase(1, Arrays.asList("()")));
        testCases.add(new TestCase(2, Arrays.asList("()()", "(())")));
        testCases.add(new TestCase(3, Arrays.asList("()()()", "(())()", "()(())", "((()))", "(()())")));
        return testCases;
    }
}
