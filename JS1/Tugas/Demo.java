package JS1.Tugas;

public class Demo {
    public static void main(String[] args) {

        Sneakers sneakers = new Sneakers();
        sneakers.setMerk("Converse");
        sneakers.setUkuran(38);
        sneakers.setJenisTali("Tali Pipih");
        sneakers.setWarnaSol("Putih");

        Flatshoes flatshoes = new Flatshoes();
        flatshoes.setMerk("Batik Keris");
        flatshoes.setUkuran(38);
        flatshoes.setWarna("Hitam");
        flatshoes.setBahan("Kulit Sintetis");

        KipasAngin kipas = new KipasAngin();
        kipas.setMerk("Goodmili Rotation Fan 9");
        kipas.setDayaListrik(30);

        Binder binder = new Binder();
        binder.setWarna("Pink");
        binder.tambahKertas(40);

        System.out.println("=== INFO SNEAKERS ===");
        sneakers.cetakInfo();
        System.out.println();

        System.out.println("=== INFO FLATSHOES ===");
        flatshoes.cetakInfo();
        System.out.println();

        System.out.println("=== INFO KIPAS ANGIN ===");
        kipas.cetakInfo();
        System.out.println();

        System.out.println("=== INFO BINDER ===");
        binder.cetakInfo();
    }
}