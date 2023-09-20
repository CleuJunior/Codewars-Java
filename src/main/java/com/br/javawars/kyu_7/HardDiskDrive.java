package com.br.javawars.kyu_7;

public class HardDiskDrive {
    public static int save(int[] sizes, int hd) {
        int aux = 0;
        int totalSaved = 0;

        for (int size : sizes) {
            aux+= size;

            if (aux > hd) {
                break;
            }

            totalSaved++;
        }

        return totalSaved;
    }
}
