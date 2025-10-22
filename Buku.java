public class Buku extends BahanPustaka {
    private String penulis;
    private int jumlahHalaman;

    public Buku(String id, String judul, String penerbit, Rak rak, String penulis, int jumlahHalaman) {
        super(id, judul, penerbit, rak);
        this.penulis = penulis;
        this.jumlahHalaman = jumlahHalaman;
    }

    
    @Override
    public String getInfo() {
        return "Buku: " + getJudul() + " oleh " + penulis + 
               " (" + jumlahHalaman + " hlm) - " + getStatus();
    }

    public void pinjam(int lamaHari) {
        super.pinjam();
        System.out.println("Buku ini harus dikembalikan dalam " + lamaHari + " hari.");
    }
}
