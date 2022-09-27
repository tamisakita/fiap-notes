package com.project.fiapnotes.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.fiapnotes.dto.NoteDto;
import com.project.fiapnotes.dto.NoteResponseDto;
import com.project.fiapnotes.entity.NoteEntity;
import com.project.fiapnotes.repository.NoteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteServiceImpl implements NoteService {

    private NoteRepository noteRepository;
    private ObjectMapper objectMapper;

    public NoteServiceImpl(NoteRepository noteRepository, ObjectMapper objectMapper) {
        this.noteRepository = noteRepository;
        this.objectMapper = objectMapper;
    }

    @Override
    public NoteResponseDto createNote(NoteDto noteDto) {
        NoteEntity noteEntity = new NoteEntity(noteDto);
        NoteEntity createdNoteEntity = noteRepository.save(noteEntity);
        return new NoteResponseDto(createdNoteEntity);
    }

    @Override
    public NoteResponseDto getNoteById(Long id) {
        return null;
    }

    @Override
    public List<NoteResponseDto> getNoteList(String textNote) {
        return null;
    }

    @Override
    public NoteResponseDto updateNote(Long id) {
        return null;
    }

    @Override
    public void deleteNote(Long id) {

    }
}
