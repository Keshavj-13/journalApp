package net.engineeringdigest.journalApp.Service;

import net.engineeringdigest.journalApp.entity.JournalEntry;
import net.engineeringdigest.journalApp.repository.JournalEntryRepo;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class JournalEntryService {
    @Autowired
    private JournalEntryRepo journalentryrepo;

    public void saveEntry(JournalEntry journalentry){
        journalentryrepo.save(journalentry);
    }

    public List<JournalEntry> getAll(){
        return journalentryrepo.findAll();
    }

    public Optional<JournalEntry> findById(ObjectId id){
        return journalentryrepo.findById(id);
    }

    public void deleteById(ObjectId id){
        journalentryrepo.deleteById(id);
    }
}
