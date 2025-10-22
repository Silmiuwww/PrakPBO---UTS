public abstract class BahanPustaka {
    private String id;
    private String judul;
    private String penerbit;
    private String status;
    private Rak rak;

    public BahanPustaka(String id, String judul, String penerbit, Rak rak) {
        this.id = id;
        this.judul = judul;
        this.penerbit = penerbit;
        this.rak = rak;
        this.status = "Tersedia";
    }

    public String getId() {
        return id; 
    }
    public String getJudul() {
        return judul;
    }
    public String getPenerbit() {
        return penerbit;
    }
    public String getStatus() {
        return status;
    }
    public Rak getRak() {
        return rak;
    }

    public void setStatus(String status) { this.status = status; }

    public abstract String getInfo();

    
    public void pinjam() {
        if (status.equals("Tersedia")) {
            status = "Dipinjam";
            System.out.println(judul + " berhasil dipinjam.");
        } else {
            System.out.println(judul + " sedang dipinjam.");
        }
    }
}
