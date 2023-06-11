package com.example.demo.controlller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Reminder;
import com.example.demo.service.ReminderService;

@RestController
@RequestMapping("/")
public class ReminderController {
    private final ReminderService reminderService;

    public ReminderController(ReminderService reminderService) {
        this.reminderService = reminderService;
    }

    @GetMapping("allreminders")
    public List<Reminder> getAllReminders() {
        return reminderService.getAllReminders();
    }

    @PostMapping("savereminder")
    public ResponseEntity<String> createReminder(@RequestBody Reminder reminder) {
        reminderService.createReminder(reminder);
        return ResponseEntity.ok("Reminder created successfully.");
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteReminder(@PathVariable Long id) {
        reminderService.deleteReminder(id);
        return ResponseEntity.ok("Reminder deleted successfully.");
    }
}

