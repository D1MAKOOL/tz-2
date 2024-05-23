package main;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Generator {
    public static void main(String[] args) {
        int[] sizes = {10, 100, 1000, 10000, 100000, 1000000};
        Random rand = new Random();

        for (int sz : sizes) {
            try (FileWriter fw = new FileWriter("file_" + sz + ".txt")) {
                for (int i = 0; i < sz; i++) {
                    fw.write(rand.nextInt(1000000) + " ");
                }
            } catch (IOException e) {
                System.out.println("Warning: " + e.getMessage());
            }
        }
    }
}