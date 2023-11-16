package CollectionAddAll

import groovy.transform.CompileStatic

@CompileStatic
class RedundantCollectionAddAllInspectionGroovy {
    static void main(String[] args) {
        // before (addAll)
        List<Integer> numbers = []
        numbers.addAll([1, 2, 3])

        // before (plus)
        numbers = []
        numbers += [1, 2, 3]

        // after
        numbers = [1, 2, 3]

        println numbers
    }
}
