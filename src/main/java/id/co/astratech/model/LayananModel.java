package id.co.astratech.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.relational.core.sql.In;

import java.math.BigInteger;

@Entity
@Table(name = "oto_msbiayajasa")
@Data
public class LayananModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bja_id")
    private Integer idLayanan;
    @Column(name = "bja_nama")
    private String nameLayanan;
    @Column(name = "bja_harga")
    private Integer hargaLayanan;
    @Column(name = "bja_estimasi")
    private Integer estimasiLayanan;
    @Column(name = "bja_status")
    private Integer statusLayanan;

    public LayananModel() { }

    public LayananModel(Integer idLayanan, String nameLayanan, Integer hargaLayanan, Integer estimasiLayanan, Integer statusLayanan) {
        this.idLayanan = idLayanan;
        this.nameLayanan = nameLayanan;
        this.hargaLayanan = hargaLayanan;
        this.estimasiLayanan = estimasiLayanan;
        this.statusLayanan = statusLayanan;
    }

    public Integer getIdLayanan() {
        return idLayanan;
    }

    public void setIdLayanan(Integer idLayanan) {
        this.idLayanan = idLayanan;
    }

    public String getNameLayanan() {
        return nameLayanan;
    }

    public void setNameLayanan(String nameLayanan) {
        this.nameLayanan = nameLayanan;
    }

    public Integer getHargaLayanan() {
        return hargaLayanan;
    }

    public void setHargaLayanan(Integer hargaLayanan) {
        this.hargaLayanan = hargaLayanan;
    }

    public Integer getEstimasiLayanan() {
        return estimasiLayanan;
    }

    public void setEstimasiLayanan(Integer estimasiLayanan) {
        this.estimasiLayanan = estimasiLayanan;
    }

    public Integer getStatusLayanan() {
        return statusLayanan;
    }

    public void setStatusLayanan(Integer statusLayanan) {
        this.statusLayanan = statusLayanan;
    }
}
