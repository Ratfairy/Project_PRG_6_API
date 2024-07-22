package id.co.astratech.rest;

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

    @GetMapping("/getAll")
    public DtoResponse getAllSparepart() {
        return sparepartService.getAllSparepart();
    }

    @GetMapping("/getById")
    public DtoResponse getSparepartById(@RequestParam("IdSparepart") Integer idSparepart) {
        return sparepartService.getSparepartById(idSparepart);
    }

    @PostMapping("/save")
    public DtoResponse saveSparepart(@RequestBody SparepartVo sparepart) {
        return sparepartService.saveSparepart(sparepart);
    }

    @PutMapping("/update")
    public DtoResponse updateSparepart(@RequestBody SparepartVo sparepart) {
        return sparepartService.updateSparepart(sparepart);
    }

    @DeleteMapping("/delete")
    public DtoResponse deleteSparepart(@RequestParam("IdSparepart") Integer idSparepart) {
        return sparepartService.deleteSparepart(idSparepart);
    }
}
