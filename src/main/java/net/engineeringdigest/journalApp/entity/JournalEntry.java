package net.engineeringdigest.journalApp.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "journal_entries")
@Data
public class JournalEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;              // BIGINT UNSIGNED in MySQL

    private String title;         // VARCHAR(255)

    @Column(columnDefinition = "TEXT")
    private String content;       // TEXT

    private LocalDateTime date;   // DATETIME(6)
}
