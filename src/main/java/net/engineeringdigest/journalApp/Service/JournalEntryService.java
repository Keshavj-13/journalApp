package net.engineeringdigest.journalApp.Service;

import net.engineeringdigest.journalApp.entity.JournalEntry;
import net.engineeringdigest.journalApp.repository.JournalEntryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

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
}
