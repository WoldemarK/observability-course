package com.kovtynov.eventpublicapi.model;

public record Event(String uid, String subject, String description, String traceId) {
}
