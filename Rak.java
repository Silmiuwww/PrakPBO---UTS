public class Rak {
    private String idRak;
    private String lokasi;
    private int kapasitas;

    public Rak(String idRak, String lokasi, int kapasitas) {
        this.idRak = idRak;
        this.lokasi = lokasi;
        this.kapasitas = kapasitas;
    }

    public String getInfo() {
        return "Rak " + idRak + " - Lokasi: " + lokasi + " (kapasitas: " + kapasitas + ")";
    }
}
