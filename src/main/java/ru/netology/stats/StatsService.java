package ru.netology.stats;

public class StatsService {

    public int sum(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int average(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum / 12;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale > sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSalesPerYear(long[] sales) {
        int count = 0;
        int average = average(sales);
        for (long sale : sales) {
            if (sale < average(sales)) {
                count++;
            }
        }
        return count;
    }

    public int maxSalesPerYear(long[] sales) {
        int count = 0;
        int average = average(sales);
        for (long sale : sales) {
            if (sale > average(sales)) {
                count++;
            }
        }
        return count;
    }
}
