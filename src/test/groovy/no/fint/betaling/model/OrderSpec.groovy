package no.fint.betaling.model

import spock.lang.Specification

class OrderSpec extends Specification {

    def "Sum should give the sum of all orderlines"() {

        given:
        def order = new Order()
        order.orderLines = []
        order.orderLines.add(new OrderLine(itemPrice: 10, numberOfItems: 5))
        order.orderLines.add(new OrderLine(itemPrice: 2, numberOfItems: 10))

        when:
        def sum = order.sum()

        then:
        sum == 70
    }
}
