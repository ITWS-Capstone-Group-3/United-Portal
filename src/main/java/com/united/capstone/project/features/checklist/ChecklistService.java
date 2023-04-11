package com.united.capstone.project.features.checklist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChecklistService {
    @Autowired
    private ChecklistRepository repository;

    public List<Checklist> getAllChecklists() {
        return repository.findAll();
    }

    public Checklist getChecklistById(int checklistId) {
        return repository.findByChecklistId(checklistId);
    }

    public String saveChecklist(Checklist checklist) {
        repository.save(checklist);
        return "saved checklist with id: " + checklist.getChecklistId();
    }

    public List<Checklist> deleteChecklistById(int checklistId) {
        repository.deleteById(checklistId);
        return repository.findAll();
    }
}
