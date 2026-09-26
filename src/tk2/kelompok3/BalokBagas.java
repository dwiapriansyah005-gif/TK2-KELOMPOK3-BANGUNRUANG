package tk2.kelompok3;

public class BalokBagas {
    
    private double panjang;
    private double lebar;
    private double tinggi;
    private double Volume;
    private double LuasPermukaan;

    public BalokBagas() {
        
       
    }

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
    public void volume(){
        Volume = panjang*lebar*tinggi;
    }
    public void LuasPermukaaan(){
        LuasPermukaan = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }

    public double getVolume() {
        return Volume;
    }

    public double getLuasPermukaan() {
        return LuasPermukaan;
    }
    
        
    }
