import groovy.transform.CompileStatic

@CompileStatic
class SafeNavigationOperatorInspection {
    static void main(String[] args) {
        final user = new User()

        // before
        if (user !== null && user.contact !== null && user.contact.email !== null) {
            println user.contact.email
        } else {
            println 'no email'
        }

        // after
        println user?.contact?.email ?: 'no email'
    }

    static class User {
        static class Contact {
            String email = null
        }

        Contact contact = null
    }
}
