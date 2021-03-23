package Minggu3;
import java.util.*;

public class TugasD {
    public static void main(String[] args){

        String nama;
        Scanner inputUser = new Scanner(System.in);

        System.out.println("-----------------------------------------------------");
        String [] judulstruk = {"Putra Jaya Abadi (PJA)", "Promo Belanja Berhadiah", "Khusus 5 Barang Pembelian Pertama", "Dengan harga minimum Rp. 10000,00"};
        for (int i = 0; i < judulstruk.length; i++) {
            System.out.println(judulstruk[i]);
        }
        System.out.println("-----------------------------------------------------");

        System.out.println("");
        System.out.print("Nama Pembeli : " );
        nama = inputUser.nextLine();

        int [] harga = new int[5];
        int total = 0;
        for (int i = 0; i < harga.length; i++) {
            System.out.print("Harga barang ke-" + (i + 1) + " : ");
            harga[i] = inputUser.nextInt();
            total  = total + harga[i];
        }

        System.out.println("Total harga pembelian atas nama " + nama + " adalah Rp. " + total);

        if (total >= 10000) {
            System.out.println("Selamat...");
            System.out.println("Anda mendapatkan hadiah 1 buah Botol cantik" + "\n");
        } else {
            System.out.println("Maaf anda belum bisa mendapatkan promo" + "\n");
        }

        System.out.println("-----------------------------------------------------");
        System.out.println("Terima Kasih");
        System.out.println("Anda sudah belanja di Putra Jaya Abadi");

    }
}
