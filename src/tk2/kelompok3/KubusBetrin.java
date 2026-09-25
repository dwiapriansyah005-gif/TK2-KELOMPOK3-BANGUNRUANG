package tk2.kelompok3;
public class KubusBetrin {
    //Atribut
    private double sisi;
    //Constructor
    public KubusBetrin (double sisi) {
        this.sisi = sisi; 
    }
    
    // Setter & Getter 
    public void setSisi(double sisi) { this.sisi = sisi; }
    public double getSisi() { return sisi; }

    // Method hitung (return)
    public double volume() {
        return sisi * sisi * sisi;
    }
    public double luasPermukaan() {
        return 6 * sisi * sisi;
    }

    // Method tampil
    public void tampil() {
        System.out.println("------- KUBUS -------");
        System.out.println("Rumus Volume (V) = S * S * S");
        System.out.println("Rumus Luas Permukaan (L) = 6 * sisi * sisi");
        System.out.println("Diketahui : S = " + (int) sisi);
        System.out.println("Ditanya : V, L?");
        System.out.println("V = " + volume());
        System.out.println("L = " + luasPermukaan());
        System.out.println();
}
}
