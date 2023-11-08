package Latihan_4;

import java.util.ArrayList;

public class Member implements User{
     private ArrayList<String> namaMember = new ArrayList<String>();
     private ArrayList<String> alamat = new ArrayList<String>();
     private ArrayList<String> telepon = new ArrayList<String>();
     private ArrayList<Double> saldo = new ArrayList<Double>();
     
     public Member(){
         this.namaMember.add("Lala");
         this.alamat.add("Sawojajar");
         this.telepon.add("08123456");
         this.saldo.add(100.000);
         
         this.namaMember.add("Lily");
         this.alamat.add("Araya");
         this.telepon.add("\t08429629");
         this.saldo.add(100.000);
     }
     public void setSaldo(double saldo){
         this.saldo.add(saldo);
     }
     public double getSaldo(double idMember){
         return this.saldo.get((int) idMember);
     }
     public void editSaldo(double idMember, double saldo){
         this.saldo.set((int) idMember, saldo);
     }
     public int getJmlMember(){
         return this.saldo.size();
     }
     
     @Override
     public void setNama(String namaMember){
         this.namaMember.add(namaMember);
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
     public String getNama(int idMember){
         return this.namaMember.get(idMember);
     }
     @Override
     public String getAlamat(int idMember){
         return this.alamat.get(idMember);
     }
     @Override
     public String getTelepon(int idMember){
         return this.telepon.get(idMember);
     }
}
