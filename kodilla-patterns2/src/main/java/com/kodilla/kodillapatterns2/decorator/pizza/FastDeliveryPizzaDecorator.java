package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class FastDeliveryPizzaDecorator extends AbstractPizzaOrderDecorator {
    public FastDeliveryPizzaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(10));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + fast delivery";
    }
}
