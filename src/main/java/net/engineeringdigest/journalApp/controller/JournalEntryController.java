package net.engineeringdigest.journalApp.controller;

import net.engineeringdigest.journalApp.Service.JournalEntryService;
import net.engineeringdigest.journalApp.entity.JournalEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {

    @Autowired
    private JournalEntryService journalEntryService;

    @GetMapping
    public List<JournalEntry> getAll(){
        return journalEntryService.getAll();
    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myEntry){
        journalEntryService.saveEntry(myEntry);
        return true;
    }
    @GetMapping("/{myId}")
    public JournalEntry getJournalEntryById(@PathVariable Long myId){
        return null;
    }
    @DeleteMapping("/{myId}")
    public boolean DltJournalEntryById(@PathVariable Long myId){
        return true;
    }
    @PostMapping("/{myId}")
    public JournalEntry UpdJournalEntryById(@PathVariable Long myId, @RequestBody JournalEntry myEntry){
        return null;
    }

}
