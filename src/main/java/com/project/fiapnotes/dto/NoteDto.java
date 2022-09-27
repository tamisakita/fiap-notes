package com.project.fiapnotes.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NoteDto {

    private Long id;
    private String textNote;
    private boolean priorityNote;
    private LocalDateTime createDataNote;
}
