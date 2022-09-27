package com.project.fiapnotes.controller;

import com.project.fiapnotes.dto.NoteDto;
import com.project.fiapnotes.dto.NoteResponseDto;
import com.project.fiapnotes.service.NoteService;
import org.aspectj.weaver.ast.Not;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/note")
public class NoteController {

    private NoteService noteService;

    @PostMapping
    public NoteResponseDto createNote(@RequestBody NoteDto noteDto) {
        return noteService.createNote(noteDto);
    }

    @GetMapping("{id}")
    public NoteResponseDto getNoteById(@PathVariable Long id) {
        return noteService.getNoteById(id);
    }

    @GetMapping
    public List<NoteResponseDto> getNoteList(NoteDto noteDto) {
        return null;
    }

    @PutMapping("{id}")
    public NoteResponseDto updateNote(@PathVariable Long id,
                          @RequestBody NoteDto noteDto) {
        return null;
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteNote(@PathVariable Long id) {
        noteService.deleteNote(id);
    }

}
