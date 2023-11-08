package UKL;

import static UKL.Main.m;
import java.util.ArrayList;
import java.util.Scanner;

public class Masyarakat implements User {
    private ArrayList<String> namaMasyarakat = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    
    
    public Masyarakat (){
        this.namaMasyarakat.add("Hagara");
        this.alamat.add("Bandung");
        this.telepon.add("098765432112");
        System.out.println("");
        
        this.namaMasyarakat.add("Giano");
        this.alamat.add("Malang");
        this.telepon.add("087654323456");
        System.out.println("");
        
        this.namaMasyarakat.add("Faras");
        this.alamat.add("Jakarta Selatan");
        this.telepon.add("0345678124563");
    }
    
     @Override
     public void setNama(String namaMasyarakat){
         this.namaMasyarakat.add(namaMasyarakat);
     }
     @Override
     public void setAlamat(String alamat){
         this.alamat.add(alamat);
     }
     @Override
     public void setTelepon(String telepon){
         this.telepon.add(telepon);
     }
     @Override
     public String getNama(int idMasyarakat){
         return this.namaMasyarakat.get(idMasyarakat);
     }
     @Override
     public String getAlamat(int idMasyarakat){
         return this.alamat.get(idMasyarakat);
     }
     @Override
     public String getTelepon(int idMasyarakat){
         return this.telepon.get(idMasyarakat);
     }

    public void tampilan(){
        int x = this.namaMasyarakat.size();
        for (int i = 0; i < x; i++) {
            System.out.println("Nama: "+getNama(i));
            System.out.println("Alamat: "+getAlamat(i));
            System.out.println("Telepon: "+getTelepon(i));
        }
    }
    
    public void Daftar(){
        String nama, alamat, nomor;
        Scanner log = new Scanner(System.in);
        System.out.println("Masukkan nama: ");
        nama = log.next();
        m.setNama(nama);
        System.out.println("Masukkan Alamat: ");
        alamat = log.next();
        m.setAlamat(alamat);
        System.out.println("Masukkan Nomor Telepon: ");
        nomor = log.next();
        m.setTelepon(nomor);
    }
}
