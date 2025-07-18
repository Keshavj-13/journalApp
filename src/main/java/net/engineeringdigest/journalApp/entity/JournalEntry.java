package net.engineeringdigest.journalApp.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "journal_entries")
@Data
@NoArgsConstructor
public class JournalEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;              // BIGINT UNSIGNED in MySQL

    @ManyToOne
    @JoinColumn(name = "user_id",nullable = false)
    User user;

    private String title;         // VARCHAR(255)

    @Column(columnDefinition = "TEXT")
    private String content;       // TEXT

    private LocalDateTime date;   // DATETIME(6)
}
