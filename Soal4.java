package praktikum3;

import java.util.Scanner;

public class Soal4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan, pil1, pil2, diskon = 0, ttlharga = 0;

        System.out.println("Selamat Datang di Toko Minuman Ridha");
        System.out.println("====================================");
        System.out.println("\tPilih menu");
        System.out.println("1. Beli Minuman 2. Keluar");
        pilihan = input.nextInt();

        if (pilihan == 1) {
            System.out.println("Masukan Jumlah Minuman : ");
            pil1 = input.nextInt();
            int jmlbrg = pil1 * 10000;

            if (jmlbrg > 50000) {
                System.out.println("Anda mendapat diskon 10%");
                diskon = jmlbrg * 10 / 100;
                System.out.println("Rp. "+diskon);
                ttlharga = jmlbrg - diskon;
                System.out.println("Anda membeli minuman sebanyak " + pil1 +" buah dengan total harga Rp. "+ jmlbrg + " dan potongan Rp. " + diskon + " total belanja keseluruhan Rp. " + ttlharga);
                
            } else if (jmlbrg > 30000 && jmlbrg <= 50000) {
                System.out.println("Anda mendapat diskon 5%");
                diskon = jmlbrg * 5 / 100;
                System.out.println("Rp. " +diskon);
                ttlharga = jmlbrg - diskon;
                System.out.println("Anda membeli minuman sebanyak " + pil1 +" buah dengan total harga Rp. "+ jmlbrg + " dan potongan Rp. " + diskon + " total belanja keseluruhan Rp. " + ttlharga);
                
            } else if (jmlbrg <= 30000 && jmlbrg > 0) {
                System.out.println("Anda membeli minuman sebanyak " + pil1 +" buah dengan total belanja keseluruhan Rp. " + jmlbrg);
            } 
            
            }
        else if (pilihan ==  2) {
                System.out.println("Anda keluar dari program");
        }
        else {
            System.out.println("Pilihan tidak tersedia");
        }
    }
}
