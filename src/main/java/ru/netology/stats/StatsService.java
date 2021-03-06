package ru.netology.stats;

public class StatsService {

    public int sumSales(long[] sales) {
        int sumSales = 0;
        for (long sale : sales) {
            sumSales += sale;
        }

        return sumSales;
    }

    public int averageSales(long[] sales) {
        return sumSales(sales) / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;

        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }

            month = month + 1;

        }

        return maxMonth + 1;

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

    public int belowAverage(long[] sales) {
        int month = 0;
        long averageSales = averageSales(sales);
        for (long sale : sales) {
            if (sale < averageSales) {
                month = month + 1;
            }
        }
        return month;
    }

    public int aboveAverage(long[] sales) {
        int month = 0;
        long averageSales = averageSales(sales);
        for (long sale : sales) {
            if (sale > averageSales) {
                month = month + 1;
            }
        }
        return month;
    }

}
