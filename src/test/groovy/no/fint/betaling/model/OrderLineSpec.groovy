package no.fint.betaling.model

import spock.lang.Specification

class OrderLineSpec extends Specification {

    def "Sum should return the product of price and amount"() {

        given:
        def line = new OrderLine()
        line.setItemPrice(10);
        line.setNumberOfItems(10)

        when:
        def sum = line.sum()

        then:
        sum == 100
    }
}
