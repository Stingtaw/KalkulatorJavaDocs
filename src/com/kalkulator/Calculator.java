package com.kalkulator;

/**
 * Kelas {@code Calculator} menyediakan berbagai operasi dasar aritmatika
 * seperti penjumlahan, pengurangan, perkalian, dan pembagian.
 *
 * <p>Kelas ini digunakan oleh {@link MainApp} untuk melakukan perhitungan
 * berdasarkan input dari pengguna.</p>
 *
 * @author khani
 * @version 1.0
 */
public class Calculator {

    /**
     * Menjumlahkan dua bilangan.
     *
     * @param a bilangan pertama
     * @param b bilangan kedua
     * @return hasil penjumlahan
     */
    public double tambah(double a, double b) {
        return a + b;
    }

    /**
     * Mengurangkan bilangan kedua dari bilangan pertama.
     *
     * @param a bilangan pertama
     * @param b bilangan kedua
     * @return hasil pengurangan
     */
    public double kurang(double a, double b) {
        return a - b;
    }

    /**
     * Mengalikan dua bilangan.
     *
     * @param a bilangan pertama
     * @param b bilangan kedua
     * @return hasil perkalian
     */
    public double kali(double a, double b) {
        return a * b;
    }

    /**
     * Membagi bilangan pertama dengan bilangan kedua.
     *
     * @param a pembilang
     * @param b penyebut
     * @return hasil pembagian
     * @throws ArithmeticException jika penyebut bernilai nol
     */
    public double bagi(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Tidak dapat membagi dengan nol!");
        }
        return a / b;
    }
}
