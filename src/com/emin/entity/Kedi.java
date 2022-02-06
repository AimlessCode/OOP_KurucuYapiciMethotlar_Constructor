package com.emin.entity;

public class Kedi {


    private int hiz;
    private int yas;
    private int agirlik;
    private String renk;
    private String ad;
    private String tur;
    private String cins;
    private boolean uyku;

    /**
     * Constructor -> Kurucu ya da Yapıcı Method
     * Syntax -> Erişim bwlirteci eklenir. gwnwllikle Public dir.
     * return -> eklenmez. yani void,int,String v.s yazılmaz
     * Method adı -> Sınıfın adı ne ise bu method un adı odur. birebir
     * sınıf adı ile aynı olmak zorundadır.
     * Parametre -> Opsiyonel dir . Method içine paremetre olabilir de almaya bilirde
     * yazılımcını kurgusuna göre bu deişimi gösterir
     * BİLGİ : Methot sınıfı nesne yaratılmadan önce çalışır. sınıf içinde
     * default işlemleri yapmak için kullanılır. Geri dönüş tipi eklenmese bile
     * geri dönüş tipi vardır . oda sınıfı objesidir.
     */

    /**
     * Default Contructor
     * Bu method yazılmasa bile her sınıfı default constructor vardır.
     */


    public Kedi(){
        ad="yumoş";
        agirlik =120;
        renk="sari";
        System.out.println("Default Constructor çalıştı");

    }






    @Override
    public String toString() {
        return "Kedi{" +
                "hiz=" + hiz +
                ", yas=" + yas +
                ", agirlik=" + agirlik +
                ", renk='" + renk + '\'' +
                ", ad='" + ad + '\'' +
                ", tur='" + tur + '\'' +
                ", cins='" + cins + '\'' +
                ", uyku=" + uyku +
                '}';
    }

    public int getHiz() {
        return hiz;
    }
    public void setHiz(int hiz) {
        this.hiz = hiz;
    }


    public int getYas() {
        return yas;
    }
    public void setYas(int yas) {
        this.yas = yas;
    }


    public int getAgirlik() {
        return agirlik;
    }
    public void setAgirlik(int agirlik) {
        this.agirlik = agirlik;
    }


    public String getRenk() {
        return renk;
    }
    public void setRenk(String renk) {
        this.renk = renk;
    }


    public String getAd() {
        return ad;
    }
    public void setAd(String ad) {
        this.ad = ad;
    }


    public String getTur() {
        return tur;
    }
    public void setTur(String tur) {
        this.tur = tur;
    }


    public String getCins() {
        return cins;
    }
    public void setCins(String cins) {
        this.cins = cins;
    }


    public boolean isUyku() {
        return uyku;
    }
    public void setUyku(boolean uyku) {
        this.uyku = uyku;
    }


}
