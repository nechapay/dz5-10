package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int num = 1, cols = 5, rows = 4;
        int[][] arr = new int[rows][cols];
        for(int i = 0; i < cols; i++) {
            for(int j = 0; j < rows; j++) {
                arr[j][i] = num++;
            }
        }
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
