package net.engineeringdigest.journalApp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import net.engineeringdigest.journalApp.entity.JournalEntry;

public interface journalEntryRepository extends MongoRepository<JournalEntry, String>{

}
