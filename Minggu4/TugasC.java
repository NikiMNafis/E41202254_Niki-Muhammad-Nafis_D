package Minggu4;

import java.util.*;

public class TugasC {
    public static void main(String[] args){

        Scanner inputUser = new Scanner(System.in);

        int banyakData, nilaiData[], jumlahNilai = 0, rataRata;

        System.out.print("Masukkan Banyaknya Data Nilai = ");
        banyakData = inputUser.nextInt();
        nilaiData = new int[banyakData];

        for (int i = 0; i < banyakData; i++) {
            System.out.print("Masukkan Data Nilai ke-" + (i + 1) + " = ");
            nilaiData[i] = inputUser.nextInt();
            jumlahNilai += nilaiData[i];
        }

        int nilaiMin = nilaiData[0];
        for (int a = 0; a < banyakData; a++) {
            if (nilaiData[a] < nilaiMin) {
                nilaiMin = nilaiData[a];
            }
        }

        int nilaiMax = nilaiData[0];
        for (int b = 0; b < banyakData; b++) {
            if (nilaiData[b] > nilaiMax) {
                nilaiMax = nilaiData[b];
            }
        }
        rataRata = jumlahNilai / banyakData;

        System.out.println(" ");
        System.out.println("Nilai Minimum = " + nilaiMin);
        System.out.println("Nilai Maksimum = " + nilaiMax);
        System.out.println("Nilai Rata-ratanya adalah = " + rataRata);

    }
}
