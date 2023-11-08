package UKL;

import static UKL.Main.b;
import java.util.ArrayList;
import java.util.Scanner;

public class Barang {
    private ArrayList<Integer> idMasyarakat = new ArrayList<Integer>();
    private ArrayList<String> namaBarang = new ArrayList<String>();
    private ArrayList<Integer> hargaAwal = new ArrayList<Integer>();
    private ArrayList<Boolean> status = new ArrayList<Boolean>();
    public ArrayList<Integer> hargaTinggi = new ArrayList<Integer>();
    
    public int jBarangg = namaBarang.size();
    
    public int getHargaTinggi(int id){
        return this.hargaTinggi.get(id);
    }

    
    public void gantiHargaAwl(int id, int harga){
        this.hargaAwal.set(id, harga);
    }
    public void setIdMasyarakat(int idMasyarakat){
        this.idMasyarakat.add(idMasyarakat);
    }
    public int getIdMasyrakat(int id){
        return this.idMasyarakat.get(id);
    }
    public void setNamaBarang(String namaBarang){
        this.namaBarang.add(namaBarang);
    }
    public String getNamaBarang(int id){
        return this.namaBarang.get(id);
    }
    public void setHargaAwal(int hargaAwal){
        this.hargaAwal.add(hargaAwal);
    }
    public int getHargaAwal(int id){
        return this.hargaAwal.get(id);
    }
    public void setStatus(boolean status){
        this.status.add(status);
    }
     public boolean getStatus(int id){
         return this.status.get(id);
    }
    
     public void jualan(){
        String nama;
        int harga;
        boolean status = true;
        Scanner i = new Scanner(System.in);
                
        System.out.println("Masukkan nama barang: ");
        nama = i.nextLine();
        b.setNamaBarang(nama);
        System.out.println("Masukkan harga awal: ");
        harga = i.nextInt();
        b.setHargaAwal(harga);
        b.setStatus(status);
        System.out.println("Barang siap dilelang");
        }

    public Barang() {
       this.namaBarang.add("Lukisan 1");
       this.hargaAwal.add(10000000);
       this.status.add(Boolean.TRUE);
       
       this.namaBarang.add("Lukisan 2");
       this.hargaAwal.add(9000000);
       this.status.add(Boolean.TRUE);
       
        for (int i = 0; i < jBarangg ; i++) {
            hargaTinggi.add(hargaAwal.get(i));
        }
    }
    
    public void tampilan(){
        int barang = namaBarang.size();
        for (int i = 0; i < barang; i++) {
            System.out.println("ID: "+namaBarang.indexOf(getNamaBarang(i)));
            System.out.println("Nama Barang: "+getNamaBarang(i));
            System.out.println("Harga Awal: "+getHargaAwal(i));
            System.out.println("");
        }
    }
}
        