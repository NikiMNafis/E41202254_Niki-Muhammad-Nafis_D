package Minggu4;

import java.util.*;

public class TugasA {
    public static void main(String[] args){

        Scanner inputUser = new Scanner(System.in);

        System.out.print("Masukkan awal bilangan : ");
        int batasAwal = inputUser.nextInt();
        System.out.print("Masukkan batas akhir bilangan : ");
        int batasAkhir = inputUser.nextInt();

        if (batasAwal < batasAkhir){
            for (int i = batasAwal; i <= batasAkhir; ) {
                i++;
                if(i % 2 == 0) {
                    System.out.print(i + "  ");
                }
            }
        } else {
            System.out.println("Maaf awal dan akhir bilangan salah");
        }

    }
}
