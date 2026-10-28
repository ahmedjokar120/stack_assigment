import java.util.Stack;

public class Solution {

    // Removes adjacent pairs of identical characters.
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if (!stack.isEmpty() && stack.peek() == current) {
                stack.pop();
            } else {
                stack.push(current);
            }
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.reverse().toString();
    }

    // Bonus: removes groups of three identical adjacent characters.
    public String removeTriplets(String s) {
        Stack<Character> characters = new Stack<>();
        Stack<Integer> counts = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if (!characters.isEmpty() && characters.peek() == current) {
                int count = counts.pop() + 1;

                if (count == 3) {
                    characters.pop();
                } else {
                    counts.push(count);
                }
            } else {
                characters.push(current);
                counts.push(1);
            }
        }

        StringBuilder result = new StringBuilder();
        while (!characters.isEmpty()) {
            result.append(characters.pop());
        }

        return result.reverse().toString();
    }
}
