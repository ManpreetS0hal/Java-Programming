package Part_2;
public class NumberPattern {
    /**
     * Prints a number pattern of stars and numbers as follows:
     *    1 
     *   1 2 1
     *  1 2 3 2 1
     * 1 2 3 4 3 2 1
     *    ...
     */
    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) System.out.print(" ");
            for (int j = i; j >= 1; j--) System.out.print(j + " ");
            for (int j = 2; j <= i; j++) System.out.print(j + " ");
            System.out.println();
        }
    }
}
