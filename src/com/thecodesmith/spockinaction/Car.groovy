package com.thecodesmith.spockinaction

class Car {


    def auth = ['brian', 'jerry']

    def status
    def driver

    Car() {

    }

    def start() {
        status = "RUNNING"
    }

    def setDriver(name) {

        if (name in auth) {
            driver = name
        } else {
            driver = null
        }
    }
}
