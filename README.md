## Method borrowing inspection
In `src/main/groovy/JavaMethodReferenceInspection.java`, there is an inspection for converting lambda expressions
to method references.

I would like to request something similar for Groovy, where methods that take a Closure (such as `each` or `collect`)
can have a method borrowing inspection.

The `src/main/groovy/GroovyMethodBorrowingInspection.groovy` file is a straight port of the Java code but using
Groovy's collection methods instead of Java streams, which can be used to test this feature request.

