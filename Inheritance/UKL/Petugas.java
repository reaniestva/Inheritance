package UKL;

import java.util.ArrayList;

public class Petugas implements User{
    private ArrayList<String> namaPetugas = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    
    public Petugas (){
        this.namaPetugas.add("Hanin");
        this.alamat.add("Tanggerang");
        this.telepon.add("0567829187822");

        this.namaPetugas.add("Arthur");
        this.alamat.add("Gorontalo");
        this.telepon.add("045678927865678");

        this.namaPetugas.add("Mattheo");
        this.alamat.add("Bogor");
        this.telepon.add("0456789287652663");
    }
    @Override
    public void setNama(String namaPetugas){
        this.namaPetugas.add(namaPetugas);
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
    public String getNama(int idPetugas){
        return this.namaPetugas.get(idPetugas);
    }
    @Override
    public String getAlamat(int idPetugas){
        return this.alamat.get(idPetugas);
    }
    @Override
    public String getTelepon(int idPetugas){
        return this.telepon.get(idPetugas);
    }
    
    public void tampilan(){
        int x = this.namaPetugas.size();
        for (int i = 0; i < x; i++) {
            System.out.println("Nama: "+getNama(i));
            System.out.println("Alamat: "+getAlamat(i));
            System.out.println("Telepon: "+getTelepon(i));
        }
    }
}
