package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {

        int[][] arrayMatrix = new int[size][size];
        for (int i = 0; i < arrayMatrix.length; i++) {
            for (int j = 0; j < arrayMatrix[i].length; j++) {
                arrayMatrix[i][j] = (i + 1) * (j + 1);
            }
        }
        return arrayMatrix;
    }
}
