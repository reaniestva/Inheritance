package UKL;

import java.util.Scanner;

public class Main {
    static Masyarakat m = new Masyarakat();
    static Petugas p = new Petugas();
    static Lelang l = new Lelang();
    static Barang b = new Barang();
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        boolean t = true;
        String k;
        String y;
        System.out.print("1. Daftar\n2. Logout\nMasukkan pilihan: ");
        y = input.next();
        if(y.equals("1")){
            m.Daftar();
        } else{
            t = false;
        }
         
        while(t == true){
            System.out.println("——————————");
            System.out.println("1. List Barang");
            System.out.println("2. List Petugas");
            System.out.println("3. List Pelelang");
            System.out.println("4. Jual Barang");
            System.out.println("5. Beli Barang");
            System.out.println("6. Log out");
            System.out.println("Masukkan pilihan: ");
            int menu = input.nextInt();
            
            if(menu == 1){
                b.tampilan();
                System.out.println("Ketik 0 untuk kembali ke menu: ");
                k = input.next(); 
            } else if(menu == 2){
                p.tampilan();
                System.out.println("Ketik 0 untuk kembali ke menu: ");
                k = input.next();
            } else if(menu == 3){
                m.tampilan();
                System.out.println("Ketik 0 untuk kembali ke menu: ");
                k = input.next();
            } else if(menu == 4){
                b.jualan();
                System.out.println("Ketik 0 untuk kembali ke menu: ");
                k = input.next();
            } else if(menu == 5){
                l.lelangan();
                System.out.println("Ketik 0 untuk kembali ke menu: ");
                k = input.next();
            } else if(menu == 6){
                t = false;
            }    
        }
    }
}