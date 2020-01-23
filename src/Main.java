import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    static final List<String> allowedInputs =  Arrays.asList("O", "X", "Y", "Z");

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println(String.format("Enter character of either: %s: ", allowedInputs));
        String charInput = scanner.next();
        boolean isInputAllowed = allowedInputs.contains(charInput.toUpperCase());
        if (!isInputAllowed) {
            System.out.println("Input is invalid!");
            return;
        }

        System.out.println("Enter non negative odd integer: ");
        int integerInput = 0;
        try {
            integerInput = scanner.nextInt();
            isInputAllowed = (integerInput > 0 && 0 != integerInput%2);
            if (!isInputAllowed) {
                System.out.println("Input is invalid!");
                return;
            }
        } catch (InputMismatchException e) {
            System.out.println("Input is not a number!");
            return;
        }

        System.out.println("\nOutput:");
        CharacterFactory characterFactory = new CharacterFactory();
        Character character = characterFactory.getCharacter(charInput);
        character.printPattern(integerInput);
    }
}
