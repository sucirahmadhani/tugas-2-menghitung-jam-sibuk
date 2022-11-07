public class Simulator {
    public static void main(String[] args) {
        Asdos fai = new Asdos("Fairuzikum" ,24, 1); //Downcasting
        Dosen raja = new Dosen("Raja OP Damanik",5); //Polymorphism
        Elemen angel = new Asdos ("Angel-chan",21, 1); //Upcasting
        Elemen firman = new Mahasiswa("Firman", 20); //Polymorphism
        Elemen nid = new Mahasiswa ("Nid to pass this sem", 23); //Downcasting
        Mahasiswa nid2 = (Mahasiswa) nid;
        Dosen niv = new Dosen("Nivotko",3); //Upcasting

        fai.mailCheck();
        raja.mailCheck();
        angel.mailCheck();
        firman.mailCheck();
        nid2.mailCheck();
        niv.mailCheck();

        int totjam = fai.jamSibuk+raja.getjamSibuk()+angel.getjamSibuk()+firman.getjamSibuk()+((Mahasiswa) nid2).getjamSibuk()+((Dosen) niv).getjamSibuk();
        System.out.println("Total jam sibuk elemen Fasilkom adalah "+totjam);
    }
}
