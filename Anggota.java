import java.util.ArrayList;

public class Anggota {
    private String idAnggota;
    private String nama;
    private String alamat;
    private ArrayList<Peminjaman> daftarPeminjaman;

    public Anggota(String idAnggota, String nama, String alamat) {
        this.idAnggota = idAnggota;
        this.nama = nama;
        this.alamat = alamat;
        this.daftarPeminjaman = new ArrayList<>();
    }

    public void pinjam(BahanPustaka bp, String idPeminjaman, String tglPinjam, String tglKembali) {
        Peminjaman p = new Peminjaman(idPeminjaman, tglPinjam, tglKembali, this, bp);
        daftarPeminjaman.add(p);
        bp.setStatus("Dipinjam");

        System.out.println("Anggota " + nama + " meminjam " + bp.getJudul());
    }

    public String getInfo() {
        return "Anggota: " + nama + " (" + idAnggota + "), Alamat: " + alamat;
    }
}
