package JS5.Tugas;

public class Main {
    public static void main(String[] args) {
        System.out.println("============ Tiket Kereta ============");
        TiketKereta tk = new TiketKereta("KA-001", "Andi", "Malang", "Jakarta", 350000, 3, "12A");
        tk.tampilKereta();

        System.out.println("\n======== Tiket Pesawat Domestik ========");
        TiketDomestik td = new TiketDomestik();
        td.kodeTiket = "GA-102";
        td.namaPenumpang = "Sinta";
        td.asal = "Surabaya";
        td.tujuan = "Denpasar";
        td.hargaDasar = 900000;
        td.maskapai = "Garuda Indonesia";
        td.beratBagasi = 25;
        td.pajakBandara = 75000;
        td.tampilDomestik();

        System.out.println("\n====== Tiket Pesawat Internasional ======");
        TiketInternasional ti = new TiketInternasional("SQ-205", "Budi", "Jakarta", "Singapura", 2500000, "Singapore Airlines", 20, "C1234567", 150000);
        ti.tampilInternasional();
    }
}
