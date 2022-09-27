package com.project.fiapnotes.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.fiapnotes.dto.NoteDto;
import com.project.fiapnotes.repository.NoteRepository;

import java.util.List;

public class NoteServiceImpl implements NoteService {

    private NoteRepository noteRepository;
    private ObjectMapper objectMapper;

    @Override
    public NoteDto createNote(NoteDto noteDto) {
        return null;
    }

    @Override
    public NoteDto getNoteById(Long id) {
        return null;
    }

    @Override
    public List<NoteDto> getNoteList(String textNote) {
        return null;
    }

    @Override
    public NoteDto updateNote(Long id) {
        return null;
    }

    @Override
    public void deleteNote(Long id) {

    }
}
