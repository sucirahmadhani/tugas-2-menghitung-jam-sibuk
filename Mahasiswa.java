public class Mahasiswa extends Elemen {
    private int sks;
    int jamSibuk;

    public Mahasiswa(String nama, int sks){
        super(nama);
        jamSibuk = sks*3;
    } 

    public void mailCheck(){
        System.out.println(this.nama + "adalah seorang mahasiswa dengan jam sibuk "+ getjamSibuk());
    }

    public int getjamSibuk(){
        return jamSibuk;
    }

    public int sks(){
        return sks;
    }
}
