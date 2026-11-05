package JS10.Percobaan1;

public class Main3 {
    public static void main(String[] args) {
        RegularStudent rStd = new RegularStudent("Rina", 400);
        ScholarshipStudent sStd =
                new ScholarshipStudent("Bayu", "KIP Kuliah");
        LabRental lab = new LabRental(3, "LAB-JARINGAN");

        Billable b[] = {rStd, lab};
        Student s[] = {rStd, sStd};

        for (Billable item : b) {
            System.out.println("Total tagihan: " + item.getBillAmount());
        }

        // Student s2[] = {rStd, sStd, lab}; // Error
    }
}
