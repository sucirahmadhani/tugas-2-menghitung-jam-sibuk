public class Asdos extends Mahasiswa {
    private int jamNgasdos;

    public Asdos(String nama, int sks, int jamNgasdos){
        super(nama, sks);
        jamSibuk = jamSibuk + jamNgasdos;
    }

    public void mailCheck(){
        System.out.println(this.nama + " adalah seorang asdos dengan jam sibuk " +getjamSibuk());
    }

    public int getjamSibuk(){
        return jamSibuk;
    }

    public int jamNgasdos(){
        return jamNgasdos;
    }
    
}
