package com.company;

public class Lockers {

    public static void main(String[] args) {
        // Open and close lockers

        boolean open = false;
        int[] Lockers = new int[100];

        for (int h = 0; h <= 99; h++) {
            Lockers[h] = 1;

            for (int i = 0; i <= 99; i = i + 2) {
                Lockers[i] = 0;/*
            for (int k = 0; k <= 49; k = k++) {

                for (int j = 1; j <= 99; j = j + j) {
                    if (Lockers[j] == 0)
                    {
                        Lockers[j] = 1;

                    }else if (Lockers[j] == 1) {
                        Lockers[j] = 0;
                    }

                }
                */
                if (Lockers[i] == 1)
                    System.out.println(Lockers[i]);
            }
        }
    }
}