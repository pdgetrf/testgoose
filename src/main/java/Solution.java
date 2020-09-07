import java.util.ArrayList;
import java.util.List;

class Solution {
    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
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
}
