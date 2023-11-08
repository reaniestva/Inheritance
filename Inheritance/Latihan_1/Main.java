package Latihan_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int nip;
        String nama;
        int jk;
        String jb;
        String status;
        int gaji = 0;
        int potongan = 0;
        int bonus = 0;
        int tunjangan = 0;
        int total;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan NIP: ");
        nip = scan.nextInt();
        System.out.print("Masukkan Nama: ");
        nama = scan.next();
        System.out.print("Masukkan Jam Kerja: ");
        jk = scan.nextInt();
        System.out.print("Masukkan Jabatan: ");
        jb = scan.next();
        System.out.print("Masukkan Status: ");
        status = scan.next();
        
        switch(jb){
            case "Boss": gaji = 10000000;
            break;
            case "Manager": gaji = 8000000;
            break;
            case "CS": gaji = 5000000;
            break;
            case "Security": gaji = 5000000;
            break;
        }
        
        if(jk < 8){
            potongan = 100000 * (8 - jk);
        } else if(jk > 8) {
            bonus = 200000;
        } else {
             
        }
        
        switch(status){
            case "Menikah":
                tunjangan = 2000000;
            break;
            case "Belum Menikah":
                tunjangan = 0;
        }
        
        switch(jb){
            case "Boss": Boss bs = new Boss(nip, nama, jk, jb, status, gaji, potongan, bonus, tunjangan);
                         bs.info();
                         total = gaji - potongan + bonus + tunjangan;
                         System.out.println("Total: "+total);
            break;
            case "Manager": Manager mn = new Manager(nip, nama, jk, jb, status, gaji, potongan, bonus, tunjangan);
                            mn.info();
                            total = gaji - potongan + bonus + tunjangan;
                            System.out.println("Total: "+total);
            break;
            case "CS": CS cs = new CS(nip, nama, jk, jb, status, gaji, potongan, bonus, tunjangan);
                       cs.info();
                       total = gaji - potongan + bonus + tunjangan;
                       System.out.println("Total: "+total);
            break;
            case "Security": Security sc = new Security(nip, nama, jk, jb, status, gaji, potongan, bonus, tunjangan);
                             sc.info();
                             total = gaji - potongan + bonus + tunjangan;
                             System.out.println("Total: "+total);
            break;
        }
    }
}
