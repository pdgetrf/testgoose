import java.util.ArrayList;
import java.util.List;

class Solution {
    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();

        // homework: uncomment the following line
        helper(0, 0, n, "", result);
        return result;
    }

    private static void helper(int open, int close, int n, String partial, List<String> result) {
        if (open == n && close == n) {
            result.add(partial);
            return;
        }

        if (open >= close && open != n) {
            helper(open + 1, close, n, partial + "(", result);
        }
        if (open > close) {
            helper(open, close + 1, n, partial + ")", result);
        }
    }

    public static void main(String[] args) {
        // use for debugging. empty this function before the final submission.
    }

    private Solution() {
        // Private constructor to exclude the Solution
        // class itself from jacoco coverage calculation
        // https://www.nerd.vision/post/jacoco-coverage-of-util-classes
        // left intentionally empty
    }
}
