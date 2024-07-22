package id.co.astratech.service;

import id.co.astratech.model.LayananModel;
import id.co.astratech.response.DtoResponse;

public interface LayananService {
    DtoResponse getAllLayanan();
    DtoResponse getLayananById(Integer idLayanan);
    DtoResponse saveLayanan(LayananModel layanan);
    DtoResponse updateLayanan(LayananModel layanan);
    DtoResponse deleteLayanan(Integer idLayanan);
    DtoResponse softDeleteLayanan(Integer idLayanan);
}
