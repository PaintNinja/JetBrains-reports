package InnerClassMayBeStatic;

class InnerClassMayBeStaticInspectionJava {
    public static void main(String[] args) {
        new InnerClassMayBeStaticInspectionJava();
    }

    InnerClassMayBeStaticInspectionJava() {
        new InnerClass().foo();
    }

    private class InnerClass {
        void foo() {
            System.out.println("foo");
        }
    }
}
