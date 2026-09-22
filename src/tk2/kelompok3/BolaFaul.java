package tk2.kelompok3;

public class BolaFaul {
    private double jariJari;

    public BolaFaul(double jariJari) {
        this.jariJari = jariJari;
    }

    
    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }
    public double volume(){
        return (4.0/3.0) * Math.PI * Math.pow(jariJari, 3);
    }
    public double LuasPermukaan(){
        return 4 * Math.PI * Math.pow(jariJari, 2);
    }
    public void tampil(){
        System.out.println("------- BOLA -------");
        System.out.println("Rumus Volume (V) = 4/3 * phi * r * r * r");
        System.out.println("Rumus Luas Permukaan (L) = 4 * phi * r * r");
        System.out.println("Diketahui : r = " + (int) jariJari
                         + ", phi = " + String.format("%.2f", Math.PI));
        System.out.println("Ditanya : V, L?");
        System.out.printf("V = %.2f%n", volume());
        System.out.printf("L = %.2f%n", LuasPermukaan());
        System.out.println();
    }
}
