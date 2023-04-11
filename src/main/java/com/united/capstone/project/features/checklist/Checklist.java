package com.united.capstone.project.features.checklist;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.united.capstone.project.features.workstation.Workstation;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
@Data
public class Checklist {

    @Id
    @GeneratedValue
    @ApiModelProperty(value = "This is auto generated id")
    private int checklistId;

    @Column(unique = true)
    private String checkListDetails;

    @JsonManagedReference
    @OneToMany(targetEntity = ChecklistItem.class, mappedBy = "checklist", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<ChecklistItem> checklistItems;

    @JsonBackReference
    @ManyToOne(targetEntity = Workstation.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "workstationId", referencedColumnName = "workstationId")
    private Workstation workstation;
}
