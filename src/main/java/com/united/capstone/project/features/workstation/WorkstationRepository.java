package com.united.capstone.project.features.workstation;

import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkstationRepository extends JpaRepository<Workstation, Integer> {

    Workstation findByWorkstationId(int workstationId);
}
