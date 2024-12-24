package net.engineeringdigest.journalApp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.engineeringdigest.journalApp.entity.JournalEntry;
import net.engineeringdigest.journalApp.repository.journalEntryRepository;

@Component
public class journalEntryService {

    @Autowired
    private journalEntryRepository journalEntryRepository;
    
        public void saveEntry(JournalEntry journalEntry) {
            journalEntryRepository.save(journalEntry);
    }
}
