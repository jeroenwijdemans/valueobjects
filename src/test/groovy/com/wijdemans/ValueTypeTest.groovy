package com.wijdemans

import spock.lang.Specification

class ValueTypeTest extends Specification {

    def "should equal as objects"() {
        Id id1 = new Id("1");
        Id id2 = new Id("1");
        Id id3 = new Id("2");

        expect:
        id1 == id2
        id1 != id3
    }

    def "should equal in set"() {
        Id id1 = new Id("1");
        Id id2 = new Id("1");

        expect:
        [id1] as Set == [id2] as Set
    }

}
