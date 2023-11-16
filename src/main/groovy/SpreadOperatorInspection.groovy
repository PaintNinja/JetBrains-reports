import groovy.transform.CompileStatic

@CompileStatic
class SpreadOperatorInspection {
    static void main(String[] args) {
        List<String> names = ['alice ', 'bob', 'carol  ', 'dave', '  eve']

        // before
        names = names.collect { it.trim() }

        // before (with method reference)
        names = names.collect(String.&trim)

        // before (with for loop)
        for (int i = 0; i < names.size(); i++) {
            names[i] = names[i].trim()
        }

        // after
        names = names*.trim()

        println names
    }
}
