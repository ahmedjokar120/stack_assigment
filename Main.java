public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println("Remove adjacent duplicate pairs:");
        System.out.println("abbaca -> " + solution.removeDuplicates("abbaca"));
        System.out.println("azxxzy -> " + solution.removeDuplicates("azxxzy"));
        System.out.println("abcd   -> " + solution.removeDuplicates("abcd"));
        System.out.println("aabbcc -> \"" + solution.removeDuplicates("aabbcc") + "\"");

        System.out.println();
        System.out.println("Bonus: remove groups of three:");
        System.out.println("deeedbbcccbdaa -> " + solution.removeTriplets("deeedbbcccbdaa"));
    }
}
