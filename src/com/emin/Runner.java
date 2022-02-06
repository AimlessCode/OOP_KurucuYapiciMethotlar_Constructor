package com.emin;

import com.emin.entity.Kedi;

public class Runner {

    public static void main(String[] args) {
        System.out.println("UYGULAMAYA GİRİŞ YAPILDI");
        Kedi kedi= new Kedi();
        System.out.println("Kedi nesnesi olusturuldu");
        System.out.println("Kedi adı     : "+kedi.getAd());
        System.out.println("Kedi yaşı    : "+kedi.getYas());
        System.out.println("Kedi Agırlık : "+ kedi.getAgirlik());
        System.out.println(kedi.toString());

    }
}
