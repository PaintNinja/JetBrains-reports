package CollectionAddAll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class RedundantCollectionAddAllInspectionJava {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1, 2, 3));
        System.out.println(numbers);
    }
}
