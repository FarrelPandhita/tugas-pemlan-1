public class AtmMain {
    public static void main(String[] args) {
        Atm atm_andi = new Atm();
        Atm atm_agus = new Atm();

        atm_andi.setNama("agus");
        atm_andi.setNorek("8888-4444");
        atm_andi.setPassword("Helloworld");
        atm_andi.setSaldo(123456789);
//        transaksi valid
        atm_andi.transaksi("Helloworld", 12345678L);
//        transaksi invalid (password)
        atm_andi.transaksi("passwordSalah", 12345678L);
//        transaksi invalid (saldo)
        atm_andi.transaksi("Helloworld", 1234567819L);

        System.out.println("================Separator================");

        atm_agus.setNama("tes");
        atm_agus.setNorek("8888");
        atm_agus.setPassword("abcd");
        atm_agus.setSaldo(-100);
    }
}
