package tk2.kelompok3;

public class BalokBagas {
    
    private double panjang;
    private double lebar;
    private double tinggi;

    public BalokBagas(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    public double volume(){
        return panjang*lebar*tinggi;
    }
    public double LuasPermukaaan(){
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }
    public void tampil(){
        System.out.println("-------BALOK-------");
        System.out.println("Rumus Volume (V) = p * l * t");
        System.out.println("Rumus Luas Permukaan (L) = 2 * (p*l + p*t + 1*t)");
        System.out.println("Diketahui : p = " + (int)panjang + "l = " + (int)lebar + "t = " + (int)tinggi );
        System.out.println("Ditanya : V, L?");
        System.out.println("V = " + volume());
        System.out.println("L = " + LuasPermukaaan());
        System.out.println();
        
    }
}
