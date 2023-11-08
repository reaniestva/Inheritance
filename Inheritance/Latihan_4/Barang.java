package Latihan_4;

import java.util.ArrayList;

public class Barang {

    private ArrayList<String> namaBarang = new ArrayList<String>();
    private ArrayList<Integer> stok = new ArrayList<Integer>();
    private ArrayList<Double> harga = new ArrayList<Double>();

    public Barang() {
        this.namaBarang.add("Coklat");
        this.stok.add(15);
        this.harga.add(10.000);
        this.namaBarang.add("Mochi");
        this.stok.add(30);
        this.harga.add(5.000);
        this.namaBarang.add("Ayam");
        this.stok.add(20);
        this.harga.add(15.000);
    }

    public int getJmlBarang() {
        return this.namaBarang.size();
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang.add(namaBarang);
    }

    public String getNamaBarang(int idBarang) {
        return this.namaBarang.get(idBarang);
    }

    public void setStok(int stok) {
        this.stok.add(stok);
    }

    public int getStok(int idBarang) {
        return this.stok.get(idBarang);
    }

    public void editStok(int idBarang, int stok) {
        this.stok.set(idBarang, stok);;
    }

    public void setHarga(double harga) {
        this.harga.add(harga);
    }

    public double getHarga(double idBarang) {
        return this.harga.get((int) idBarang);
    }
}
