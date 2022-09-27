package com.project.fiapnotes.controller;

import com.project.fiapnotes.dto.NoteDto;
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
    public NoteDto createNote(@RequestBody NoteDto noteDto) {
        return null;
    }

    @GetMapping("{id}")
    public NoteDto getNoteById(@PathVariable Long id) {
        return noteService.getNoteById(id);
    }

    @GetMapping
    public List<NoteDto> getNoteList(NoteDto noteDto) {
        return null;
    }

    @PutMapping("{id}")
    public NoteDto updateNote(@PathVariable Long id,
                          @RequestBody NoteDto noteDto) {
        return null;
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteNote(@PathVariable Long id) {
        noteService.deleteNote(id);
    }

}
