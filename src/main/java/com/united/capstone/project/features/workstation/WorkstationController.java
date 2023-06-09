package com.united.capstone.project.features.workstation;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/workstation")
public class WorkstationController {

    @Autowired
    private WorkstationService service;

    @GetMapping("/getAll")
    @ApiOperation(value = "it will fetch all workstations")
    public List<Workstation> getAllWorkstations() {
        return service.getAllWorkstations();
    }

    @GetMapping("/get/{workstationId}")
    @ApiOperation(value = "it will fetch workstation details for given workstation id")
    public Workstation getWorkstationById(@PathVariable int workstationId) {
        return service.getWorkstationById(workstationId);
    }

    @PostMapping("/save")
    @ApiOperation(value = "it is saving new workstation")
    public String saveWorkstation(@RequestBody Workstation workstation) {
        return service.saveWorkstation(workstation);
    }

    @PostMapping("/save/bulk")
    @ApiOperation(value = "it is saving list of new workstation")
    public String saveListOfWorkstations(@RequestBody List<Workstation> workstations) {
        return service.saveListOfWorkstations(workstations);
    }

    @DeleteMapping("/delete/{workstationId}")
    @ApiOperation(value = "it will delete workstation with id")
    public List<Workstation> deleteWorkstationById(@PathVariable int workstationId) {
        return service.deleteWorkstationById(workstationId);
    }

}
