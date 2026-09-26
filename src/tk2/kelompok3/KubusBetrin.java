package tk2.kelompok3;
public class KubusBetrin {
    //Atribut
    private double sisi;
    private double volume;
    private double luasPermukaan;
    //Constructor
//    public KubusBetrin (double sisi) {
//        this.sisi = sisi; 
//    }
    
    // Setter & Getter 
    public void setSisi(double sisi) { this.sisi = sisi; }
    public double getSisi() { return sisi; }

    // Method hitung (return)
    public double volume() {
        volume = sisi * sisi * sisi;
        return volume;
    }
    public double luasPermukaan() {
        luasPermukaan= 6 * sisi * sisi;
        return luasPermukaan;
    }

//    // Method tampil
//    public void tampil() {
//        System.out.println("------- KUBUS -------");
//        System.out.println("Rumus Volume (V) = s * s * s");
//        System.out.println("Rumus Luas Permukaan (L) = 6 * sisi * sisi");
//        System.out.println("Diketahui : s = " + (int) sisi);
//        System.out.println("Ditanya : V, L?");
//        System.out.println("V = " + volume());
//        System.out.println("L = " + luasPermukaan());
//        System.out.println();
//}
}
