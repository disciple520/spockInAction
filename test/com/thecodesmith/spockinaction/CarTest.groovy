package com.thecodesmith.spockinaction

import spock.lang.Specification

class CarTest extends Specification {

    def "can create a new Car"() {

        given:
        def car = new Car()

        expect:
        car != null
    }

    def "car is running after start"() {

        given:
        def car = new Car()

        when:
        car.start()

        then:
        car.status == "RUNNING"
    }

    def "only authorized drivers may drive the car"() {

        given:
        def car = new Car()

        when:
        car.driver = name

        then:
        car.driver == result

        where:
        name    | result
        'brian' | 'brian'
        'oreo'  | null
    }
}
