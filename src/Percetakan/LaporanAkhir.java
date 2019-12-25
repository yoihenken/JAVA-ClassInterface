package Percetakan;

public class LaporanAkhir implements CetakLaporan, TampilLaporan {
    @Override
    public void cetakF4() {
        System.out.println("Cetak Laporan di F4");
    }

    @Override
    public void cetakA4() {
        System.out.println("Cetak Laporan di A4");
    }

    @Override
    public void tampilMobile() {
        System.out.println("Tampil di Handphone");
    }

    @Override
    public void tampilWeb() {
        System.out.println("Tampil di Monitor");
    }

    public static void main(String[] args) {
        LaporanAkhir lt = new LaporanAkhir();
        lt.cetakF4();
        lt.cetakA4();
        lt.tampilMobile();
        lt.tampilWeb();
    }
}
