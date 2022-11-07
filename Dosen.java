public class Dosen extends Elemen {
    private int jumlahHariKerja;
    public int getJumlahHariKerja() {
        return jumlahHariKerja;
    }

    int jamSibuk;

    public Dosen(String nama, int jumlahHariKerja){
        super(nama);
        jamSibuk = jumlahHariKerja*8;
    }

    public int getjamSibuk(){
        return jamSibuk;
    }

    public int jumlahHariKerja(){
        return jamSibuk;
    }

    public void mailCheck(){
        System.out.println(this.nama+" adalah seorang dosen dengan jam sibuk "+getjamSibuk());
    }
    
}
