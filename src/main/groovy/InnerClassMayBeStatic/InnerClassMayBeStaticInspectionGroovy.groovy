package InnerClassMayBeStatic

import groovy.transform.CompileStatic

@CompileStatic
class InnerClassMayBeStaticInspectionGroovy {
    static void main(String[] args) {
        new InnerClassMayBeStaticInspectionGroovy()
    }

    InnerClassMayBeStaticInspectionGroovy() {
        new InnerClass().foo()
    }

    class InnerClass {
        void foo() {
            println 'foo'
        }
    }
}
