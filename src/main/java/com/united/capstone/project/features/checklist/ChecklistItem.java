package com.united.capstone.project.features.checklist;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class ChecklistItem {

    @Id
    @GeneratedValue
    @ApiModelProperty(value = "This is auto generated id")
    private int itemId;

    private String itemDetails;

    private ChecklistItemStatusEnum itemStatus;

    private String errorDescription;

    private byte[] image;

    @ManyToOne(targetEntity = Checklist.class, fetch = FetchType.EAGER)
    @JoinColumn(name="checklistId", referencedColumnName="checklistId")
    private Checklist checklist;
}
