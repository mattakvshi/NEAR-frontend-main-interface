package ru.mattakvshi.near.service;


import jakarta.transaction.Transactional;
import ru.mattakvshi.near.entity.NotificationTemplate;

import java.util.UUID;

public interface NotificationTemplateService {
    @Transactional
    UUID saveTemplate(NotificationTemplate notificationTemplate);

    @Transactional
    UUID updateTemplate(NotificationTemplate notificationTemplate);

    @Transactional
    void deleteTemplate(NotificationTemplate notificationTemplate);
}