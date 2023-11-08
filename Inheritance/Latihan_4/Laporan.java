package Latihan_4;

public class Laporan {
    public void laporan(Barang barang) {
        int x = barang.getJmlBarang();

        System.out.println();
        System.out.println("Tabel Makanan");
        System.out.println();
        System.out.println("Nama Makanan \tStok \tHarga");
        for (int i = 0; i < x; i++) {
            System.out.println(barang.getNamaBarang(i) + "\t"+ 
            barang.getStok(i) + "\t" + barang.getHarga(i));
        }
    }

    public void laporan(Member member){
        int x = member.getJmlMember();
        
        System.out.println();
        System.out.println("Tabel Member");
        System.out.println();
        System.out.println("Nama \t Alamat \t Telepon \t Saldo");
        
        for (int i = 0; i < x; i++) {
            System.out.println(member.getNama(i)+"\t"
                    + member.getAlamat(i)+"\t"+member.getTelepon(i)+"\t"
                            + member.getSaldo(i));
        }
    }
    public void laporan(Transaksi transaksi, Barang barang){
        int x = transaksi.getJmlTransaksi();
        
        System.out.println();
        System.out.println("Laporan Transaksi");
        System.out.println();
        System.out.println("Nama Makanan \t Qty \t Harga \t Jumlah");
        
        int total = 0;
        for (int i = 0; i < x; i++) {
            int jumlah = (int) (transaksi.getBanyaknya(i) * barang.getHarga(transaksi.getIdBarang(i)));
            total += jumlah;
            
            System.out.println(barang.getNamaBarang(transaksi.getIdBarang(i))+
                    "\t\t  "+transaksi.getBanyaknya(i)+"\t  "+barang.getHarga(transaksi.getIdBarang(i))+
                    "\t  "+jumlah);
        }
        System.out.println("Total Omset: "+total);
    }
}
