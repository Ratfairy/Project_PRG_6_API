package id.co.astratech.rest;

import id.co.astratech.model.LayananModel;
import id.co.astratech.model.SparepartModel;
import id.co.astratech.response.DtoResponse;
import id.co.astratech.service.SparepartService;
import id.co.astratech.vo.SparepartVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/sparepart")
public class SparepartRest {

    @Autowired
    private SparepartService sparepartService;

    public SparepartRest(SparepartService sparepartService) {
        this.sparepartService = sparepartService;
    }

    @GetMapping("/getAllSparepart")
    public DtoResponse getAllSparepart() {
        return sparepartService.getAllSparepart();
    }

    @GetMapping("/getSparepartById")
        public DtoResponse getSparepartById(@RequestParam("IdSparepart") Integer idSparepart) {
        return sparepartService.getSparepartById(idSparepart);
    }

    @PostMapping("/saveSparepart")
    public DtoResponse saveSparepart(@RequestBody SparepartModel sparepart) {
        return sparepartService.saveSparepart(sparepart);
    }

    @PostMapping("/updateSparepart")
    public DtoResponse updateSparepart(@RequestBody SparepartModel sparepart) {
        return sparepartService.updateSparepart(sparepart);
    }

    @PostMapping("/deleteSparepart")
    public DtoResponse deleteSparepart(@RequestParam("sca_id") Integer idSparepart) {
      return sparepartService.deleteSparepart(idSparepart);
    }

    @PostMapping("/softDeleteSparepart")
    public DtoResponse softDeleteSparepart(@RequestParam("sca_id") Integer idSparepart){
        return sparepartService.softDeleteSparepart(idSparepart);
    }
}
