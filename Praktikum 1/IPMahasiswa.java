/**
 * IPMahasiswa.java
 * [Jelaskan kegunaan class ini]
 * @author [18221029] [Muhammad Mumtaz]
 */

public class IPMahasiswa {
    // Deklarasi atribut
    private Mahasiswa mahasiswa;
    private Double ipk;

    /**
     * Konstruktor
     * @param mahasiswa
     * @param ipk
     * Apabila ipk > 4.00 atau <= 0.00, maka IPK secara default akan diganti menjadi 0.00 
     */
    public IPMahasiswa(Mahasiswa mahasiswa, Double ipk) {
        this.mahasiswa = mahasiswa;
        this.ipk = ipk;
        if(ipk > 4.00 || ipk <= 0.00){
            this.ipk = 0.00;
        }
    }

    /**
     * Getter mahasiswa
     * @return mahasiswa
     */
    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    /**
     * Getter ipk
     * 
     * @return ipk
     */
    public Double getIPK() {
        return ipk;
    }

    /**
     * Method untuk mengganti IPK
     * @param ipk sebagai nilai IPK baru
     */
    public void ubahIPK(double ipk) {
        this.ipk = ipk;
    }

    /**
     * Method untuk mengembalikan informasi kemungkinan cumlaude
     * IPK dinyatakan cumlaude apabila >= 3.5
     */
    public Boolean isCumlaude() {
        return (this.ipk >= 3.5);
    }

    /**
     * Method untuk menghitung kemungkinan agar mendapat gelar cumlaude
     * Asumsi: jumlah maksimal SKS satu mahasiswa adalah 144
     * Apabila IPK Cumlaude, maka return 0.0
     * Apabila IPK tidak cumlaude, maka untuk menghitung diffToCumlaude adalah
     * totalCumlaude dikurangi SKS mahasiswa dikali IPK saat ini kemudian dibagi dengan sisa SKS yang dapat diambil
     */
    public Double avgDiffToCumlaude() {
        Double totalCumlaude = (3.5 * 144);
        // Isi dibawah ini
        if(this.ipk >= 3.5){
            return 0.0;
        }
        else{
            return ((totalCumlaude-(mahasiswa.getSks() * this.ipk)) / (144 - this.mahasiswa.getSks()));
        }
    }
    
}