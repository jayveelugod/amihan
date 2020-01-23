public class CharacterFactory {
    public Character getCharacter(String character) {
        switch (character.toUpperCase()) {
            case "O": return new OCharacter();
            case "X": return  new XCharacter();
            case "Y": return  new YCharacter();
            case "Z": return  new ZCharacter();
        }
        return null;
    }
}
