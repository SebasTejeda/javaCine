package main.java.pe.edu.upc.application;

public class Program {
    public static void main(String[] args) {
        int[][] asientos = new int[8][9];

        for(int i = 0; i < 8; i++){
            char col = (char)(i+65);
            for(int j = 0; j < 7; j++){
                System.out.print(col + "" + (j+1) + " ");
            }
            System.out.println();
        }
    }
}
