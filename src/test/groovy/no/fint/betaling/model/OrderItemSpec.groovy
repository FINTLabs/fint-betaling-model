package no.fint.betaling.model

import spock.lang.Specification

class OrderItemSpec extends Specification {

    def "Sum should return the product of price and amount"() {

        given:
        def line = new OrderItem()
        line.setItemPrice(10);
        line.setItemQuantity(10)

        when:
        def sum = line.sum()

        then:
        sum == 100
    }
}
