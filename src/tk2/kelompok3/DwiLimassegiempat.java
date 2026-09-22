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

    //Constructor
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
    public double volume (){
        return (1.0/3.0) * (sisiAlas*sisiAlas) * tinggiLimas;
    }
    
    public double luasPermukaan (){
        double luasAlas = sisiAlas * sisiAlas;
        double luasSisiTegak = 4 * (0.5 * sisiAlas * tinggiSisi);
        return luasAlas + luasSisiTegak;
        
    }
     //Method Menampilkan
     public void tampil() {
        double v = Math.round(volume() * 100.0) / 100.0;
        double l = Math.round(luasPermukaan() * 100.0) / 100.0;

         System.out.println("-------Limas Segi Empat-------");
        System.out.println("Rumus Volume (V) = 1/3 * s * s * t");
        System.out.println("Rumus Luas Permukaan (L) = (s*s) + 4*(1/2 * s * tinggiSisi)");
        System.out.println("Diketahui : s = " + (int) sisiAlas
                         + ", t = " + (int) tinggiLimas
                         + ", tinggiSisi = " + (int) tinggiSisi);
        System.out.println("Ditanya : V, L?");
        System.out.println("V = " + v);
        System.out.println("L = " + l);
        System.out.println();

    }
    
}
