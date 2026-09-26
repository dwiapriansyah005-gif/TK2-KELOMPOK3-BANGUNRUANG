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
