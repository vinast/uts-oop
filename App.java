public class App {
    public static void main(String[] args) throws Exception {
        Tendik tndk = new Tendik();
        tndk.setName("Didik Vinastu");
        tndk.setNIP(2100018181);
        tndk.setTanggalLahir("10/19/2003");
        tndk.setAlamat("Jambi");
        tndk.setThnMasuk(2020);

        Dosen dsn = new Dosen();
        dsn.setName("Yolla Noverina, S.Kom., M.Kom.");
        dsn.setProdi("Informatika");
        dsn.setNIDN(2018118902);
        dsn.setNIP(2015080720);
        dsn.setTanggalLahir("02/06/1989");
        dsn.setAlamat("Jambi");
        dsn.setThnMasuk(2013);

        System.out.println("Nama Tendik         : "+ tndk.getName());
        System.out.println("NIP  Tendik         : "+ tndk.getNIP());
        System.out.println("TTL                 : "+ tndk.getTanggalLahir());
        System.out.println("Alamat              : "+ tndk.getAlamat());
        System.out.println("Tahun Masuk         : "+ tndk.getThnMasuk());
        System.out.println("Gaji Pokok          : "+tndk.gajiTotal());
        System.out.println("Gaji Lembur(20jam)  : "+ tndk.lembur(20));
        System.out.println("Gaji Keseluruhan    : "+ tndk.gajiTotal(20));

        System.out.println("\n");
        System.out.println("Nama Dosen          : "+ dsn.getName());
        System.out.println("NIP  Dosen          : "+ dsn.getNIP());
        System.out.println("NIDN                : " +dsn.getNIDN());
        System.out.println("Jurusan             : " + dsn.getProdi());
        System.out.println("TTL                 : "+ dsn.getTanggalLahir());
        System.out.println("Alamat              : "+ dsn.getAlamat());
        System.out.println("Tahun Masuk         : "+ dsn.getThnMasuk());
        System.out.println("Gaji Pokok          : "+ dsn.gajiTotal());
        System.out.println("Kel Mengajar(6SKS)  : "+ dsn.mengajarLebih(6));
        System.out.println("Gaji Keseluruhan    : "+ dsn.gajiTotal(6));



    }
}
