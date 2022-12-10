public class MainApp {

    public class TransportasiAir {
        protected int jumlahKursi, biaya;

        // cosntructor
    public Transportasi(int jumlahKursi, int biaya) {
        this.informasi = informasi;
        this.berlayar = berlayar;
        this.berlabuh = berlabuh;
    }

        public void informasi() {
            System.out.println("");
        }

        public void berlayar() {
            System.out.println("");
        }

        public void berlabuh() {
            System.out.println("");
        }
    }

    public class sampan extends TransportasiAir {
        protected int layar;

        public sampan(int jumlahKursi, int biaya, int layar) {
            layar(jumlahKursi, biaya, layar);
            this.layar = layar;
        }

    }
}