package com.kodilla.kodillapatterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        BigDecimal cost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15), cost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        String desc = pizzaOrder.getDescription();
        //Then
        assertEquals("Pizza with tomato sauce and mozzarella", desc);
    }

    @Test
    public void testPizzaOrderWithThickCrustGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ThickCrustPizzaDecorator(pizzaOrder);
        //When
        BigDecimal cost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(20), cost);
    }

    @Test
    public void testPizzaOrderWithThickCrustGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ThickCrustPizzaDecorator(pizzaOrder);
        //When
        String desc = pizzaOrder.getDescription();
        //Then
        assertEquals("Pizza with tomato sauce and mozzarella with thick crust", desc);
    }

    @Test
    public void testPizzaOrderWithThickCrustMeatAddVegeAddGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ThickCrustPizzaDecorator(pizzaOrder);
        pizzaOrder = new MeatAdditionsPizzaDecorator(pizzaOrder);
        pizzaOrder = new VegeAdditionsPizzaDecorator(pizzaOrder);
        //When
        BigDecimal cost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(25), cost);
    }

    @Test
    public void testPizzaOrderWithThickCrustMeatAddVegeAddGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ThickCrustPizzaDecorator(pizzaOrder);
        pizzaOrder = new MeatAdditionsPizzaDecorator(pizzaOrder);
        pizzaOrder = new VegeAdditionsPizzaDecorator(pizzaOrder);
        //When
        String desc = pizzaOrder.getDescription();
        //Then
        assertEquals("Pizza with tomato sauce and mozzarella with thick crust + extra meat addition + extra vege addition", desc);
    }

    @Test
    public void testPizzaOrderWithThickCrustMeatAddVegeAddFastDelivGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ThickCrustPizzaDecorator(pizzaOrder);
        pizzaOrder = new MeatAdditionsPizzaDecorator(pizzaOrder);
        pizzaOrder = new VegeAdditionsPizzaDecorator(pizzaOrder);
        pizzaOrder = new FastDeliveryPizzaDecorator(pizzaOrder);
        //When
        BigDecimal cost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(35), cost);
    }

    @Test
    public void testPizzaOrderWithThickCrustMeatAddVegeAddFastDelivGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ThickCrustPizzaDecorator(pizzaOrder);
        pizzaOrder = new MeatAdditionsPizzaDecorator(pizzaOrder);
        pizzaOrder = new VegeAdditionsPizzaDecorator(pizzaOrder);
        pizzaOrder = new FastDeliveryPizzaDecorator(pizzaOrder);
        //When
        String desc = pizzaOrder.getDescription();
        //Then
        assertEquals("Pizza with tomato sauce and mozzarella with thick crust + extra meat addition + extra vege addition + fast delivery", desc);
    }
}
