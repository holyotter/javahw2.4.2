package ru.netology.stats;

public class StatsService {

    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int findAvg(int[] sales) {
        return calculateSum(sales) / sales.length;
    }

    public int findMax(int[] sales) {
        int max = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[max]) {
                max = month;
            }
            month = month + 1;
        }
        return max + 1;
    }

    public int findMin(int[] sales) {
        int min = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[min]) {
                min = month;
            }
            month = month + 1;
        }
        return min + 1;
    }

    public int findLessAvg(int[] sales) {
        int avg = findAvg(sales);
        int counter = 0;
        for (int sale : sales) {
            if (sale < avg) {
                counter++;
            }
        }
        return counter;
    }

    public int findMoreAvg(int[] sales) {
        int avg = findAvg(sales);
        int counter = 0;
        for (int sale : sales) {
            if (sale > avg) {
                counter++;
            }
        }
        return counter;
    }
}
