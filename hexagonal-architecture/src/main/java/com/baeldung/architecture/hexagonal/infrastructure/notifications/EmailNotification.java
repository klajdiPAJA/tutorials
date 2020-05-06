package com.baeldung.architecture.hexagonal.infrastructure.notifications;

import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Component
public class EmailNotification implements Notification {
    @Override
    public void notify(MessageDto message) {
        log.info("Sending email to: {} with content: {}", message.getUser(), message.getMessage());
    }
}
