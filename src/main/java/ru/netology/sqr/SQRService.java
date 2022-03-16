package ru.netology.sqr;

public class SQRService {
    public int sqrAmount(int start, int finish) {
        int amount = 0;

        for (int i = 10; i <= 99; i++) {
            int sqr = i * i;
            if (sqr >= start & sqr <= finish) {
                amount++;
            }
        }

        return amount;
    }
}
