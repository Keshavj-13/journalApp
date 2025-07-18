package net.engineeringdigest.journalApp.entity;

import lombok.Data;
import org.springframework.stereotype.Indexed;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;              // BIGINT UNSIGNED in MySQL

    @Column(nullable = false, unique = true)
    private String username;         // VARCHAR(255)

    @Column(nullable = false)
    private String password;       // TEXT

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    List <JournalEntry> journalEntries = new ArrayList<>();
}
