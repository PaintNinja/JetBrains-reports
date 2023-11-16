import java.util.Arrays;
import java.util.List;

public class JavaMethodReferenceInspection {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("alice ", "bob", "carol  ", "dave", "  eve");

        // before
        names = names.stream().map(s -> s.trim()).toList();

        // after
        names = names.stream().map(String::trim).toList();

        System.out.println(names);
    }
}
