package com.united.capstone.project.features.workstation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkstationService {
    @Autowired
    private WorkstationRepository repository;

    public List<Workstation> getAllWorkstations() {
        return repository.findAll();
    }

    public Workstation getWorkstationById(int workstationId) {
        return repository.findByWorkstationId(workstationId);
    }

    public String saveWorkstation(Workstation workstation) {
        repository.save(workstation);
        return "saved workstation with id: " + workstation.getWorkstationId();
    }

    public String saveListOfWorkstations(List<Workstation> workstations) {
        repository.saveAll(workstations);
        return "saved all " + workstations.size() + " workstations";
    }

    public List<Workstation> deleteWorkstationById(int workstationId) {
        repository.deleteById(workstationId);
        return repository.findAll();
    }
}
