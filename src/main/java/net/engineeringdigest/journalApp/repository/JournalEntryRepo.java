package net.engineeringdigest.journalApp.repository;
import net.engineeringdigest.journalApp.entity.JournalEntry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JournalEntryRepo extends JpaRepository<JournalEntry, Long> {
}
