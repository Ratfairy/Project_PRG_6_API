package id.co.astratech.rest;

import id.co.astratech.model.LayananModel;
import id.co.astratech.response.DtoResponse;
import id.co.astratech.service.LayananService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/layanan")
public class LayananRest {
    @Autowired
    private LayananService layananService;

    public LayananRest(LayananService layananService){this.layananService = layananService;}

    @GetMapping("/getLayanan")
    public DtoResponse getLayanan(){
        return layananService.getAllLayanan();
    }

    @PostMapping("/saveLayanan")
    public DtoResponse saveLayanan(@RequestBody LayananModel layanan){
        return layananService.saveLayanan(layanan);
    }
    @PostMapping("/updateLayanan")
    public DtoResponse updateLayanan(@RequestBody LayananModel updatelayanan){
        return layananService.updateLayanan(updatelayanan);
    }
    @PostMapping("/deleteLayanan")
    public DtoResponse deleteLayanan(@RequestParam("bja_id") Integer idLayanan){
        return layananService.deleteLayanan(idLayanan);
    }
    @PostMapping("/softDeleteLayanan")
    public DtoResponse softDeleteLayanan(@RequestParam("bja_id") Integer idLayanan){
        return layananService.softDeleteLayanan(idLayanan);
    }
    @GetMapping("/getLayananById")
    public DtoResponse getLayananById(@RequestParam("bja_id") Integer idLayanan){
        return layananService.getLayananById(idLayanan);
    }
}
