/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi_22166023_latihan28_ganti.kata;
import java.util.Scanner;
/**
 *
 * @author user
 * NAMA : Peni Nurul Fauzah
 * KELAS : PBO28
 * NIM : 22166023
 * DESKRIPSI PROGRAM : Ganti Kata Kerja
 */
public class SI_RegPagi_22166023_Latihan28_GantiKata {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==PROGRAM GANTI KATA==");

        System.out.print("Masukkan kalimat: ");
        String kalimat = scanner.nextLine();

        System.out.print("Masukkan kata yang ingin diganti: ");
        String kataYangInginDiganti = scanner.nextLine();

        System.out.print("Masukkan kata pengganti: ");
        String kataPengganti = scanner.nextLine();

        // Menyimpan kalimat awal sebelum melakukan penggantian
        String kalimatAwal = kalimat;

        String kalimatBaru = kalimat.replace(kataYangInginDiganti, kataPengganti);

        System.out.println("==HASIL FORMATTING==");
        System.out.println("Kalimat awal: " + kalimatAwal);
        System.out.println("Kalimat baru: " + kalimatBaru);
    }
    
}
