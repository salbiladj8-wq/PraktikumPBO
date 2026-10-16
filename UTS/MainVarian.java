package UTS;

public class MainVarian {
    public static void main(String[] args) {
        Gudang gudang = new Gudang("Hub Malang", 2);
        gudang.setKepala(new Pegawai("PGW-001", "Pak Bowo"));

        Kurir eko = new Kurir("Eko", "Motor");

        PaketReguler paketReguler = new PaketReguler("PKT-001", 3);
        paketReguler.setKurir(eko);

        PaketReguler paketTanpaKurir = new PaketReguler("PKT-002", 1);

        PaketKilat paketKilat = new PaketKilat("PKT-003", 2);
        paketKilat.setKurir(eko);

        LabelPrinter printer = new LabelPrinter("Thermal-01");
        printer.cetakLabel(paketReguler);
        printer.cetakLabel(paketTanpaKurir);
        printer.cetakLabel(paketKilat);

        gudang.simpan(paketReguler, 1);
        gudang.simpan(paketTanpaKurir, 1);
        gudang.simpan(paketKilat, 2);
        gudang.tampilInfo();

        Paket paketPolimorfik = new PaketKilat("PKT-099", 5);
        System.out.println("Ongkir polimorfik: " + paketPolimorfik.hitungOngkir());
    }
}
