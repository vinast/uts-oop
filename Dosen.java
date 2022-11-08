public class Dosen extends Karyawan{
    private String prodi;
    private int NIDN;

    protected int total;
    @Override
    public int gajiPokok() {
        return super.gajiPokok();
    }

    public int gajiTotal(){
        return super.gajiPokok();
    }

    public int mengajarLebih(int sks){
        total = 100000 * sks;
        return  total;
    }

    //overloading
    public int gajiTotal(int jam){
        return gaji + total;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public int getNIDN() {
        return NIDN;
    }

    public void setNIDN(int NIDN) {
        this.NIDN = NIDN;
    }
}
