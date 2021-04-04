package Minggu4;

public class TugasB {
    public static void main(String[] args){

        int a = 1, b = 1;

        System.out.println("        Do_While");

        System.out.println("Bilangan Kelipatan 2 (1-100)");
        System.out.println("============================");
        do {
            a++;
            System.out.print(a + " ");
            a++;
        } while (a <= 100);
        System.out.println("\n");

        System.out.println("Bilangan Perkalian 2 (1-100)");
        System.out.println("============================");
        do {
            System.out.print("  " + b);
            b = b * 2;
        } while (b <= 100);

    }
}
