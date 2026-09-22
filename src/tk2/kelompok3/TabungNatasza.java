package tk2.kelompok3;
public class TabungNatasza {
    private double jariJari;
    private double tinggi;
    public TabungNatasza(double jariJari, double tinggi){
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

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
        return Math.PI * Math.pow(jariJari, 2) * tinggi;
    }
    public double luasPermukaan() {
        return 2 * Math.PI * jariJari * (jariJari + tinggi);
    }
     public void tampil() {
         System.out.println("-------TABUNG-------");
        System.out.println("Rumus Volume (V) = phi * r * r * t");
        System.out.println("Rumus Luas Permukaan (L) = 2 * phi * r * (r + t)");
        System.out.println("Diketahui : r = " + (int) jariJari
                         + ", t = " + (int) tinggi
                         + ", phi = " + String.format("%.2f", Math.PI));
        System.out.println("Ditanya : V, L?");
        System.out.printf("V = %.2f%n", volume());
        System.out.printf("L = %.2f%n", luasPermukaan());
        System.out.println();
     }
    
}
