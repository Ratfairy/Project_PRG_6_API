package id.co.astratech.service.Impl;

import id.co.astratech.dao.SparepartDao;
import id.co.astratech.model.LayananModel;
import id.co.astratech.model.SparepartModel;
import id.co.astratech.repository.SparepartRepository;
import id.co.astratech.response.DtoResponse;
import id.co.astratech.service.SparepartService;
import id.co.astratech.vo.SparepartVo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static id.co.astratech.constant.LayananConstant.mNotFound;
import static id.co.astratech.constant.LayananConstant.mUpdateFailed;
import static id.co.astratech.constant.LayananConstant.mUpdateSuccess;
import static id.co.astratech.constant.SparepartConstant.*;

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
    public DtoResponse getSparepartById(Integer idSparepart){
        SparepartModel sparepartModel = sparepartRepository.findById(idSparepart).orElse(null);
        if (sparepartModel != null) {
            return new DtoResponse(200, sparepartModel, mUpdateSuccess);
        } else {
            return new DtoResponse(404, null, "Sparepart not found");
        }
    }

    @Override
    public DtoResponse saveSparepart(SparepartModel sparepart){
        try{
            sparepartRepository.save(sparepart);
            return new DtoResponse(200,sparepart,mCreateSuccess);
        }catch (Exception e){
            return new DtoResponse(500,sparepart,mCreateFailed);
        }
    }

    @Override
    public DtoResponse updateSparepart(SparepartModel sparepart) {
        try{
            SparepartModel updatedSparepart = sparepartRepository.save(sparepart);
            if (updatedSparepart != null) {
                return new DtoResponse(200, updatedSparepart, mUpdateSuccess);
            } else {
                return new DtoResponse(200, null, mNotFound);
            }
        } catch (Exception e) {
            return new DtoResponse(200,null,mUpdateFailed);
        }
    }

    @Override
    public DtoResponse deleteSparepart(Integer idSparepart) {
        Optional<SparepartModel> sparepartOptional = sparepartRepository.findById(idSparepart);
        if (sparepartOptional.isPresent()) {
            sparepartRepository.deleteById(idSparepart);
            return new DtoResponse(200, null, mDeleteSuccess);
        } else {
            return new DtoResponse(404, null, "Sparepart not found");
        }
    }

    @Override
    public DtoResponse softDeleteSparepart(Integer idSparepart) {
        SparepartModel sparepart = sparepartRepository.findById(idSparepart).orElse(null);
        if (sparepart != null) {
            sparepart.setStatusSparepart(0); // Mengubah status menjadi 0 (soft delete)
            sparepartRepository.save(sparepart);
            return new DtoResponse(200, + idSparepart);
        } else {
            return new DtoResponse(400, + idSparepart + " not found");
        }
    }
}
