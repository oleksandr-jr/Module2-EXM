package L12FQ.Q1_E2_ProducerConsumer;

import common.Console;

// Класс Магазин, хранящий произведенные товары
class Store {
    private int product = 0;

    public synchronized void get() {
        while (product < 1) {
            try {
                wait();
            } catch (InterruptedException ignored) {
            }
        }
        product--;

        Console.println("Покупатель купил 1 товар", Console.color.BLUE);
        System.out.println("Товаров на складе: " + product);
        notify();
    }

    public synchronized void put() {
        while (product >= 3) {
            try {
                wait();
            } catch (InterruptedException ignored) {
            }
        }
        product++;
        Console.println("Производитель добавил 1 товар", Console.color.GREEN);
        System.out.println("Товаров на складе: " + product);
        notify();
    }
}
