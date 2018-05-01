import java.util.HashSet;
import java.util.LinkedHashSet;

class NonRepeatingCharacter {

    static Character find(String s) {
        char[] chars =  s.toCharArray();
        HashSet<Character> alreadySeen = new HashSet<>();
        LinkedHashSet<Character> nonRepeat = new LinkedHashSet<>();

        for (char c : chars) {
            if (alreadySeen.contains(c)) {
                nonRepeat.remove(c);
            } else {
                nonRepeat.add(c);
                alreadySeen.add(c);
            }
        }

        if (nonRepeat.isEmpty()) {
            return null;
        }

        return nonRepeat.iterator().next();
    }

}
