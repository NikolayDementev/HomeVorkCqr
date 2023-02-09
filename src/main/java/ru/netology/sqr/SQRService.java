package ru.netology.sqr;

public class SQRService {

    public int calculationOfSquares (int lowReng, int highReng) {
        int result = 0;

        for (int i = 10; i <= 99; i++) {
            int iSquares = i * i;
            if (iSquares >= lowReng) {
                if (iSquares <= highReng) {
                    result++;
                }
            }
        }


        return result;
    }
}