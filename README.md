# 🏦 ATM Simulation (Java OOP)

Proyek ini merupakan implementasi sederhana dari sistem **ATM (Automated Teller Machine)** menggunakan konsep **Object-Oriented Programming (OOP)** dalam bahasa pemrograman **Java**.  
Program ini dibuat sebagai bagian dari **tugas perkuliahan** untuk mempraktikkan konsep **encapsulation, validation, dan transaction logic**.

---

# 📌 Fitur Program

Program ATM ini memiliki beberapa fitur utama:

### 1. Validasi Data Pengguna
Program melakukan validasi terhadap data yang dimasukkan sebelum disimpan ke dalam objek.

Validasi yang diterapkan:

| Data | Aturan Validasi |
|-----|----------------|
| Nama | Minimal 4 karakter |
| Nomor Rekening | Minimal 8 karakter |
| Password | Minimal 8 karakter dan harus memiliki huruf kapital |
| Saldo | Harus bernilai lebih dari 0 |

---

### 2. Manajemen Data Nasabah
Setiap objek ATM menyimpan informasi:

- Nama pemilik rekening
- Nomor rekening
- Password
- Saldo

Semua data tersebut disimpan menggunakan konsep **encapsulation** dengan atribut `private` dan diakses melalui **getter & setter**.

Contoh atribut dalam class ATM:

```java
private Long saldo;
private String nama;
private String norek;
private String password;
```

---

### 3. Sistem Transaksi
Program memungkinkan pengguna melakukan transaksi pengeluaran saldo dengan aturan berikut:

- Password harus benar
- Saldo harus mencukupi

Jika salah satu kondisi tidak terpenuhi maka transaksi akan ditolak.

Contoh kondisi transaksi:

| Kondisi | Hasil |
|-------|------|
| Password benar & saldo cukup | Transaksi berhasil |
| Password salah | Transaksi ditolak |
| Saldo tidak cukup | Transaksi ditolak |

---

# 🧠 Konsep OOP yang Digunakan

Program ini mengimplementasikan beberapa konsep dasar **Object-Oriented Programming**:

### Encapsulation
Semua atribut dibuat `private` dan hanya dapat diakses melalui **getter dan setter**.

Contoh:

```java
public String getNama() {
    return nama;
}
```

---

### Data Validation
Setter memanggil method validator sebelum menyimpan data.

Contoh:

```java
public void setPassword(String password) {
    if(passwordValidator(password)){
        this.password = password;
    }
}
```

---

### Static Validator Method
Beberapa method validator dibuat `static` agar dapat dipanggil tanpa membuat objek baru.

Contoh:

```java
public static boolean passwordValidator(String password)
```

---

### Stream API (Modern Java)
Digunakan untuk mengecek huruf kapital dalam password.

```java
password.chars().anyMatch(Character::isUpperCase);
```

---

# ⚙️ Struktur Program

```
ATM-OOP-Java
│
├── Atm.java
│   Class utama yang menyimpan data nasabah dan logika transaksi
│
├── AtmMain.java
│   Class untuk menjalankan simulasi ATM
│
└── README.md
    Dokumentasi proyek
```

---

# ▶️ Cara Menjalankan Program

1. Clone repository ini

```bash
git clone https://github.com/username/atm-java-oop.git
```

2. Compile program

```bash
javac Atm.java AtmMain.java
```

3. Jalankan program

```bash
java AtmMain
```

---

# 💻 Contoh Output Program

```
Berhasil! nama anda: agus
Berhasil! norek anda : 8888-4444
Password berhasil diset : Helloworld
Berhasil! saldo anda : 123456789

Transaksi berhasil! Saldo sekarang: 111111111
Password tidak sesuai
Saldo tidak mencukupi!

================Separator================

Nama minimal 4 karakter.
Norek tidak valid.
Password minimal 8 karakter.
Saldo tidak valid.
```

---

# 🎓 Tujuan Pembelajaran

Melalui proyek ini mahasiswa dapat memahami:

- Implementasi **OOP dalam Java**
- Penggunaan **getter dan setter**
- Konsep **encapsulation**
- Implementasi **data validation**
- Penggunaan **Java Stream API**
- Pembuatan **logika transaksi sederhana**

---

# 👨‍💻 Author

Nama : **(Isi Nama Kamu)**  
Program Studi : **(Isi Prodi Kamu)**  
Universitas : **(Isi Universitas Kamu)**  
Mata Kuliah : **Pemrograman Berorientasi Objek**

---

# 📄 License

Proyek ini dibuat untuk **keperluan pembelajaran dan tugas akademik**.
