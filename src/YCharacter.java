public class YCharacter implements Character {
    @Override
    public void printPattern(int n) {
        // loop for rows
        for (int i = 0; i < n; i++){
            // loop for columns
            for (int j = 0; j <= n; j++){
                if (((i == j || n-(i+1) == j) && (i <= n/2)) ||
                   (i > n/2 && n/2 == j)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
