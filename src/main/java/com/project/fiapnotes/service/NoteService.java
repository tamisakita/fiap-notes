package com.project.fiapnotes.service;

import com.project.fiapnotes.dto.NoteDto;
import com.project.fiapnotes.dto.NoteResponseDto;
import com.project.fiapnotes.repository.NoteRepository;

import java.util.List;

public interface NoteService {
    NoteResponseDto createNote(NoteDto noteDto);

    NoteResponseDto getNoteById(Long id);

    List<NoteResponseDto> getNoteList(String textNote);

    NoteResponseDto updateNote(Long id);

    void deleteNote(Long id);
}
