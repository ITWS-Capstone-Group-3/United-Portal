package com.united.capstone.project.features.checklist;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ChecklistRepository extends JpaRepository<Checklist, Integer> {

    Checklist findByChecklistId(int checklistId);
}
