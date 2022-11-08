public class Tendik extends Karyawan{
    protected int total;
//    protected int totalGaji;
    @Override
    public int gajiPokok() {
        return super.gajiPokok();
    }

    public int gajiTotal(){
        return super.gajiPokok();
    }

    public int lembur(int jam){
//        gajiPokok();
//        int total;
         total = 50000 * jam;
        return  total;
    }

    //overloading
    public int gajiTotal(int jam){
        return gaji + total;
    }



}
