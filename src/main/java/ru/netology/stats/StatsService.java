package ru.netology.stats;

public class StatsService {

    // Сумма всех продаж
    public long sumSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    //  Минимальная сумма продаж
    public long minSales(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    // Максимальная сумма продаж
    public long maxSales(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    // Средняя сумма продаж
    public long averageSales(int[] sales) {
        return sumSales(sales) / sales.length;
    }

    // продажами ниже среднего
    public long belowAverageSales(int[] sales) {
        long average = averageSales(sales);
        int count = 0;
        for (int sale : sales) {
            if (sale > average) {
                count++;
            }
        }
        return count;
    }

    // продажами выше среднего
    public long aboveAverageSales(int[] sales) {
        long average = averageSales(sales);
        int count = 0;
        for (int sale : sales) {
            if (sale < average) {
                count++;
            }
        }
        return count;
    }
}
