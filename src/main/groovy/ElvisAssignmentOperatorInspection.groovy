import groovy.transform.CompileStatic

@CompileStatic
class ElvisAssignmentOperatorInspection {
    static void main(String[] args) {
        String username = null

        // before (if statement)
        if (username === null) {
            username = 'anonymous'
        }

        // before (ternary operator)
        username = username === null ? 'anonymous' : username

        // after (Groovy 3.0+)
        username ?= 'anonymous'

        println username
    }
}
