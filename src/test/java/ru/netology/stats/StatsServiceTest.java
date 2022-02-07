package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    long[] sales1 = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void shouldSumSales() {
        StatsService service = new StatsService();
        int actual = service.sumSales(sales1);
        int expected = 180;

        assertEquals(expected, actual);
    }

    @Test
    void shouldAverageSales() {
        StatsService service = new StatsService();
        int actual = service.averageSales(sales1);
        int expected = 15;

        assertEquals(expected, actual);
    }

    @Test
    void shouldMaxSales() {
        StatsService service = new StatsService();
        int actual = service.maxSales(sales1);
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    void shouldMinSales() {
        StatsService service = new StatsService();
        int actual = service.minSales(sales1);
        int expected = 9;

        assertEquals(expected, actual);
    }


    @Test
    void shouldBelowAverage() {
        StatsService service = new StatsService();
        int actual = service.belowAverage(sales1);
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    void shouldAboveAverage() {
        StatsService service = new StatsService();
        int actual = service.aboveAverage(sales1);
        int expected = 5;

        assertEquals(expected, actual);
    }

}