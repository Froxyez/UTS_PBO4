package com.mycompany.remotecontrol;

import java.util.Scanner;

public class RemoteControl {
    public static void main(String[] args) {
        int opsi;
        boolean keluar = false;
        Scanner input = new Scanner(System.in);
        
        Mobil mobil = new Mobil();
           
        System.out.println("\n--- Halo Selamat Datang di Program Remote Control ---\n");
        System.out.print("Masukkan Nama Mobil Kamu : ");
        mobil.nama = input.nextLine();
        
        System.out.print("Masukkan Kecepatan Kamu Sekarang (1-100) : ");
        mobil.kecepatan = input.nextInt();
        
        System.out.print("Masukkan Bar pada indeks minyak Kamu Sekarang (1-100) : ");
        mobil.bar = input.nextInt();
        
        while (!keluar){
            System.out.println(
            "\nPilih Opsi:" +
                        "\n1. Mobil Maju" +
                        "\n2. Mobil Belok" +
                        "\n3. Mobil Berhenti" +
                        "\n4. Mobil Membunyikan Klakson" +
                        "\n5. Matikan Mesin Mobil" +
                        "\n6. Keluar");
            System.out.print("\nPilih: ");
            opsi = input.nextInt();
            
            if(opsi == 1){
                mobil.jalan();
            }else if (opsi == 2){
                mobil.belok();
            }else if(opsi == 3){
                mobil.berhenti();
            }else if(opsi ==4){
                mobil.klakson();
            }else if(opsi == 5){
                mobil.mesin_mati();
            }else if(opsi == 6){
                keluar = true;
            }else {
                System.out.println("Kamu salah Memasukkan Angka");
            }
        }
    }
}
