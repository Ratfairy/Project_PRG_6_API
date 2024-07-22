package id.co.astratech.vo;

import id.co.astratech.model.LayananModel;
import id.co.astratech.model.UserModel;

import java.math.BigInteger;

public class LayananVo {
    private Integer idLayanan;
    private String nama;
    private BigInteger harga;
    private Integer estimasi;
    private Integer status;

    public LayananVo() { }

    public LayananVo(LayananModel layanan) {
        this.idLayanan = layanan.getIdLayanan();
        this.nama = layanan.getNameLayanan();
        this.harga = layanan.getHargaLayanan();
        this.estimasi = layanan.getEstimasiLayanan();
        this.status = layanan.getStatusLayanan();
    }

    public LayananVo(Integer idLayanan, String nama, BigInteger harga, Integer estimasi, Integer status) {
        this.idLayanan = idLayanan;
        this.nama = nama;
        this.harga = harga;
        this.estimasi = estimasi;
        this.status = status;
    }

    public Integer getIdLayanan() {
        return idLayanan;
    }

    public void setIdLayanan(Integer idLayanan) {
        this.idLayanan = idLayanan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public BigInteger getHarga() {
        return harga;
    }

    public void setHarga(BigInteger harga) {
        this.harga = harga;
    }

    public Integer getEstimasi() {
        return estimasi;
    }

    public void setEstimasi(Integer estimasi) {
        this.estimasi = estimasi;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
