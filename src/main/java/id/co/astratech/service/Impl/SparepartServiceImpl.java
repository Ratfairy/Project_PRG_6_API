package id.co.astratech.service.Impl;

import id.co.astratech.constant.UserConstant;
import id.co.astratech.dao.SparepartDao;
import id.co.astratech.model.SparepartModel;
import id.co.astratech.repository.SparepartRepository;
import id.co.astratech.response.DtoResponse;
import id.co.astratech.service.SparepartService;
import id.co.astratech.vo.SparepartVo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static id.co.astratech.constant.LayananConstant.*;
import static id.co.astratech.constant.UserConstant.mCreateSuccess;

@Service
@Transactional
public class SparepartServiceImpl implements SparepartService
{
    @Autowired
    private SparepartDao sparepartDao;
    @Autowired
    private SparepartRepository sparepartRepository;

    @Override
    public DtoResponse getAllSparepart() {
        if(sparepartDao.getAllSparepart() != null){
            return new DtoResponse(200,sparepartDao.getAllSparepart());
        }
        return new DtoResponse(200,null,mEmptyData);
    }

    @Override
    public DtoResponse getSparepartById(Integer IdSparepart){
        SparepartModel sparepartModel = sparepartRepository.findById(IdSparepart).orElse(null);
        if (sparepartModel != null) {
            return new DtoResponse(200, sparepartModel, mUpdateSuccess);
        } else {
            return new DtoResponse(404, null, "Service not found");
        }
    }

    @Override
    public DtoResponse saveSparepart(SparepartVo sparepart) {
        try {
            SparepartModel newSparepart = new SparepartModel();
            newSparepart.setNamaSparepart(sparepart.getNamaSparepart());
            newSparepart.setHargaSparepart(sparepart.getHargaSparepart());
            newSparepart.setSatuanSparepart(sparepart.getSatuanSparepart());
            newSparepart.setMerkSparepart(sparepart.getMerkSparepart());
            newSparepart.setDeskripsiSparepart(sparepart.getDeskripsiSparepart());
            newSparepart.setStatusSparepart("Aktif");

            sparepartRepository.save(newSparepart);
            return new DtoResponse(201, sparepart, mCreateSuccess);
        } catch (Exception e) {
            return new DtoResponse(400, sparepart, UserConstant.mCreateFailed);
        }
    }

    @Override
    public DtoResponse updateSparepart(SparepartVo sparepartVo) {
        Optional<SparepartModel> sparepartOptional = sparepartRepository.findById(sparepartVo.getIdSparepart());
        if (sparepartOptional.isPresent()) {
            SparepartModel existingSparepart = sparepartOptional.get();
            existingSparepart.setNamaSparepart(sparepartVo.getNamaSparepart());
            existingSparepart.setHargaSparepart(sparepartVo.getHargaSparepart());
            existingSparepart.setSatuanSparepart(sparepartVo.getSatuanSparepart());
            existingSparepart.setMerkSparepart(sparepartVo.getMerkSparepart());
            existingSparepart.setDeskripsiSparepart(sparepartVo.getDeskripsiSparepart());
            existingSparepart.setStatusSparepart(sparepartVo.getStatusSparepart());

            sparepartRepository.save(existingSparepart);
            return new DtoResponse(200, new SparepartVo(existingSparepart), mUpdateSuccess);
        } else {
            return new DtoResponse(404, null, "Sparepart not found");
        }
    }

    @Override
    public DtoResponse deleteSparepart(Integer IdSparepart) {
        Optional<SparepartModel> sparepartOptional = sparepartRepository.findById(IdSparepart);
        if (sparepartOptional.isPresent()) {
            sparepartRepository.deleteById(IdSparepart);
            return new DtoResponse(200, null, mDeleteSuccess);
        } else {
            return new DtoResponse(404, null, "Sparepart not found");
        }
    }




}
