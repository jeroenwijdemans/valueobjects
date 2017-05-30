package com.wijdemans

import spock.lang.Specification
import spock.lang.Unroll

class ValueTypeTest extends Specification {

    def "i should be able to generate a new Id by using the utility method"() {
        when:
        Id id = Id.generate()

        then:
        id.toString().length() == 36
    }

    def "when i create a new object i expect the toString to be equal to its value"() {
        when:
        Id id = new Id("1")

        then:
        id.toString() == id.getValue()
    }

    def "should equal as objects"() {
        Id id1 = new Id("1")
        Id id2 = new Id("1")
        Id id3 = new Id("2")

        expect:
        id1 == id2
        id1 != id3
    }

    def "should equal in set"() {
        Id id1 = new Id("1")
        Id id2 = new Id("1")

        expect:
        [id1] as Set == [id2] as Set
    }

    def "when argument is null i expect an illegalargumentexception"() {
        when:
        new Id(null)

        then:
        thrown(IllegalArgumentException.class)
    }

    def "testing equality of self"() {
        given:
        def o1 = new Id("1")

        expect:
        o1.equals(o1)
    }

    @Unroll
    def "testing equality for the sake of coverage - and unroll!"() {
        expect:
        result == o1.equals(o2)

        where:
        o1         || o2             || result
        new Id("1") | null            | false
        new Id("1") | new String("1") | false
        new Id("1") | new Id("1")     | true

    }
}