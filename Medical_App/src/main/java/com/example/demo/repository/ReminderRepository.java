package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Reminder;

@Repository
public interface ReminderRepository extends JpaRepository<Reminder, Long> {
  
}
