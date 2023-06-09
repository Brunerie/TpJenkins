package exercice3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class testDelivery {
    @Test
    public void testCalculateCostForShortDistanceAndLightWeight () {
        double cost = Delivery.calculateCost(30, 5);
        assertEquals(10, cost);
    }

    @Test
    public void testCalculateCostForShortDistanceAndHeavyWeight () {
        double cost = Delivery.calculateCost(30, 20);
        assertEquals(15, cost);
    }

    @Test
    public void testCalculateCostForLongDistanceAndLightWeight () {
        double cost = Delivery.calculateCost(100, 5);
        assertEquals(35, cost);
    }

    @Test
    public void testCalculateCostForLongDistanceAndHeavyWeight () {
        double cost = Delivery.calculateCost(100, 20);
        assertEquals(40, cost);
    }
}
