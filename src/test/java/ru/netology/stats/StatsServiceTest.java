package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {

    @org.junit.jupiter.api.Test
    void sum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.sum(sales);
        long expected = 180;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void average() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.average(sales);
        long expected = 15;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void minSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.minSales(sales);
        long expected = 9;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void maxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.maxSales(sales);
        long expected = 6;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void minSalesPerYear() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.minSalesPerYear(sales);
        long expected = 5;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void maxSalesPerYear() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.maxSalesPerYear(sales);
        long expected = 5;
        assertEquals(expected, actual);
    }
}


