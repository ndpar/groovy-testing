package com.ndpar.gtesting

import spock.lang.Specification

class SpockTest extends Specification {

    def app

    def setup() {
        app = new App()
    }

    def "next number is 6"() {
        when:
        def number = app.number

        then:
        number.next() == 6
    }

    def "two plus two is four"() {
        expect:
        2 + 2 == 4
    }

    def "can you figure out what I'm up to?"() {
        expect:
        name.size() == size

        where:
        name << ['Kirk', 'Spock', 'Scotty']
        size << [4, 5, 6]
    }
}