package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StatsServiceTest {
    private final StatsService service = new StatsService();
    private final int[] exampleSales = {17, 5, 16, 15, 35, 20, 19, 20, 15, 68, 12, 18};

    @Test
    void sumSales() {
        int expectedSum = 260;
        int actual = service.sumSales(exampleSales);
        Assertions.assertEquals(expectedSum, actual);
    }

    @Test
    void minSales() {
        int expectedMonth = 2;
        int actual = service.minSales(exampleSales);
        Assertions.assertEquals(expectedMonth, actual);
    }

    @Test
    void maxSales() {
        int expectedMonth = 10;
        int actual = service.maxSales(exampleSales);
        Assertions.assertEquals(expectedMonth, actual);
    }

    @Test
    void averageSales() {
        int expectedMonth = 21;
        int actual = service.averageSales(exampleSales);
        Assertions.assertEquals(expectedMonth, actual);
    }

    @Test
    void belowAverageSales() {
        int expectedMonth = 2;
        int actual = service.belowAverageSales(exampleSales);
        Assertions.assertEquals(expectedMonth, actual);
    }

    @Test
    void aboveAverageSales() {
        int expectedMonth = 10;
        int actual = service.aboveAverageSales(exampleSales);
        Assertions.assertEquals(expectedMonth, actual);
    }
}