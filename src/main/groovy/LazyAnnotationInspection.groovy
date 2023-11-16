import groovy.transform.CompileStatic

@CompileStatic
class LazyAnnotationInspection {
    static class Before1 {
        private String lazyThing = null

        String getLazyThing() {
            if (lazyThing == null) {
                lazyThing = 'Hello, world!'
            }
            return lazyThing
        }

        static void main(String[] args) {
            println new Before1().lazyThing
        }
    }

    static class Before2 {
        private String lazyThing = null

        String getLazyThing() {
            if (lazyThing != null) {
                return lazyThing;
            } else {
                lazyThing = 'Hello, world!';
                return lazyThing;
            }
        }

        static void main(String[] args) {
            println new Before2().lazyThing
        }
    }

    static class After {
        @Lazy
        String lazyThing = 'Hello, world!'

        static void main(String[] args) {
            println new After().lazyThing
        }
    }
}
