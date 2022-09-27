package com.project.fiapnotes.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TB_FIAP_NOTE")
public class NoteEntity {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "TEXT_NOTE", nullable = false, length = 200)
    private String textNote;

    @Column(name = "PRIORITY_NOTE",nullable = false)
    private boolean priorityNote;

    @Column(name = "CREATE_DATE_NOTE", nullable = false)
    private LocalDateTime createDataNote;

    @PrePersist
    public void prePersist() {
        createDataNote = LocalDateTime.now();
    }
}
