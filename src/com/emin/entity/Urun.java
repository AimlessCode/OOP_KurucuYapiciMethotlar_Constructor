package com.emin.entity;

public class Urun {

    private long Id;
    private String ad;
    private double fiyat;

    public Urun() {
    }

    public Urun(long id, String ad, double fiyat) {
        this.Id = id;
        this.ad = ad;
        this.fiyat = fiyat;
    }



    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return "Urun{" +
                "Id=" + Id +
                ", ad='" + ad + '\'' +
                ", fiyat=" + fiyat +
                '}';
    }
}
