package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int findAverage(int[] sales){
        int currentAverage = calculateSum(sales) / sales.length;
        return currentAverage;
    }


    public int findMonthMax(int[] sales){
        int currentMax = sales[0];
        int month = 0;
        int monthMax = 0;
        for (int sale : sales) {
            month++;
            if (currentMax <= sale) {
                currentMax = sale;
                monthMax = month;
            }
        }
        return monthMax;
    }

    public int findMonthMin(int[] sales) {
        int currentMin = sales[0];
        int month = 0;
        int monthMin = 0;
        for (int sale : sales) {
            month++;
            if (currentMin > sale) {
                currentMin = sale;
                monthMin = month;
            }
        }
        return monthMin;
    }

    public int findCountOverAverage(int[] sales) {
        int currentAverage = findAverage(sales);
        int count = 0;
            for (int sale : sales) {
            if (currentAverage < sale) {
                count++;
                            }
        }
        return count;
    }

    public int findCountUnderAverage(int[] sales) {
        int currentAverage = findAverage(sales);
        int count = 0;
        for (int sale : sales) {
            if (currentAverage > sale) {
                count++;
            }
        }
        return count;
    }
}
