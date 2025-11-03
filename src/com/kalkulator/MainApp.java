package com.kalkulator;

import java.util.Scanner;

/**
 * Kelas utama {@code MainApp} yang menjalankan program kalkulator interaktif.
 * 
 * <p>Pengguna dapat memilih jenis operasi dan memasukkan angka secara langsung
 * melalui terminal.</p>
 *
 * <p>Program ini menggunakan kelas {@link Calculator} untuk melakukan
 * perhitungan aritmatika.</p>
 *
 * @author khani
 * @version 1.0
 */
public class MainApp {

    /**
     * Metode utama untuk menjalankan aplikasi kalkulator.
     *
     * @param args argumen baris perintah (tidak digunakan)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        boolean lanjut = true;

        System.out.println("===== KALKULATOR SEDERHANA =====");

        while (lanjut) {
            System.out.println("\nPilih operasi:");
            System.out.println("1. Penjumlahan (+)");
            System.out.println("2. Pengurangan (-)");
            System.out.println("3. Perkalian (*)");
            System.out.println("4. Pembagian (/)");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan (1-5): ");

            int pilihan = scanner.nextInt();

            if (pilihan == 5) {
                System.out.println("Terima kasih telah menggunakan kalkulator!");
                break;
            }

            System.out.print("Masukkan angka pertama: ");
            double a = scanner.nextDouble();

            System.out.print("Masukkan angka kedua: ");
            double b = scanner.nextDouble();

            try {
                switch (pilihan) {
                    case 1 -> System.out.println("Hasil: " + calc.tambah(a, b));
                    case 2 -> System.out.println("Hasil: " + calc.kurang(a, b));
                    case 3 -> System.out.println("Hasil: " + calc.kali(a, b));
                    case 4 -> System.out.println("Hasil: " + calc.bagi(a, b));
                    default -> System.out.println("Pilihan tidak valid!");
                }
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
