package UKL;

import static UKL.Main.b;
import static UKL.Main.input;
import java.util.ArrayList;

public class Lelang {
    private ArrayList<Integer> idPenawar;
    private ArrayList<Integer> idBarang;
    private ArrayList<Integer> hargaTawar;

    public Lelang (){
        idPenawar = new ArrayList<Integer>();
        idBarang = new ArrayList<Integer>();
        hargaTawar = new ArrayList<Integer>();
    }
    public void Tambah(int idPenawar, int idBarang, int hargaTawar) {
        this.idPenawar.add(idPenawar);
        this.idBarang.add(idBarang);
        this.hargaTawar.add(hargaTawar);
    }
    
    public ArrayList<Integer> getIdPenawar(){
        return idPenawar;
    }
    public ArrayList<Integer> getIdBarang(){
        return idBarang;
    }
    public ArrayList<Integer> getHargaTawar(){
        return hargaTawar;
    }
    
    public void lelangan(){
        System.out.println("Masukkan ID Barang: ");
        int nomor = input.nextInt();
        if(b.getStatus(nomor) == true){
        System.out.println("Masukkan harga tawar: ");
        int tawar = input.nextInt();
                    
            if(tawar > b.getHargaAwal(nomor)){
                b.gantiHargaAwl(nomor, tawar);
                System.out.println("Harga "+b.getNamaBarang(nomor)+": "+b.getHargaAwal(nomor));
            } else{ 
                System.out.println("Harga yang anda tawarkan kurang");
            }
}
    }

    
}    