package FieldMayBeFinal

import groovy.transform.CompileStatic

@CompileStatic
class FieldMayBeFinalInspectionGroovy {
    private static String fieldMayBeFinal = 'foo'

    static void main(String[] args) {
        println fieldMayBeFinal
    }
}
