package com.united.capstone.project.features.workstation;

import com.united.capstone.project.features.checklist.Checklist;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import java.util.List;


@Entity
@Table
@Data
public class Workstation {

    @Id
    @GeneratedValue
    @ApiModelProperty(value = "This is auto generated id")
    private int workstationId;

    private String workstationDetails;

    private WorkstationTypeEnum workstationTypeEnum;

    @OneToMany(targetEntity = Checklist.class, mappedBy = "workstation", fetch = FetchType.EAGER)
    private List<Checklist> checklists;

}
