package JS1.Tugas;

public class Flatshoes extends Sepatu {
    private String warna;
    private String bahan;

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Warna  : " + warna);
        System.out.println("Bahan  : " + bahan);
    }
}