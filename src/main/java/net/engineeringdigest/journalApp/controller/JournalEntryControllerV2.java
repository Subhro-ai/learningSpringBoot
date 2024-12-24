package net.engineeringdigest.journalApp.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.engineeringdigest.journalApp.entity.JournalEntry;
import net.engineeringdigest.journalApp.services.journalEntryService;

@RestController
@RequestMapping("/journal")
public class JournalEntryControllerV2 {

    // private Map<Long, JournalEntry> journalEntries = new HashMap<>();

    @Autowired
    private journalEntryService journalEntryService;


    @GetMapping
    public List<JournalEntry> getAll(){
        return null;
    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myEntry) {
        journalEntryService.saveEntry(myEntry);
        return true;
    }

    @GetMapping("/id/{myId}")
    public JournalEntry getJournalEntry(@PathVariable Long myId) {
        return null;
    }

    @DeleteMapping("/id/{myId}")
    public JournalEntry deleteJournalEntry(@PathVariable Long myId) {
        return null;
    }

    @PutMapping("/id/{myId}")
    public JournalEntry deleteJournalEntryById(@PathVariable Long myId, @RequestBody JournalEntry myEntry) {
        return null;
    }
}
