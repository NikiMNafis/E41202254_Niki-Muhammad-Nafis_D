package Minggu3;

import java.util.*;

public class TugasE {
    public static void main(String[] args){

        Scanner inputUser = new Scanner(System.in);
        String nama;
        int menu;

        System.out.println("CAFE SAHABAT");
        System.out.println("ANEKA MINUMAN");

        System.out.println("-----------------------");
        String [] daftarmenu = {"SPECIAL MENU :", "1. Soft drinks", "2. Mix juice", "3. Nescafe", "4. Soda milk", "5. Tea"};
        for (int i = 0; i < daftarmenu.length; i++) {
            System.out.println(daftarmenu[i]);
        }
        System.out.println("-----------------------");

        System.out.print("Masukkan nama pembeli : ");
        nama = inputUser.nextLine();

        System.out.print("Silahkan masukkan pilihan anda : ");
        menu = inputUser.nextInt();

        switch (menu){
            case 1 :
                System.out.println("Minuman yang anda pesan adalah Soft drinks");
                break;
            case 2 :
                System.out.println("Minuman yang anda pesan adalah Mix juice");
                break;
            case 3 :
                System.out.println("Minuman yang anda pesan adalah Nescave");
                break;
            case 4 :
                System.out.println("Minuman yang anda pesan adalah Soda milk");
                break;
            case 5 :
                System.out.println("Minuman yang anda pesan adalah Tea");
                break;
            default :
                System.out.println("Pilihan menu yang anda pilih salah");
        }
        System.out.println("Pesanan anda akan segera kami antar");
        System.out.println("Terima Kasih " + nama + " telah berkunjung di Cafe Sahabat");
    }
}
