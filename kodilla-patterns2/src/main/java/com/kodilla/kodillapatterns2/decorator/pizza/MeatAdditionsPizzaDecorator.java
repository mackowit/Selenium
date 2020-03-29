package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class MeatAdditionsPizzaDecorator extends AbstractPizzaOrderDecorator {
    public MeatAdditionsPizzaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(3));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + extra meat addition";
    }
}
