/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k;
import java.util.Scanner;
/**
 *
 * @author tegar
 */
public class Mahasiswa {
    Scanner scanner = new Scanner(System.in);
    private int nilai, banyak_mahasiswa, ratarata, totalnilai;

    public double getBanyak_mahasiswa() {
        System.out.print("Masukkan Banyaknya Mahasiswa\t: ");
        return banyak_mahasiswa = scanner.nextInt();
    }

    public double getNilai(int jumlah) {
        System.out.printf("Nilai Mahasiswa ke-%d\t\t: ",jumlah);
        return nilai = scanner.nextInt();
    }
}
