package com.mycompany.remotecontrol;

public class Mobil {
    String nama;
    int kecepatan,bar;

    void jalan(){
        bar--;
        if(bar > 10){
            kecepatan++;
            System.out.println("Mobil Melaju...");
            System.out.println("Kecepatan anda sekarang : "+kecepatan);
        } else {
            System.out.println("Mobil kehabisan bar");
        }
    }
    
    void berhenti(){
        bar--;
        if(bar > 10){
            kecepatan = 0;
            System.out.println("Mobil Berhenti...");
            System.out.println("Kecepatan anda sekarang : "+kecepatan);
        } else {
            System.out.println("Mobil kehabisan bar");
        }
    }
    
    void belok(){
        bar--;
        kecepatan--;
        System.out.println("Mobil berbelok");
        System.out.println("Kecepatan anda sekarang : "+kecepatan);
    }
    
    void klakson(){
        System.out.println("Telolet telolet ~~~~");
    }
    
    void mesin_mati(){
        if(kecepatan > 0){
            System.out.println("Mesin tidak bisa dimatikan karena sedang melaju");
        } else {
            System.out.println("Mesin dimatikan...");
        }
    }
}
