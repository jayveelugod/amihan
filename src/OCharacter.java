public class OCharacter implements Character {
    @Override
    public void printPattern(int n) {
        // loop for rows
        for (int i = 0; i < n; i++){
            // loop for columns
            for (int j = 0; j <= n+1; j++){
                if ((0 == i || n-1 == i) && (j > 0 && j <= n) ||
                   ((0 != i && n-1 != i) && (0 == j || n+1 == j))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
