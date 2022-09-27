package com.project.fiapnotes.dto;

import com.project.fiapnotes.entity.NoteEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NoteResponseDto {
    private Long id;
    private String textNote;
    private boolean priorityNote;
    private LocalDateTime createDataNote;

    public NoteResponseDto(NoteEntity noteEntity) {
        this.id = noteEntity.getId();
        this.textNote = noteEntity.getTextNote();
        this.priorityNote = noteEntity.isPriorityNote();
        this.createDataNote = noteEntity.getCreateDataNote();
    }
}
