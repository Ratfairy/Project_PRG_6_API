package id.co.astratech.vo;

import id.co.astratech.model.LayananModel;
import id.co.astratech.model.UserModel;

import java.math.BigInteger;

public class LayananVo {
    private Integer idLayanan;
    private String nama;
    private Integer harga;
    private Integer estimasi;
    private Integer status;

    public LayananVo() { }

    public LayananVo(Integer idLayanan, String nama, Integer harga, Integer estimasi, Integer status) {
        this.idLayanan = idLayanan;
        this.nama = nama;
        this.harga = harga;
        this.estimasi = estimasi;
        this.status = status;
    }




}
