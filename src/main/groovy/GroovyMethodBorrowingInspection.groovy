import groovy.transform.CompileStatic

@CompileStatic
class GroovyMethodBorrowingInspection {
    static void main(String[] args) {
        List<String> names = ['alice ', 'bob', 'carol  ', 'dave', '  eve']

        // before
        names = names.collect { it.trim() }

        // after
        names = names.collect(String.&trim)

        println names
    }
}
