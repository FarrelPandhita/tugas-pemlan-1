public class Atm {
     private Long saldo;
     private String nama;
     private String norek;
     private String password;


    public void setPassword(String password) {
        if(passwordValidator(password)){
        this.password = password;
            System.out.println("Password berhasil diset : "+ password);
        }
    }

    public void setNama(String nama) {
        if(namaValidator(nama)){
            this.nama = nama;
            System.out.println("Berhasil! nama anda: "+ nama);
        }
    }

    public void setNorek(String norek) {
        if(noRekValidator(norek)){
            this.norek = norek;
            System.out.println("Berhasil! norek anda : "+ norek);
        }
    }

    public void setSaldo(long saldo) {
        if (saldoValidator(saldo)){
            this.saldo = saldo;
            System.out.println("Berhasil! saldo anda : "+ saldo);
        }
    }

    public String getNorek() {
        return norek;
    }

    public long getSaldo() {
        return saldo;
    }

    public String getNama() {
        return nama;
    }

    public String getPassword() {
        return password;
    }

    public static boolean namaValidator(String nama){
        if (nama == null) {
            System.out.println("Nama tidak boleh kosong!");
            return false;
        }
        if (nama.length() < 4) {
            System.out.println("Nama minimal 4 karakter.");
            return false;
        }
        return true;
    }
    public static boolean noRekValidator(String norek){
        if (norek == null) {
            System.out.println("Norek tidak boleh kosong!");
            return false;
        }
        if (norek.length() < 8) {
            System.out.println("Norek tidak valid.");
            return false;
        }
        return true;
    }

    public static boolean passwordValidator(String password){

        if (password == null) {
            System.out.println("Password tidak boleh kosong!");
            return false;
        }
        if (password.length() < 8) {
            System.out.println("Password minimal 8 karakter.");
            return false;
        }
        if (!password.chars().anyMatch(Character::isUpperCase)) {
            System.out.println("Password harus memiliki huruf kapital.");
            return false;
        }
        if (!password.contains("_")) {
        System.out.println("Password harus mengandung karakter '_'.");
        return false;
        }
        return true;
    }
    public static boolean saldoValidator(Long saldo){
        if(saldo != null){
            if(saldo>0 ){
                System.out.println("Saldo berhasil diset: "+ saldo);
                return true;
            }else{
                System.out.println("Saldo tidak valid.");
                return false;
            }
        }else{
            System.out.println("Saldo tidak boleh kosong!");
            return false;
        }
    }

    public void transaksi(String passwordInput, long pengeluaran){
        if (!password.equals(passwordInput)) {
            System.out.println("Password tidak sesuai");
            return;
        }
        if (saldo < pengeluaran) {
            System.out.println("Saldo tidak mencukupi!");
            return;
        }
        saldo -= pengeluaran;
        System.out.println("Transaksi berhasil! Saldo sekarang: " + saldo);
    }
}




