package com.united.capstone.project.features.checklist;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

    private String checkListDetails;

    @OneToMany(targetEntity = ChecklistItem.class, mappedBy = "checklist", fetch = FetchType.EAGER)
    private List<ChecklistItem> checklistItems;

    @JsonIgnore
    @ManyToOne(targetEntity = Workstation.class, fetch = FetchType.EAGER)
    @JoinColumn(name="workstationId", referencedColumnName="workstationId")
    private Workstation workstation;
}
