package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class VegeAdditionsPizzaDecorator extends AbstractPizzaOrderDecorator {
    public VegeAdditionsPizzaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(2));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + extra vege addition";
    }
}
