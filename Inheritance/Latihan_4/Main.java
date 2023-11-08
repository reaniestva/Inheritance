package Latihan_4;


public class Main {
    public static void main(String[] args) {
        Laporan lp = new Laporan();
        Barang br = new Barang ();
        Transaksi tr = new Transaksi ();
        Member mb = new Member ();
        Karyawan kr = new Karyawan();
        
        tr.prosesTransaksi(mb, tr, br);
        
        lp.laporan(br);
        lp.laporan(mb);
        lp.laporan(tr, br);
    }
}
