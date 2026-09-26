package tk2.kelompok3;

public class MainBangunRuang {

    public static void main(String[] args) {
        // TODO code application logic here
        // 1. KUBUS 
        KubusBetrin kubus = new KubusBetrin(14);
        kubus.tampil();
        // 2.Tabung
        TabungNatasza tabung = new TabungNatasza(7, 10);
        tabung.tampil();
        //3.Balok
        BalokBagas balok = new BalokBagas(10, 8, 7);

        System.out.println("-------BALOK-------");
        System.out.println("Rumus Volume (V) = p * l * t");
        System.out.println("Rumus Luas Permukaan (L) = 2 * (p*l + p*t + 1*t)");
        System.out.println("Diketahui : p = " + (int) balok.getPanjang() + ", l = " + (int) balok.getLebar() + ", t = " + (int) balok.getTinggi());
        System.out.println("Ditanya : V, L?");
        System.out.println("V = " + balok.getVolume());
        System.out.println("L = " + balok.getLuasPermukaan());
        System.out.println();
        //4.Bola
        BolaFaul bola = new BolaFaul(7);
        bola.tampil();
        //5.Kerucut
        KerucutFarid kerucut = new KerucutFarid(7, 24, 25);
        kerucut.tampil();
        //6.Limas Segi Empat
        DwiLimassegiempat limas = new DwiLimassegiempat(10, 5, 12);

        limas.volume();
        limas.luasPermukaan();

        double v = Math.round(limas.getVolume() * 100.0) / 100.0;
        double l = Math.round(limas.getLuasPermukaan() * 100.0) / 100.0;

        System.out.println("------Limas Segi Empat------");
        System.out.println("Rumus Volume (V) = 1/3 * s * s * t");
        System.out.println("Rumus Luas Permukaan (L) = (s*s) + 4*(1/2 * s * tinggiSisi)");
        System.out.println("Diketahui : s = " + (int) limas.getSisiAlas());
        System.out.println("Diketahui : t = " + (int) limas.getTinggiLimas());
        System.out.println("Diketahui : tinggiSisi = " + (int) limas.getTinggiSisi());

        System.out.println("Volume = " + v);
        System.out.println("Luas Permukaan = " + l);
    }

}
