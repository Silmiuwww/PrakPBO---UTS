public class DemoPerpustakaan {
    public static void main(String[] args) {
        Rak rak1 = new Rak("R02", "Lantai 2", 40);

        Buku buku1 = new Buku("B002", "Hujan", "Gramedia", rak1, "Tere Liye", 320);
        Majalah majalah1 = new Majalah("M002", "Bobo", "Kompas Media", rak1, "45", "September");

        Anggota anggota1 = new Anggota("A002", "Naila", "Malang");

        System.out.println(buku1.getInfo());
        System.out.println(majalah1.getInfo());

        buku1.pinjam();      
        majalah1.pinjam(3);  
        anggota1.pinjam(buku1, "P002", "22-10-2025", "29-10-2025");
        anggota1.pinjam(majalah1, "P003", "22-10-2025", "25-10-2025");

        System.out.println(buku1.getInfo());
        System.out.println(majalah1.getInfo());
    }
}
