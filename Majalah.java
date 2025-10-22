public class Majalah extends BahanPustaka {
    private String edisi;
    private String bulanTerbit;

    public Majalah(String id, String judul, String penerbit, Rak rak, String edisi, String bulanTerbit) {
        super(id, judul, penerbit, rak);
        this.edisi = edisi;
        this.bulanTerbit = bulanTerbit;
    }

    @Override
    public String getInfo() {
        return "Majalah: " + getJudul() + " Edisi " + edisi + " (" + bulanTerbit + ") - " + getStatus();
    }

    public void pinjam(int lamaHari) {
        super.pinjam();
        System.out.println("Majalah ini harus dikembalikan dalam " + lamaHari + " hari.");
    }
}
