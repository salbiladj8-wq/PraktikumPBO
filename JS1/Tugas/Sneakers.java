package JS1.Tugas;

public class Sneakers extends Sepatu {
    private String jenisTali;
    private String warnaSol;

    public void setJenisTali(String jenisTali) {
        this.jenisTali = jenisTali;
    }

    public void setWarnaSol(String warnaSol) {
        this.warnaSol = warnaSol;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Tali   : " + jenisTali);
        System.out.println("Sol    : " + warnaSol);
    }
}