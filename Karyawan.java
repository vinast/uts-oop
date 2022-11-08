public class Karyawan {
    protected int NIP;
    protected String name;
    protected String alamat;
    protected String tanggalLahir;
    protected int thnMasuk;
    protected int gaji;

    public int gajiPokok(){
        setGaji(2000000);
        return gaji;

    }

    public int getNIP() {
        return NIP;
    }

    public void setNIP(int NIP) {
        this.NIP = NIP;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public int getThnMasuk() {
        return thnMasuk;
    }

    public void setThnMasuk(int thnMasuk) {
        this.thnMasuk = thnMasuk;
    }

    public int getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }
}
