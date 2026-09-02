package JS1.Tugas;

public class KipasAngin {
    private String merk;
    private int dayaListrik;

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setDayaListrik(int daya) {
        this.dayaListrik = daya;
    }

    public void cetakInfo() {
        System.out.println("Merk         : " + merk);
        System.out.println("Daya Listrik : " + dayaListrik + " Watt");
    }
}