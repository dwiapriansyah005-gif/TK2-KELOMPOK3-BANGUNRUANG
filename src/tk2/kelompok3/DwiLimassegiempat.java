
package tk2.kelompok3;
public class DwiLimassegiempat {


        //Atributt
        private double alas;
        private double tinggi;
        private double tinggiSisi;

        
        //Constructor
        public DwiLimassegiempat(double alas, double tinggi, double tinggiSisi) {
            this.alas = alas;
            this.tinggi = tinggi;
            this.tinggiSisi = tinggiSisi;
        }

        
        //Getter dan Setter
        public double getAlas() {
            return alas;
        }

        public void setAlas(double alas) {
            this.alas = alas;
        }

        public double getTinggi() {
            return tinggi;
        }

        public void setTinggi(double tinggi) {
            this.tinggi = tinggi;
        }

        public double getTinggiSisi() {
            return tinggiSisi;
        }

        public void setTinggiSisi(double tinggiSisi) {
            this.tinggiSisi = tinggiSisi;
        }

        //rumus
        // 1. Menghitung diagonal alas
        public double diagonalAlas() {
            return alas * Math.sqrt(2);
        }

        // 2. Menghitung luas alas
        public double luasAlas() {
            return alas * alas;
        }

        // 3. Menghitung keliling alas
        public double kelilingAlas() {
            return 4 * alas;
        }

        // 4. Menghitung luas satu sisi tegak
        public double luasSisitegak() {
            return 0.5 * alas * tinggiSisi;
        }

        // 5. Menghitung luas selimut
        public double luasSelimut() {
            return 4 * luasSisitegak();
        }

        // 6. Menghitung luas permukaan
        public double luasPermukaan() {
            return luasAlas() + luasSelimut();
        }

        // 7. Menghitung Volume
        public double volume() {
            return (1.0 / 3.0) * luasAlas() * tinggi;
        }

        //method
        public void tampil() {
            System.out.println("Rumus Diagonal Alas (d) = alas * Math.sqrt(2) ");
            System.out.println("Rumus Luas Alas (LA) = alas * alas ");
            System.out.println("Rumus Keliling Alas (K) = 4 * alas ");
            System.out.println("Rumus Luas Sisi Tegak (Lst) = 1/2 * alas * tinggiSisi ");
            System.out.println("Rumus Luas selimut (Ls) = 4 * luasSisitegak ");
            System.out.println("Rumus Luas Permukaan (L) = luasAlas + luasSelimut ");
            System.out.println("Rumus Volume (V) = 1/3 * luasAlas * tinggi ");

            System.out.println("Diketahui : alas = " + (double) alas + "\ntinggi = " + (double) tinggi + "\ntinggiSisi = " + (double) tinggiSisi);
            System.out.println("Ditanya : Diagonal Alas, Luas Alas, Keliling Alas, Luas Sisi Tegak, Luas Selimut, Luas Permukaan, Volume?");

            System.out.println("Diagonal Alas = " + diagonalAlas());
            System.out.println("Luas Alas = " + luasAlas());
            System.out.println("Keliling Alas = " + kelilingAlas());
            System.out.println("Luas Sisi Tegak = " + luasSisitegak());
            System.out.println("Luas Selimut = " + luasSelimut());
            System.out.println("Luas Permukaan = " + luasPermukaan());
            System.out.println("Volume = " + volume());

            System.out.println();
        }
    }


