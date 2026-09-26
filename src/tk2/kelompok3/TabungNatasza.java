package tk2.kelompok3;
public class TabungNatasza {
    private double jariJari;
    private double tinggi;
    private double volume;
    private double luasPermukaan;
//    public TabungNatasza(double jariJari, double tinggi){
//        this.jariJari = jariJari;
//        this.tinggi = tinggi;
//    }

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    public double volume() {
        volume = Math.PI * Math.pow(jariJari, 2) * tinggi;
        return volume;
    }
    public double luasPermukaan() {
        luasPermukaan = 2 * Math.PI * jariJari * (jariJari + tinggi);
        return luasPermukaan;
    }
//     public void tampil() {
//         System.out.println("-------TABUNG-------");
//        System.out.println("Rumus Volume (V) = phi * r * r * t");
//        System.out.println("Rumus Luas Permukaan (L) = 2 * phi * r * (r + t)");
//        System.out.println("Diketahui : r = " + (int) jariJari
//                         + ", t = " + (int) tinggi
//                         + ", phi = " + String.format("%.2f", Math.PI));
//        System.out.println("Ditanya : V, L?");
//        System.out.printf("V = %.2f%n", volume());
//        System.out.printf("L = %.2f%n", luasPermukaan());
//        System.out.println();
//     }
    
}
