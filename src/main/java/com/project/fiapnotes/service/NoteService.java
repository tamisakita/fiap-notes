package com.project.fiapnotes.service;

import com.project.fiapnotes.dto.NoteDto;
import com.project.fiapnotes.repository.NoteRepository;

import java.util.List;

public interface NoteService {
    NoteDto createNote(NoteDto noteDto);

    NoteDto getNoteById(Long id);

    List<NoteDto> getNoteList(String textNote);

    NoteDto updateNote(Long id);

    void deleteNote(Long id);
}
