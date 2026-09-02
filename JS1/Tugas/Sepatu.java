package JS1.Tugas;

public class Sepatu {
    private String merk;
    private int ukuran;

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setUkuran(int ukuran) {
        this.ukuran = ukuran;
    }

    public void cetakInfo() {
        System.out.println("Merk   : " + merk);
        System.out.println("Ukuran : " + ukuran);
    }
}