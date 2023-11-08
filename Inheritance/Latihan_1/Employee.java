package Latihan_1;

public class Employee {
    private String nama;
    private int jk;
    private String jb;
    private String status;
    private int gaji;
    private int potongan;
    private int bonus;
    private int tunjangan;
        
    public Employee(String nama, int jk, String jb, String status, int gaji, int potongan, int bonus, int tunjangan) {
        this.nama = nama;
        this.jk = jk;
        this.jb = jb;
        this.status = status;
        this.gaji = gaji;
        this.potongan = potongan;
        this.bonus = bonus;
        this.tunjangan = tunjangan;
    }
   public void info() {
       System.out.println("Nama : " +nama);
       System.out.println("Jam Kerja : " +jk);
       System.out.println("Jabatan : " +jb);
       System.out.println("Status : " +status);
       System.out.println("Gaji : " +gaji);
       System.out.println("Potongan : " +potongan);
       System.out.println("Bonus : " +bonus);
       System.out.println("Tunjangan: "+tunjangan);
   }
}
