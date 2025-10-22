public class Peminjaman {
    private String idPeminjaman;
    private String tglPinjam;
    private String tglKembali;
    private Anggota anggota;
    private BahanPustaka bahanPustaka;

    public Peminjaman(String idPeminjaman, String tglPinjam, String tglKembali, Anggota anggota, BahanPustaka bahanPustaka) {
        this.idPeminjaman = idPeminjaman;
        this.tglPinjam = tglPinjam;
        this.tglKembali = tglKembali;
        this.anggota = anggota;
        this.bahanPustaka = bahanPustaka;
    }

    public Peminjaman(String idPeminjaman, String tglPinjam, String tglKembali) {
        this(idPeminjaman, tglPinjam, tglKembali, null, null);
    }

    public Peminjaman(String idPeminjaman) {
        this(idPeminjaman, "-", "-", null, null);
    }

    public BahanPustaka getBahanPustaka() {
        return bahanPustaka;
    }

    public String getTglPinjam() {
        return tglPinjam;
    }
}
