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
        BalokBagas balok = new BalokBagas(8,4,3);
        balok.tampil();
        //Bola
        BolaFaul bola = new BolaFaul(7);
        bola.tampil();
    }
    
}
