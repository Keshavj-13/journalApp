package net.engineeringdigest.journalApp.Service;

import net.engineeringdigest.journalApp.entity.JournalEntry;
import net.engineeringdigest.journalApp.entity.User;
import net.engineeringdigest.journalApp.repository.JournalEntryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Component
public class JournalEntryService {
    @Autowired
    private JournalEntryRepo journalentryrepo;

    @Autowired
    private UserService userService;

    public void saveEntry(JournalEntry journalentry, String username){
        User user = userService.findByUsername(username);
        journalentry.setDate(LocalDateTime.now());
        JournalEntry saved = journalentryrepo.save(journalentry);
        user.getJournalEntries().add(saved);
    }

    public List<JournalEntry> getAll(){
        return journalentryrepo.findAll();
    }

    public Optional<JournalEntry> findById(Long id){
        return journalentryrepo.findById(id);
    }

    public void deleteById(Long id){
        journalentryrepo.deleteById(id);
    }
}
