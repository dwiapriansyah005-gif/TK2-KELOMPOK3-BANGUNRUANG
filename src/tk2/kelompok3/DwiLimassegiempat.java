/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tk2.kelompok3;

/**
 *
 * @author macbookairm12020
 */
//Limas Dwi Apriansyah
public class DwiLimassegiempat {

    //Atribut
    private double sisiAlas;
    private double tinggiLimas;
    private double tinggiSisi;
    private double volume;
    private double luasPermukaan;

    //Constructor
    //jframe
    public DwiLimassegiempat() {

    }

    public DwiLimassegiempat(double sisiAlas, double tinggiLimas, double tinggiSisi) {
        this.sisiAlas = sisiAlas;
        this.tinggiLimas = tinggiLimas;
        this.tinggiSisi = tinggiSisi;
    }

    //Getter & Setter
    public double getSisiAlas() {
        return sisiAlas;
    }

    public void setSisiAlas(double sisiAlas) {
        this.sisiAlas = sisiAlas;
    }

    public double getTinggiLimas() {
        return tinggiLimas;
    }

    public void setTinggiLimas(double tinggiLimas) {
        this.tinggiLimas = tinggiLimas;
    }

    public double getTinggiSisi() {
        return tinggiSisi;
    }

    public void setTinggiSisi(double tinggiSisi) {
        this.tinggiSisi = tinggiSisi;
    }

    //Method Menghitung
    public void volume() {
        volume = (1.0 / 3.0) * (sisiAlas * sisiAlas) * tinggiLimas;
    }

    public void luasPermukaan() {
        double luasAlas = sisiAlas * sisiAlas;
        double luasSisiTegak = 4 * (0.5 * sisiAlas * tinggiSisi);
        luasPermukaan = luasAlas + luasSisiTegak;

    }

    public double getVolume() {
        return volume;
    }

    public double getLuasPermukaan() {
        return luasPermukaan;
    }

}
