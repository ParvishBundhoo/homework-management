package com.homework.managment.homeworkmanagement.model;


import com.homework.managment.homeworkmanagement.enums.HomeworkCompletetionStatus;
import com.homework.managment.homeworkmanagement.enums.Subject;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="HOMEWORK_ITEM")
public class HomeworkItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long HomeworkItemId;

    private LocalDate dateGiven;
    private LocalDate dueDate;
    private Subject subject;
    private String details;
    private HomeworkCompletetionStatus homeworkCompletetionStatus;

    public HomeworkItem() {
    }

    public HomeworkItem(long homeworkItemId, LocalDate dateGiven, LocalDate dueDate, Subject subject, String details, HomeworkCompletetionStatus homeworkCompletetionStatus) {
        HomeworkItemId = homeworkItemId;
        this.dateGiven = dateGiven;
        this.dueDate = dueDate;
        this.subject = subject;
        this.details = details;
        this.homeworkCompletetionStatus = homeworkCompletetionStatus;
    }

    public long getHomeworkItemId() {
        return HomeworkItemId;
    }

    public void setHomeworkItemId(long homeworkItemId) {
        HomeworkItemId = homeworkItemId;
    }

    public LocalDate getDateGiven() {
        return dateGiven;
    }

    public void setDateGiven(LocalDate dateGiven) {
        this.dateGiven = dateGiven;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public HomeworkCompletetionStatus getHomeworkCompletetionStatus() {
        return homeworkCompletetionStatus;
    }

    public void setHomeworkCompletetionStatus(HomeworkCompletetionStatus homeworkCompletetionStatus) {
        this.homeworkCompletetionStatus = homeworkCompletetionStatus;
    }
}
