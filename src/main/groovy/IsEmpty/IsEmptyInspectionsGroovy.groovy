package IsEmpty

import groovy.transform.CompileStatic

import java.util.stream.Collectors

@CompileStatic
class IsEmptyInspectionsGroovy {
    static void main(String[] args) {
        String s = ''
        if (s == '') {
            println 's is empty'
        }

        if (s.length() == 0) {
            println 's is empty'
        }

        List<Object> l = randomList()
        if (l.size() > 0) {
            println 'l is not empty'
        }

        if (l.stream().count() == 0) {
            println 'l is empty'
        }

        if (l.stream().collect(Collectors.counting()) == 0) {
            println 'l is empty'
        }
    }

    private static List<Object> randomList() {
        List<Object> l = []
        if (new Random().nextInt() == 0) {
            l.add(new Object())
        }
        return l
    }
}
