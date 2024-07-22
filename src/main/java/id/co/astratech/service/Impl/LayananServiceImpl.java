package id.co.astratech.service.Impl;

import id.co.astratech.dao.LayananDao;
import id.co.astratech.model.LayananModel;
import id.co.astratech.repository.LayananRepository;
import id.co.astratech.response.DtoResponse;
import id.co.astratech.service.LayananService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static id.co.astratech.constant.LayananConstant.*;

@Service
@Transactional
public class LayananServiceImpl implements LayananService {
    @Autowired
    private LayananDao layananDao;

    @Autowired
    private LayananRepository layananRepository;

    @Override
    public DtoResponse getAllLayanan() {
        if(layananDao.getAllLayanan() != null){
            return new DtoResponse(200,layananDao.getAllLayanan());
        }
        return new DtoResponse(200,null,mEmptyData);

    }

    @Override
    public DtoResponse getLayananById(Integer idLayanan ){
        LayananModel layananData = layananRepository.findById(idLayanan).orElse(null);
        if (layananData != null) {
            return new DtoResponse(200, layananData, mUpdateSuccess);
        } else {
            return new DtoResponse(404, null, "Service not found");
        }
    }

    @Override
    public DtoResponse saveLayanan(LayananModel layanan){
        try{
            layananRepository.save(layanan);
            return new DtoResponse(200,layanan,mCreateSuccess);
        }catch (Exception e){
            return new DtoResponse(500,layanan,mCreateFailed);
        }
    }

    @Override
    public DtoResponse updateLayanan(LayananModel layanan) {
        try{
            LayananModel updatedLayanan = layananRepository.save(layanan);
            if (updatedLayanan != null) {
                return new DtoResponse(200, updatedLayanan, mUpdateSuccess);
            } else {
                return new DtoResponse(200, null, mNotFound);
            }
        } catch (Exception e) {
            return new DtoResponse(200,null,mUpdateFailed);
        }
    }

    @Override
    public DtoResponse deleteLayanan(Integer idLayanan) {
        Optional<LayananModel> layananDataOptional = layananRepository.findById(idLayanan);
        if (layananDataOptional.isPresent()) {
            LayananModel layananData = layananDataOptional.get();
            try {
                layananRepository.delete(layananData);
                return new DtoResponse(200, layananData, mDeleteSuccess);
            } catch (Exception e) {
                return new DtoResponse(500, null, mDeleteFailed);
            }
        }
        return new DtoResponse(404, null, mNotFound);
    }

    public DtoResponse softDeleteLayanan(Integer idLayanan) {
        LayananModel layanan = layananRepository.findById(idLayanan).orElse(null);
        if (layanan != null) {
            layanan.setStatusLayanan(0); // Mengubah status menjadi 0 (soft delete)
            layananRepository.save(layanan);
            return new DtoResponse(200, + idLayanan);
        } else {
            return new DtoResponse(400, + idLayanan + " not found");
        }
    }
}
