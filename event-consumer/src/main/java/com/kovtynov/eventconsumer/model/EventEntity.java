package com.kovtynov.eventconsumer.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "event_entity")
public class EventEntity {

    @Id
    private String  uid;

    @Column(name = "subject")
    private String subject;

    @Column(name = "description")
    private String description;


    public String getUid() {
        return uid;
    }

    public String getSubject() {
        return subject;
    }

    public String getDescription() {
        return description;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "EventEntity{" +
                "uid='" + uid + '\'' +
                ", subject='" + subject + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
