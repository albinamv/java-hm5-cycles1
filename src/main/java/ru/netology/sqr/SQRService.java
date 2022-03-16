package ru.netology.sqr;

public class SQRService {
    public int sqrtAmount(int start, int finish) {
        int amount = 0;

        for (int i = 10; i <= 99; i++) {
            int sqrt = i * i;
            if (sqrt >= start & sqrt <= finish) {
                amount++;
            }
        }

        return amount;
    }
}
