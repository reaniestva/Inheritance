package Latihan_1;

import java.util.Scanner;

public class Boss extends Employee{
    private int nip;
    
    public Boss(int nip, String nama, int jk, String jb, String status, int gaji, int potongan, int bonus, int tunjangan){
        super(nama, jk, jb, status, gaji, potongan, bonus, tunjangan);
        this.nip = nip;
    }
    public void info() {
        System.out.println("NIP: " +this.nip);
        super.info();
    }
}