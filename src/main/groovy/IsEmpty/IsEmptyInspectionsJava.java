package IsEmpty;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class IsEmptyInspectionsJava {
    public static void main(String[] args) {
        String s = "";
        if (s.equals("")) {
            System.out.println("s is empty");
        }

        if (s.length() == 0) {
            System.out.println("s is empty");
        }

        List<Object> l = randomList();
        if (l.size() > 0) {
            System.out.println("l is not empty");
        }

        if (l.stream().count() == 0) {
            System.out.println("l is empty");
        }

        if (l.stream().collect(Collectors.counting()) == 0) {
            System.out.println("l is empty");
        }
    }

    private static List<Object> randomList() {
        List<Object> l = new ArrayList<>();
        if (new Random().nextInt() == 0) {
            l.add(new Object());
        }
        return l;
    }
}
