package Minggu3;

import java.util.*;

public class TugasB {
    public static void main(String[] args){


        Scanner inputUser = new Scanner(System.in);

        System.out.print("Masukkan panjang arrray : ");
        int panjangArray = inputUser.nextInt();
        int[] nilaiRandom = new int[panjangArray];

        for (int i = 0; i < panjangArray; i++) {
            System.out.print("Nilai acak ke " + i + " : ");
            nilaiRandom[i] = inputUser.nextInt();
        }

        System.out.print("Nilai Array = ");
        for (int j : nilaiRandom){
            System.out.print(j + " ");
        }

    }
}
