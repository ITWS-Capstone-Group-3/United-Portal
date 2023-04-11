package com.united.capstone.project.features.checklist;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/checklist")
public class ChecklistController {

    @Autowired
    private ChecklistService service;

    @GetMapping("/getAll")
    @ApiOperation(value = "it will fetch all checklists")
    public List<Checklist> getAllChecklists() {
        return service.getAllChecklists();
    }

    @GetMapping("/get/{checklistId}")
    @ApiOperation(value = "it will fetch checklist details for given checklist id")
    public Checklist getChecklistById(@PathVariable int checklistId) {
        return service.getChecklistById(checklistId);
    }

    @PostMapping("/save")
    @ApiOperation(value = "it is saving new checklist")
    public String saveChecklist(@RequestBody Checklist checklist) {
        return service.saveChecklist(checklist);
    }

    @DeleteMapping("/delete/{checklistId}")
    @ApiOperation(value = "it will delete checklist with id")
    public List<Checklist> deleteChecklistById(@PathVariable int checklistId) {
        return service.deleteChecklistById(checklistId);
    }
}
