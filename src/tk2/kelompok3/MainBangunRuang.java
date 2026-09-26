package tk2.kelompok3;
public class MainBangunRuang {
    public static void main(String[] args) {
        // TODO code application logic here
        // 1. KUBUS 
        KubusBetrin kubus = new KubusBetrin();
        kubus.setSisi(14);
       
        // 2.Tabung
        TabungNatasza tabung = new TabungNatasza(7, 10);
        tabung.tampil();
        //3.Balok
        BalokBagas balok = new BalokBagas(8,4,3);
        balok.tampil();
        //4.Bola
        BolaFaul bola = new BolaFaul(7);
        bola.tampil();
        //5.Kerucut
        KerucutFarid kerucut = new KerucutFarid(7,24,25);
        kerucut.tampil();
        //6.Limas Segi Empat
        DwiLimassegiempat limas = new DwiLimassegiempat (10, 5, 12);
        limas.tampil();
    }
    
}
