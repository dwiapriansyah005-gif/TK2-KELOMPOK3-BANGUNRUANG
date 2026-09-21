package tk2.kelompok3;
public class KerucutFarid {

    // Atribut
    private double jariJari, tinggi, garisPelukis;

    // Construcktor
    public KerucutFarid(double jariJari, double tinggi, double garisPelukis) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
        this.garisPelukis = garisPelukis;
    }

    // Setter & Getter
    public void setJariJari(double r) { this.jariJari = r; }
    public double getJariJari() { return jariJari; }

    public void setTinggi(double t) { this.tinggi = t; }
    public double getTinggi() { return tinggi; }

    public void setGarisPelukis(double s) { this.garisPelukis = s; }
    public double getGarisPelukis() { return garisPelukis; }

    // Method hitung (return)
    public double volume() {
        return (1.0/3.0) * Math.PI * Math.pow(jariJari, 2) * tinggi;
    }
    public double luasPermukaan() {
        return Math.PI * jariJari * (jariJari + garisPelukis);
    }

    // Method tampil
    public void tampil() {
        System.out.println("Rumus Volume (V) = 1/3 * phi * r * r * t");
        System.out.println("Rumus Luas Permukaan (L) = phi * r * (r + s)");
        System.out.println("Diketahui : r = " + (int) jariJari + "\nt = " + (int) tinggi + "\ns = " + (int) garisPelukis + "\nphi = " + String.format("%.2f", Math.PI));
        System.out.println("Ditanya : V, L?");
        System.out.printf("V = %.2f%n", volume());
        System.out.printf("L = %.2f%n", luasPermukaan());
        System.out.println();
    }
}

