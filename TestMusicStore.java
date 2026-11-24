public class TestMusicStore {
    public static void main(String[] args) {
        Guitar gitar1 = new Guitar(2000000, true, 6, "Mahogany");
        System.out.println("Kayu gitar: " + gitar1.getWoodType() + ", Jumlah senar: " + gitar1.getNumStrings());
        System.out.println("Harga (setelah onSale 15%): Rp" + gitar1.getPrice());
        System.out.println("Harga karyawan (diskon 25%): Rp" + gitar1.getEmployeePrice());
    }
}